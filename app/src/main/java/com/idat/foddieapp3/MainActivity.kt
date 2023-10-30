package com.idat.foddieapp3

import android.annotation.SuppressLint
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnRegister = findViewById<Button>(R.id.btnRegister)
        //val textEmail = findViewById<EditText>(R.id.txtEmailLogin)
        //val textPassword = findViewById<EditText>(R.id.txtPasswordLogin)
        val btnIniciarS = findViewById<Button>(R.id.btnLogin)
        btnIniciarS.setOnClickListener {
            val intent = Intent(this, UsuarioActivity::class.java)
            startActivity(intent)
        }
        btnRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
}