package com.tradewin.eightlesson

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val login = PreferenceHelper.getLogin()
        val pass = PreferenceHelper.getPass()

        if (!login.isNullOrEmpty() && !pass.isNullOrEmpty()) {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
            finish()
        } else {
            val intent = Intent(this, SIngUpActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}