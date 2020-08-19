package com.example.officium

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class datospersonales : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datospersonales)

        setup()
    }

    private fun setup(){

        bt_buscar2.setOnClickListener(){
            val Intent = Intent(this@datospersonales, MainActivity::class.java )
            startActivity(Intent)


        }

        bt_micv.setOnClickListener(){
            val Intent = Intent(this@datospersonales, datospersonales::class.java )
            startActivity(Intent)
            Toast.makeText(this,"Boton funcionando", Toast.LENGTH_LONG).show()
        }

        bt_postul.setOnClickListener(){
            val Intent = Intent(this@datospersonales, postulaciones::class.java )
            startActivity(Intent)
        }

    }
}