package ramble.sokol.myolimp.feature_onboarding.domain.models

data class FragmentImg (
    val img: Int,
    val isCurrent: Boolean = false,
    val textTitle: String,
    val textContent: String
)