package com.laura.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.laura.intents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var amb: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(amb.root)
        supportActionBar?.subtitle = "MainActivity"
    }


}