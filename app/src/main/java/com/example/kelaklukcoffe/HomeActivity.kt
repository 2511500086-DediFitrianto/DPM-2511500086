package com.example.kelaklukcoffe

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    private lateinit var rvProduk: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rvProduk = findViewById(R.id.rvProduk)

        val listProduk = listOf(
            Product(
                R.drawable.ic_launcher_foreground,
                "Kopi Susu",
                "Rp 18.000"
            ),
            Product(
                R.drawable.ic_launcher_foreground,
                "Matcha Latte",
                "Rp 22.000"
            ),
            Product(
                R.drawable.ic_launcher_foreground,
                "Nasi Goreng",
                "Rp 25.000"
            ),
            Product(
                R.drawable.ic_launcher_foreground,
                "Cheese Cake",
                "Rp 20.000"
            )
        )

        rvProduk.layoutManager = GridLayoutManager(this, 2)
        rvProduk.adapter = ProductAdapter(listProduk)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)

        bottomNav.selectedItemId = R.id.nav_home

        bottomNav.setOnItemSelectedListener { item ->

            when (item.itemId) {

                R.id.nav_home -> true

                R.id.nav_location -> {
                    startActivity(Intent(this, LocationActivity::class.java))
                    true
                }

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