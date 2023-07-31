package ramble.sokol.myolimp.feature_splash_onBoarding.domain.models

data class FragmentImg (
    val img: Int,
    val isCurrent: Boolean = false,
    val textTitle: String,
    val textContent: String
)