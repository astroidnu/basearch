package com.scoproject.mvpbasearch

import android.arch.lifecycle.ViewModel

/**
 * Created by ibnumuzzakkir on 31/01/18.
 * Android Engineer
 * SCO Project
 */
class BaseViewModel<V : BaseContract.View, P:BaseContract.Presenter<V>> : ViewModel(){
    private var presenter: P? = null

    internal fun setPresenter(presenter: P) {
        if (this.presenter == null) {
            this.presenter = presenter
        }
    }

    internal fun getPresenter(): P? {
        return this.presenter
    }

    override fun onCleared() {
        super.onCleared()
        presenter = null
    }

}
