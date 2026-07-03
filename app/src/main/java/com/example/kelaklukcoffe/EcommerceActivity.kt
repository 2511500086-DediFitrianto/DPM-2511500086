package com.example.kelaklukcoffe

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class EcommerceActivity : AppCompatActivity() {

    private lateinit var rvShop: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ecommerce)

        rvShop = findViewById(R.id.rvShop)

        val produkList = listOf(
            Product(
                R.drawable.ic_launcher_foreground,
                "Arabica Coffee",
                "Rp 80.000"
            ),
            Product(
                R.drawable.ic_launcher_foreground,
                "Robusta Coffee",
                "Rp 75.000"
            ),
            Product(
                R.drawable.ic_launcher_foreground,
                "Matcha Premium",
                "Rp 65.000"
            ),
            Product(
                R.drawable.ic_launcher_foreground,
                "Coffee Beans",
                "Rp 95.000"
            )
        )

        rvShop.layoutManager = GridLayoutManager(this, 2)
        rvShop.adapter = ProductAdapter(produkList)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)

        bottomNav.selectedItemId = R.id.nav_shop

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

                R.id.nav_shop -> true

                R.id.nav_notification -> {
                    startActivity(Intent(this, NotificationActivity::class.java))
                    finish()
                    true
                }

                R.id.nav_profile -> {
                    startActivity(Intent(this, ProfileActivity::class.java))
                    finish()
                    true
                }

                else -> false
            }
        }
    }
}