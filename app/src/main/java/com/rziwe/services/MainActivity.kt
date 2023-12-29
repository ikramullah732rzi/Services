package com.rziwe.services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rziwe.services.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val  binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)




        binding.start.setOnClickListener {

            startService(Intent(this@MainActivity,NewService::class.java))

        }


        binding.end.setOnClickListener {

           stopService(Intent(this@MainActivity,NewService::class.java))

        }




    }
}