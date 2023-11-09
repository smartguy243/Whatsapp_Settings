package com.example.my_application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.my_application.ui.theme.My_ApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            My_ApplicationTheme {
                // A surface container using the 'background' color from the theme
                ScaffoldCompose()
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldCompose () {
    Scaffold ( topBar = {TopAppBarCompose()},
        bottomBar = {BottomAppBarCompose()}
    )
    { innerPadding ->

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarCompose () {
    TopAppBar(title = {  })
}


@Composable
fun BottomAppBarCompose










@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    My_ApplicationTheme {
        Greeting("Android")
    }
}