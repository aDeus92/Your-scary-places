package com.adeus.yourscaryplaces.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adeus.yourscaryplaces.R
import com.adeus.yourscaryplaces.ui.theme.OnSurfaceColor
import com.adeus.yourscaryplaces.ui.theme.PrimaryColor
import com.adeus.yourscaryplaces.ui.theme.SurfaceColor
import com.adeus.yourscaryplaces.ui.theme.YourScaryPlacesTheme

@Composable
fun JetIconButton(
    vectorDrawableId: Int,
    modifier: Modifier,
    shape: RoundedCornerShape,
    contentPadding: PaddingValues
) {
    Box(
        modifier = modifier
            .clip(shape)
            .background(SurfaceColor)
            .clickable(
                enabled = true,
                onClick = {}
            )
            .padding(contentPadding),

        ) {
        Icon(
            painterResource(vectorDrawableId),
            contentDescription = "",
            tint = OnSurfaceColor
        )
    }
}


@Preview
@Composable
private fun JetIBPreview() {
    YourScaryPlacesTheme {
        val iconBtnLeft = R.drawable.ic_left
        JetIconButton(iconBtnLeft, Modifier, RoundedCornerShape(5.dp), PaddingValues(5.dp))
    }
}