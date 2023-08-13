package com.example.bottomnavigationcompose

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.bottomnavigationcompose.ui.theme.BottomNavigationComposeTheme

@Composable
fun SettingsScreen() {

    BottomNavigationComposeTheme {

        Surface(
            modifier = Modifier.fillMaxSize(), color = Color.Blue
        ) {


            Text("Settings")
        }
    }
}