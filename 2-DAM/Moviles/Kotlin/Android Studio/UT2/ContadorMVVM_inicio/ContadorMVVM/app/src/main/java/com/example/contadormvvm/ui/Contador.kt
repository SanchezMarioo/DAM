package com.example.contadormvvm.componentes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.contadormvvm.utils.MAXIMO
import com.example.contadormvvm.utils.MINIMO
import com.example.contadormvvm.viewModel.ContadorUIState
import com.example.contadormvvm.viewModel.ContadorViewModel

@Composable
fun Contador(
    estado : ContadorUIState,
    onIncrementar: () -> Unit,
    onDecrementar: () -> Unit,
    onReinciar: () -> Unit,
) {
    Box() {
        Text(
            "$movimientos",
            modifier = Modifier
                .padding(8.dp)
                .align(Alignment.TopEnd)
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Contador $contador",
                style = MaterialTheme.typography.headlineMedium
            )
            Spacer(modifier = Modifier.height(24.dp))
            Button(onIncrementar, enabled = contador < MAXIMO) {
                Text("Incrementar")
            }
            Button(onDecrementar, enabled = contador > MINIMO) {
                Text("Decrementar")
            }
            Button(onReinciar) {
                Text("Reinciar")
            }
        }


    }
}