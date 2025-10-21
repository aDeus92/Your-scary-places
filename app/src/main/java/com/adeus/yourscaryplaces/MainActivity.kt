package com.adeus.yourscaryplaces

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.adeus.yourscaryplaces.ui.theme.YourScaryPlacesTheme
import com.adeus.yourscaryplaces.ui.theme.components.PlanetCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            YourScaryPlacesTheme {
                PlanetCard("Ghost\"Yenion\"",4, "file:///android_asset/image/planet1.jpg", Modifier)
            }
        }
    }
}

