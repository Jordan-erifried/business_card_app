package com.example.mycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycard.ui.theme.MyCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xff006064)
                ) {
                    MyCardWithText(stringResource(R.string.name_text), stringResource(R.string.job_title_text))
                }
            }
        }
    }
}

@Composable
fun MyCardWithText(name: String, jobTitle: String) {
      Column(
          modifier = Modifier.fillMaxSize(),
          verticalArrangement = Arrangement.Center,
          horizontalAlignment = Alignment.CenterHorizontally,
      ) {
            MyCardWithImage()
            Text(
                text = name,
                fontSize = 24.sp,
                modifier = Modifier.padding( end = 8.dp)
            )
          Spacer(modifier = Modifier.height(10.dp))
          Text(
              text = jobTitle,
              fontSize = 16.sp,
              textAlign = TextAlign.Center,
              color = Color(0xFF3ddc84)
          )

      }

    Column(
       modifier = Modifier
           .fillMaxWidth()
           .padding(top = 500.dp)
           .padding(bottom = 70.dp),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ){
        Divider(color = Color.White, thickness = 1.dp)
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp),
                ) {
            val icon = painterResource(R.drawable.call)
            Icon(
                painter = icon,
                contentDescription = null,
                modifier = Modifier.padding(start = 60.dp),
                Color(0xFF3ddc84)
            )
            Text("+225 0789312357", modifier = Modifier.padding(start = 30.dp))
        }
        Divider(color = Color.White, thickness = 1.dp)

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp),
        ) {
            val icon = painterResource(R.drawable.share)
            Icon(
                painter = icon,
                contentDescription = null,
                modifier = Modifier.padding(start = 60.dp),
                Color(0xFF3ddc84)
            )
            Text("@AndroidDev", modifier = Modifier.padding(start = 30.dp))
        }
        Divider(color = Color.White, thickness = 1.dp)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp),
        ) {
            val icon = painterResource(R.drawable.mail)
            Icon(
                painter = icon,
                contentDescription = null,
                modifier = Modifier.padding(start = 60.dp),
                Color(0xFF3ddc84)
            )
            Text("danerifried@gmail.com", modifier = Modifier.padding(start = 30.dp))
        }
    }

}

@Composable
fun MyCardWithImage() {
    val image = painterResource(id = R.drawable.android_logo)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier.size(100.dp)

    )
}

@Preview(showBackground = true)
@Composable
fun MyCardPreview() {
    MyCardTheme {
        MyCardWithText(stringResource(R.string.name_text), stringResource(R.string.job_title_text))
    }
}