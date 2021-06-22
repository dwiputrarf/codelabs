package com.kodekita.codelabs.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.kodekita.codelabs.R
import com.kodekita.codelabs.base.BaseActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel
import kotlin.coroutines.CoroutineContext

class SplashScreenActivity : BaseActivity<UserViewModel>() {
    private val TAG = "SplashScreenActivity"

    override val layoutResourceId: Int = R.layout.activity_splash_screen

    override val viewModel: UserViewModel by viewModel()

    override fun initIntent() {
    }

    override fun initDataBinding() {
    }

    private fun initObserver(){
        viewModel.userList.observe(this, {
            Log.d(TAG, "Data $it")
            // update UI
        })
    }

    override fun initAction() {
        authenticateUser()
    }

    fun authenticateUser(){
        GlobalScope.launch(){
            delay(1000L)

        }
    }
}