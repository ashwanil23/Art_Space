package com.example.artspace

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceTheme {
                    ArtImage()
                }
            }
        }
    }
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ArtImage() {
    var nextImage by remember { mutableIntStateOf(0) }
    var nextText by remember { mutableIntStateOf(0) }

    Scaffold (
        modifier = Modifier.padding(top = 40.dp),
        topBar ={

        }
    ){
        Column(
            Modifier.
            wrapContentSize(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Column (Modifier
                    .weight(3.5f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                when(nextImage){
                    0 -> {
                        Image(painter = painterResource(id = R.drawable.saint_james_minor_1952_5_15),
                            contentDescription = stringResource(id =R.string.Saint_James_Minor_1952_5_15),
                        )
                    }
                    1 -> {
                        Image(painter = painterResource(id = R.drawable.portrait_of_a_woman_1956_12_1),
                            contentDescription = stringResource(id =R.string.Portrait_of_a_Woman),
                        )
                    }
                    2 -> {
                        Image(painter = painterResource(id = R.drawable.the_mourning_madonna_1952_5_13),
                            contentDescription = stringResource(id =R.string.The_Mourning_Madonna),
                        )
                    }
                    3 -> {
                        Image(painter = painterResource(id = R.drawable.enthroned_madonna_and_child_1949_7_1),
                            contentDescription = stringResource(id =R.string.Enthroned_Madonna_and_Child),
                        )
                    }
                    4 -> {
                        Image(painter = painterResource(id = R.drawable.madonna_and_child_enthroned_with_four_saints_1952_5_12),
                            contentDescription = stringResource(id =R.string.Madonna_and_Child_Enthroned_With_Four_Saints),
                        )
                    }
                    5 -> {
                        Image(painter = painterResource(id = R.drawable.madonna_and_child_on_a_curved_throne_1937_1_1),
                            contentDescription = stringResource(id =R.string.Madonna_and_Child_on_a_Curved_Throne),
                        )
                    }
                    6 -> {
                        Image(painter = painterResource(id = R.drawable.the_nativity_with_the_prophets_isaiah_and_ezekiel_1937_1_8),
                            contentDescription = stringResource(id =R.string.The_Nativity_with_the_Prophets_Isaiah_and_Ezekiel),
                        )
                    }
                    7 -> {
                        Image(painter = painterResource(id = R.drawable.madonna_and_child_with_saint_john_the_baptist__saint_peter__and_two_angels_1952_5_60),
                            contentDescription = stringResource(id =R.string.Madonna_and_Child_with_Saint_John_the_Baptist_Saint_Peter_and_Two_Angels),
                        )
                    }
                    8 -> {
                        Image(painter = painterResource(id = R.drawable.maesta__madonna_and_child_with_four_angels__1961_9_77),
                            contentDescription = stringResource(id =R.string.maesta_madonna_and_child_with_four_angels_1961_9_77),
                        )
                    }
                    9 -> {
                        Image(painter = painterResource(id = R.drawable.saint_john_the_evangelist_1952_5_16),
                            contentDescription = stringResource(id =R.string.Saint_John_the_Evangelist),
                        )
                    }
                    10 -> {
                        Image(painter = painterResource(id = R.drawable.the_calling_of_the_apostles_peter_and_andrew_1939_1_141),
                            contentDescription = stringResource(id =R.string.the_calling_of_the_apostles_peter_and_andrew),
                        )
                    }
                    11 -> {
                        Image(painter = painterResource(id = R.drawable.the_mourning_saint_john_the_evangelist_1952_5_14),
                            contentDescription = stringResource(id =R.string.The_Mourning_Saint_John_the_Evangelist),
                        )
                    }
                }
            }
            Column(
                Modifier.
                fillMaxWidth().
                weight(1.6f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                when(nextText){
                    0 -> {
                        Text(modifier = Modifier
                            .padding(4.dp)
                            .fillMaxWidth()
                            , text = stringResource(id = R.string.Saint_James_Minor_1952_5_15),
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,

                        )
                        Text(modifier = Modifier.
                            fillMaxWidth().
                            padding(4.dp),
                            text = "Master of Saint Francis (C.1272)",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center)
                    }
                    1 -> {
                        Text(modifier = Modifier
                            .padding(4.dp)
                            .fillMaxWidth()
                            , text = stringResource(id = R.string.Portrait_of_a_Woman),
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                        Text(modifier = Modifier.fillMaxWidth(),
                            text = "Egyptian 2nd Century (2nd century)",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center)
                    }
                    2 -> {
                        Text(modifier = Modifier
                            .padding(4.dp)
                            .fillMaxWidth()
                            , text = stringResource(id = R.string.The_Mourning_Madonna),
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                        Text(modifier = Modifier.fillMaxWidth(),
                            text = "Master of the Franciscan Crucifixes (C.1270/1275)",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center)
                    }
                    3 -> {
                        Text(modifier = Modifier
                            .padding(4.dp)
                            .fillMaxWidth()
                            , text = stringResource(id = R.string.Enthroned_Madonna_and_Child),
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                        Text(modifier = Modifier.fillMaxWidth(),
                            text = "Byzantine 13th Century (possibly from Constantinople) (C.1260/1280)",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center)
                    }
                    4 -> {
                        Text(modifier = Modifier
                            .padding(4.dp)
                            .fillMaxWidth()
                            , text = stringResource(id = R.string.Madonna_and_Child_Enthroned_With_Four_Saints),
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                        Text(modifier = Modifier.fillMaxWidth(),
                            text = "Margaritone d'Arezzo (C.1240/1245)",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center)
                    }
                    5 -> {
                        Text(modifier = Modifier
                            .padding(4.dp)
                            .fillMaxWidth()
                            , text = stringResource(id = R.string.Madonna_and_Child_on_a_Curved_Throne),
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                        Text(modifier = Modifier.fillMaxWidth(),
                            text = "Byzantine 13th Century (possibly from Constantinople) (C.1260/1280)",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center)
                    }
                    6 -> {
                        Text(modifier = Modifier
                            .padding(4.dp)
                            .fillMaxWidth()
                            , text = stringResource(id = R.string.The_Nativity_with_the_Prophets_Isaiah_and_Ezekiel),
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                        Text(modifier = Modifier.fillMaxWidth(),
                            text = "Duccio di Buoninsegna (1308-1311)",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center)
                    }
                    7 -> {
                        Text(modifier = Modifier
                            .padding(4.dp)
                            .fillMaxWidth()
                            , text = stringResource(id = R.string.Madonna_and_Child_with_Saint_John_the_Baptist_Saint_Peter_and_Two_Angels),
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                        Text(modifier = Modifier.fillMaxWidth(),
                            text = "Tuscan 13th Century (C.1290)",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center)
                    }
                    8 -> {
                        Text(modifier = Modifier
                            .padding(4.dp)
                            .fillMaxWidth()
                            , text = stringResource(id = R.string.maesta_madonna_and_child_with_four_angels_1961_9_77),
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                        Text(modifier = Modifier.fillMaxWidth(),
                            text = "Master of Città di Castello (C.1290)",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center)
                    }
                    9 -> {
                        Text(modifier = Modifier
                            .padding(4.dp)
                            .fillMaxWidth()
                            , text = stringResource(id = R.string.Saint_John_the_Evangelist),
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                        Text(modifier = Modifier.fillMaxWidth(),
                            text = "Master of Saint Francis (C.1272)",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center)
                    }
                    10 -> {
                        Text(modifier = Modifier
                            .padding(4.dp)
                            .fillMaxWidth()
                            , text = stringResource(id = R.string.the_calling_of_the_apostles_peter_and_andrew),
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                        Text(modifier = Modifier.fillMaxWidth(),
                            text = "Duccio di Buoninsegna (1308-1311)",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center)
                    }
                    11 -> {
                        Text(modifier = Modifier
                            .padding(4.dp)
                            .fillMaxWidth()
                            , text = stringResource(id = R.string.The_Mourning_Saint_John_the_Evangelist),
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                        Text(modifier = Modifier.fillMaxWidth(),
                            text = "Master of the Franciscan Crucifixes (C.1270/1275)",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center)
                    }
                }

            }

            Column(
                Modifier.
                fillMaxWidth().
                padding(top = 24.dp).
                weight(2f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                Row(Modifier.
                    padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically) {
                    Button(onClick = { if(nextImage > 0 && nextText > 0){
                        nextImage --
                        nextText --
                    }else if (nextImage == 0 && nextText == 0){
                        nextImage = 11
                        nextText = 11
                    } },
                        Modifier.weight(1f)) {
                        Text(text = "Previous")
                    }

                    Spacer(modifier = Modifier.padding(16.dp))

                    Button(onClick = { if(nextImage < 11 && nextText < 11){
                        nextImage ++
                        nextText ++
                    }else if (nextImage == 11 && nextText == 11){
                        nextImage = 0
                        nextText = 0
                    } },
                        Modifier.weight(1f)) {
                        Text(text = "Next",
                            textAlign = TextAlign.Center)
                    }
                }
            }

        }
    }
}

@Composable
fun GetArtImage(){

}

@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun ArtSpaceThemePreview() {
    ArtSpaceTheme {
        ArtImage()
    }
}