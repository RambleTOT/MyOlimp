package ramble.sokol.myolimp.feature_onborading.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ramble.sokol.myolimp.R
import ramble.sokol.myolimp.feature_onborading.components.FragmentImage
import ramble.sokol.myolimp.feature_onborading.view_models.OnBoardingViewModel
import ramble.sokol.myolimp.ui.theme.BlueStart
import ramble.sokol.myolimp.ui.theme.White
import kotlinx.coroutines.launch

@SuppressLint("SuspiciousIndentation", "UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnBoardingScreen(
    viewModel: OnBoardingViewModel
) {

    val items = viewModel.items
    val pagerState = rememberPagerState()
    val coroutineScope = rememberCoroutineScope()

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
            pageCount = items.size
        ) {
            FragmentImage(
                items = items,
                position = it,
                pagerState = pagerState
            )
        }

        Spacer(modifier = Modifier.height(22.dp))

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 36.dp)
                .background(
                    color = BlueStart,
                    shape = RoundedCornerShape(size = 16.dp)
                ),
            colors = ButtonDefaults.buttonColors(
                containerColor = BlueStart
            ),
            onClick = {
                coroutineScope.launch {
                    pagerState.animateScrollToPage(
                        pagerState.currentPage + 1,

                    )
                }
            }
        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth(),
                text = stringResource(R.string.next),
                style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.medium)),
                    fontWeight = FontWeight(600),
                    color = White,
                    textAlign = TextAlign.Center
                )
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = stringResource(R.string.skip),
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.regular)),
                fontWeight = FontWeight(500),
                color = Color(0xCC8C888A),
                letterSpacing = 0.3.sp,
            )
        )
    }
}

