package ramble.sokol.myolimp.feature_authentication.navigation

sealed class CurrentScreen {

    object SignUpScreen : CurrentScreen()
    object LoginScreen : CurrentScreen()
    object BeginAuthenticationScreen : CurrentScreen()
}
