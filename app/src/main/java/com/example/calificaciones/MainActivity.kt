package com.example.calificaciones

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var califiacar: Button
    private var calificacion: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calificacion = findViewById(R.id.calificacion)
    }

    fun calificar(view: View){
        val intent = Intent(this,calificar::class.java).apply {  }
        startActivity(intent)



    }

}