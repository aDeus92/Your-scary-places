package com.adeus.yourscaryplaces.ui.theme.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview


import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.adeus.yourscaryplaces.R
import com.adeus.yourscaryplaces.ui.theme.BackgroundColor
import com.adeus.yourscaryplaces.ui.theme.OnSurfaceColor
import com.adeus.yourscaryplaces.ui.theme.SurfaceColor
import com.adeus.yourscaryplaces.ui.theme.YourScaryPlacesTheme


@Composable
fun JetTextCard(
    label: String,
    value: String,
    modifier: Modifier
) {
    Column(
        modifier = modifier
            .fillMaxHeight()
            .clip(RoundedCornerShape(20.dp))
            .background(SurfaceColor)
            .padding(3.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)


    ) {
        Text(text = label,
            color = OnSurfaceColor,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Text(text = value,
            color = OnSurfaceColor,
            fontSize = 15.sp,)
    }
}

@Preview
@Composable

private fun JetTextCardPreview() {
    YourScaryPlacesTheme {
        JetTextCard(
            stringResource(R.string.ghosty_label),
            "We are happy to show you lost places in our endless galaxy.",
            Modifier
        )

    }
}