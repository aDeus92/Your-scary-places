package com.adeus.yourscaryplaces.test

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.adeus.yourscaryplaces.ui.theme.OnSurfaceColor

@Composable
fun JetInfoDialog(
    title: String,
    body: String,
    positiveBtnText: String,
    negativeBtnText: String,
    onApply: () -> Unit,
    onClose: () -> Unit
) {
    Dialog(onDismissRequest = onClose) {
        DialogContent(title, body, positiveBtnText, negativeBtnText, onApply, onClose)
    }
}

@Composable
private fun DialogContent(
    title: String,
    body: String,
    positiveBtnText: String,
    negativeBtnText: String,
    onApply: () -> Unit,
    onClose: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(OnSurfaceColor),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column {
            Text(title)
            Text(body)
        }
        Row(modifier= Modifier.fillMaxWidth()) {
            Button(
                modifier = Modifier.fillMaxWidth(0.4f),
                onClick = onApply) {
                Text(positiveBtnText)
            }
            Button(
                modifier = Modifier.fillMaxWidth(0.4f),
                onClick = onClose) {
                Text(negativeBtnText)
            }

        }
    }
}

@Preview
@Composable
private fun DisplayJetInfoDialog() {
    JetInfoDialog("Tour detalis", "Name", "Apply", "Cancel", onApply = {}) { }
}