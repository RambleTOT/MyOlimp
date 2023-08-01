package ramble.sokol.myolimp.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import ramble.sokol.myolimp.R


@Composable
fun OlimpTheme(
    uiColor: Color = Transparent,
    isSplashScreen: Boolean = false,
    content: @Composable () -> Unit
) {

    if (!isSplashScreen) {

        val systemUiController = rememberSystemUiController()
        val useDarkIcons = !isSystemInDarkTheme()

        DisposableEffect(systemUiController, useDarkIcons) {

            systemUiController.setSystemBarsColor(
                color = uiColor,
                darkIcons = useDarkIcons
            )

            onDispose {}
        }

        MaterialTheme(
            typography = Typography,
            content = content
        )
    } else {
        GradientBackground(
            content = content
        )
    }
}

@Composable
fun GradientBackground(
    content: @Composable () -> Unit
) {

    val systemUiController = rememberSystemUiController()
    val useDarkIcons = !isSystemInDarkTheme()

    DisposableEffect(systemUiController, useDarkIcons) {

        systemUiController.setStatusBarColor(
            color = BlueStart,
            darkIcons = useDarkIcons
        )

        systemUiController.setNavigationBarColor(
            color = BlueEnd,
            darkIcons = useDarkIcons
        )

        onDispose {}
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        BlueStart,
                        BlueEnd
                    )
                )
            )
            .paint(
                painterResource(id = R.drawable.splash_screen_backgrond),
                contentScale = ContentScale.FillBounds
            )
    ) {
        MaterialTheme(
            typography = Typography,
            content = content
        )
    }
}
