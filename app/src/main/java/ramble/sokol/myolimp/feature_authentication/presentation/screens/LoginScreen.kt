package ramble.sokol.myolimp.feature_authentication.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.indication
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TextFieldDefaults.indicatorLine
import androidx.compose.material3.contentColorFor
import androidx.compose.material3.minimumInteractiveComponentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import ramble.sokol.myolimp.R
import ramble.sokol.myolimp.ui.theme.BlueStart
import ramble.sokol.myolimp.ui.theme.OlimpTheme
import ramble.sokol.myolimp.ui.theme.Transparent

@Destination
@Composable
fun LoginScreen(
    navigator: DestinationsNavigator
) {
    OlimpTheme {
        var tabIndex by remember { mutableStateOf(0) } // 1.
        val tabTitles = listOf("Почта", "Номер телефона")
        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .padding(0.05184.dp)
                    .width(100.dp)
                    .height(24.dp),
                painter = painterResource(id = R.drawable.vector),
                contentDescription = "image description",
                //contentScale = ContentScale.None
            )
            Text(
                modifier = Modifier
                    .width(220.dp)
                    .height(40.dp),
                text = "Вход в сервис",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 20.sp,
                    //fontFamily = FontFamily(Font(R.font.)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF222222),
                    textAlign = TextAlign.Center,
                )
            )
            TabRow(selectedTabIndex = tabIndex) { // 3.
                tabTitles.forEachIndexed { index, title ->
                    Tab(

                        selected = tabIndex == index, // 4.
                        onClick = { tabIndex = index },
                        text = { Text(text = title,
                            color = Color.Black) }) // 5.
                }
            }
            when (tabIndex) { // 6.
                0 -> LoginEmailScreen()
                1 -> LoginPhoneScreen()
            }


        }
    }
}


@Destination
@Composable
fun LoginEmailScreen() {
    OlimpTheme {
        var name by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                modifier = Modifier
                    .width(320.dp)
                    .height(15.dp),
                text = "Почта",
                style = TextStyle(
                    fontSize = 13.sp,
                    lineHeight = 15.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF222222),
                )
            )
            Spacer(modifier = Modifier.height(8.dp))

            TextField(
                modifier = Modifier
                    .width(331.dp)
                    .height(45.dp),
                value = name,
                singleLine = true,
                onValueChange = { value -> name = value },
            )
            Spacer(modifier = Modifier.height(24.dp))

            Text(
                modifier = Modifier
                    .width(320.dp)
                    .height(15.dp),
                text = "Пароль",
                style = TextStyle(
                    fontSize = 13.sp,
                    lineHeight = 15.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF222222),
                )
            )
            Spacer(modifier = Modifier.height(8.dp))

            TextField(
                modifier = Modifier
                    .width(331.dp)
                    .height(45.dp),
                value = password,
                singleLine = true,
                onValueChange = { value -> password = value },
            )
            Spacer(modifier = Modifier.height(24.dp))

            Button(onClick = {}){
                Text("Click", fontSize = 25.sp)
            }
        }
    }
}

@Destination
@Composable
fun LoginPhoneScreen() {
    OlimpTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            var name by remember { mutableStateOf("") }
            var password by remember { mutableStateOf("") }
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    modifier = Modifier
                        .width(320.dp)
                        .height(15.dp),
                    text = "Номер телефона",
                    style = TextStyle(
                        fontSize = 13.sp,
                        lineHeight = 15.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF222222),
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))

                TextField(
                    modifier = Modifier
                        .width(331.dp)
                        .height(45.dp),
                    value = name,
                    singleLine = true,
                    onValueChange = { value -> name = value },
                )
                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    modifier = Modifier
                        .width(320.dp)
                        .height(15.dp),
                    text = "Пароль",
                    style = TextStyle(
                        fontSize = 13.sp,
                        lineHeight = 15.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF222222),
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))

                TextField(
                    modifier = Modifier
                        .width(331.dp)
                        .height(45.dp),
                    value = password,
                    singleLine = true,
                    onValueChange = { value -> password = value },
                )
                Spacer(modifier = Modifier.height(24.dp))

                Button(onClick = {}) {
                    Text("Click", fontSize = 25.sp)
                }
            }
        }
    }
}


/*@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}*/
