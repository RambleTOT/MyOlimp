package ramble.sokol.myolimp.di

import androidx.lifecycle.viewmodel.compose.viewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module
import ramble.sokol.myolimp.feature_onboarding.domain.view_models.OnBoardingViewModel

val viewModelsModule = module {

    viewModel<OnBoardingViewModel> {
        OnBoardingViewModel()
    }

}
