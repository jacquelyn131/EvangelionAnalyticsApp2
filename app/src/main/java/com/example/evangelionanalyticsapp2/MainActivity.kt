package com.example.evangelionanalyticsapp2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
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
                    CharacterResult()
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
            text = "Press \"Scrape\" to scrape data",
            modifier = modifier
        )
        Text(
            text = "[Scrape]",
            modifier = modifier
        )
        // copyright
        Text(
            text = "copyright license",
            modifier = modifier
        )

    }
}

// Episode Page UI Interface

// User interface to fetch data about a specific episode
@Composable
fun EpisodePage(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = modifier
    ) {
        Text(
            text = "[Menu Icon]",
            modifier = modifier
        )
        Text(
            text = "Generate data about an episode: ",
            modifier = modifier
        )
        Text(
            text = "25",
            modifier = modifier
        )
        Text(
            text = "[Go button]",
            modifier = modifier
        )
        // Output data here.
        Text(
            text = "\"The Ending World\"",
            modifier = modifier
        )
        Text(
            text = "- Duration: ",
            modifier = modifier
        )
        Text(
            text = "- Ending Theme: ",
            modifier = modifier
        )
        Text(
            text = "- Most frequent characters: ",
            modifier = modifier
        )
        Text(
            text = "- Average rating: ",
            modifier = modifier
        )
        Text(
            text = "- Episode rank: ",
            modifier = modifier
        )

    }
}

// Character Page UI Interface
// Search for data about a specific character.
@Composable
fun CharacterPage(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = modifier
    ) {
        Text(
            text = "[Menu Icon]",
            modifier = modifier
        )
        Text(
            text = "Generate data about a character: ",
            modifier = modifier
        )
        Text(
            text = "[Shinji]",
            modifier = modifier
        )
        Text(
            text = "[Kaji]",
            modifier = modifier
        )
        Text(
            text = "[Misato]",
            modifier = modifier
        )
        Text(
            text = "[Rei]",
            modifier = modifier
        )
    }
}

// Character Result UI Interface
// Display data about a specific character.
@Composable
fun CharacterResult(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = modifier
    ) {
        Text(
            text = "[Menu icon]",
            modifier = modifier
        )
        Text(
            text = "Shinji Ikari",
            modifier = modifier
        )
        Text(
            text = "[Shinji picture]",
            modifier = modifier
        )
        Text(
            text = "- Age: ",
            modifier = modifier
        )
        Text(
            text = "- Num of episodes: ",
            modifier = modifier
        )
        Text(
            text = "- Average rating: ",
            modifier = modifier
        )
    }
}

// Overview Page UI Interface

/*  TODO: */



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EvangelionAnalyticsApp2Theme {
        Greeting("Android")
    }
}
