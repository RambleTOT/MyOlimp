package ramble.sokol.myolimp.feature_splash_onBoarding.presentation.screens

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import kotlinx.coroutines.delay
import ramble.sokol.myolimp.R
import ramble.sokol.myolimp.destinations.OnBoardingScreenDestination
import ramble.sokol.myolimp.ui.theme.OlimpTheme

@RootNavGraph(start = true)
@Destination
@Composable
fun SplashScreen(
    navigator: DestinationsNavigator
) {
    OlimpTheme (
        isSplashScreen = true
    ) {

        val transition = rememberInfiniteTransition(label = "")
        val alpha by transition.animateFloat(
            initialValue = 0f,
            targetValue = 1f,
            animationSpec = infiniteRepeatable(
                animation = tween(
                    durationMillis = 1000,
                    delayMillis = 500
                ),
                repeatMode = RepeatMode.Reverse
            ), label = ""
        )

        LaunchedEffect(
            key1 = true
        ) {
            delay(2000L)
        /*
            After delay launch onBoarding
        */

        // after that user won't be able to go to previous page
            navigator.popBackStack()
            navigator.navigate(OnBoardingScreenDestination)
        }

        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 64.dp)
                    .alpha(alpha = alpha),
                painter = painterResource(R.drawable.splash_screen_name),
                contentDescription = "app image name"
            )
        }
    }
}
