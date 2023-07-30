package ramble.sokol.myolimp.feature_authentication.presentation.screens

import android.widget.Toast
import androidx.compose.animation.Crossfade
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import ramble.sokol.myolimp.feature_authentication.navigation.CurrentScreen
import ramble.sokol.myolimp.feature_authentication.navigation.Router

@Composable
fun MainAuthenticationScreen (

) {

    Crossfade(targetState = Router.currentScreen) {
        when (it.value) {

            is CurrentScreen.BeginAuthenticationScreen -> {
                BeginAuthenticationScreen()
            }

            is CurrentScreen.SignUpScreen -> {
                // TODO change this screen after developing

                BeginAuthenticationScreen()
                Toast.makeText(LocalContext.current, "Developing...", Toast.LENGTH_SHORT).show()
            }

            is CurrentScreen.LoginScreen -> {
                // TODO change this screen after developing

                BeginAuthenticationScreen()
                Toast.makeText(LocalContext.current, "Developing...", Toast.LENGTH_SHORT).show()
            }
        }
    }

}
