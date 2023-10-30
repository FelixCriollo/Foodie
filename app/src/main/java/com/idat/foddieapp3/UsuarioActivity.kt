package com.idat.foddieapp3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class UsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuario)

        val btnHistorialC = findViewById<Button>(R.id.btnHistorial)
        val btnFAQ = findViewById<Button>(R.id.btnFAQ2)
        val btnPedirAyuda = findViewById<Button>(R.id.btnAyuda)
        val btnTomarFoto = findViewById<Button>(R.id.btnTakePicture)
        btnHistorialC.setOnClickListener {
            val intent = Intent(this, User_HistorialActivity::class.java)
            startActivity(intent)
        }
        btnFAQ.setOnClickListener {
            val intent = Intent(this, User_FAQActivity::class.java)
            startActivity(intent)
        }
        btnPedirAyuda.setOnClickListener {
            val intent = Intent(this, User_AyudaActivity::class.java)
            startActivity(intent)
        }
        btnTomarFoto.setOnClickListener {
            val mensaje = "Mensaje: Estará disponible pronto...!"
            val duracion = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, mensaje, duracion)
            toast.show()
        }
    }
}