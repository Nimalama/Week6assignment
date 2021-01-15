package com.nima.week6softuseractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var btn:Button = findViewById(R.id.button)
        btn.setOnClickListener (){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}