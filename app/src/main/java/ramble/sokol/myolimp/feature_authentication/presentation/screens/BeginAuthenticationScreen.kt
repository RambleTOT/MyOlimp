package ramble.sokol.myolimp.feature_authentication.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ramble.sokol.myolimp.R
import ramble.sokol.myolimp.feature_authentication.presentation.components.OutlinedBtn
import ramble.sokol.myolimp.feature_authentication.navigation.CurrentScreen
import ramble.sokol.myolimp.feature_authentication.navigation.Router
import ramble.sokol.myolimp.feature_onborading.presentation.components.FilledBtn
import ramble.sokol.myolimp.ui.theme.GreySecondary
import ramble.sokol.myolimp.ui.theme.LightBlack

@Composable
fun BeginAuthenticationScreen (

) {

    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            modifier = Modifier
                .fillMaxHeight(0.4f)
                .fillMaxWidth(),
            painter = painterResource(id = R.drawable.authorization_main),
            contentDescription = "image authentication"
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = stringResource(R.string.last_step),
            style = TextStyle(
                fontSize = 26.sp,
                lineHeight = 25.sp,
                fontFamily = FontFamily(Font(R.font.bold)),
                fontWeight = FontWeight(700),
                color = LightBlack,
                textAlign = TextAlign.Center,
                letterSpacing = 0.5.sp,
            )
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            modifier = Modifier.padding(horizontal = 36.dp),
            text = stringResource(R.string.choose_option_authentication),
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 14.sp,
                fontFamily = FontFamily(Font(R.font.medium)),
                fontWeight = FontWeight(500),
                color = GreySecondary,
                textAlign = TextAlign.Center,
                letterSpacing = 0.3.sp,
            )
        )

        Spacer(modifier = Modifier.height(24.dp))

        FilledBtn(
            text = stringResource(R.string.register)
        ) {
            Router.navigateTo(CurrentScreen.SignUpScreen)
        }

        Spacer(Modifier.height(12.dp))

        OutlinedBtn(
            text = stringResource(R.string.login)
        ) {
            Router.navigateTo(CurrentScreen.SignUpScreen)
        }

    }

}
