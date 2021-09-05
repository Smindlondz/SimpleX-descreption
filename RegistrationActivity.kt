package com.ayama.simplexgeomedicalservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_registration.*

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        setupActionBar()

        tv_login.setOnClickListener {
            // Launch the Login activity when user clicks on the text.
            val intent = Intent(this@RegistrationActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_register.setOnClickListener {
            // Launch the Dashboard activity when user clicks on the button.
            val intent = Intent(this@RegistrationActivity, DashboardActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
    private fun setupActionBar() {
        setSupportActionBar(toolbar_registration_activity)

        val actionBar = supportActionBar
        if (actionBar !=null){
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_action_back)
        }
        toolbar_registration_activity.setNavigationOnClickListener {onBackPressed()}
    }
}