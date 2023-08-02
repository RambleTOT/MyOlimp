package ramble.sokol.myolimp.feature_profile.presentation.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import com.ramcosta.composedestinations.annotation.Destination
import ramble.sokol.myolimp.ui.theme.BottomBarTheme

@Destination
@Composable
fun ProfileScreen(
    navController: NavController
) {
    BottomBarTheme(
        navController = navController
    ) {
        Text (
            modifier = Modifier
                .fillMaxSize(),
            textAlign = TextAlign.Center,
            text = "ProfileScreen"
        )
    }
}

@Destination
@Composable
fun HomeScreen(
    navController: NavController
) {
    BottomBarTheme(
        navController = navController
    ) {
        Text (
            modifier = Modifier
                .fillMaxSize(),
            textAlign = TextAlign.Center,
            text = "HomeScreen"
        )
    }
}

@Destination
@Composable
fun CalendarScreen(
    navController: NavController
) {
    BottomBarTheme(
        navController = navController
    ) {
        Text (
            modifier = Modifier
                .fillMaxSize(),
            textAlign = TextAlign.Center,
            text = "CalendarScreen"
        )
    }
}

@Destination
@Composable
fun NewsScreen(
    navController: NavController
) {
    BottomBarTheme(
        navController = navController
    ) {
        Text (
            modifier = Modifier
                .fillMaxSize(),
            textAlign = TextAlign.Center,
            text = "NewsScreen"
        )
    }
}

@Destination
@Composable
fun LibraryScreen(
    navController: NavController
) {
    BottomBarTheme(
        navController = navController
    ) {
        Text (
            modifier = Modifier
                .fillMaxSize(),
            textAlign = TextAlign.Center,
            text = "LibraryScreen"
        )
    }
}
