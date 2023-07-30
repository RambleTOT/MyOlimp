package ramble.sokol.myolimp.feature_onborading.models

data class FragmentImg (
    val img: Int,
    val isCurrent: Boolean = false,
    val textTitle: String,
    val textContent: String
)