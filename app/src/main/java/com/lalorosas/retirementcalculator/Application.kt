package com.lalorosas.retirementcalculator

import android.app.Application
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

/**
 * Project Android CI.CD.
 *
 * Created by Rhony on 04/09/20.
 */
class Application : Application() {

    override fun onCreate() {
        super.onCreate()
        AppCenter.start(
            this,
            "6dbacf1c-02fd-48f7-b9a7-4baacceb204d",
            Analytics::class.java,
            Crashes::class.java
        )
    }
}