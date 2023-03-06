package com.example.calificaciones

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class calificar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calificar)

    }

    fun regresar(view: View){
        val intent = Intent(this,MainActivity::class.java).apply {  }
        startActivity(intent)
    }
}