package com.joelson.carexpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.joelson.carexpress.activities.SignupActivity

class MainActivity : AppCompatActivity() {

    private lateinit var signupButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signupButton = findViewById(R.id.signupButton)
        signupButton.setOnClickListener {
            openSignupPage()
        }
    }
    private fun openSignupPage(){
        val ceIntent = Intent (this, SignupActivity::class.java)
        startActivity(ceIntent)
    }
}