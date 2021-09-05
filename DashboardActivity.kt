package com.ayama.simplexgeomedicalservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.activity_main.*


class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        btn_doctor.setOnClickListener {
            // Launch the Doctor List when user clicks on the text.
            val intent = Intent(this@DashboardActivity, DoctorList::class.java)
            startActivity(intent)
        }
        btn_pharmacy.setOnClickListener {
            // Launch the Pharmacy list when user clicks on the button.
            val intent = Intent(this@DashboardActivity, PharmacyList::class.java)
            startActivity(intent)
        }
        btn_hospital.setOnClickListener {
            // Launch the Hospital List when user clicks on the button.
            val intent = Intent(this@DashboardActivity, HospitalList::class.java)
            startActivity(intent)
        }
        btn_ambulance.setOnClickListener {
            // Launch the Ambulance List when user clicks on the button.
            val intent = Intent(this@DashboardActivity, AmbulanceList::class.java)
            startActivity(intent)
        }
    }
}

