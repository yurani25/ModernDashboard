package com.example.moderndashboard

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Tarjeta para la ropa
        val clothingCard = findViewById<CardView>(R.id.clothingCard)
        clothingCard.setOnClickListener {
            val intent = Intent(this@MainActivity, clothingActivity::class.java)
            startActivity(intent)
        }

        // Tarjeta para la electrónica
        val elecName = findViewById<CardView>(R.id.elecName)
        elecName.setOnClickListener {
            val intent = Intent(this@MainActivity, ElectronicsActivity::class.java)
            startActivity(intent)
        }

        val  homecard = findViewById<CardView>(R.id.homecard)
        homecard.setOnClickListener {
            val intent = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(intent)
        }
        val beautycard = findViewById<CardView>(R.id.beautycard)
        beautycard.setOnClickListener {
            val intent = Intent(this@MainActivity, BeautyActivity::class.java)
            startActivity(intent)
        }

        val  pharmacy= findViewById<CardView>(R.id.pharmacy)
        pharmacy.setOnClickListener {
            val intent = Intent(this@MainActivity, PharmacyActivity::class.java)
            startActivity(intent)
        }
        val  groceries = findViewById<CardView>(R.id.groceries)
        groceries.setOnClickListener {
            val intent = Intent(this@MainActivity, GroceriesActivity::class.java)
            startActivity(intent)
        }


    }
}