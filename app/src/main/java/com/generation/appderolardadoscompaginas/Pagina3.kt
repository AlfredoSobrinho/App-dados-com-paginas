package com.generation.appderolardadoscompaginas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Pagina3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina3)




        val botaod12 = findViewById<Button>(R.id.botaod12)


        botaod12.setOnClickListener {

            rolardados(12)
        }

        val v2 = findViewById<Button>(R.id.v2)

        v2.setOnClickListener {

            val m1 = Intent(this, MainActivity::class.java)
            startActivity(m1)
        }




    }


    fun rolardados(lados: Int) {

        var valor = (1..lados).random()


        val textoresultado = findViewById<TextView>(R.id.texto2)


        textoresultado.text = valor.toString()
    }




    }


