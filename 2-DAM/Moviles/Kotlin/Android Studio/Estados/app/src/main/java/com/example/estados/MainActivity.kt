package com.example.estados

import android.content.ContentValues.TAG
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.util.Log.d
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.estados.ui.theme.EstadosTheme
import kotlin.math.log

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EstadosTheme {
                Greeting(modifier = Modifier.fillMaxSize())
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy!!!")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart!!!")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume!!!")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause!!!")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop!!!")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart!!!")
    }



    @Composable
    fun Greeting(modifier: Modifier = Modifier) {
        var numero by rememberSaveable { mutableIntStateOf(0) }
        Column(
            modifier = modifier, verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Text("$numero",fontSize = 96.sp, modifier = Modifier.clickable {
                numero++
            })

        }
    }


}

