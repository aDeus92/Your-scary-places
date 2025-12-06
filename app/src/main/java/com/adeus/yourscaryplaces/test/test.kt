package com.adeus.yourscaryplaces.test

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.adeus.yourscaryplaces.R
import com.adeus.yourscaryplaces.ui.theme.OnPrimaryColor
import com.adeus.yourscaryplaces.ui.theme.OnSurfaceColor
import com.adeus.yourscaryplaces.ui.theme.black

@Composable
fun JetInfoDialog(
    title: String,
    body: String,
    date: String,
    positiveBtnText: String,
    negativeBtnText: String,
    onApply: () -> Unit,
    onClose: () -> Unit
) {
    Dialog(onDismissRequest = onClose) {
        DialogContent(title, body, date,positiveBtnText, negativeBtnText, onApply, onClose)
    }
}

@Composable
private fun DialogContent(
    title: String,
    body: String,
    date:String,
    positiveBtnText: String,
    negativeBtnText: String,
    onApply: () -> Unit,
    onClose: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(10.dp))
            .background(black),

        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Column(
            modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(title,
                color = OnSurfaceColor,
                fontSize = 20.sp)
            HorizontalDivider(modifier =  Modifier.padding(start=80.dp,end=80.dp, bottom = 5.dp),
                thickness = 2.dp)
            Text(
                "Name: $body",
                color = OnSurfaceColor,
                fontSize = 15.sp)
            Text("Date: $date",
                color = OnSurfaceColor,
                fontSize = 15.sp)
        }
        Row(modifier = Modifier.fillMaxWidth()
            .background(OnPrimaryColor)) {
            Button(
                modifier = Modifier.fillMaxWidth(0.5f),
                shape = RoundedCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(OnPrimaryColor),
                onClick = onApply
            ) {
                Text(positiveBtnText)
            }
            Button(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(OnPrimaryColor,black),
                onClick = onClose
            ) {
                Text(negativeBtnText)
            }

        }
    }
}

@Preview
@Composable
private fun DisplayJetInfoDialog() {
    JetInfoDialog("Tour details", stringResource(R.string.ghosty_label),"Tomorrow", "Apply", "Cancel", onApply = {}) { }
}