package com.scoproject.mvpbasearch

/**
 * Created by ibnumuzzakkir on 31/01/18.
 * Android Engineer
 * SCO Project
 */
interface IBasePresenter<in V : BaseContract.View>{
    fun attachView(view: V)

    fun detachView()
}