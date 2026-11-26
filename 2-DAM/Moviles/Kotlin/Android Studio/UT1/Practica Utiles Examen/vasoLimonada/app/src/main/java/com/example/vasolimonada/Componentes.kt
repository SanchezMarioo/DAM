package com.example.limonada

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ImagenLimonada(
    @DrawableRes imagen: Int,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = imagen),
        contentDescription = "Imagen del proceso de la limonada",
        modifier = modifier
            .size(180.dp)
            .clickable { onClick() }
    )
}
