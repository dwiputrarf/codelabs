package com.kodekita.codelabs.di.features

import com.kodekita.codelabs.data.user.remote.UserRepository
import com.kodekita.codelabs.data.user.remote.UserRepositoryImpl
import com.kodekita.codelabs.domain.UserInteractor
import com.kodekita.codelabs.domain.UserInteractorImpl
import com.kodekita.codelabs.ui.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
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