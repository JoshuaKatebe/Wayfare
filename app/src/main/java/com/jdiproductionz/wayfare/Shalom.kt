package com.jdiproductionz.wayfare

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jdiproductionz.wayfare.ui.theme.WayfareTheme

class Shalom : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WayfareTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen3()
                }
            }
        }
    }
}


@Composable
fun MainScreen3(){
    val sha1 = painterResource(id = R.drawable.sha1)
    val sha2 = painterResource(id = R.drawable.sha2)
    val sha3 = painterResource(id = R.drawable.sha3)
    val sha4 = painterResource(id = R.drawable.sha4)
    val sha5 = painterResource(id = R.drawable.sha5)
    val sha6 = painterResource(id = R.drawable.sha6)

    Column {
        Slide(
            title = "Shalom Travel Services" ,
            image = sha1,
            image2 = sha2,
            image3 = sha3,
            image4 = sha4,
            image5 = sha5,
            image6 = sha6
        )


    }

}

@Composable
fun Slide(title: String, image: Painter, image2: Painter, image3: Painter, image4: Painter, image5: Painter, image6: Painter){
    Column(modifier = Modifier.fillMaxSize()) {
        LazyColumn{
            items(1){
                LazyRow(){
                    items(1){
                        Image(painter = image, contentDescription = null, contentScale = ContentScale.FillBounds, modifier = Modifier.height(400.dp))
                        Spacer(modifier = Modifier.width(3.dp))
                        Image(painter = image2, contentDescription = null, contentScale = ContentScale.FillBounds, modifier = Modifier.height(400.dp))
                        Spacer(modifier = Modifier.width(3.dp))
                        Image(painter = image3, contentDescription = null, contentScale = ContentScale.FillBounds, modifier = Modifier.height(400.dp))
                        Spacer(modifier = Modifier.width(3.dp))
                        Image(painter = image4, contentDescription = null, contentScale = ContentScale.FillBounds, modifier = Modifier.height(400.dp))
                        Spacer(modifier = Modifier.width(3.dp))
                        Image(painter = image5, contentDescription = null, contentScale = ContentScale.FillBounds, modifier = Modifier.height(400.dp))
                        Spacer(modifier = Modifier.width(3.dp))
                        Image(painter = image6, contentDescription = null, contentScale = ContentScale.FillBounds, modifier = Modifier.height(400.dp))
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = title, fontSize = 29.sp)
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "Shalom Bus Services is a reputable transport company in Zambia, offering quality coach services since 1996. They operate a fleet of 36 buses, including luxury coaches and standard buses, catering to everyday travelers, business travelers and tourists")
                Spacer(modifier = Modifier.height(60.dp))
                Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
                    Button(
                        onClick = {

                        },
                        modifier = Modifier
                            .width(250.dp)
                            .height(50.dp)
                    ) {
                        Text(text = "Buy Ticktets")
                    }
                }




            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    WayfareTheme {
        MainScreen3()
    }
}