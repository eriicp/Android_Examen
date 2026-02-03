package com.example.examen

sealed class Estat(val nom: String) {
    object NoComencada : Estat("No començada")
    object EnCurs : Estat("En curs")
    object Finalitzada : Estat("Finalitzada")
}