package com.example.dagger2sample

import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var sharedPrefComponent : SharedPrefComponent
    @Inject
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedPrefComponent = DaggerSharedPrefComponent.builder().sharedPrefModule(SharedPrefModule()).build()

        sharedPrefComponent.inject(this)

    }

}

