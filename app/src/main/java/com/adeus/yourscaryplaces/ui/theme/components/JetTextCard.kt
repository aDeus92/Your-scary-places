package com.adeus.yourscaryplaces.ui.theme.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


import androidx.compose.ui.unit.dp


@Composable
fun JetTextCard(
    label:String,
    value: String,
    modifier: Modifier
){
    Column(
        modifier = modifier
            .background(MaterialTheme.colorScheme.background)
            .padding(3.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)


    ) {
        Text(text = label)
        Text(text = value)
    }
}