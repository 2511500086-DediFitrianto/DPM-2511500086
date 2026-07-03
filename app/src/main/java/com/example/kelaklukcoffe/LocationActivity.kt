package com.example.kelaklukcoffe

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class LocationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)

        bottomNav.selectedItemId = R.id.nav_location

        bottomNav.setOnItemSelectedListener {

            when(it.itemId){

                R.id.nav_home -> {
                    startActivity(Intent(this, HomeActivity::class.java))
                    true
                }

                R.id.nav_location -> true

                R.id.nav_shop -> {
                    startActivity(Intent(this, EcommerceActivity::class.java))
                    true
                }

                R.id.nav_notification -> {
                    startActivity(Intent(this, NotificationActivity::class.java))
                    true
                }

                R.id.nav_profile -> {
                    startActivity(Intent(this, ProfileActivity::class.java))
                    true
                }

                else -> false
            }
        }
    }
}