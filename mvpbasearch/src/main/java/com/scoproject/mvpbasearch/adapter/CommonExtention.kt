package com.scoproject.mvpbasearch.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Nirwanto Maingkolang on 13/02/18.
 * Android Engineer
 */

infix fun ViewGroup.inflate(layoutResId: Int): View =
        LayoutInflater.from(context).inflate(layoutResId, this, false)