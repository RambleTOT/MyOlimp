package ramble.sokol.myolimp.feature_profile.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ramble.sokol.myolimp.R
import ramble.sokol.myolimp.ui.theme.BlackOption
import ramble.sokol.myolimp.ui.theme.GreyDescription

@Composable
fun Reference(
    icon: Int,
    title: String,
    content: String,
    isShowBack: Boolean = true,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = 24.dp
            )
            .clip(RoundedCornerShape(20.dp))
            .clickable(onClick = onClick),
        horizontalArrangement = if (isShowBack) Arrangement.SpaceEvenly else Arrangement.Start
    ) {
        Image(
            modifier = Modifier
                .wrapContentSize(Alignment.CenterStart),
            painter = painterResource(id = icon),
            contentDescription = "awd"
        )

        Spacer(modifier = Modifier.width(19.dp))

        Column {
            Text(
                text = title, style = TextStyle(
                    fontSize = 15.sp,
                    fontFamily = FontFamily(Font(R.font.medium)),
                    fontWeight = FontWeight(500),
                    color = BlackOption,
                    letterSpacing = 0.3.sp,
                )
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = content, style = TextStyle(
                    fontSize = 11.sp,
                    fontFamily = FontFamily(Font(R.font.regular)),
                    fontWeight = FontWeight(400),
                    color = GreyDescription,
                    letterSpacing = 0.2.sp,
                )
            )
        }
        if (isShowBack) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically),
                painter = painterResource(id = R.drawable.ic_profile_btn_back),
                contentDescription = "button back",
                alignment = Alignment.CenterEnd
            )
        }
    }

}
