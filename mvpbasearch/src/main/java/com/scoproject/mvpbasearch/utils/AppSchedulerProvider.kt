package com.scoproject.mvpbasearch.utils

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by ibnumuzzakkir on 31/01/18.
 * Android Engineer
 * SCO Project
 */
class AppSchedulerProvider : SchedulerProvider{
    override fun ui(): Scheduler = AndroidSchedulers.mainThread()
    override fun computation(): Scheduler = Schedulers.computation()
    override fun io(): Scheduler = Schedulers.io()
}