package com.example.examen

import androidx.annotation.StringRes

enum class Categoria(@StringRes val etiquetaResId: Int, val etiqueta: String) {
    SALUD(R.string.category_salud, "Salud"),
    ESTUDIO(R.string.category_estudio, "Estudio"),
    HOGAR(R.string.category_hogar, "Hogar"),
    OCIO(R.string.category_ocio, "Ocio")
}
