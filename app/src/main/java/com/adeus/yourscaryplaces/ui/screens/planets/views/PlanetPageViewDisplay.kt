package com.adeus.yourscaryplaces.ui.screens.planets.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.adeus.yourscaryplaces.R
import com.adeus.yourscaryplaces.ui.theme.OnPrimaryColor
import com.adeus.yourscaryplaces.ui.theme.PrimaryColor
import com.adeus.yourscaryplaces.ui.theme.YourScaryPlacesTheme
import com.adeus.yourscaryplaces.ui.theme.components.JetGradientButton
import com.adeus.yourscaryplaces.ui.theme.components.JetIconButton
import com.adeus.yourscaryplaces.ui.theme.components.JetTextCard
import com.adeus.yourscaryplaces.ui.theme.components.PlanetCard


@Composable
fun PlanetPageViewDisplay() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PrimaryColor)
            .verticalScroll(
                enabled = true, state = rememberScrollState()

            ),
        verticalArrangement = Arrangement.SpaceEvenly
    )
    {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 15.dp)
        ) {
            JetIconButton(
                R.drawable.ic_left,
                Modifier,
                RoundedCornerShape(5.dp),
                PaddingValues(5.dp)
            )

        }

        Column(
            modifier = Modifier
                .padding(10.dp),

        ) {
            Text(
                modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
                text = stringResource(R.string.ghosty_label),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = OnPrimaryColor,

                )
            PlanetCard(
                stringResource(R.string.ghosty_label), 4, "file:///android_asset/image/planet1.jpg",
                Modifier
            )
            JetTextCard(
                stringResource(R.string.description),
                "We are happy to show you lost places in our endless galaxy.",
                Modifier
            )

        }
        Column(
            modifier = Modifier.fillMaxHeight()
        ) {
        JetGradientButton(
            stringResource(R.string.send_application),
            Modifier
                .padding(20.dp)
                .fillMaxWidth()
        )
        }
    }
}

@Preview
@Composable
private fun PlanetPagePreview() {
    YourScaryPlacesTheme {
        PlanetPageViewDisplay()
    }
}