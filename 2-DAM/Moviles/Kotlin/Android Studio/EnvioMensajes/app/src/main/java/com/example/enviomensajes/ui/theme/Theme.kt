package com.example.enviomensajes.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val TemaNaranja = lightColorScheme(
    primary = NaranjaPrincipal,
    secondary = NaranjaClaro,
    background = Blanco,
    surface = Blanco,
    onPrimary = Blanco,
    onBackground = TextoOscuro,
    onSurface = TextoOscuro
)

// 2. Esquema para la segunda Activity (Verde)
private val TemaVerde = lightColorScheme(
    primary = VerdePrincipal,
    secondary = VerdeClaro,
    background = Blanco,
    surface = Blanco,
    onPrimary = Blanco,
    onBackground = TextoOscuro,
    onSurface = TextoOscuro
)
@Composable
fun EnvioMensajesTheme(
    usarTemaVerde: Boolean = false,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (usarTemaVerde) {
            TemaVerde
        } else {
            TemaNaranja
        },
        typography = Typography,
        content = content
    )
}