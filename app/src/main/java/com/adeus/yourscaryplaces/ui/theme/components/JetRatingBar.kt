package com.adeus.yourscaryplaces.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.adeus.yourscaryplaces.R
import com.adeus.yourscaryplaces.ui.theme.OnSecondaryColor
import com.adeus.yourscaryplaces.ui.theme.PrimaryColor
import com.adeus.yourscaryplaces.ui.theme.YourScaryPlacesTheme

@Composable

fun JetRatingBar(
    rating: Int,
    modifier: Modifier
) {

    Row(
        modifier= modifier.background(PrimaryColor),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        for (i in 1..5) {
            Icon(
                imageVector = ImageVector.vectorResource(R.drawable.star_rate),
                contentDescription = "",
                tint = if (i <= rating) {
                    OnSecondaryColor
                } else {
                    Color.Gray
                }
            )
        }
    }

}

@Preview
@Composable
private fun JetRatingBarPreview() {
    YourScaryPlacesTheme {
        JetRatingBar(2, Modifier)
    }
}