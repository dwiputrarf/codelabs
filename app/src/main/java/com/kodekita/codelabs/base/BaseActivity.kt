package com.kodekita.codelabs.base

import android.app.ProgressDialog
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.kodekita.codelabs.R

abstract class BaseActivity<VM : BaseViewModel, VB : ViewBinding> : AppCompatActivity() {

    abstract val viewModel: VM
    private lateinit var binding: VB

    private var mProgressDialog: ProgressDialog? = null
    private var isSetBackButtonValid = false

    abstract fun getViewBinding(): VB

    protected abstract fun initIntent()
    protected abstract fun initData()
    protected abstract fun initAction()
    protected abstract fun initObserver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = getViewBinding()

        setContentView(binding.root)

        initIntent()
        initData()
        initAction()
        initObserver()
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