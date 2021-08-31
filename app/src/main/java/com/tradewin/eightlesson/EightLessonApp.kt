package com.tradewin.eightlesson

import android.app.Application

class EightLessonApp : Application() {

    override fun onCreate() {
        super.onCreate()
        PreferenceHelper.initPreference(this)
    }

}