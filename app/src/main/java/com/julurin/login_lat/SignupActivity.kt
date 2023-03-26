package com.julurin.login_lat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val login = findViewById<Button>(R.id.button2)
        val signup = findViewById<TextView>(R.id.textView3)

        login.setOnClickListener {
//            finish()
//            startActivity(Intent(this, HomeActivity::class.java))
            back()
        }

        signup.setOnClickListener {
//            finish()
//            startActivity(Intent(this, SigninActivity::class.java))
            back()
        }
    }

    @Deprecated("Deprecated in Java", ReplaceWith("finish()"))
    override fun onBackPressed() {
        back()
    }

    private fun back() {
        finish()
        overridePendingTransition(R.anim.no_animation, R.anim.slide_out)
    }
}