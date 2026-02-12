package org.mariofernandes.myyear

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview

import org.mariofernandes.myyear.utils.Calculate

@Composable
@Preview
fun App() {
    MaterialTheme {
        var textInput by remember { mutableStateOf("") }
        var calculate by remember { mutableStateOf("") }
        val greeting = remember { Greeting().greet() }
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            OutlinedTextField(
                value = textInput,
                onValueChange = { newText ->
                                    val filteredText = newText.filter { it.isDigit() }
                                    textInput = filteredText
                                },
                label = { Text("Enter your age") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                singleLine = true,
            )
            Button(onClick = {
                if (textInput.isNotBlank()) {
                    val age = textInput.toInt()
                    calculate = Calculate().calculateYearBirth(age)
                }
            }) {
                Text("Calculate!")
            }
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text("Response: $calculate")
                Text("Compose: $greeting")
            }
        }
    }
}