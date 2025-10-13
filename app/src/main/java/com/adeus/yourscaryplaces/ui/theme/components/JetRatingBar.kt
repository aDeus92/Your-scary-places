package com.adeus.yourscaryplaces.ui.theme.components

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

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.adeus.yourscaryplaces.R
import com.adeus.yourscaryplaces.ui.theme.YourScaryPlacesTheme

@Composable

fun JetRatingBar(
    rating: Int,
    modifier: Modifier
) {
    Box(){
    Row(
        horizontalArrangement = Arrangement.SpaceBetween
    ) {


            Icon(
                imageVector = ImageVector.vectorResource(R.drawable.star_svgrepo_com),
                contentDescription = "",
                tint = Color.Yellow
            )
        }

    }
}

@Preview
@Composable
private fun JetRatingBarPreview() {
    YourScaryPlacesTheme {
        JetRatingBar(3, Modifier)
    }
}