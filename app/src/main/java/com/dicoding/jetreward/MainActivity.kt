package com.dicoding.jetreward

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.dicoding.jetreward.ui.theme.JetRewardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetRewardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize().background( brush = Brush.verticalGradient(
                        colors = listOf(Color(0xFFFBC405), Color(0xFFFA4C05)),
                        startY = 0f,
                        endY = 2000f
                    )),
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                ) {
                    JetRewardApp()
                }
            }
        }
    }
}