package com.example.kelaklukcoffe

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnRegister = findViewById<MaterialButton>(R.id.btnRegister)
        val tvLogin = findViewById<TextView>(R.id.tvLogin)

        btnRegister.setOnClickListener {
            startActivity(
                Intent(this, LoginActivity::class.java)
            )
            finish()
        }

        tvLogin.setOnClickListener {
            startActivity(
                Intent(this, LoginActivity::class.java)
            )
            finish()
        }
    }
}