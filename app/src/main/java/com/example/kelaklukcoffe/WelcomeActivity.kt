package com.example.kelaklukcoffe

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_welcome)

        findViewById<MaterialButton>(R.id.btnRegister)
            .setOnClickListener {

                startActivity(
                    Intent(this, RegisterActivity::class.java)
                )
            }

        findViewById<MaterialButton>(R.id.btnLogin)
            .setOnClickListener {

                startActivity(
                    Intent(this, LoginActivity::class.java)
                )
            }
    }
}