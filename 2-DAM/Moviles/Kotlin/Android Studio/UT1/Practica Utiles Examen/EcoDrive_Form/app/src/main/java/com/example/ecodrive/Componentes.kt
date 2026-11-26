package com.example.ecodrive

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun TextInput(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    isError: Boolean,
    msgError: String = "",
    imeAction: ImeAction = ImeAction.Default,
    keyboardType: KeyboardType = KeyboardType.Text
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(label) },
        isError = isError,
        supportingText = {
            if (isError) {
                Text(msgError)
            }
        },
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = keyboardType,
            imeAction = imeAction
        ),

    )
}

@Composable
fun TipoVehiculoSelect(
    nombre: String,
    onCambioValor: (String) -> Unit,
    list: List<String>,
    // Label
    etiqueta: String = "Tipo Vehiculo"
) {
    var expanded by remember { mutableStateOf(false) }

    Box {
        OutlinedTextField(
            value = nombre,
            onValueChange = {},
            readOnly = true,
            label = { Text(etiqueta) },
            trailingIcon = {
                Icon(
                    // androidx-compose-material-icons-extended = { group = "androidx.compose.material", name = "material-icons-extended" }
                    // En gradle/libs.versions.toml
                    // app/build.gradle.kts
                    // implementation(libs.androidx.compose.material.icons.extended)
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
    @Composable
    fun Switch(value: String, onValueChange: (Boolean) -> Unit) {
        Switch(value, onValueChange)
    }
}