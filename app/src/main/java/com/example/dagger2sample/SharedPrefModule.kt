package com.example.dagger2sample

import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class SharedPrefModule(var context: Context) {

    fun provideContext() : Context{
        return context
    }

    @Singleton
    @Provides
    fun provideSharedPref(context: Context) : SharedPreferences {

        return PreferenceManager.getDefaultSharedPreferences(context)
    }


}