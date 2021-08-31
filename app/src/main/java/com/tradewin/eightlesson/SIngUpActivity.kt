package com.tradewin.eightlesson

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SIngUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_up)
        val etName = findViewById<EditText>(R.id.etName)
        val etSecondName = findViewById<EditText>(R.id.etSecondName)
        val etLogin = findViewById<EditText>(R.id.etLogin)
        val etPass = findViewById<EditText>(R.id.etPass)
        val etRepeatPass = findViewById<EditText>(R.id.etRepeatPass)
        val btnSignUp = findViewById<Button>(R.id.btnSignUp)

        btnSignUp.setOnClickListener {
            PreferenceHelper.saveName(etName.text.toString())
            PreferenceHelper.saveSecondName(etSecondName.text.toString())
            PreferenceHelper.saveLogin(etLogin.text.toString())
            PreferenceHelper.savePass(etPass.text.toString())
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}