package com.kodekita.codelabs.domain

import io.reactivex.Single

interface UserInteractor {
    fun getUser(page:String): Single<List<User>>
}