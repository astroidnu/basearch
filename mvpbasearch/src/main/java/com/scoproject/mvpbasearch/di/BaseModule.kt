package com.scoproject.mvpbasearch.di

import android.app.Application
import android.content.Context
import com.scoproject.mvpbasearch.utils.AppSchedulerProvider
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

/**
 * Created by ibnumuzzakkir on 31/01/18.
 * Android Engineer
 * SCO Project
 */
@Module
open class BaseModule{
    @Provides @Singleton
    internal fun provideContext(application: Application): Context {
        return application
    }

    @Provides @Singleton
    fun provideCompositeDisposable() = CompositeDisposable()

    @Provides @Singleton
    fun provideSchedulerProvider() = AppSchedulerProvider()
}