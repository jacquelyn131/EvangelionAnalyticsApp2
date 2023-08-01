package com.example.evangelionanalyticsapp2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
                    HomeScreen()
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

// Navigation Menu UI Interface- UI for the navigation menu the user uses
//  to navigate between the different interfaces

@Composable
fun NavMenu(modifier: Modifier = Modifier) {
    // Home icon button
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = modifier) {
        Text(
            text = "[Home button icon]",
            modifier = modifier
        )

        // Home page button
        Text(
            text = "Home",
            modifier = modifier
        )

        // Overview page button
        Text(
            text = "Overview",
            modifier = modifier
        )

        // Episodes page button
        Text(
            text = "Episodes",
            modifier = modifier
        )

        // Characters page button
        Text(
            text = "Characters",
            modifier = modifier
        )
    }

}

// Home Page UI Interface
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    // Column to hold all the elements
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = modifier) {
        // Home button icon
        Text(
            text = "[Home Button icon]",
            modifier = modifier
        )
        // Scrape button
        Text(
            text = "Press \neat a potato"
        )

    }
}

// Episode Page UI Interface

/* TODO: */

// Character Page UI Interface

/* TODO: */

// Overview Page UI Interface

/*  TODO: */



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EvangelionAnalyticsApp2Theme {
        Greeting("Android")
    }
}
