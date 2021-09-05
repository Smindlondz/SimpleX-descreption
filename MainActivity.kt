package com.ayama.simplexgeomedicalservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_registration.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_register.setOnClickListener {
            // Launch the registration activity when user clicks on the text.
            val intent = Intent(this@MainActivity, RegistrationActivity::class.java)
            startActivity(intent)
        }
        btn_login.setOnClickListener {
            // Launch the Dashboard activity when user clicks on the button.
            val intent = Intent(this@MainActivity, DashboardActivity::class.java)
            startActivity(intent)
        }
    }
}