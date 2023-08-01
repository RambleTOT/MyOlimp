package ramble.sokol.myolimp.feature_splash_onBoarding.presentation.components

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ramble.sokol.myolimp.R
import ramble.sokol.myolimp.feature_splash_onBoarding.domain.models.FragmentImg
import ramble.sokol.myolimp.ui.theme.BlueStart
import ramble.sokol.myolimp.ui.theme.GreyInactive
import ramble.sokol.myolimp.ui.theme.GreySecondary
import ramble.sokol.myolimp.ui.theme.LightBlack

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FragmentImage(
    items: List<FragmentImg>,
    position: Int,
    pagerState: PagerState,
) {
    val item = items[position]

    Column (
        modifier = Modifier
            .padding(horizontal = 36.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            modifier = Modifier
                .fillMaxHeight(0.4f)
                .fillMaxWidth(),
            painter = painterResource(id = item.img),
            contentDescription = item.textTitle
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom
        ) {
            repeat(items.size) {
                Box(modifier = Modifier
                    .padding(4.dp)
                    .clip(CircleShape)
                    .background(
                        if (pagerState.currentPage == it) BlueStart else GreyInactive,
                        shape = RoundedCornerShape(size = 100.dp)
                    )
                    .height(12.dp)
                    .size(
                        if (pagerState.currentPage == it) 24.dp else 12.dp
                    )
                    .animateContentSize()
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = item.textTitle,
            style = TextStyle(
                fontSize = 26.sp,
                lineHeight = 25.sp,
                fontFamily = FontFamily(Font(R.font.bold)),
                fontWeight = FontWeight(700),
                color = LightBlack,
                textAlign = TextAlign.Center,
                letterSpacing = 0.5.sp,
            )
        )

        Spacer(modifier = Modifier.height(8.dp))
        
        Text(
            text = item.textContent,
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 14.sp,
                fontFamily = FontFamily(Font(R.font.medium)),
                fontWeight = FontWeight(500),
                color = GreySecondary,
                textAlign = TextAlign.Center,
                letterSpacing = 0.3.sp,
            )
        )
    }
}
