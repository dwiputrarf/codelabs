package com.kodekita.codelabs.ui

import android.util.Log
import com.kodekita.codelabs.R
import com.kodekita.codelabs.base.BaseActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeActivity : BaseActivity<UserViewModel>() {

    private val TAG = "HomeActivity"

    override val layoutResourceId: Int = R.layout.activity_home

    override val viewModel: UserViewModel by viewModel()

    override fun initIntent() {
        initObserver()
    }

    override fun initDataBinding() {
        viewModel.getUser("1")
    }

    private fun initObserver(){
        viewModel.userList.observe(this, {
            Log.d(TAG, "Data $it")
        })
    }

    override fun initAction() {}
}