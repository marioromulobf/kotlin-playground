package org.mariofernandes.myyear

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "my-year-multiplatform",
    ) {
        App()
    }
}