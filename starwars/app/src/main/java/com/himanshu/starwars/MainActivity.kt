package com.himanshu.starwars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.lifecycleScope

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launchWhenCreated {
            try {
                val profile = retrofitInstance.api.getCharacter()
                Toast.makeText(applicationContext, profile.body().toString(), Toast.LENGTH_LONG).show()
            } catch (e: Error) {
                Toast.makeText(applicationContext, e.message.toString(), Toast.LENGTH_LONG).show()
            }
        }

    }
}