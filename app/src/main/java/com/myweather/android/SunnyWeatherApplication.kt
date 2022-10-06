package com.myweather.android

import android.app.Application
import android.content.Context
/**
 * AndroidManifest.xml文件的<application>标签下指定SunnyWeatherApplication，
 */
class SunnyWeatherApplication : Application() {
    companion object{
        lateinit var context:Context
        const val TOKEN = ""//填入申请的token
    }

    override fun onCreate() {
        super.onCreate()
        context= applicationContext
    }



}