package com.himanshu.starwars

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.himanshu.starwars.dataFiles.Planet
import com.himanshu.starwars.retrofit.RetrofitInstance

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launchWhenCreated {
            try {
                val planet = RetrofitInstance.api.getPlanet("https://swapi.dev/api/planets/1/").body()
                Toast.makeText(applicationContext,planet.toString(),Toast.LENGTH_SHORT).show()
            } catch (e: Error) {
                Toast.makeText(applicationContext, "Error", Toast.LENGTH_LONG).show()
            }
        }

    }
}