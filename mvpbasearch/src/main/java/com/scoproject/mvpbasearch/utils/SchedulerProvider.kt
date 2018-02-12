package com.scoproject.mvpbasearch.utils

import io.reactivex.Scheduler

/**
 * Created by ibnumuzzakkir on 31/01/18.
 * Android Engineer
 * SCO Project
 */
interface SchedulerProvider{
    fun ui(): Scheduler
    fun computation(): Scheduler
    fun io(): Scheduler
}