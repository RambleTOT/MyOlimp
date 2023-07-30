package ramble.sokol.myolimp.feature_authentication.presentation.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ramble.sokol.myolimp.feature_authentication.presentation.screens.MainAuthenticationScreen

class MainAuthenticationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainAuthenticationScreen()
        }
    }
}