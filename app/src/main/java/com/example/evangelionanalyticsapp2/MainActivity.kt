package com.example.evangelionanalyticsapp2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.evangelionanalyticsapp2.ui.theme.EvangelionAnalyticsApp2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EvangelionAnalyticsApp2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

// Navigation Menu UI Interface

/* TODO:  */

// Home Page UI Interface
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Text(
        text = "Home Button",
        modifier = modifier
    )
}

// Episode Page UI Interface

/* TODO: */

// Character



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EvangelionAnalyticsApp2Theme {
        Greeting("Android")
    }
}
