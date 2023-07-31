package ramble.sokol.myolimp.feature_onboarding.domain.view_models

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.ViewModel
import ramble.sokol.myolimp.feature_onboarding.domain.models.FragmentImg

class OnBoardingViewModel : ViewModel() {

    private val _items = mutableStateListOf<FragmentImg>()
    val items: SnapshotStateList<FragmentImg> = _items

    fun addItem(item: FragmentImg) {
        _items.add(item)
    }

    fun deleteAllItems() {
        _items.clear()
    }
}
