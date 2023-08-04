package com.example.evangelionanalyticsapp2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
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
                    OverviewPage()
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
        // call my button here
        HomeIconButton()
        // Home page button
        HomeButton()

        // Overview page button
        OverviewButton()

        // Episodes page button
        EpisodesButton()
        // Characters page button
        CharactersButton()
    }

}
// HOme Icon button
@Composable
fun HomeIconButton() {
    Button(onClick = {
        // your onClick code here
    }) {
        Text(text = "[Home Icon]")
    }
}
// HOme button
@Composable
fun HomeButton() {
    Button(onClick = {
        // your onClick code here
    }) {
        Text(text = "Home")
    }
}
// Overview page button
@Composable
fun OverviewButton() {
    Button(onClick = {
        // your onClick code here
    }) {
        Text(text = "Overview")
    }
}
// Episodes page button
@Composable
fun EpisodesButton() {
    Button(onClick = {
        // your onClick code here
    }) {
        Text(text = "Episodes")
    }
}
// Characters page button
@Composable
fun CharactersButton() {
    Button(onClick = {
        // your onClick code here
    }) {
        Text(text = "Characters")
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
        HomeIconButton()
        Text(
            text = "Eva Scraper",
            modifier = modifier
        )
        // Scrape button
        Text(
            text = "Press \"Scrape\" to scrape data",
            modifier = modifier
        )
        ScrapeButton()
        // copyright
        Text(
            text = "copyright license",
            modifier = modifier
        )

    }
}
// Scrape Button
@Composable
fun ScrapeButton() {
    Button(onClick = {
        // your onClick code here
    }) {
        Text(text = "Scrape")
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
        HomeIconButton()
        Text(
            text = "Generate data about an episode: ",
            modifier = modifier
        )
        Text(
            text = "25",
            modifier = modifier
        )
        GoButton()
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
// Go button
@Composable
fun GoButton() {
    Button(onClick = {
        // your onClick code here
    }) {
        Text(text = "Go")
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
        HomeIconButton()
        Text(
            text = "Generate data about a character: ",
            modifier = modifier
        )
        ShinjiButton()
        KajiButton()
        MisatoButton()
        ReiButton()
    }
}
// Shinji button
@Composable
fun ShinjiButton() {
    Button(onClick = {
        // your onClick code here
    }) {
        Text(text = "Shinji")
    }
}
// Kaji button
@Composable
fun KajiButton() {
    Button(onClick = {
        // your onClick code here
    }) {
        Text(text = "Kaji")
    }
}
// Misato button
@Composable
fun MisatoButton() {
    Button(onClick = {
        // your onClick code here
    }) {
        Text(text = "Misato")
    }
}
// Rei button
@Composable
fun ReiButton() {
    Button(onClick = {
        // your onClick code here
    }) {
        Text(text = "Rei")
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
        HomeIconButton()
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
@Composable
fun OverviewPage(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = modifier
    ) {
        HomeIconButton()
        Text(
            text = "Neon Genesis Evangelion",
            modifier = modifier
        )
        Text(
            text = "The Show: ",
            modifier = modifier
        )
        Text(
            text = "- Num episodes: ",
            modifier = modifier
        )
        Text(
            text = "- Average rating: ",
            modifier = modifier
        )
        Text(
                text = "- Most frequent characters: ",
        modifier = modifier
        )
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EvangelionAnalyticsApp2Theme {
        Greeting("Android")
    }
}
