package com.jdiproductionz.wayfare

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jdiproductionz.wayfare.ui.theme.WayfareTheme

class Providers : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WayfareTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}



@Composable
fun MainScreen(){
    val context = LocalContext.current
    val ubz = painterResource(id = R.drawable.ubzlogo)
    val pow = painterResource(id = R.drawable.powlogo)
    val lik = painterResource(id = R.drawable.liklogo)
    val sha = painterResource(id = R.drawable.shalogo)
    val mja = painterResource(id = R.drawable.mjalogo)
    val crh = painterResource(id = R.drawable.crhlogo)
    Column(modifier = Modifier.fillMaxSize()){
        Spacer(modifier = Modifier.height(20.dp))
        Row(horizontalArrangement = Arrangement.Center) {
            Text(text = "Choose a Provider", fontSize = 40.sp)
        }

        Spacer(modifier = Modifier.height(50.dp))
        Column {
            Row(horizontalArrangement = Arrangement.Center) {
                ItemCards(title = "Power Tools", image = pow, contentDescription = "Tools", "Shalom" )
                ItemCards(title = "Shalom", image = sha, contentDescription = "Tools", "Power" )
            }
            Row(horizontalArrangement = Arrangement.Center) {
                ItemCards(title = "UBZ Company", image = ubz, contentDescription = "Tools", "UBZ" )
                ItemCards(title = "Likili", image = lik, contentDescription = "Tools", "Likili" )
            }
            Row(horizontalArrangement = Arrangement.Center) {
                ItemCards(title = "CR Holdings", image = crh, contentDescription = "Tools", "CRH" )
                ItemCards(title = "Mazhandu Bus", image = mja, contentDescription = "Tools", "Mazhandu")
            }
        }
    }
}

@Composable
fun ItemCards(title: String, image: Painter, contentDescription: String, name: String){
    val context = LocalContext.current
    Card(
        modifier = Modifier
            .padding(3.dp)
            .width(189.dp)
            .height(150.dp)
            .clickable {
                val navigate = Intent(context, Shalom::class.java)
                context.startActivity(navigate)
            },
        elevation = CardDefaults.cardElevation(4.dp),
        shape = RoundedCornerShape(7.dp),
        colors = CardDefaults.cardColors(Color(0xFFBFDBF7))
    ){
        Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()) {
            Spacer(modifier = Modifier.height(1.dp))
            Card(elevation = CardDefaults.cardElevation(2.dp), shape = RoundedCornerShape(7.dp), modifier = Modifier
                .height(110.dp)
                .width(175.dp)) {
                Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()) {
                    Image(painter = image, contentDescription = contentDescription, modifier = Modifier.fillMaxSize(), contentScale = ContentScale.FillBounds)
                }

            }
            Spacer(modifier = Modifier.width(1.dp))
            Row {
                Spacer(modifier = Modifier.width(8.dp))
                Column(horizontalAlignment = Alignment.Start, modifier = Modifier.fillMaxWidth()) {
                    Text(text = title)
                    Spacer(modifier = Modifier.width(0.dp))
                }
            }


        }

    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    WayfareTheme {
        MainScreen()
    }
}