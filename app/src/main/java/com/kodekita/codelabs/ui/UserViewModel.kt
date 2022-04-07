package com.kodekita.codelabs.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.kodekita.codelabs.base.BaseViewModel
import com.kodekita.codelabs.domain.User
import com.kodekita.codelabs.domain.UserInteractor
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class UserViewModel(private val repo: UserInteractor) : BaseViewModel() {

    private val TAG = "UserViewModel"

    val userList = MutableLiveData<Result<List<User>>>()

    fun getUser(page:String) {
        addDisposable(repo.getUser(page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                userList.value = Result.success(it)
                Log.d(TAG, "Data : $it")
            }, {
                Log.d(TAG, "data response error, message : ${it.message}")
            }))
    }

}
