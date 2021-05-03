package com.kodekita.codelabs.data.user.remote

import com.kodekita.codelabs.data.user.response.UserResponse
import io.reactivex.Single

class UserRepositoryImpl(private val service:UserServices):UserRepository{
    override fun getUser(page: String): Single<UserResponse> {
        return service.getUser(page = page)
    }
}