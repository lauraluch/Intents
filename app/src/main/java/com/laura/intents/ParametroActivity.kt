package com.laura.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.laura.intents.databinding.ActivityParametroBinding

class ParametroActivity : AppCompatActivity() {
    private val apb by lazy {
        ActivityParametroBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(apb.root)
    }
}