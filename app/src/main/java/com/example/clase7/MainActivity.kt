package com.example.clase7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val foto= findViewById<ImageView>(R.id.fotoperfil)
       /* val  boton= findViewById<ImageButton>(R.id.imageButton)
        boton.setOnClickListener{
            Toast.makeText(this,"Gracias Totales de Listener",Toast.LENGTH_LONG)
        }
        */
    }

    fun accion(view: View) {
        val toast = Toast.makeText(this,"Gracias Totales",Toast.LENGTH_LONG)
        toast.show()
    }
}