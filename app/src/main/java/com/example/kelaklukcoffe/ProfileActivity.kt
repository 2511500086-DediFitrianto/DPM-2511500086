package com.example.kelaklukcoffe

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)

        bottomNav.selectedItemId = R.id.nav_profile

        bottomNav.setOnItemSelectedListener {

            when (it.itemId) {

                R.id.nav_home -> {
                    startActivity(Intent(this, HomeActivity::class.java))
                    finish()
                    true
                }

                R.id.nav_location -> {
                    startActivity(Intent(this, LocationActivity::class.java))
                    finish()
                    true
                }

                R.id.nav_shop -> {
                    startActivity(Intent(this, EcommerceActivity::class.java))
                    finish()
                    true
                }

                R.id.nav_notification -> {
                    startActivity(Intent(this, NotificationActivity::class.java))
                    finish()
                    true
                }

                R.id.nav_profile -> true

                else -> false
            }
        }
    }
}