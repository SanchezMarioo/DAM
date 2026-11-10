package com.example.examen

import androidx.compose.ui.test.isToggleable
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextReplacement
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.examen.ui.theme.ExamenTheme
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class HabitosScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun listaInicialMuestraHabitosDeEjemplo() {
        composeTestRule.setContent {
            ExamenTheme {
                HabitosScreen()
            }
        }

        // Muestra la lista inicial con hábitos de ejemplo
        composeTestRule.onNodeWithText("Hacer ejercicio").assertExists()
        composeTestRule.onNodeWithText("Estudiar Kotlin").assertExists()
        composeTestRule.onNodeWithText("Limpiar la casa").assertExists()
        composeTestRule.onNodeWithText("Leer un libro").assertExists()
    }

    @Test
    fun alMarcarHabitoProgresoCardActualizaCompletados() {
        composeTestRule.setContent {
            ExamenTheme {
                HabitosScreen()
            }
        }

        // Inicialmente 1 de 4 completados
        composeTestRule.onNodeWithText("1 de 4 completados").assertExists()

        // Marcamos un hábito
        composeTestRule.onAllNodes(isToggleable())[0].performClick()

        // Pasa a 2 de 4 completados
        composeTestRule.onNodeWithText("2 de 4 completados").assertExists()
    }

    @Test
    fun alEscribirTextoYAnadirSeAgregaHabitoYConCampoVacioNoCambia() {
        composeTestRule.setContent {
            ExamenTheme {
                HabitosScreen()
            }
        }

        // Escribimos texto en el campo
        composeTestRule.onNodeWithTag("nuevoHabitoTextField").performTextReplacement("Meditar 10 minutos")

        // Pulsamos en Añadir
        composeTestRule.onNodeWithTag("botonAnadir").performClick()

        // Verificamos que se añade el hábito pasando el total de 4 a 5 (1 de 5 completados)
        composeTestRule.onNodeWithText("1 de 5 completados").assertExists()

        // Al intentar añadir con el campo de texto vacío
        composeTestRule.onNodeWithTag("botonAnadir").performClick()

        // El número total de hábitos no cambia (permanece en 1 de 5 completados)
        composeTestRule.onNodeWithText("1 de 5 completados").assertExists()
    }
}
