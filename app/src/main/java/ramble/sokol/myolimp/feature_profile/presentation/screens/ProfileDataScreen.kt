package ramble.sokol.myolimp.feature_profile.presentation.screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ramcosta.composedestinations.annotation.Destination
import ramble.sokol.myolimp.R
import ramble.sokol.myolimp.feature_profile.presentation.components.ProfileFilledBtn
import ramble.sokol.myolimp.feature_profile.presentation.components.ProfileOutlinedBtn
import ramble.sokol.myolimp.ui.theme.BlackProfile
import ramble.sokol.myolimp.ui.theme.BottomBarTheme
import ramble.sokol.myolimp.ui.theme.White

@Destination
@Composable
fun ProfileDataScreen(
    navController: NavController
) {
    BottomBarTheme(
        navController = navController
    ) {

        val context = LocalContext.current

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(bottom = 52.dp),
            horizontalAlignment = CenterHorizontally,
        ) {
            /*
                Top Bar
            */
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .background(
                        color = White, shape = RoundedCornerShape(
                            topStart = 0.dp, topEnd = 0.dp, bottomEnd = 40.dp, bottomStart = 40.dp
                        )
                    ),
                horizontalAlignment = CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                Image(
                    modifier = Modifier.padding(top = 8.dp),
                    painter = painterResource(id = R.drawable.ic_default_img),
                    contentDescription = "user image"
                )

                Spacer(modifier = Modifier.height(18.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    ProfileFilledBtn(text = stringResource(R.string.edit)) {
                        Toast.makeText(context, "It's developing", Toast.LENGTH_SHORT).show()
                    }

                    ProfileOutlinedBtn(text = stringResource(R.string.delete)) {
                        Toast.makeText(context, "It's developing", Toast.LENGTH_SHORT).show()
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))
            }

            /*
                Achievements
            */
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(all = 16.dp)
                    .background(
                        color = White,
                        shape = RoundedCornerShape(size = 25.dp)
                    )
                    .padding(
                        horizontal = 18.dp,
                        vertical = 16.dp
                    )
            ) {
                Text(
                    text = stringResource(R.string.achivement),
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontFamily = FontFamily(Font(R.font.medium)),
                        fontWeight = FontWeight(500),
                        color = BlackProfile,
                        letterSpacing = 0.4.sp,
                    )
                )

                Spacer(modifier = Modifier.height(11.dp))
                
                Text(
                    modifier = Modifier
                        .fillMaxWidth(),
                    text = stringResource(R.string.with_out_achivement),
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontFamily = FontFamily(Font(R.font.bold)),
                        fontWeight = FontWeight(700),
                        color = Color.Red,
                        letterSpacing = 0.4.sp,
                        textAlign = TextAlign.Center,
                        textDecoration = TextDecoration.Underline
                    )
                )
            }
        }
    }
}
