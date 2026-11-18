package com.example.scaperoom

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar() {
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ),
        title = {
            Text(stringResource(R.string.app_name))
        }
    )
}

@Composable
fun CampoNombre(
    nombre: String,
    onCambioValor: (String) -> Unit,
    isError: Boolean
) {
    TextField(
        value = nombre,
        onValueChange = onCambioValor,
        label = { Text(stringResource(R.string.lbl_name)) },
        isError = isError
    )
}

@Composable
fun CampoEdad(
    nombre: String,
    onCambioValor: (String) -> Unit,
    isError: Boolean
) {
    TextField(
        value = nombre,
        onValueChange = onCambioValor,
        label = { Text(stringResource(R.string.label_edad)) },
        isError = isError
    )
}

@Composable
fun CampoCodigo(
    nombre: String,
    onCambioValor: (String) -> Unit,
    isError: Boolean
) {
    TextField(
        value = nombre,
        onValueChange = { nuevoTexto -> onCambioValor(nuevoTexto.take(4)) },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
        label = { Text(stringResource(R.string.label_codigo)) },
        isError = isError
    )
}

@Composable
fun CampoDificultad(
    nombre: String,
    onCambioValor: (String) -> Unit,
    list: List<String>,
    etiqueta: String = "Dificultad"
) {
    var expanded by remember { mutableStateOf(false) }

    Box {
        TextField(
            value = nombre,
            onValueChange = {},
            readOnly = true,
            label = { Text(etiqueta) },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = etiqueta,
                    modifier = Modifier.clickable { expanded = !expanded }
                )
            }
        )

        DropdownMenu(
            expanded = expanded && list.isNotEmpty(),
            onDismissRequest = { expanded = false }
        ) {
            list.forEach { opcion ->
                DropdownMenuItem(
                    text = { Text(opcion) },
                    onClick = {
                        onCambioValor(opcion)
                        expanded = false
                    }
                )
            }
        }
    }
}