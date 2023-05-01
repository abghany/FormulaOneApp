package com.gnacoding.formulaoneapp.presentation.ui.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.gnacoding.formulaoneapp.presentation.ui.theme.FormulaOneAppTheme
import com.gnacoding.formulaoneapp.presentation.ui.theme.Typography

@Composable
fun TextDetail(
    title: String,
    detail: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Text(
            text = title,
            style = Typography.titleMedium,
            modifier = Modifier.weight(1f)
        )
        Text(
            text = detail,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            style = Typography.bodyLarge,
            modifier = Modifier
                .weight(1f)
                .alpha(0.5f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TextDetailPreview() {
    FormulaOneAppTheme {
        TextDetail(title = "Team", detail = "Mercedes-AMG")
    }
}