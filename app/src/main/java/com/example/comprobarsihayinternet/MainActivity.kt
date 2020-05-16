package com.example.comprobarsihayinternet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bValidarRed = findViewById<Button>(R.id.idValidarRed)
        bValidarRed.setOnClickListener {
            //codigo para validar red
            if (Network.hayRed(this)){
                Toast.makeText(this, "Si Hay Red",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "Acegurate que haya una coneccion a internet",Toast.LENGTH_LONG).show()
            }
        }


    }
}
