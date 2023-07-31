package ramble.sokol.myolimp.feature_splash_onBoarding.presentation.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ramble.sokol.myolimp.feature_splash_onBoarding.presentation.screens.SplashScreen


class SplashActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SplashScreen()
        }
    }
}
