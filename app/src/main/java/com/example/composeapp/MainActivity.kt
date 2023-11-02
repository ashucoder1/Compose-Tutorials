package com.example.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAppTheme {
                // A surface container using the 'background' color from the theme

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                )
                {

//                    CustomText()
//                    Greeting()
                    Column(modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Gray)
                        .padding(24.dp)
                    ) {
//                        CustomItem(weight = 3f, color = MaterialTheme.colorScheme.secondary)
//                        CustomItem(weight = 1f, color = MaterialTheme.colorScheme.primary)
                        ExpandableCard(title="MY Final Title",
                            description = "sdfdsdffdfffsdfs" +
                                    "sdfsdfsfdfdsdffsfdsdfsd" +
                                    "sfsdfdfdfsdfdsfdfdsfdsdf" +
                                    "sdfdffsffjhhjjmhhjmmhmhm"
                        )

                    }
                }
            }
        }
    }
}


@Composable
fun ColumnScope.CustomItem(weight:Float ,color:Color){
    Surface(modifier = Modifier
        .width(200.dp)
        .padding(vertical = 10.dp)
        .weight(weight),
        color=color)
        {}
}
@Composable
fun Greeting(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Green),
        contentAlignment = Alignment.Center){
        Box(modifier= Modifier
            .background(Color.Blue)
            .verticalScroll(rememberScrollState())
        ,contentAlignment = Alignment.TopCenter){
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color.LightGray))
            Text(text = "I luv U,,, great entry of you", fontSize = 40.sp)
        }
    }
}

@Composable
fun CustomText(){

    Column {
        SelectionContainer {
            Text(text = "Hello boi", modifier = Modifier.size(20.dp)
            , fontFamily = FontFamily.SansSerif)
        }
        DisableSelection {
            Text(text = "Hello boi", modifier = Modifier.size(20.dp))
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeAppTheme {
//        Greeting()
        ExpandableCard(title="MY Final Title",
            description = "sdfdsdffdfffsdfs" +
                    "sdfsdfsfdfdsdffsfdsdfsd" +
                    "sfsdfdfdfsdfdsfdfdsfdsdf" +
                    "sdfdffsffjhhjjmhhjmmhmhm"
        )
//        Column(modifier = Modifier.height(500.dp),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            ) {
//                CustomItem(weight = 3f, color = MaterialTheme.colorScheme.secondary)
//                CustomItem(weight = 1f, color = MaterialTheme.colorScheme.primary)
//
//            }


    }
}