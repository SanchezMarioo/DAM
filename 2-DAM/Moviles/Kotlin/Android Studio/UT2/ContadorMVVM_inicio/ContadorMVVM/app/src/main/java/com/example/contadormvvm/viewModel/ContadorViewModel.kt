package com.example.contadormvvm.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.contadormvvm.utils.MAXIMO
import com.example.contadormvvm.utils.MINIMO

class ContadorViewModel : ViewModel() {

    var uiState by mutableStateOf(ContadorUIState())
    fun incrementar(){
        if(uiState.contador < MAXIMO) {
            uiState = uiState.copy(
                contador = uiState.contador + 1,
                movimientos = uiState.movimientos + 1

            )

        }

    }
    fun decrememtar(){
        if(uiState.contador > MINIMO){
            uiState = uiState.copy(
                contador = uiState.contador - 1,
                movimientos = uiState.movimientos + 1

            )
        }
    }
    fun reinciar(){
        uiState = ContadorUIState() // Reinciamos a los valores inciales
    }
}