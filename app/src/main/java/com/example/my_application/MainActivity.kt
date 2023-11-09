package com.example.my_application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.my_application.ui.theme.My_ApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            My_ApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ScaffoldCompose()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldCompose () {
    Scaffold(topBar = { TopAppBarCompose() },
        bottomBar = { BottomAppBarCompose() }
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
        ) {

            Text(
                text = "Réglages",
                modifier = Modifier
                    .padding(start = 20.dp),
                fontSize = 30.sp,
                fontWeight = FontWeight.W700
            )
            Spacer(
                modifier = Modifier
                    .padding(bottom = 5.dp)
            )

            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp)
            ) {

                Column(
                    modifier = Modifier
                        .background(Color.White.copy(alpha = 0.3f))
                        .fillMaxWidth()
                        .requiredHeight(35.dp)
                ) {

                    Row {
                        Image(
                            modifier = Modifier
                                .padding(start = 7.dp, top = 7.dp, end = 5.dp),
                            painter = painterResource(id = R.drawable.icon_search),
                            contentDescription = "icon_search",
                            colorFilter = ColorFilter.tint(color = Color.DarkGray.copy(alpha = 0.4f))
                        )
                        Text(
                            modifier = Modifier
                                .padding(top = 6.dp),
                            text = "Rechercher",
                            color = Color.DarkGray.copy(alpha = 0.6f)
                        )
                    }
                }

            }

            Spacer(
                modifier = Modifier
                    .padding(bottom = 15.dp)
            )

            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp),
                colors = CardDefaults.cardColors(Color.White)
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp, bottom = 9.dp)
                ) {

                    Row(
                        modifier = Modifier
                            .padding(top = 6.dp, bottom = 3.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.icon_profil),
                            contentDescription = "profil",
                            modifier = Modifier
                                .padding(start = 0.dp)
                                .size(65.dp),
                            alignment = Alignment.CenterStart
                        )

                        Column(verticalArrangement = Arrangement.Center) {
                            Text(
                                text = "Éraste_Kadiayi",
                                fontWeight = FontWeight.W500,
                                modifier = Modifier
                                    .padding(top = 7.dp),
                                fontSize = 20.sp
                            )
                            Text(
                                text = "«À tes résolutions répon...",
                                color = Color.DarkGray.copy(alpha = 0.6f)
                            )
                        }
                        Card(
                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                            colors = CardDefaults.cardColors(Color.White.copy(alpha = 0.1f)),
                            shape = CircleShape,
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.icon_qr_code_scanner),
                                contentDescription = "icon_scanner",
                                colorFilter = ColorFilter.tint(Color.Blue.copy(alpha = 0.6f)),
                                alignment = Alignment.Center
                            )
                        }
                    }

                    Divider(thickness = 1.dp)

                    Row(
                        modifier = Modifier
                            .padding(top = 8.dp, end = 5.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Card(
                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                            colors = CardDefaults.cardColors(Color.White),
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.avatar),
                                contentDescription = "avatar",
                                modifier = Modifier
                                    .background(Color.Blue.copy(alpha = 0.7f))
                            )
                        }
                        Text(
                            text = "Avatar",
                            modifier = Modifier
                                .padding(start = 15.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 172.dp)
                        )
                    }
                }

            }

            Spacer(
                modifier = Modifier
                    .padding(bottom = 30.dp)
            )

            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp),
                colors = CardDefaults.cardColors(Color.White)
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp, bottom = 9.dp)
                ) {

                }
            }

        }

    }
}

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun TopAppBarCompose() {
        TopAppBar(title = {
            Text(
                text = "Réglages",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 119.dp),
                fontSize = 18.sp,
                fontWeight = FontWeight.W600
            )
        })
    }


    @Composable
    fun BottomAppBarCompose() {

    }









