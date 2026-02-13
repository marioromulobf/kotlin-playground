package br.com.mrbf.my_year_multiplatform

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "my_year_multiplatform",
    ) {
        App()
    }
}