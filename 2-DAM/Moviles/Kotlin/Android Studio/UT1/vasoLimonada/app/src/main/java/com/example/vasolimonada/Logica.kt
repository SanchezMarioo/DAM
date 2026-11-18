package com.example.limonada

fun generarPulsacionesNecesarias(): Int {
    return (2..4).random()
}

fun obtenerSiguienteEstado(
    estadoActual: EstadoLimonada,
    pulsaciones: Int,
    pulsacionesNecesarias: Int
): EstadoLimonada {
    return when (estadoActual) {
        EstadoLimonada.LIMONERO -> EstadoLimonada.LIMON

        EstadoLimonada.LIMON -> {
            if (pulsaciones >= pulsacionesNecesarias) {
                EstadoLimonada.LIMONADA
            } else {
                EstadoLimonada.LIMON
            }
        }

        EstadoLimonada.LIMONADA -> EstadoLimonada.VASO_VACIO
        EstadoLimonada.VASO_VACIO -> EstadoLimonada.LIMONERO
    }
}
