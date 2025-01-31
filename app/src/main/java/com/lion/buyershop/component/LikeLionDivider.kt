package com.lion.buyershop.component

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun LikeLionDivider(
    paddingTop:Dp = 0.dp,
    color:Color = Color.LightGray)
{
    Spacer(modifier = Modifier.height(5.dp))
    HorizontalDivider(
        modifier = Modifier.fillMaxWidth().padding(top = paddingTop),
        color = color
    )
    Spacer(modifier = Modifier.height(5.dp))
}