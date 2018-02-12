package com.scoproject.mvpbasearch

import android.arch.lifecycle.Lifecycle
import android.os.Bundle

/**
 * Created by ibnumuzzakkir on 30/01/18.
 * Android Engineer
 * SCO Project
 */
class BaseContract{
    interface View{
        fun setPresenter(presenter: BasePresenter<*>)
    }

    interface Presenter<in V : BaseContract.View>{
        fun attachLifecycle(lifecycle: Lifecycle)

        fun detachLifecycle(lifecycle: Lifecycle)

        fun attachView(view: V)

        fun detachView()
    }

}