package com.kodekita.codelabs.ui

import android.content.Intent
import com.kodekita.codelabs.base.BaseActivity
import com.kodekita.codelabs.databinding.ActivitySplashScreenBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class SplashScreenActivity : BaseActivity<UserViewModel, ActivitySplashScreenBinding>() {

    override val viewModel: UserViewModel by viewModel()

    override fun getViewBinding(): ActivitySplashScreenBinding =
        ActivitySplashScreenBinding.inflate(layoutInflater)

    override fun initIntent() {}

    override fun initData() {}

    override fun initAction() {
        authenticateUser()
    }

    override fun initObserver() {}

    private fun authenticateUser() {
        CoroutineScope(Dispatchers.Default).launch {
            delay(2000)
            val intent = Intent(this@SplashScreenActivity, HomeActivity::class.java).apply {
                flags =
                    Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
            }
            startActivity(intent)
        }
    }

}