package com.kodekita.codelabs.di.features

import com.kodekita.codelabs.data.user.remote.UserRepository
import com.kodekita.codelabs.data.user.remote.UserRepositoryImpl
import com.kodekita.codelabs.local.user.UserInteractor
import com.kodekita.codelabs.local.user.UserInteractorImpl
import com.kodekita.codelabs.ui.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.core.qualifier.named
import org.koin.dsl.module

val userModule: Module = module {

    factory<UserRepository> {
        UserRepositoryImpl(get())
    }

    factory <UserInteractor> {
        UserInteractorImpl(get())
    }

    viewModel { UserViewModel(get()) }
}