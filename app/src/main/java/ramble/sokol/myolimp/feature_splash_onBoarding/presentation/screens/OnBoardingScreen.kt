package ramble.sokol.myolimp.feature_splash_onBoarding.presentation.screens

import android.annotation.SuppressLint
import android.content.Intent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch
import ramble.sokol.myolimp.R
import ramble.sokol.myolimp.feature_authentication.presentation.activities.MainAuthenticationActivity
import ramble.sokol.myolimp.feature_splash_onBoarding.domain.models.FragmentImg
import ramble.sokol.myolimp.feature_splash_onBoarding.presentation.components.FilledBtn
import ramble.sokol.myolimp.feature_splash_onBoarding.presentation.components.FragmentImage
import ramble.sokol.myolimp.ui.theme.GreyDark
import ramble.sokol.myolimp.ui.theme.OlimpTheme

@SuppressLint("SuspiciousIndentation", "UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnBoardingScreen() {
    OlimpTheme {

        val items = getFragments()
        val pagerState = rememberPagerState(
            initialPage = 0,
            initialPageOffsetFraction = 0f
        ) {
            items.size
        }
        val coroutineScope = rememberCoroutineScope()
        val context = LocalContext.current
        val intent = Intent(context, MainAuthenticationActivity::class.java)

        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = CenterHorizontally
        ) {
            HorizontalPager(
                modifier = Modifier
                    .fillMaxWidth(),
                state = pagerState,
                pageContent = {
                    FragmentImage(
                        items = items,
                        position = it,
                        pagerState = pagerState
                    )
                }
            )

            Spacer(modifier = Modifier.height(22.dp))

            FilledBtn(
                text = stringResource(R.string.next)
            ) {
                if (pagerState.currentPage + 1 < items.size) {
                    coroutineScope.launch {
                        pagerState.animateScrollToPage(
                            pagerState.currentPage + 1,

                            )
                    }
                } else {
                    context.startActivity(intent)
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                modifier = Modifier
                    .clickable {
                        context.startActivity(intent)
                    },
                text = stringResource(R.string.skip),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.regular)),
                    fontWeight = FontWeight(500),
                    color = GreyDark,
                    letterSpacing = 0.3.sp,
                )
            )
        }
    }
}

@Composable
private fun getFragments() : List<FragmentImg> {
/*
    Add all images with text
*/
    val items = mutableListOf<FragmentImg>()
    val context = LocalContext.current

    items.add(
        FragmentImg(
            img = R.drawable.onboarding_1st,
            textTitle = context.getString(R.string.text_title_1_onboarding),
            textContent = context.getString(R.string.text_content_1_onboarding)
        )
    )

    items.add(
        FragmentImg(
            img = R.drawable.onboarding_2nd,
            textTitle = context.getString(R.string.text_title_2_onboarding),
            textContent = context.getString(R.string.text_content_2_onboarding)
        )
    )

    items.add(
        FragmentImg(
            img = R.drawable.onboarding_3rd,
            textTitle = context.getString(R.string.text_title_3_onboarding),
            textContent = context.getString(R.string.text_content_3_onboarding)
        )
    )

    items.add(
        FragmentImg(
            img = R.drawable.onboarding_4th,
            textTitle = context.getString(R.string.text_title_4_onboarding),
            textContent = context.getString(R.string.text_content_4_onboarding)
        )
    )

    return items
}

