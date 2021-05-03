package com.kodekita.codelabs.di

import com.kodekita.codelabs.data.user.remote.UserServices
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

val apiModule = module {
    single<UserServices> {
        Retrofit.Builder()
            .baseUrl("https://reqres.in/")
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(UserServices::class.java)
    }
}