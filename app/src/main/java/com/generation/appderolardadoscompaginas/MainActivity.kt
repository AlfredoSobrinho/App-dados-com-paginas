package com.generation.appderolardadoscompaginas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val bd6 = findViewById<Button>(R.id.bd6)
        val d12 = findViewById<Button>(R.id.d12)


        bd6.setOnClickListener {

            val pagina2 = Intent(this, Pagina2::class.java)
            startActivity(pagina2)
        }

        d12.setOnClickListener {
                val pagina3 = Intent(this, Pagina3::class.java)
                startActivity(pagina3)
            }





        val d20 = findViewById<Button>(R.id.d20)

                d20.setOnClickListener {


                    val pagina4 = Intent(this, Pagina4::class.java)
                    startActivity(pagina4)

                }


            }


        }




