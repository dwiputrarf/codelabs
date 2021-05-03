package com.kodekita.codelabs.data.user.remote

import com.kodekita.codelabs.data.user.response.UserResponse
import io.reactivex.Single

interface UserRepository {
    fun getUser(page:String): Single<UserResponse>
}