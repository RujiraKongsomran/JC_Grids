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
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
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
import com.rujirakongsomran.jc_grids.ui.theme.GridBackground3
import com.rujirakongsomran.jc_grids.ui.theme.JC_GridsTheme
import kotlin.random.Random

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
    val icon = listOf(
        "\uD83C\uDF47",
        "\uD83C\uDF48",
        "\uD83C\uDF49",
        "\uD83C\uDF4A",
        "\uD83C\uDF4B",
        "\uD83C\uDF4C",
        "\uD83C\uDF4D",
        "\uD83E\uDD6D",
        "\uD83C\uDF4E",
        "\uD83C\uDF4F",
        "\uD83C\uDF50",
        "\uD83C\uDF51",
        "\uD83C\uDF52",
        "\uD83C\uDF53",
        "\uD83E\uDD5D",
    )
    LazyVerticalGrid(
        cells = GridCells.Fixed(3),
        contentPadding = PaddingValues(8.dp)
    ) {
        items(icon) { item ->
            Card(
                modifier = Modifier.padding(4.dp),
                backgroundColor = Color(
                    red = Random.nextInt(0, 255),
                    green = Random.nextInt(0, 255),
                    blue = Random.nextInt(0, 255)
                )
            )
            {
                Text(
                    text = item,
                    fontSize = 40.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(20.dp),
                )
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