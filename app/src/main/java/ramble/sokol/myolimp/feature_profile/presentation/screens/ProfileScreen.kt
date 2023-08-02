package ramble.sokol.myolimp.feature_profile.presentation.screens

import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
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
import com.ramcosta.composedestinations.annotation.Destination
import org.koin.androidx.compose.getViewModel
import ramble.sokol.myolimp.R
import ramble.sokol.myolimp.feature_profile.domain.view_models.ProfileViewModel
import ramble.sokol.myolimp.feature_profile.presentation.components.Reference
import ramble.sokol.myolimp.ui.theme.BlackProfile
import ramble.sokol.myolimp.ui.theme.BottomBarTheme
import ramble.sokol.myolimp.ui.theme.GreyProfile
import ramble.sokol.myolimp.ui.theme.White

@RequiresApi(Build.VERSION_CODES.Q)
@Destination
@Composable
fun ProfileScreen(
    navController: NavController
) {
    BottomBarTheme(
        navController = navController
    ) {

        val viewModel = getViewModel<ProfileViewModel>()
        val context = LocalContext.current

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

        /*
            Top Bar
        */
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .background(
                        color = White, shape = RoundedCornerShape(
                            topStart = 0.dp, topEnd = 0.dp, bottomEnd = 40.dp, bottomStart = 40.dp
                        )
                    ),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                Image(
                    modifier = Modifier.padding(top = 8.dp),
                    painter = painterResource(id = R.drawable.ic_default_img),
                    contentDescription = "user image"
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Спиридонова Диана", style = TextStyle(
                        fontSize = 17.sp,
                        fontFamily = FontFamily(Font(R.font.bold)),
                        fontWeight = FontWeight(600),
                        color = BlackProfile,
                        letterSpacing = 0.4.sp,
                    )
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    modifier = Modifier.padding(bottom = 16.dp), text = "Ученик", style = TextStyle(
                        fontSize = 13.sp,
                        fontFamily = FontFamily(Font(R.font.medium)),
                        fontWeight = FontWeight(500),
                        color = GreyProfile,
                        letterSpacing = 0.26.sp,
                    )
                )
            }

        /*
           References
        */
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(all = 16.dp)
                    .background(
                        color = White,
                        shape = RoundedCornerShape(size = 25.dp)
                    )
                    .padding(vertical = 16.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Reference(
                    icon = R.drawable.ic_profile_data,
                    title = stringResource(R.string.profile_data),
                    content = stringResource(R.string.profile_data_content)
                ) {
                    Toast.makeText(context, "It's developing", Toast.LENGTH_SHORT).show()
                }

                Spacer(
                    modifier = Modifier
                        .height(29.dp)
                )

                Reference(
                    icon = R.drawable.ic_profile_purpose,
                    title = stringResource(R.string.profile_purpose),
                    content = stringResource(R.string.profile_purpose_content)
                ) {
                    Toast.makeText(context, "It's developing", Toast.LENGTH_SHORT).show()
                }

                Spacer(
                    modifier = Modifier
                        .height(29.dp)
                )

                Reference(
                    icon = R.drawable.ic_profile_progress,
                    title = stringResource(R.string.profile_progress),
                    content = stringResource(R.string.profile_progress_content)
                ) {
                    Toast.makeText(context, "It's developing", Toast.LENGTH_SHORT).show()
                }

                Spacer(
                    modifier = Modifier
                        .height(29.dp)
                )

                Reference(
                    icon = R.drawable.ic_profile_favourite,
                    title = stringResource(R.string.profile_favourite),
                    content = stringResource(R.string.profile_favourite_content)
                ) {
                    Toast.makeText(context, "It's developing", Toast.LENGTH_SHORT).show()
                }

                Spacer(
                    modifier = Modifier
                        .height(29.dp)
                )

                Reference(
                    icon = R.drawable.ic_profile_watch,
                    title = stringResource(R.string.profile_watch),
                    content = stringResource(R.string.profile_watch_content)
                ) {
                    Toast.makeText(context, "It's developing", Toast.LENGTH_SHORT).show()
                }

                Spacer(
                    modifier = Modifier
                        .height(29.dp)
                )

                Reference(
                    icon = R.drawable.ic_profile_result,
                    title = stringResource(R.string.profile_result),
                    content = stringResource(R.string.profile_result_content)
                ) {
                    Toast.makeText(context, "It's developing", Toast.LENGTH_SHORT).show()
                }

                Spacer(
                    modifier = Modifier
                        .height(29.dp)
                )

                Reference(
                    icon = R.drawable.ic_profile_logout,
                    title = stringResource(R.string.profile_logout),
                    content = stringResource(R.string.profile_logout_content),
                    isShowBack = false
                ) {
                    Toast.makeText(context, "It's developing", Toast.LENGTH_SHORT).show()
                }
            }
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
            modifier = Modifier.fillMaxSize(), textAlign = TextAlign.Center, text = "HomeScreen"
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
            modifier = Modifier.fillMaxSize(), textAlign = TextAlign.Center, text = "CalendarScreen"
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
            modifier = Modifier.fillMaxSize(), textAlign = TextAlign.Center, text = "NewsScreen"
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
            modifier = Modifier.fillMaxSize(), textAlign = TextAlign.Center, text = "LibraryScreen"
        )
    }
}
