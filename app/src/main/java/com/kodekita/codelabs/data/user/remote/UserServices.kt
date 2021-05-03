package com.kodekita.codelabs.data.user.remote

import com.kodekita.codelabs.data.user.response.UserResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface UserServices {
    @GET("api/users?")
    fun getUser(@Query("page") page: String): Single<UserResponse>
}