package com.example.akbankarayztasarim.widgets

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun IslemlerRow(iconRes: Int, text:  String){

    Row (
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,

        ){
        Icon(
            painter = painterResource(id = iconRes),
            contentDescription = "", modifier = Modifier.size(32.dp, 32.dp).padding(end = 16.dp).offset(x = 8.dp)
        )

        Text(text = text, style = TextStyle(fontWeight = FontWeight.Bold)
            , modifier = Modifier.padding(8.dp))

    }
}