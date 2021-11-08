package com.rujirakongsomran.jc_grids

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.LinearGradientShader
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rujirakongsomran.jc_grids.ui.theme.GridBackground1
import com.rujirakongsomran.jc_grids.ui.theme.GridBackground2
import com.rujirakongsomran.jc_grids.ui.theme.JC_GridsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC_GridsTheme {
                // A surface container using the 'background' color from the theme

            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ShowGrid() {
    val data = listOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5")
    LazyVerticalGrid(
        cells = GridCells.Fixed(3),
        contentPadding = PaddingValues(8.dp)
    ) {
        items(data) { item ->
            Card(
                modifier = Modifier.padding(4.dp),
                backgroundColor = Color.Transparent

            )
            {
                Box(
                    modifier = Modifier.background(
                        Brush.linearGradient(
                            listOf(
                                GridBackground1,
                                GridBackground2
                            )
                        )
                    )
                ) {
                    Text(
                        text = item,
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(24.dp),
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Monospace
                    )
                }
            }
        }
    }
}


@Preview
@Composable
fun ShowGridPreview() {
    JC_GridsTheme {
        ShowGrid()
    }
}