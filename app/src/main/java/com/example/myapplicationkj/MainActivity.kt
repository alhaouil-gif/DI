package com.example.myapplicationkj

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplicationkj.ui.theme.MyApplicationkjTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationkjTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize().background(Color.Cyan)
    ) {
        Spacer(modifier = Modifier.height(70.dp)) // Espacio desde arriba

        Row(

            modifier = Modifier.width(350.dp).height(100.dp).background(Color.Black)
        )
        {
            Column(
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier.width(150.dp).padding(top = 40.dp).padding(start = 10.dp)
            ) {
                Text(text = "¡Hello Android!", modifier = Modifier.background(Color.White))
            }
            Spacer(modifier = Modifier.width(80.dp))

            Column(
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier.width(120.dp).padding(top = 40.dp)
            ) {
                Text(text = "¡Hello Android!", modifier = Modifier.background(Color.Cyan))
            }

        }
        Row(

            modifier = Modifier.width(350.dp).height(200.dp).background(Color.Gray)
        )
        {
            Spacer(modifier = Modifier.width(100.dp))

            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.width(250.dp).padding(top = 40.dp)
            )
            {
                Text(text = "¡Hello Android!", modifier = Modifier.background(Color.Yellow))


                Text(
                    text = "¡Hello Android!",
                    modifier = Modifier.height(60.dp).background(Color.Red).padding(top = 20.dp)
                )

                Text(
                    text = "¡Hello Android!", modifier = Modifier.background(Color.White)
                )

            }

        }
        Column(
            modifier = Modifier
                .width(350.dp).height(195.dp)
                .background(Color.Green)
                ,
            horizontalAlignment = Alignment.End
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(0.6f)
                    .background(Color.Blue).height(65.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(onClick = {},Modifier.aspectRatio(1f), shape = CircleShape) { Text("1") }
                Button(onClick = {}, Modifier.aspectRatio(1f),shape = CircleShape) { Text("2") }
                Button(onClick = {}, Modifier.aspectRatio(1f),shape = CircleShape) { Text("3") }
            }


            Row(
                modifier = Modifier
                    .fillMaxWidth(0.75f)
                    .background(Color.Yellow).height(65.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(onClick = {}, Modifier.aspectRatio(1f),shape = CircleShape) { Text("4") }
                Button(onClick = {},Modifier.aspectRatio(1f) ,shape = CircleShape) { Text("5") }
                Button(onClick = {},Modifier.aspectRatio(1f) ,shape = CircleShape) { Text("6") }
            }


            Row(
                modifier = Modifier
                    .fillMaxWidth(0.6f)
                    .background(Color.White).height(65.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(onClick = {}, Modifier.aspectRatio(1f), shape = CircleShape) { Text("7") }
                Button(onClick = {},Modifier.aspectRatio(1f), shape = CircleShape) { Text("8") }
                Button(onClick = {},Modifier.aspectRatio(1f), shape = CircleShape) { Text("9") }
            }
        }


    }

}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationkjTheme {
        Greeting("Android")
    }
}