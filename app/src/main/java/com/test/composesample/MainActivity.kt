package com.test.composesample

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.test.composesample.ui.theme.ComposeSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Column(modifier = Modifier.background(color = Color.LightGray)
//                .fillMaxSize(),
//                horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Top){
//                    Greeting("AB")
//                    Greeting("CDE")
//                    Greeting("FG")
//            }
//            Row(modifier = Modifier.background(color = Color.LightGray)
//                .fillMaxSize(),
//                horizontalArrangement = Arrangement.Center,
//                verticalAlignment = Alignment.Bottom){
//                Greeting("AB")
//                Greeting("CDE")
//                Greeting("FG")
//            }

//            BoxExample3()
            
            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                ButtonDemo()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
    fontSize =  32.sp,
    fontWeight = FontWeight.Bold,
    color = Color.Red,
    textAlign = TextAlign.Center,
    modifier = Modifier
        .background(color = Color.Yellow)
        .border(2.dp, color = Color.Green)
        .padding(10.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeSampleTheme {
        Greeting("Jetpack")
    }
}

@Composable
fun BoxExample1(){
    Box(
        modifier = Modifier
            .background(color = Color.Green)
            .size(180.dp, 300.dp)
    ){
        Box(
            modifier = Modifier
                .background(color = Color.Yellow)
                .size(125.dp, 100.dp)
                .align(Alignment.TopEnd)
        ){

        }
        Text(text = "Hi",
        style = MaterialTheme.typography.h3,
            modifier = Modifier
                .background(color = Color.White)
                .size(90.dp, 50.dp)
                .align(Alignment.BottomCenter)
        )
    }
}

@Composable
fun BoxExample2(){
    Box(
        modifier = Modifier
            .background(color = Color.LightGray)
            .fillMaxSize()
    ){

        Text(
            style = MaterialTheme.typography.h5,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.TopStart),
            text = "Top Start"
        )

        Text(
            style = MaterialTheme.typography.h5,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.TopCenter),
            text = "Top Center"
        )

        Text(
            style = MaterialTheme.typography.h5,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.TopEnd),
            text = "Top End"
        )

        Text(
            style = MaterialTheme.typography.h5,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.CenterStart),
            text = "Center Start"
        )

        Text(
            style = MaterialTheme.typography.h5,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.Center),
            text = "Center"
        )

        Text(
            style = MaterialTheme.typography.h5,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.CenterEnd),
            text = "Center End"
        )
        Text(
            style = MaterialTheme.typography.h5,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.BottomStart),
            text = "Bottom Start"
        )

        Text(
            style = MaterialTheme.typography.h5,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.BottomCenter),
            text = "Bottom Center"
        )

        Text(
            style = MaterialTheme.typography.h5,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.BottomEnd),
            text = "Bottom End"
        )
    }
}

@Composable
fun BoxExample3(){
    Box(){
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Android Background"
        )
        Text(text = "Android Background",
        style = MaterialTheme.typography.h4,
        color = Color.Black,
        modifier =  Modifier
            .align(Alignment.BottomStart))

        Button(
            onClick = {},
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = Color.White,
                contentColor = Color.DarkGray
            ),
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(10.dp)
                .border(5.dp, Color.DarkGray, RectangleShape)

        ){
            Text(text = "Add to Cart")
        }
    }
}

@Composable
fun ButtonDemo(){
    val context = LocalContext.current
    Button(onClick = {
        Toast.makeText(context, "Clicked on Button", Toast.LENGTH_LONG).show()
    },
    enabled = false
    ){
        Text(text = "Add To Cart")
    }

    TextButton(onClick = {
        Toast.makeText(context, "Clicked on Text Button", Toast.LENGTH_LONG).show()
    }
    ){
        Text(text = "Add To Cart")
    }

    OutlinedButton(onClick = {
        Toast.makeText(context, "Clicked on Outlined Button", Toast.LENGTH_LONG).show()
    }
    ){
        Text(text = "Add To Cart")
    }
    
    IconButton(onClick = { Toast.makeText(context, "Clicked on Refresh Button", Toast.LENGTH_LONG).show()}) {
        Icon(
            Icons.Filled.Refresh,
            contentDescription = "Refresh Button",
            tint = Color.DarkGray,
            modifier = Modifier.size(80.dp))
    }

    Button(onClick = {
        Toast.makeText(context, "Add to Cart", Toast.LENGTH_LONG).show()
    },
        shape = CutCornerShape(10.dp),
    contentPadding = PaddingValues(16.dp),
        border = BorderStroke(10.dp, Color.Black),
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = Color.DarkGray,
            contentColor = Color.White
        )
        ) {
        Text(text = "Add To Cart",
            style = MaterialTheme.typography.h3,
            modifier = Modifier.padding(5.dp)
            )
    }

    Button(onClick = {
        Toast.makeText(context, "Add to Cart", Toast.LENGTH_LONG).show()
    },
        shape = CircleShape,
        contentPadding = PaddingValues(16.dp),
        border = BorderStroke(10.dp, Color.Black),
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = Color.DarkGray,
            contentColor = Color.White
        )
    ) {
        Text(text = "Add To Cart ",
            style = MaterialTheme.typography.h3,
            modifier = Modifier.padding(5.dp)
        )
    }
}
