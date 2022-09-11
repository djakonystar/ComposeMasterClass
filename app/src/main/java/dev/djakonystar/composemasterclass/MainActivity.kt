package dev.djakonystar.composemasterclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.djakonystar.composemasterclass.ui.theme.ComposeMasterClassTheme
import dev.djakonystar.composemasterclass.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeMasterClassTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Preview()
@Composable
fun Greeting() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(colorResource(id = R.color.teal_200))
        ) {
            Spacer(modifier = Modifier.height(32.dp))
            Row {
                Spacer(modifier = Modifier.width(20.dp))
                Image(
                    painter = painterResource(id = R.drawable.potter),
                    contentDescription = "imageView",
                    modifier = Modifier
                        .size(56.dp)
                        .clip(RoundedCornerShape(28.dp)),
                    contentScale = ContentScale.Crop,
                )
            }
            Spacer(modifier = Modifier.height(32.dp))
            Text(
                text = "Apartments savings",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 14.sp,
                ),
                modifier = Modifier.padding(start = 20.dp)
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {
                Text(
                    text = "$700.55",
                    style = Typography.h2,
                )
                Text(
                    text = "of 50m",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 14.sp,
                    ),
                    modifier = Modifier.align(Alignment.CenterEnd)
                )
            }
            
            Spacer(modifier = Modifier.height(32.dp))
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
            shape = RectangleShape
        ) {
            Box(
                modifier = Modifier
                    .padding(
                        horizontal = 20.dp,
                        vertical = 20.dp
                    )
                    .fillMaxWidth()
            ) {
                Text(
                    "Saving 5% of daily pay",
                    style = TextStyle(
                        fontWeight = FontWeight(500),
                        color = Color.Black,
                        fontSize = 16.sp
                    )
                )

                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "forward",
                    modifier = Modifier.align(Alignment.CenterEnd),
                    tint = Color.LightGray
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Box(
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .fillMaxWidth()
        ) {
            Text(
                "Activity",
                style = TextStyle(
                    fontWeight = FontWeight(500),
                    color = Color.Black,
                    fontSize = 16.sp
                )
            )
            Row(modifier = Modifier.align(Alignment.CenterEnd)) {
                Text(
                    "View All",
                    style = TextStyle(
                        fontSize = 14.sp,
                    ),
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "forward",
                    tint = Color.LightGray
                )
            }
        }

        Card(modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth(),
            shape = RoundedCornerShape(20.dp)
        ) {
            LazyColumn {
                items(50) {
                    MyItem()
                    Divider(
                        thickness = 0.5.dp,
                    )
                }
            }
        }
    }
}

@Composable
fun MyItem() {
    Box(modifier = Modifier
        .padding(20.dp)
        .fillMaxWidth()) {
        Column {
            Text("5% of $2500", style = TextStyle(
                fontSize = 16.sp,
            ))

            Text("Dec 25", style = TextStyle(
                fontSize = 14.sp,
                color = Color.LightGray
            ))
        }

        Text("Something", style = TextStyle(
            fontSize = 14.sp,
            color = Color.LightGray
        ),
            modifier = Modifier.align(Alignment.CenterEnd))
    }
}
