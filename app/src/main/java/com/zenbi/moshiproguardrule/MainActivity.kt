package com.zenbi.moshiproguardrule

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.zenbi.moshiproguardrule.model.Person
import com.zenbi.moshiproguardrule.ui.theme.MoshiProguardRuleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val person = Person.adapter.fromJson(jsonStr)

        setContent {
            MoshiProguardRuleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting(person?.name ?: "empty")
                }
            }
        }
    }

    companion object {
        private const val jsonStr = "{\"name\":\"Nguyen\"}"
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MoshiProguardRuleTheme {
        Greeting("Android")
    }
}