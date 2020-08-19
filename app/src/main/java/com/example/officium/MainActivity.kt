package com.example.officium

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setup()
    }

    private fun setup(){

        bt_buscar.setOnClickListener(){
               if(et_barrabusqueda.text.isNotEmpty()){

                  /* val Intent = Intent(this@MainActivity, anuncios::class.java )
                   startActivity(Intent)  */



                   /* lo que viene despues de esto dentro del if es prueba   */


                   val textobusqueda = et_barrabusqueda.text.toString()
                   val intent = Intent(this@MainActivity, anuncios::class.java )
                   intent.putExtra("palabra ingresada", textobusqueda)



                   startActivity(intent)





               } else {
                   showalert()
               }
        }

        bt_micv.setOnClickListener(){
            val Intent = Intent(this@MainActivity, datospersonales::class.java )
            startActivity(Intent)
            Toast.makeText(this,"Boton funcionando", Toast.LENGTH_LONG).show()
        }

        bt_postul.setOnClickListener(){
            val Intent = Intent(this@MainActivity, postulaciones::class.java )
            startActivity(Intent)
        }

    }

    private fun showalert(){

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Debes escribir algo en el buscador!")
        builder.setPositiveButton("Entendido", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()

    }
}