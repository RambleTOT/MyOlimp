package ramble.sokol.myolimp.ui.presentation.bottom_navigation

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ramcosta.composedestinations.navigation.navigate
import com.ramcosta.composedestinations.navigation.popBackStack
import com.ramcosta.composedestinations.navigation.popUpTo
import com.ramcosta.composedestinations.utils.isRouteOnBackStack
import ramble.sokol.myolimp.NavGraphs
import ramble.sokol.myolimp.R
import ramble.sokol.myolimp.ui.theme.BlueStart
import ramble.sokol.myolimp.ui.theme.GreyNavigationText
import ramble.sokol.myolimp.ui.theme.White

@Composable
fun BottomNavigationBar(
    navController: NavController
) {
    BottomNavigation(
        modifier = Modifier
            .wrapContentSize()
            .clip(RoundedCornerShape(40.dp, 40.dp, 0.dp, 0.dp)),
        elevation = 4.dp,
        backgroundColor = White,
    ) {
        BottomNavigationDestinations.values().forEach {
            val isOpened = navController.isRouteOnBackStack(it.direction)

            BottomNavigationItem(
                selected = isOpened,
                onClick = {
                    if (isOpened) {
                        // When we click again on a bottom bar item and it was already selected
                        // we want to pop the back stack until the initial destination of this bottom bar item
                        navController.popBackStack(it.direction, false)
                        return@BottomNavigationItem
                    }

                    navController.navigate(it.direction) {

                        // Pop up to the root of the graph to
                        // avoid building up a large stack of destinations
                        // on the back stack as users select items
                        popUpTo(NavGraphs.root) {
                            saveState = true
                        }

                        // Avoid multiple copies of the same destination when
                        // reselecting the same item
                        launchSingleTop = true

                        // Restore state when reselecting a previously selected item
                        restoreState = true
                    }
                },
                icon = {
                    Icon(
                        painter = painterResource(id = it.icon),
                        tint = if (isOpened) BlueStart else GreyNavigationText,
                        contentDescription = stringResource(it.label),
                    )
                },
                label = {
                    Text(
                        text = stringResource(it.label),
                        style = TextStyle(
                            fontSize = 8.sp,
                            fontFamily = FontFamily(Font(R.font.medium)),
                            fontWeight = FontWeight(500),
                            color = if (isOpened) BlueStart else GreyNavigationText,
                            textAlign = TextAlign.Center,
                            letterSpacing = 0.2.sp,
                        )
                    )
                }
            )
        }
    }
}
