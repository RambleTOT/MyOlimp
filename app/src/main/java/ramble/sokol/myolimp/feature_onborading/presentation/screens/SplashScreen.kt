package ramble.sokol.myolimp.feature_onborading.presentation.screens

import android.content.Intent
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import ramble.sokol.myolimp.R
import ramble.sokol.myolimp.feature_onborading.presentation.activities.OnBoardingActivity

@Composable
fun SplashScreen() {

    val context = LocalContext.current
    val intent = Intent(context, OnBoardingActivity::class.java)
    val transition = rememberInfiniteTransition()
    val alpha by transition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 1000,
                delayMillis = 500
            ),
            repeatMode = RepeatMode.Reverse
        )
    )

    LaunchedEffect(
        key1 = true
    ) {
        delay(1500L)
    /*
        After delay launch MainActivity
    */
        context.startActivity(intent)
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
