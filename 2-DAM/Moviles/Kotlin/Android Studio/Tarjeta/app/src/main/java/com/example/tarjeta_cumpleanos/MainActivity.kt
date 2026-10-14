package com.example.tarjeta_cumpleanos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import com.example.tarjeta_cumpleanos.ui.theme.Tarjeta_CumpleanosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tarjeta_CumpleanosTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ScreenRectangle()
                }
            }
        }
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.androidparty)
    Box(modifier = modifier) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        GreetingText(message = message, from = from, modifier = Modifier)
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        Text(
            text = message,
            fontSize = 48.sp,
            textAlign = TextAlign.Center,
            lineHeight = 68.sp,
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(horizontal = 8.dp)
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    Tarjeta_CumpleanosTheme {
        GreetingImage(message = "Happy Birthday Sam!", from = "From Emma")
    }
}

@Preview(showBackground = true)
@Composable
fun TextCodeLabPreview() {
    Tarjeta_CumpleanosTheme {
        Body()
    }
}

@Composable
fun Body() {
    Column {
        HeaderImage()
        BodyText(
            stringResource(R.string.title),
            stringResource(R.string.subtitle),
            stringResource(R.string.body)
        )
    }
}

@Composable
fun TaskAdministrator(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(id = R.drawable.ic_task_completed)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .width(200.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = "All tasks completed",
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 24.dp)
                .padding(bottom = 8.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = "Nice work!",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TaskAdministratorPreview() {
    Tarjeta_CumpleanosTheme {
        TaskAdministrator()
    }
}

@Composable
fun BodyText(title: String, subtitle: String, body: String) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(8.dp)
    ) {
        Text(
            text = title,
            fontSize = 28.sp,
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center,
            lineHeight = 48.sp,
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(horizontal = 8.dp)
        )
        Text(
            text = subtitle,
            fontSize = 18.sp,
            textAlign = TextAlign.Justify,
            style = MaterialTheme.typography.titleMedium,
            lineHeight = 32.sp,
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(horizontal = 8.dp)
        )
        Text(
            text = body,
            fontSize = 14.sp,
            textAlign = TextAlign.Justify,
            style = MaterialTheme.typography.bodyMedium,
            lineHeight = 32.sp,
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(horizontal = 8.dp)
        )
    }
}

@Composable
fun Rectangle(
    color: Color,
    title: String,
    description: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = color)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontSize = 24.sp,
            fontWeight = FontWeight.Black,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = description,
            fontSize = 14.sp,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun ScreenRectangle() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(Modifier.weight(1f)) {
            Rectangle(
                Color(0xFFEADDFF),
                stringResource(R.string.first_title),
                stringResource(R.string.first_description),
                modifier = Modifier.weight(1f)
            )
            Rectangle(
                Color(0xFFD0BCFF),
                stringResource(R.string.second_title),
                stringResource(R.string.second_description),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            Rectangle(
                Color(0xFFB69DF8),
                stringResource(R.string.third_title),
                stringResource(R.string.third_description),
                modifier = Modifier.weight(1f)
            )
            Rectangle(
                Color(0xFFF6EDFF),
                stringResource(R.string.fourth_title),
                stringResource(R.string.fourth_description),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun PresentationCard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_task_completed),
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )
            Text(
                text = "Full name",
                fontSize = 24.sp,
                fontWeight = FontWeight.Black,
                modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
            )
            Text(
                text = "Title",
                fontSize = 14.sp
            )
        }
        Column(
            modifier = Modifier.padding(bottom = 48.dp),
            horizontalAlignment = Alignment.Start
        ) {
            // 1. Teléfono
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 8.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_task_completed),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Text(
                    text = "+00 (00) 000 000",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }

            // 2. Red social
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 8.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_task_completed),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Text(
                    text = "@socialmediahandle",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }

            // 3. Email
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 8.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_task_completed),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Text(
                    text = "email@domain.com",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PresentationCardPreview() {
    Tarjeta_CumpleanosTheme {
        PresentationCard()
    }
}

@Preview(showBackground = true)
@Composable
fun ScreenRectanglePreview() {
    Tarjeta_CumpleanosTheme {
        ScreenRectangle()
    }
}

@Preview(showBackground = true)
@Composable
fun RectanglePreview() {
    Tarjeta_CumpleanosTheme {
        Rectangle(
            Color(0xFFEADDFF),
            stringResource(R.string.first_title),
            stringResource(R.string.first_description)
        )
    }
}

@Composable
fun HeaderImage(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Image(
        painter = image,
        contentDescription = null,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun HeaderImagePreview() {
    Tarjeta_CumpleanosTheme {
        HeaderImage(
            modifier = Modifier
                .size(300.dp)
                .fillMaxSize()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BodyTextPreview() {
    Tarjeta_CumpleanosTheme {
        BodyText(
            stringResource(R.string.title),
            stringResource(R.string.subtitle),
            stringResource(R.string.body)
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tarjeta_CumpleanosTheme {
        Greeting("Android")
    }
}