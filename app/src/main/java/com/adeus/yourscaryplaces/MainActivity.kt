package com.adeus.yourscaryplaces

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.adeus.yourscaryplaces.test.JetInfoDialog
import com.adeus.yourscaryplaces.ui.screens.planets.views.PlanetsViewDisplay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PlanetsViewDisplay()
        }
    }
}

