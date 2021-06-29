package com.joelson.carexpress.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.joelson.carexpress.R

class SignupActivity : AppCompatActivity() {

    private lateinit var signupregButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        signupregButton = findViewById(R.id.signupregButton)
        signupregButton.setOnClickListener {
            openServicePage()
        }
    }

    private fun openServicePage(){
        val cesIntent = Intent(this, ServiceActivity::class.java)
        startActivity(cesIntent)
    }
}