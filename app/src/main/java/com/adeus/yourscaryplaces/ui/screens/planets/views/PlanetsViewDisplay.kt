package com.adeus.yourscaryplaces.ui.screens.planets.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.adeus.yourscaryplaces.R
import com.adeus.yourscaryplaces.ui.theme.OnPrimaryColor
import com.adeus.yourscaryplaces.ui.theme.PrimaryColor
import com.adeus.yourscaryplaces.ui.theme.YourScaryPlacesTheme
import com.adeus.yourscaryplaces.ui.theme.components.PlanetCard

@Composable

fun PlanetsViewDisplay(){
    Column(modifier = Modifier.fillMaxSize()
        .background(PrimaryColor)
        .verticalScroll(enabled = true, state = rememberScrollState())){

        Column (
            modifier = Modifier.fillMaxWidth()
                .padding(top = 30.dp,bottom = 15.dp),
            horizontalAlignment = Alignment.CenterHorizontally){
            Text(
                text= stringResource(R.string.header_title),
                fontSize = 24.sp,
                color = OnPrimaryColor,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
                )
        }

        PlanetCard("Ghost\"Yenion\"",5, "file:///android_asset/image/planet1.jpg", Modifier)
        PlanetCard("Destroyed Platform",5, "file:///android_asset/image/planet2.jpg", Modifier)
        PlanetCard("Gold Mine",5, "file:///android_asset/image/planet3.jpg", Modifier)
    }
}

@Preview
@Composable
private fun PlanetsViewDisplayPreview(){
    YourScaryPlacesTheme {
        PlanetsViewDisplay()
    }
}