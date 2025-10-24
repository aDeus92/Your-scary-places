package com.adeus.yourscaryplaces.ui.theme.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.adeus.yourscaryplaces.ui.theme.OnSurfaceColor
import com.adeus.yourscaryplaces.ui.theme.PrimaryColor
import com.adeus.yourscaryplaces.ui.theme.YourScaryPlacesTheme
import com.adeus.yourscaryplaces.ui.theme.fonts

@Composable
fun PlanetCard(
    label: String,
    rating: Int,
    imagePath: String,
    modifier: Modifier
) {
    Column(
        modifier = modifier.background(PrimaryColor),
        verticalArrangement = Arrangement.SpaceBetween

    ){
        AsyncImage(
            modifier = modifier
                .padding(10.dp)
                .size(360.dp, 160.dp)
                .border(BorderStroke(4.dp, Color.White),RoundedCornerShape(30.dp))
                .clip(RoundedCornerShape(32.dp)),
            model = imagePath,
            contentDescription = ' '.toString(),
            contentScale = ContentScale.Crop

        )
        Row(modifier = modifier.fillMaxWidth()
            .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween){
            Text(
                text = label,
                fontFamily= fonts,
                fontWeight = FontWeight.Bold,
                color = OnSurfaceColor
            )
            JetRatingBar(rating, Modifier)
        }
    }

}

@Preview
@Composable
private fun PlanetCardPreview(){
    YourScaryPlacesTheme {
        PlanetCard("Ghost\"Yenion\"",4, "file:///android_asset/image/planet1.jpg", Modifier)
    }
}