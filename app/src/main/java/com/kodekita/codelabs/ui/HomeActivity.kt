package com.kodekita.codelabs.ui

import android.util.Log
import androidx.fragment.app.FragmentTransaction
import com.kodekita.codelabs.R
import com.kodekita.codelabs.base.BaseActivity
import com.kodekita.codelabs.databinding.ActivityHomeBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeActivity : BaseActivity<UserViewModel, ActivityHomeBinding>() {

    override val viewModel: UserViewModel by viewModel()

    override fun getViewBinding(): ActivityHomeBinding = ActivityHomeBinding.inflate(layoutInflater)
    private lateinit var binding: ActivityHomeBinding

    override fun initIntent() {
        initObserver()
    }

    override fun initData() {
        viewModel.getUser("1")
    }

    override fun initAction() {
        binding = getViewBinding()
        val ft: FragmentTransaction = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragHolder, ManageFragment())
        ft.commit()
    }

    override fun initObserver() {
        viewModel.userList.observe(this) {
            Log.d(TAG, "Data $it")
        }
    }

    companion object {
        private val TAG = HomeActivity::class.java.simpleName
    }
}