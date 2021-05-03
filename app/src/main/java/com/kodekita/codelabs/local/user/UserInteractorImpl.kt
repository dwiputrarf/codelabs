package com.kodekita.codelabs.local.user

import com.kodekita.codelabs.data.user.remote.UserRepository
import io.reactivex.Single

class UserInteractorImpl (private val userRepository: UserRepository) : UserInteractor {

    override fun getUser(page: String): Single<List<User>> {
        return userRepository.getUser(page).map {
            it.data.map { data ->
                data.toUserData()
            }
        }
    }
}