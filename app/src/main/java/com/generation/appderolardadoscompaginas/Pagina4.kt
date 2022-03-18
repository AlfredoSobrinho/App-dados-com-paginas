package com.generation.appderolardadoscompaginas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Pagina4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina4)


        val botaod20 = findViewById<Button>(R.id.botaod20)


        botaod20.setOnClickListener {

            rolardados(20)

        }



        val v3 = findViewById<Button>(R.id.v3)

        v3.setOnClickListener {

            val m1 = Intent(this, MainActivity::class.java)
            startActivity(m1)
        }

    }


    fun rolardados(lados: Int) {

        var valor = (1..lados).random()


        val textoresultado = findViewById<TextView>(R.id.texto3)


        textoresultado.text = valor.toString()
    }






    }



