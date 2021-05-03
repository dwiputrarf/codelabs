package com.kodekita.codelabs.local.user

import io.reactivex.Single

interface UserInteractor {
    fun getUser(page:String): Single<List<User>>
}