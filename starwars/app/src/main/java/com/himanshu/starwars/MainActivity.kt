package com.himanshu.starwars

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.himanshu.starwars.retrofit.RetrofitInstance

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launchWhenCreated {
            try {
                val profile = RetrofitInstance.api.getPeople()
                Toast.makeText(applicationContext, profile.body().toString(), Toast.LENGTH_LONG)
                    .show()
                val films = RetrofitInstance.api.getFilms()
                Toast.makeText(applicationContext, films.body().toString(), Toast.LENGTH_LONG)
                    .show()
                val planets = RetrofitInstance.api.getPlanets()
                Toast.makeText(applicationContext, planets.body().toString(), Toast.LENGTH_LONG)
                    .show()
            } catch (e: Error) {
                Toast.makeText(applicationContext, e.message.toString(), Toast.LENGTH_LONG).show()
            }
        }

    }
}