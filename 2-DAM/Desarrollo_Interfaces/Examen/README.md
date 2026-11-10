# Gestor de Hábitos - Aplicación Android con Jetpack Compose

## Descripción de la Aplicación
Esta aplicación es un gestor de hábitos diarios desarrollado en Android nativo usando **Jetpack Compose** y **Material Design 3**. Permite a los usuarios organizar, filtrar, agregar y dar seguimiento a sus hábitos diarios.

### Características Principales:
- **Estructura base con Scaffold y TopAppBar**: Encabezado persistente titulado "Habitos de Mario" respetando `innerPadding`.
- **Filtro de Categorías (`LazyRow`)**: Filtrado rápido por categoría (`Salud`, `Estudio`, `Hogar`, `Ocio` y `Todas`).
- **Añadir Nuevos Hábitos**: Campo de texto y botón interactivo organizados con distribución proporcional por pesos (`0.70f` y `0.30f`).
- **Lista de Hábitos (`LazyColumn`)**: Renderizado eficiente mediante claves únicas (`key = habito.id`) y tarjeta interactiva (`HabitoItem`).
- **Tarjeta de Progreso (`ProgressCard`)**: Indicador de progreso animado (`animateFloatAsState`) que muestra el recuento de tareas completadas de manera segura frente a listas vacías.
- **Animaciones y Estilos**: Transición suave de color de fondo (`animateColorAsState`) y texto tachado cuando un hábito se marca como realizado.
- **Persistencia en Rotación (`rememberSaveable`)**: Conservación de estado del filtro activo y de la lista de hábitos tras cambios de orientación.
- **Temas Claro y Oscuro**: Paletas de colores personalizadas en `Theme.kt` y `Color.kt`.
- **Tipografías Personalizadas por Peso (`Type.kt`)**: Uso de `titleLarge` (ExtraBold), `titleMedium` (Bold), `labelLarge` (SemiBold) y `bodyMedium` (Medium).
- **Accesibilidad e Internacionalización**: Áreas táctiles garantizadas de al menos 48dp, `contentDescription` dinámico con el nombre del hábito y textos externalizados a `strings.xml`.

---

## Estructura de Ficheros

```
Examen/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/examen/
│   │   │   │   ├── Categoria.kt       # Enum de categorías con IDs de recursos traducidos
│   │   │   │   ├── Habito.kt          # Clase de datos (Data Class) para representar un hábito
│   │   │   │   ├── MainActivity.kt    # Pantalla principal (HabitosScreen, ProgressCard, HabitoItem, Previews)
│   │   │   │   └── ui/theme/
│   │   │   │       ├── Color.kt       # Definición de paletas de color para modo claro y oscuro
│   │   │   │       ├── Theme.kt       # Configuración de MaterialTheme y temas Light/Dark
│   │   │   │       └── Type.kt        # Configuración de estilos tipográficos y pesos de fuente
│   │   │   └── res/
│   │   │       └── values/
│   │   │           ├── strings.xml    # Externalización de cadenas de texto y recursos localizados
│   │   │           └── themes.xml     # Configuración de temas base
│   └── build.gradle.kts               # Configuración de dependencias de Compose y Material 3
└── README.md                          # Documentación del proyecto
```

---

## Uso del Agente de IA (Prompts y Correcciones)

A lo largo del desarrollo de la aplicación se utilizó un agente de Inteligencia Artificial para acelerar la creación del código. A continuación se detallan 3 prompts clave utilizados y las correcciones manuales que se tuvieron que realizar:

### Prompt 1: Creación del layout horizontal para añadir hábitos
- **Prompt enviado al Agente**:
  > *"Falta que lazyrow este el textfield y el boton de añadir"*
- **Problema / Resultado generado**:
  El agente colocó el `OutlinedTextField` y el `Button` como elementos dentro de un `LazyRow`. Como consecuencia, el botón de añadir quedaba cortado fuera de la pantalla en dispositivos móviles y requería scroll horizontal para interactuar con él.
- **Corrección manual / Ajuste**:
  Se sustituyó el `LazyRow` por un `Row(modifier = Modifier.fillMaxWidth())` utilizando distribución por pesos (`Modifier.weight(0.70f)` para el campo de texto y `Modifier.weight(0.30f)` para el botón), asegurando que ambos elementos quepan perfectamente en la pantalla de forma proporcional.

### Prompt 2: Preservación de la lista de hábitos al rotar la pantalla
- **Prompt enviado al Agente**:
  > *"Los estados de los filtros deben de guardarse cuando se da la vuelta..."*

### Prompt 3: Creación de componentes modulares y animaciones
- **Prompt enviado al Agente**:
  > *"Ahora crea dos componenibles HabitoItem: params = habit onToggle onDelete y modifier Incluye una preview ProgessCard: Card que muestre X de Y completados..."*
- **Problema / Resultado generado**:
  El agente inicialmente incluyó cadenas de texto hardcodeadas ("Tareas completadas", "de", "completados") dentro del código de los composables y omitió la protección para evitar la división entre cero cuando la lista de hábitos está vacía.
- **Corrección manual / Ajuste**:
  Se reemplazaron todos los literales de texto por llamadas a `stringResource(...)` utilizando patrones formateados en `strings.xml` (por ejemplo `%1$d de %2$d completados`) y se añadió la comprobación de seguridad `if (total > 0) completados.toFloat() / total else 0f` en el componente `ProgressCard`.
