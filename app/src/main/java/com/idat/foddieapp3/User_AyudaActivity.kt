package com.idat.foddieapp3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class User_AyudaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_ayuda)

        val txtNombre = findViewById<EditText>(R.id.txtNombre)
        val txtCorreo = findViewById<EditText>(R.id.txtCorreo)
        val txtAsunto = findViewById<EditText>(R.id.txtAsunto)
        val txtDescrip = findViewById<EditText>(R.id.txtDescripcion)
        val btnIrAtrasAyuda = findViewById<Button>(R.id.btnIrAtras)
        val btnEnviar = findViewById<Button>(R.id.btnEnviarAyuda)
        btnIrAtrasAyuda.setOnClickListener {
            val intent = Intent(this, UsuarioActivity::class.java)
            startActivity(intent)
        }
        btnEnviar.setOnClickListener {
            val nombre = txtNombre.text.toString()
            val correo = txtCorreo.text.toString()
            val asunto = txtAsunto.text.toString()
            val descri = txtDescrip.text.toString()
            val mensaje = "Nombre: $nombre\nCorreo: $correo\nAsunto: $asunto\nDescripción: $descri"
            val duracion = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, mensaje, duracion)
            toast.show()
        }
    }
}