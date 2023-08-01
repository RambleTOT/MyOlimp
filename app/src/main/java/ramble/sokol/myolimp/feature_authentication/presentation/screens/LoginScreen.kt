package ramble.sokol.myolimp.feature_authentication.presentation.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import ramble.sokol.myolimp.ui.theme.OlimpTheme

@Destination
@Composable
fun LoginScreen (
    navigator: DestinationsNavigator
) {
    OlimpTheme {
        Text(text = "LoginScreen")
    }
}
