package com.example.akbankarayztasarim

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign

@Composable
fun BottomBarPage() {
    val selectedItem = remember { mutableStateOf(0) }

    Scaffold(
        bottomBar = {
            BottomAppBar(
                content = {
                    NavigationBarItem(
                        selected = selectedItem.value == 0,
                        onClick = { selectedItem.value = 0 },
                        icon = {
                            Icon(
                                painter = painterResource(id = R.drawable.home),
                                contentDescription = ""
                            )
                        },
                        label = { Text(text = "Anasayfa") }

                    )

                    NavigationBarItem(
                        selected = selectedItem.value == 1,
                        onClick = { selectedItem.value = 1 },
                        icon = {
                            Icon(
                                painter = painterResource(id = R.drawable.sync_alt),
                                contentDescription = ""
                            )
                        },
                        label = { Text(text = "Transfer ve ödemler", textAlign = TextAlign.Center) }

                    )

                    NavigationBarItem(
                        selected = selectedItem.value == 2,
                        onClick = { selectedItem.value = 2 },
                        icon = {
                            Icon(
                                painter = painterResource(id = R.drawable.favorite),
                                contentDescription = ""
                            )
                        },
                        label = { Text(text = "Senin için") }

                    )

                    NavigationBarItem(
                        selected = selectedItem.value == 3,
                        onClick = { selectedItem.value = 3 },
                        icon = {
                            Icon(
                                painter = painterResource(id = R.drawable.search),
                                contentDescription = ""
                            )
                        },
                        label = { Text(text = "Arama ve asistan", textAlign = TextAlign.Center) }

                    )
                },
                containerColor = Color.White
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (selectedItem.value == 0) Anasayfa()

        }

    }


}