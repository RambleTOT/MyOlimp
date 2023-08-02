package ramble.sokol.myolimp.feature_profile.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ramble.sokol.myolimp.R
import ramble.sokol.myolimp.ui.theme.BlueStart
import ramble.sokol.myolimp.ui.theme.White

@Composable
fun ProfileFilledBtn (
    text: String,
    onClick: () -> Unit
) {
    Button(
        modifier = Modifier
            .wrapContentSize()
            .height(40.dp)
            .background(
                color = BlueStart,
                shape = RoundedCornerShape(size = 16.dp)
            ),
        colors = ButtonDefaults.buttonColors(
            containerColor = BlueStart
        ),
        onClick = onClick
    ) {
        Text (
            text = text,
            style = TextStyle(
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.medium)),
                fontWeight = FontWeight(500),
                color = White,
            )
        )
    }
}
