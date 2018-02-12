package com.scoproject.mvpbasearch

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.LifecycleRegistry
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjection

/**
 * Created by ibnumuzzakkir on 30/01/18.
 * Android Engineer
 * SCO Project
 */
abstract class BaseActivity : AppCompatActivity(), BaseContract.View, LifecycleOwner{
    private var presenter: BasePresenter<*>? = null

    private val mLifecycleRegistry : LifecycleRegistry by lazy{
        LifecycleRegistry(this)
    }


    /**
     * This function replace onCreate as main function run in activity
     * Auto Dependency Injection
     * */

    abstract fun onActivityReady(savedInstanceState: Bundle?)

    /**
     * Getting Layout ID from activity
     * */

    abstract fun getLayoutId(): Int


    override fun onCreate(savedInstanceState: Bundle?) {
        //Auto DI
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        onActivityReady(savedInstanceState)

        presenter?.attachLifecycle(lifecycle)
    }


    override fun getLifecycle(): Lifecycle {
        return mLifecycleRegistry
    }

    override fun setPresenter(presenter: BasePresenter<*>) {
        this.presenter = presenter
    }


}