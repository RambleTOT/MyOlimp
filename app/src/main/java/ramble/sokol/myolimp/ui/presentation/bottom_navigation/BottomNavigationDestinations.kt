package ramble.sokol.myolimp.ui.presentation.bottom_navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import ramble.sokol.myolimp.R
import ramble.sokol.myolimp.destinations.CalendarScreenDestination
import ramble.sokol.myolimp.destinations.DirectionDestination
import ramble.sokol.myolimp.destinations.HomeScreenDestination
import ramble.sokol.myolimp.destinations.LibraryScreenDestination
import ramble.sokol.myolimp.destinations.NewsScreenDestination
import ramble.sokol.myolimp.destinations.OnBoardingScreenDestination
import ramble.sokol.myolimp.destinations.ProfileScreenDestination
import ramble.sokol.myolimp.destinations.SplashScreenDestination

enum class BottomNavigationDestinations (
    val direction: DirectionDestination,
    @DrawableRes val icon: Int,
    @StringRes val label: Int
) {
    Home(HomeScreenDestination, R.drawable.nav_home, R.string.nav_home_name),
    Calendar(CalendarScreenDestination, R.drawable.nav_calendar, R.string.nav_calendar_name),
    Library(LibraryScreenDestination, R.drawable.nav_library, R.string.nav_library_name),
    News(NewsScreenDestination, R.drawable.nav_news, R.string.nav_news_name),
    Profile(ProfileScreenDestination, R.drawable.nav_profile, R.string.nav_profile_name),
}
