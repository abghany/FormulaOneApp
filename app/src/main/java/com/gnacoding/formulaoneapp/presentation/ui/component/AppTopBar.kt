package com.gnacoding.formulaoneapp.presentation.ui.component

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.material3.SmallTopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.gnacoding.formulaoneapp.R
import com.gnacoding.formulaoneapp.presentation.ui.theme.FormulaOneAppTheme

@Composable
fun AppTopBar(title: String) {
    SmallTopAppBar(
        title = {
            Text(text = title)
        }
    )
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun AppTopBarLightPreview() {
    FormulaOneAppTheme {
        AppTopBar(title = stringResource(id = R.string.app_name))
    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun AppTopBarDarkPreview() {
    FormulaOneAppTheme {
        AppTopBar(title = stringResource(id = R.string.app_name))
    }
}