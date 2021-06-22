package com.kodekita.codelabs.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity<R : BaseViewModel> : AppCompatActivity() {

    abstract val layoutResourceId: Int

    abstract val viewModel: R

    abstract fun initIntent()
    abstract fun initDataBinding()
    abstract fun initAction()

    private var isSetBackButtonValid = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutResourceId)

        initIntent()
        initDataBinding()
        initAction()
    }
}