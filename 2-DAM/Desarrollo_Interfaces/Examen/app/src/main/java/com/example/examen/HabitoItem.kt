package com.example.examen

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.examen.ui.theme.ExamenTheme

/**
 * Representa un hábito individual dentro de la lista con opciones para marcar como realizado o eliminar.
 *
 * @param habito Instancia del modelo [Habito] con la información del hábito.
 * @param onToggle Callback invocado al alternar el estado del checkbox de realizado.
 * @param onDelete Callback invocado al pulsar el botón de eliminación.
 * @param modifier Modificador opcional para personalizar el diseño de la tarjeta.
 */
@Composable
fun HabitoItem(
    habito: Habito,
    onToggle: (Habito) -> Unit,
    onDelete: (Habito) -> Unit,
    modifier: Modifier = Modifier
) {
    val backgroundColor by animateColorAsState(
        targetValue = if (habito.realizado) {
            MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
        } else {
            MaterialTheme.colorScheme.surface
        },
        label = "HabitoItemColorAnimation"
    )

    val textColor = if (habito.realizado) {
        MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f)
    } else {
        MaterialTheme.colorScheme.onSurface
    }

    val categoryColor = if (habito.realizado) {
        MaterialTheme.colorScheme.outline
    } else {
        MaterialTheme.colorScheme.primary
    }

    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = backgroundColor),
        elevation = CardDefaults.cardElevation(defaultElevation = if (habito.realizado) 0.dp else 2.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            // Izquierda: Checkbox con área táctil de al menos 48dp
            Checkbox(
                checked = habito.realizado,
                onCheckedChange = { onToggle(habito) },
                modifier = Modifier.sizeIn(minWidth = 48.dp, minHeight = 48.dp)
            )

            // Centro: Tarea
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = habito.nombre,
                    style = MaterialTheme.typography.titleMedium,
                    color = textColor,
                    textDecoration = if (habito.realizado) TextDecoration.LineThrough else TextDecoration.None
                )
                Text(
                    text = stringResource(R.string.category_prefix, stringResource(habito.categoria.etiquetaResId)),
                    style = MaterialTheme.typography.bodyMedium,
                    color = categoryColor
                )
            }

            // Derecha: Borrar tarea con área táctil de al menos 48dp y contentDescription personalizado con el nombre del hábito
            IconButton(
                onClick = { onDelete(habito) },
                modifier = Modifier.sizeIn(minWidth = 48.dp, minHeight = 48.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = stringResource(R.string.delete_habit_desc, habito.nombre),
                    tint = if (habito.realizado) MaterialTheme.colorScheme.error.copy(alpha = 0.6f) else MaterialTheme.colorScheme.error
                )
            }
        }
    }
}

@Preview(showBackground = true, name = "HabitoItem Pendiente")
@Composable
fun HabitoItemPreview() {
    ExamenTheme {
        HabitoItem(
            habito = Habito(1, "Hacer ejercicio", Categoria.SALUD, "Entrenamiento 45 min", false),
            onToggle = {},
            onDelete = {}
        )
    }
}

@Preview(showBackground = true, name = "HabitoItem Realizado")
@Composable
fun HabitoItemDonePreview() {
    ExamenTheme {
        HabitoItem(
            habito = Habito(2, "Estudiar Kotlin", Categoria.ESTUDIO, "Repasar Compose", true),
            onToggle = {},
            onDelete = {}
        )
    }
}
