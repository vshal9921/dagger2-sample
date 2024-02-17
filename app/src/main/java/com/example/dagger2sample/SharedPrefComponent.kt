package com.example.dagger2sample

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [SharedPrefModule::class])
interface SharedPrefComponent {

    fun inject(mainActivity: MainActivity)
}