package com.gnacoding.formulaoneapp.presentation.ui.component

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gnacoding.formulaoneapp.R
import com.gnacoding.formulaoneapp.presentation.ui.theme.FormulaOneAppTheme
import com.gnacoding.formulaoneapp.presentation.ui.theme.Typography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DriverItem(
    name: String,
    raceNumber: String,
    nationality: Int,
    profilePicture: Int,
    teamConstructor: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .padding(8.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
    ) {
        Image(
            painter = painterResource(id = profilePicture),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.fillMaxWidth()
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(top = 4.dp)
                .padding(horizontal = 8.dp)
        ) {
           Text(
               text = raceNumber,
               style = Typography.titleLarge,
               modifier = Modifier.padding(end = 8.dp)
           )
           Text(
               text = name,
               maxLines = 1,
               overflow = TextOverflow.Ellipsis,
               style = Typography.titleMedium,
               modifier = Modifier
                   .weight(1f)
                   .padding(end = 8.dp)
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
        Text(
            text = teamConstructor,
            style = Typography.labelSmall,
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun DriverItemLightPreview() {
    FormulaOneAppTheme {
        DriverItem(
            name = "Lewis Hamilton",
            raceNumber = "44",
            nationality = R.drawable.united_kingdom,
            profilePicture = R.drawable.lewis_hamilton,
            teamConstructor = "Mercedes-AMG"
        )
    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun DriverItemNightPreview() {
    FormulaOneAppTheme {
        DriverItem(
            name = "Max Verstappen",
            raceNumber = "1",
            nationality = R.drawable.netherlands,
            profilePicture = R.drawable.max_verstappen,
            teamConstructor = "Red Bull Racing"
        )
    }
}

