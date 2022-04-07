package com.kodekita.codelabs.ui

import android.util.Log
import com.kodekita.codelabs.base.BaseActivity
import com.kodekita.codelabs.databinding.ActivityHomeBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeActivity : BaseActivity<UserViewModel, ActivityHomeBinding>() {

    override val viewModel: UserViewModel by viewModel()

    override fun getViewBinding(): ActivityHomeBinding = ActivityHomeBinding.inflate(layoutInflater)

    override fun initIntent() {
        initObserver()
    }

    override fun initData() {
        viewModel.getUser("1")
    }

    override fun initAction() {}

    override fun initObserver() {
        viewModel.userList.observe(this) {
            Log.d(TAG, "Data $it")
        }
    }

    companion object {
        private val TAG = HomeActivity::class.java.simpleName
    }
}