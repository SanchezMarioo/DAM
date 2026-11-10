package com.example.examen

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.listSaver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.examen.ui.theme.ExamenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExamenTheme {
                HabitosScreen()
            }
        }
    }
}

val listHabitoSaver = listSaver<SnapshotStateList<Habito>, Any>(
    save = { list ->
        list.map { habito ->
            listOf(habito.id, habito.nombre, habito.categoria.name, habito.descripcion, habito.realizado)
        }
    },
    restore = { restoredList ->
        val stateList = mutableStateListOf<Habito>()
        @Suppress("UNCHECKED_CAST")
        (restoredList as List<List<Any>>).forEach { item ->
            stateList.add(
                Habito(
                    id = item[0] as Int,
                    nombre = item[1] as String,
                    categoria = Categoria.valueOf(item[2] as String),
                    descripcion = item[3] as String,
                    realizado = item[4] as Boolean
                )
            )
        }
        stateList
    }
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HabitosScreen() {
    val h1Nombre = stringResource(R.string.sample_habit_1)
    val h1Desc = stringResource(R.string.sample_habit_1_desc)
    val h2Nombre = stringResource(R.string.sample_habit_2)
    val h2Desc = stringResource(R.string.sample_habit_2_desc)
    val h3Nombre = stringResource(R.string.sample_habit_3)
    val h3Desc = stringResource(R.string.sample_habit_3_desc)
    val h4Nombre = stringResource(R.string.sample_habit_4)
    val h4Desc = stringResource(R.string.sample_habit_4_desc)

    val listaHabitos = rememberSaveable(saver = listHabitoSaver) {
        mutableStateListOf(
            Habito(1, h1Nombre, Categoria.SALUD, h1Desc, false),
            Habito(2, h2Nombre, Categoria.ESTUDIO, h2Desc, true),
            Habito(3, h3Nombre, Categoria.HOGAR, h3Desc, false),
            Habito(4, h4Nombre, Categoria.OCIO, h4Desc, false)
        )
    }

    var categoriaFiltroNombre by rememberSaveable { mutableStateOf<String?>(null) }
    val categoriaFiltro = categoriaFiltroNombre?.let { Categoria.valueOf(it) }

    var nuevoNombre by rememberSaveable { mutableStateOf("") }
    var nextId by rememberSaveable { mutableIntStateOf(5) }

    val totalHabitos = listaHabitos.size
    val habitosCompletados = listaHabitos.count { it.realizado }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(R.string.app_title),
                        style = MaterialTheme.typography.titleLarge
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Composable ProgressCard
            ProgressCard(
                completados = habitosCompletados,
                total = totalHabitos
            )

            // LazyRow: Filtros por categoría
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                item {
                    FilterChip(
                        selected = categoriaFiltro == null,
                        onClick = { categoriaFiltroNombre = null },
                        label = {
                            Text(
                                text = stringResource(R.string.category_all),
                                style = MaterialTheme.typography.labelLarge
                            )
                        }
                    )
                }
                items(Categoria.entries.toTypedArray()) { cat ->
                    FilterChip(
                        selected = categoriaFiltro == cat,
                        onClick = { categoriaFiltroNombre = cat.name },
                        label = {
                            Text(
                                text = stringResource(cat.etiquetaResId),
                                style = MaterialTheme.typography.labelLarge
                            )
                        }
                    )
                }
            }

            // Row para añadir hábito con la misma altura exacta y forma (RoundedCornerShape(12.dp))
            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                OutlinedTextField(
                    value = nuevoNombre,
                    onValueChange = { nuevoNombre = it },
                    label = { Text(stringResource(R.string.new_habit_label), style = MaterialTheme.typography.bodyMedium) },
                    singleLine = true,
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier
                        .weight(0.70f)
                        .size(70.dp)
                        .testTag("nuevoHabitoTextField")
                )
                Button(
                    onClick = {
                        if (nuevoNombre.isNotBlank()) {
                            val cat = categoriaFiltro ?: Categoria.SALUD
                            listaHabitos.add(
                                Habito(
                                    id = nextId++,
                                    nombre = nuevoNombre.trim(),
                                    categoria = cat,
                                    descripcion = "",
                                    realizado = false
                                )
                            )
                            nuevoNombre = ""
                        }
                    },
                    shape = RoundedCornerShape(12.dp),
                    contentPadding = PaddingValues(0.dp),
                    modifier = Modifier
                        .weight(0.30f)
                        .size(62.dp)
                        .testTag("botonAnadir")
                ) {
                    Text(stringResource(R.string.add_button), style = MaterialTheme.typography.labelLarge)
                }
            }

            // Lista filtrada de hábitos
            val habitosFiltrados = if (categoriaFiltro == null) {
                listaHabitos
            } else {
                listaHabitos.filter { it.categoria == categoriaFiltro }
            }

            // LazyColumn con items y key = id
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(
                    items = habitosFiltrados,
                    key = { habito -> habito.id }
                ) { habito ->
                    HabitoItem(
                        habito = habito,
                        onToggle = { h ->
                            val index = listaHabitos.indexOfFirst { it.id == h.id }
                            if (index != -1) {
                                listaHabitos[index] = h.copy(realizado = !h.realizado)
                            }
                        },
                        onDelete = { h ->
                            listaHabitos.removeIf { it.id == h.id }
                        }
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, name = "Modo Claro")
@Composable
fun HabitosScreenLightPreview() {
    ExamenTheme(darkTheme = false) {
        HabitosScreen()
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES, name = "Modo Oscuro")
@Composable
fun HabitosScreenDarkPreview() {
    ExamenTheme(darkTheme = true) {
        HabitosScreen()
    }
}