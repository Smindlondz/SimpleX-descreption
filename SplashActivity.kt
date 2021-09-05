package com.ayama.simplexgeomedicalservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        Handler().postDelayed(
            {
                //Launch the Main Activity
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))

                finish() //Call this when your activity is done and should be closed
            },
            2500

        )

    }

}