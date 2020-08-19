package com.example.officium

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_anuncios.*
import kotlinx.android.synthetic.main.activity_main.*

class anuncios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anuncios)


        val palabraIngresada = intent.extras!!["palabra ingresada"] as String
        tv_ingresobusqueda.text = palabraIngresada
    }
}