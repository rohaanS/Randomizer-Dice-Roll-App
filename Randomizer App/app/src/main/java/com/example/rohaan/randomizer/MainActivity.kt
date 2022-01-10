package com.example.rohaan.randomizer

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import com.example.rohaan.randomizer.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.rollButton)
        val resultsTextView = findViewById<TextView>(R.id.resultsTextView)
        var seekBar = findViewById<SeekBar>(R.id.seekBar)

        rollButton.setOnClickListener {
            val safe = if (seekBar.progress == 0) {
                resultsTextView.text = "0"
            } else {
                val rand = Random.nextInt(seekBar.progress) + 1
                resultsTextView.text = rand.toString()
            }


        }
    }
}