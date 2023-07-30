package ramble.sokol.myolimp.feature_authentication.navigation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

object Router {
    var currentScreen: MutableState<CurrentScreen> = mutableStateOf(CurrentScreen.BeginAuthenticationScreen)

    fun navigateTo(destination : CurrentScreen){
        currentScreen.value = destination
    }
}