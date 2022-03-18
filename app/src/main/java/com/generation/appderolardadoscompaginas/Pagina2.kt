package com.generation.appderolardadoscompaginas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Pagina2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina2)



        val botaod6 = findViewById<Button>(R.id.botaod6)


        botaod6.setOnClickListener {

            rolardados(6)

        }



        val v1 = findViewById<Button>(R.id.v1)

        v1.setOnClickListener {

            val m1 = Intent(this, MainActivity::class.java)
            startActivity(m1)
        }



        }


    fun rolardados(lados: Int) {

        var valor = (1..lados).random()


        val textoresultado = findViewById<TextView>(R.id.texto1)


        textoresultado.text = valor.toString()
    }
}