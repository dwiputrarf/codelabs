package com.kodekita.codelabs.base

import android.app.ProgressDialog
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kodekita.codelabs.R

abstract class BaseActivity<T : BaseViewModel> : AppCompatActivity() {

    abstract val layoutResourceId: Int

    abstract val viewModel: T

    private var mProgressDialog: ProgressDialog? = null

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

    fun showLoading() {
        hideLoading()

        if (mProgressDialog == null) {
            mProgressDialog = ProgressDialog(this).apply {
                setMessage(getString(R.string.please_wait))
                isIndeterminate = true
                setCancelable(false)
                setCanceledOnTouchOutside(false)
            }
        }
        mProgressDialog!!.show()
    }

    fun hideLoading() {
        if (mProgressDialog != null && mProgressDialog!!.isShowing) {
            mProgressDialog!!.cancel()
        }
    }
}