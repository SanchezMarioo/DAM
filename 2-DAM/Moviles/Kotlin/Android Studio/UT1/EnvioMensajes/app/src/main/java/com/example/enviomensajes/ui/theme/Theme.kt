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
    onPrimary = Blanco,
    secondary = NaranjaClaro,
    onBackground = TextoOscuro,
    surface = NaranjaClaro,
    onSurface = TextoOscuro
)

private val TemaVerde = lightColorScheme(
    primary = VerdePrincipal,
    onPrimary = Blanco,
    secondary = VerdeClaro,
    onBackground = TextoOscuro,
    surface = VerdeClaro,
    onSurface = TextoOscuro,
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