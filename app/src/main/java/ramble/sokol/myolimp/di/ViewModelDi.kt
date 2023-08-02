package ramble.sokol.myolimp.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import ramble.sokol.myolimp.feature_profile.domain.view_models.ProfileViewModel

val viewModelsModule = module {

    /*
    Create viewModels here
    */

    viewModel {
        ProfileViewModel() // for ProfileScreen
    }

}
