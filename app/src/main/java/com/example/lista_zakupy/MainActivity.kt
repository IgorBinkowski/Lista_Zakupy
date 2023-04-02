package com.example.lista_zakupy

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.chip.Chip

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val dodawanie=findViewById<RadioButton>(R.id.dodawanie)
        val odhacznie=findViewById<RadioButton>(R.id.odhaczanie)

        val pieczywo= findViewById<TextView>(R.id.textView)
        pieczywo.visibility = View.GONE
       val bagietka = findViewById<Chip>(R.id.bagietka)
        bagietka.visibility = View.GONE
        val croissant = findViewById<Chip>(R.id.croissant)
        croissant.visibility = View.GONE
        val chleb =findViewById<Chip>(R.id.chleb)
        chleb.visibility = View.GONE

        val wedliny= findViewById<TextView>(R.id.textView2)
        wedliny.visibility = View.GONE
        val szynka = findViewById<Chip>(R.id.szynka)
        szynka.visibility = View.GONE
        val salami = findViewById<Chip>(R.id.salami)
        salami.visibility = View.GONE
        val kielbasa= findViewById<Chip>(R.id.kielbasa)
        kielbasa.visibility = View.GONE

        val warzywa= findViewById<TextView>(R.id.textView3)
        warzywa.visibility = View.GONE
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
            pieczywo.visibility = View.VISIBLE
            bagietka.visibility = View.VISIBLE
            croissant.visibility = View.VISIBLE
            chleb.visibility = View.VISIBLE

            wedliny.visibility = View.VISIBLE
            szynka.visibility = View.VISIBLE
            salami.visibility = View.VISIBLE
            kielbasa.visibility = View.VISIBLE

            warzywa.visibility = View.VISIBLE
            Ziemniak.visibility = View.VISIBLE
            Marchewka.visibility = View.VISIBLE
            Kukurydza.visibility = View.VISIBLE
            Salata.visibility = View.VISIBLE
        }
        }
        odhacznie.setOnClickListener(){
            if (bagietka.isChecked) {
                bagietka.visibility = View.VISIBLE
            }
            else{bagietka.visibility=View.GONE}

            if (croissant.isChecked) {
                croissant.visibility = View.VISIBLE
            }
            else{croissant.visibility=View.GONE}

            if (chleb.isChecked) {
                chleb.visibility = View.VISIBLE
            }
            else{chleb.visibility=View.GONE}

            if (szynka.isChecked) {
                szynka.visibility = View.VISIBLE
            }
            else{szynka.visibility=View.GONE}

            if (salami.isChecked) {
                salami.visibility = View.VISIBLE
            }
            else{salami.visibility=View.GONE}

            if (kielbasa.isChecked) {
                kielbasa.visibility = View.VISIBLE
            }
            else{kielbasa.visibility=View.GONE}

            if (Ziemniak.isChecked) {
                Ziemniak.visibility = View.VISIBLE
            }
            else{Ziemniak.visibility=View.GONE}

            if (Marchewka.isChecked) {
                Marchewka.visibility = View.VISIBLE
            }
            else{Marchewka.visibility=View.GONE}

            if (Kukurydza.isChecked) {
                Kukurydza.visibility = View.VISIBLE
            }
            else{Kukurydza.visibility=View.GONE}

            if (Salata.isChecked) {
                Salata.visibility = View.VISIBLE
            }
            else{Salata.visibility=View.GONE}
        }
    }
}