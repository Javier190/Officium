package com.example.officium

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class postulaciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_postulaciones)

        setup()


    }

    private fun setup(){

        bt_buscar2.setOnClickListener(){
                val Intent = Intent(this@postulaciones, MainActivity::class.java )
                startActivity(Intent)


        }

        bt_micv.setOnClickListener(){
            val Intent = Intent(this@postulaciones, datospersonales::class.java )
            startActivity(Intent)
            Toast.makeText(this,"Boton funcionando", Toast.LENGTH_LONG).show()
        }

        bt_postul.setOnClickListener(){
            val Intent = Intent(this@postulaciones, postulaciones::class.java )
            startActivity(Intent)
        }

    }
}