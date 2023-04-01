package com.example.lista_zakupy

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.chip.Chip

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val dodawanie=findViewById<RadioButton>(R.id.dodawanie)
        val odhacznie=findViewById<RadioButton>(R.id.odhaczanie)

       val bagietka = findViewById<Chip>(R.id.ziemniak)
        bagietka.visibility = View.GONE
        val croissant = findViewById<Chip>(R.id.salami)
        croissant.visibility = View.GONE
        val chleb =findViewById<Chip>(R.id.kielbasa)
        chleb.visibility = View.GONE

        val szynka = findViewById<Chip>(R.id.szynka)
        szynka.visibility = View.GONE
        val salami = findViewById<Chip>(R.id.salami)
        salami.visibility = View.GONE
        val kielbasa= findViewById<Chip>(R.id.kielbasa)
        kielbasa.visibility = View.GONE

        val Ziemniak = findViewById<Chip>(R.id.ziemniak)
        Ziemniak.visibility = View.GONE
        val Marchewka = findViewById<Chip>(R.id.marchewka)
        Marchewka.visibility = View.GONE
        val Kukurydza= findViewById<Chip>(R.id.kukurydza)
        Kukurydza.visibility = View.GONE
        val Salata= findViewById<Chip>(R.id.salata)
        Salata.visibility = View.GONE

        dodawanie.setOnClickListener(){
        if (dodawanie.isChecked) {
            bagietka.visibility = View.VISIBLE
            croissant.visibility = View.VISIBLE
            chleb.visibility = View.VISIBLE

            szynka.visibility = View.VISIBLE
            salami.visibility = View.VISIBLE
            kielbasa.visibility = View.VISIBLE

            Ziemniak.visibility = View.VISIBLE
            Marchewka.visibility = View.VISIBLE
            Kukurydza.visibility = View.VISIBLE
            Salata.visibility = View.VISIBLE
        }
        }
        odhacznie.setOnClickListener(){
            if (dodawanie.isChecked) {
                bagietka.visibility = View.GONE
                croissant.visibility = View.GONE
                chleb.visibility = View.GONE

                szynka.visibility = View.GONE
                salami.visibility = View.GONE
                kielbasa.visibility = View.GONE

                Ziemniak.visibility = View.GONE
                Marchewka.visibility = View.GONE
                Kukurydza.visibility = View.GONE
                Salata.visibility = View.GONE
            }
        }
    }
}