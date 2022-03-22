package com.kodekita.codelabs.base

import android.app.Application
import com.kodekita.codelabs.di.apiModule
import com.kodekita.codelabs.di.features.userModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.module.Module

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(applicationContext)
            modules(getDefinedModules())
        }
    }

    private fun getDefinedModules(): List<Module> {
        return arrayListOf(
            apiModule,
            userModule
        )
    }
}