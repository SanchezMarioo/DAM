package com.example.examen

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.examen.ui.theme.ExamenTheme

/**
 * Tarjeta de progreso que muestra el recuento de tareas completadas y un indicador de progreso lineal animado.
 *
 * @param completados Número de hábitos que han sido marcados como realizados.
 * @param total Número total de hábitos en la lista.
 * @param modifier Modificador opcional para personalizar el diseño del componente.
 */
@Composable
fun ProgressCard(
    completados: Int,
    total: Int,
    modifier: Modifier = Modifier
) {
    val targetProgreso = if (total > 0) completados.toFloat() / total else 0f
    val animatedProgreso by animateFloatAsState(
        targetValue = targetProgreso,
        label = "ProgressAnimation"
    )

    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        )
    ) {
        Column(
            modifier = Modifier.padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stringResource(R.string.tasks_completed_title),
                    style = MaterialTheme.typography.labelLarge
                )
                Text(
                    text = stringResource(R.string.tasks_completed_count, completados, total),
                    style = MaterialTheme.typography.labelLarge
                )
            }
            LinearProgressIndicator(
                progress = { animatedProgreso },
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProgressCardPreview() {
    ExamenTheme {
        ProgressCard(completados = 2, total = 4)
    }
}
