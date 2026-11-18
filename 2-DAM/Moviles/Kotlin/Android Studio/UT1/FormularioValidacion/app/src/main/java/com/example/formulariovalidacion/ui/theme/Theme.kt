package com.example.formulariovalidacion.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val TemaAdmin = darkColorScheme(
    background = Color(0xFF6285F5),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White,
)

private val TemaUser = lightColorScheme(
    background = Color(0xFF90D781),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White,

)

@Composable
fun FormularioValidacionTheme(
    admin: Boolean = true,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if(admin){
            TemaAdmin
        } else{
            TemaUser
        },
        typography = Typography,
        content = content
    )
}