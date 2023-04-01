package com.example.lista_zakupy

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.chip.Chip

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val bagietka = findViewById<Chip>(R.id.bagietka)
        bagietka.visibility = View.GONE
        val croissant = findViewById<Chip>(R.id.croissant)
        croissant.visibility = View.GONE
        val chleb =findViewById<Chip>(R.id.chleb)
        chleb.visibility = View.GONE
    }
}