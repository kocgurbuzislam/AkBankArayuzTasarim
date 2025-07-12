package com.example.akbankarayztasarim

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.akbankarayztasarim.ui.theme.AkBankArayüzTasarimTheme
import com.example.akbankarayztasarim.widgets.IslemlerRow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Anasayfa() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {},
                actions = {
                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_notifications),
                            contentDescription = "",
                            tint = Color.White
                        )
                    }

                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_account),
                            contentDescription = "",
                            tint = Color.White
                        )
                    }

                },
                colors = TopAppBarDefaults.topAppBarColors(Color.Red)


            )
        },
        containerColor = Color.White


    ) { paddingValues ->

        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically

            ) {
                Text(
                    text = "HESAPLAR VE KARTLAR",
                    style = TextStyle(fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(start = 8.dp)
                )
                TextButton(
                    onClick = {}
                ) {
                    Text(text = "TÜMÜ", color = Color.Red)

                }

            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(all = 8.dp)
                    .size(100.dp, 160.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)


            ) {
                Column {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "KADIKÖY/IST",
                            style = TextStyle(fontWeight = FontWeight.Bold),
                            modifier = Modifier.padding(start = 8.dp, top = 8.dp)
                        )
                        TextButton(
                            onClick = {}

                        ) {
                            Text(
                                text = "...",
                                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 24.sp)
                            )
                        }
                    }

                    Text(
                        text = "0020-0123432",
                        style = TextStyle(fontWeight = FontWeight.Bold),
                        modifier = Modifier.padding(start = 8.dp)
                    )

                    Text(
                        text = "Kullanılabilir bakiye",
                        style = TextStyle(fontWeight = FontWeight.Bold),
                        modifier = Modifier.padding(top = 24.dp, start = 8.dp)
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 8.dp, start = 8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Text(
                            text = "3293,84TL",
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 18.sp
                            )
                        )
                        Text(
                            text = "Vadesiz",
                            style = TextStyle(color = Color.Gray),
                            modifier = Modifier.padding(end = 8.dp)
                        )
                    }

                    Divider(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 16.dp),
                        thickness = 10.dp,
                        color = Color.Red
                    )
                }

            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.White)
                    .padding(all = 8.dp)
                    .size(100.dp, 150.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(8.dp)
            ) {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {


                    Column(
                        modifier = Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.SpaceBetween,


                        ) {
                        Text(
                            text = "%0 faizli 25.000 TL 'ye varan\n taksitli avans fırsatı için hemen\n Axeess'e başvur! ",
                            style = TextStyle(color = Color.Black, fontWeight = FontWeight.Bold),
                            modifier = Modifier.padding(start = 8.dp, top = 16.dp)

                        )


                        Text(
                            text = "Hemen Başvur!",
                            style = TextStyle(
                                color = Color.Red,
                                fontWeight = FontWeight.Bold
                            ),

                            modifier = Modifier
                                .padding(start = 16.dp, end = 32.dp)
                                .offset(y = -12.dp)


                        )

                    }

                    Image(
                        painter = painterResource(id = R.drawable.kart),
                        modifier = Modifier
                            .size(150.dp, 150.dp)
                            .padding(end = 12.dp, bottom = 12.dp),
                        contentDescription = ""
                    )


                }


            }
            Text(
                text = "KREDİLER VE ARTI PARA",
                style = TextStyle(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(all = 8.dp)
            )

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.White)
                    .padding(all = 8.dp)
                    .size(100.dp, 150.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(8.dp)

            ) {
                Row {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(all = 8.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Text(
                                text = "KREDİ / ARTI PARA ÜRÜNLERİ",
                                style = TextStyle(fontWeight = FontWeight.Bold)

                            )

                            Text(
                                text = "...",
                                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 24.sp)
                            )


                        }

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "İhtiyacına uygun kredi\nseçenekleri incele ve kolayca\nbaşvur!",
                                style = TextStyle(fontWeight = FontWeight.Bold),
                            )

                            Image(
                                painter = painterResource(id = R.drawable.money),
                                contentDescription = "", Modifier.size(90.dp, 90.dp)
                            )
                        }

                        Text(
                            text = "Hemen İncele",
                            style = TextStyle(fontWeight = FontWeight.Bold, color = Color.Red),

                            )
                    }


                }

            }

            Text(
                text = "YATIRIM VE DÖVİZ",
                style = TextStyle(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(all = 8.dp)
            )

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.White)
                    .padding(all = 8.dp)
                    .size(100.dp, 130.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(4.dp)

            ) {
                Column {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "YATIRIMLARIM",
                            style = TextStyle(fontWeight = FontWeight.Bold),
                            modifier = Modifier.padding(all = 8.dp)
                        )

                        Text(
                            text = "...",
                            style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 24.sp),
                            modifier = Modifier.padding(end = 8.dp)
                        )

                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Yatırım işlemi yap ve yatırmlarını\ntakip et",
                            style = TextStyle(fontWeight = FontWeight.Bold),
                            modifier = Modifier.padding(start = 8.dp)
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.dolar),
                            contentDescription = "",
                            Modifier
                                .size(90.dp, 60.dp)
                                .padding(end = 32.dp),
                            tint = Color.Black,


                            )
                    }

                    Text(
                        modifier = Modifier.padding(all = 8.dp),
                        text = "Yatırımlarını Görüntüle",
                        style = TextStyle(fontWeight = FontWeight.Bold, color = Color.Red),

                        )
                }
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.White)
                    .padding(all = 8.dp)
                    .size(100.dp, 50.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(4.dp),
                shape = RectangleShape


            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Son İşlemler",
                        style = TextStyle(fontWeight = FontWeight.Bold),
                        modifier = Modifier.padding(start = 8.dp)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.add),
                        contentDescription = "", modifier = Modifier.size(70.dp, 70.dp)
                    )
                }
            }


            Text(
                text = "İşlemler",
                style = TextStyle(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(start = 8.dp, top = 16.dp)
            )

            IslemlerRow(R.drawable.add,"Başvuru ve nakit ihtiyaçları")
            IslemlerRow(R.drawable.security,"Sigortalar ve bireysel emeklilik")
            IslemlerRow(R.drawable.total,"Tüm Varlıklar")
            IslemlerRow(R.drawable.campaign,"Kampanyalar")

        }


    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AkBankArayüzTasarimTheme {
        Anasayfa()
    }
}


