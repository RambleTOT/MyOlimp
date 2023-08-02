package ramble.sokol.myolimp.feature_profile.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.ramcosta.composedestinations.annotation.Destination
import org.koin.androidx.compose.getViewModel
import ramble.sokol.myolimp.feature_authentication.view_models.ProfileViewModel
import ramble.sokol.myolimp.ui.theme.BottomBarTheme
import ramble.sokol.myolimp.ui.theme.White

@Destination
@Composable
fun ProfileScreen(
    navController: NavController
) {
    BottomBarTheme(
        navController = navController
    ) {

        val viewModel = getViewModel<ProfileViewModel>()

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .background(
                    color = White,
                    shape = RoundedCornerShape(
                        topStart = 0.dp,
                        topEnd = 0.dp,
                        bottomEnd = 40.dp,
                        bottomStart = 40.dp
                    )
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

        }
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
        Text(
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
        Text(
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
        Text(
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
        Text(
            modifier = Modifier
                .fillMaxSize(),
            textAlign = TextAlign.Center,
            text = "LibraryScreen"
        )
    }
}
