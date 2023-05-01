package com.gnacoding.formulaoneapp.presentation.screen.driver_detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.gnacoding.formulaoneapp.R
import com.gnacoding.formulaoneapp.domain.model.Driver
import com.gnacoding.formulaoneapp.presentation.ui.component.TextDetail
import com.gnacoding.formulaoneapp.presentation.ui.theme.Typography
import com.gnacoding.formulaoneapp.presentation.util.UiState

@Composable
fun DriverDetailScreen(
    driverId: Int,
    viewModel: DriverDetailViewModel = hiltViewModel(),
    navigateBack: () -> Unit,
) {
    viewModel.driver.collectAsState(initial = UiState.Loading).value.let { uiState ->
        when (uiState) {
            is UiState.Loading -> viewModel.getDriver(driverId)
            is UiState.Success -> DriverDetailContent(
                driver = uiState.data,
                onAddToFavoriteClicked = viewModel::updateFavoriteDriver,
                onBackClicked = navigateBack
            )
            is UiState.Error -> {}
        }
    }
}

@Composable
fun DriverDetailContent(
    driver: Driver,
    onAddToFavoriteClicked: (id: Int, isFavorite: Boolean) -> Unit,
    onBackClicked: () -> Unit,
) {
    val (
        id, name, raceNumber, nationality, profilePicture, teamConstructor,
        totalPodium, totalPoints, totalWorldChampionship, biography, isFavorite,
    ) = driver

    Box(modifier = Modifier.fillMaxWidth()) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(bottom = 16.dp)
        ) {
            Image(
                painter = painterResource(id = profilePicture),
                contentDescription = name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(360.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = raceNumber,
                            style = Typography.titleLarge,
                            modifier = Modifier.padding(end = 8.dp)
                        )
                        Image(
                            painter = painterResource(id = nationality),
                            contentDescription = null,
                            alignment = Alignment.CenterEnd,
                            modifier = Modifier
                                .size(24.dp)
                                .clip(RoundedCornerShape(8.dp))
                        )
                    }
                    Icon(
                        painter = if (isFavorite) painterResource(id = R.drawable.ic_favorite)
                            else painterResource(id = R.drawable.ic_favorite_border),
                        contentDescription = null,
                        tint = if (isFavorite) Color.Red else MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier
                            .size(32.dp)
                            .clickable(
                                interactionSource = remember { MutableInteractionSource() },
                                indication = null
                            ) {
                                onAddToFavoriteClicked(id ?: 0, !isFavorite)
                            }
                    )
                }
                Text(
                    text = name,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    style = Typography.titleMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Divider(
                    color = MaterialTheme.colorScheme.outline,
                    modifier = Modifier.alpha(0.6f)
                )
                Spacer(modifier = Modifier.height(16.dp))
                TextDetail(title = "Team", detail = teamConstructor)
                Spacer(modifier = Modifier.height(4.dp))
                TextDetail(title = "Podiums", detail = totalPodium)
                Spacer(modifier = Modifier.height(4.dp))
                TextDetail(title = "Points", detail = totalPoints)
                Spacer(modifier = Modifier.height(4.dp))
                TextDetail(title = "World Championships", detail = totalWorldChampionship)
                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    text = "Biography",
                    style = Typography.titleMedium
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = biography,
                    style = Typography.bodyMedium,
                    modifier = Modifier.alpha(0.8f)
                )
            }
        }
        IconButton(
            onClick = onBackClicked,
            modifier = Modifier
                .padding(start = 8.dp, top = 8.dp)
                .align(Alignment.TopStart)
                .clip(CircleShape)
                .size(40.dp)
                .testTag("back_button")
                .background(MaterialTheme.colorScheme.background.copy(alpha = 0.6f))
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_arrow_left),
                contentDescription = null
            )
        }
    }
}