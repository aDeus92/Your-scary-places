package com.adeus.yourscaryplaces

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.adeus.yourscaryplaces.ui.screens.planets.views.PlanetsViewDisplay
import com.adeus.yourscaryplaces.ui.theme.YourScaryPlacesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            YourScaryPlacesTheme {
                PlanetsViewDisplay()
                 }
        }
    }
}

