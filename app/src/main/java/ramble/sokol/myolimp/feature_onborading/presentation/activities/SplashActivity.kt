package ramble.sokol.myolimp.feature_onborading.presentation.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.graphics.toArgb
import ramble.sokol.myolimp.feature_onborading.presentation.screens.SplashScreen
import ramble.sokol.myolimp.ui.theme.BlueEnd
import ramble.sokol.myolimp.ui.theme.BlueStart
import ramble.sokol.myolimp.ui.theme.GradientBackground
import ramble.sokol.myolimp.ui.theme.RoundLineBackground


class SplashActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = BlueStart.toArgb()
        window.navigationBarColor = BlueEnd.toArgb()

        setContent {

            GradientBackground {
                RoundLineBackground {
                    SplashScreen()
                }
            }
        }
    }
}
