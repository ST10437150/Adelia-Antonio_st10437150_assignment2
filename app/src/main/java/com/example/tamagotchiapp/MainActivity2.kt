package com.example.tamagotchiapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity2k : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var feedButton: Button
    private lateinit var cleanButton: Button
    private lateinit var playButton: Button
    private lateinit var hungerCountTextView: TextView
    private lateinit var cleanCountTextView: TextView
    private lateinit var happyCountTextView: TextView

    private var hungerCount: Int = 0
    private var cleanCount: Int = 0
    private var happyCount: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

// Initialize views
        imageView = findViewById(R.id.imageView2)
        feedButton = findViewById(R.id.feedButton)
        cleanButton = findViewById(R.id.cleanButton)
        playButton = findViewById(R.id.playButton)
        hungerCountTextView = findViewById(R.id.hungerCount)
        cleanCountTextView = findViewById(R.id.cleanCount)
        happyCountTextView = findViewById(R.id.happyCount)

// Set initial count values
        updateCountViews()

// Set onClick listeners for buttons
        feedButton.setOnClickListener {
// Change pet image
            imageView.setImageResource(R.drawable.a)
// Increment hunger count
            hungerCount++
// Update count views
            updateCountViews()
        }

        cleanButton.setOnClickListener {
// Change pet image
            imageView.setImageResource(R.drawable.s)
// Increment clean count
            cleanCount++
// Update count views
            updateCountViews()
        }

        playButton.setOnClickListener {
// Change pet image
            imageView.setImageResource(R.drawable.g)
// Increment happy count
            happyCount++
// Update count views
            updateCountViews()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun updateCountViews() {
        if (hungerCount > 0) {
            hungerCountTextView.text = "Hunger Count: $hungerCount"
        } else {
            hungerCountTextView.text = ""
        }

        if (cleanCount > 0) {
            cleanCountTextView.text = "Clean Count: $cleanCount"
        } else {
            cleanCountTextView.text = ""
        }

        if (happyCount > 0) {
            happyCountTextView.text = "Happy Count: $happyCount"
        } else {
            happyCountTextView.text = ""
        }
    }
}


/* class MainActivity2 : AppCompatActivity() {

private lateinit var imageView: ImageView
private lateinit var feedButton: Button
private lateinit var cleanButton: Button
private lateinit var playButton: Button
private lateinit var hungerCountTextView: TextView
private lateinit var cleanCountTextView: TextView
private lateinit var happyCountTextView: TextView

private var hungerCount: Int = 0
private var cleanCount: Int = 0
private var happyCount: Int = 0

override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
setContentView(R.layout.activity_main2)

// Initialize views
imageView = findViewById(R.id.imageView2)
feedButton = findViewById(R.id.feedButton)
cleanButton = findViewById(R.id.cleanButton)
playButton = findViewById(R.id.playButton)
hungerCountTextView = findViewById(R.id.hungerCount)
cleanCountTextView = findViewById(R.id.cleanCount)
happyCountTextView = findViewById(R.id.happyCount)

// Set initial count values
updateCountViews()

// Set onClick listeners for buttons
feedButton.setOnClickListener {
// Change pet image
imageView.setImageResource(R.drawable.a)
// Increment hunger count
hungerCount++
// Update count views
updateCountViews()
}

cleanButton.setOnClickListener {
// Change pet image
imageView.setImageResource(R.drawable.s)
// Increment clean count
cleanCount++
// Update count views
updateCountViews()
}

playButton.setOnClickListener {
// Change pet image
imageView.setImageResource(R.drawable.g)
// Increment happy count
happyCount++
// Update count views
updateCountViews()
}
}

private fun updateCountViews() {
hungerCountTextView.text = getString(R.string.hungerCount, hungerCount.toString())
cleanCountTextView.text = getString(R.string.cleanCount, cleanCount.toString())
happyCountTextView.text = getString(R.string.happyCount, happyCount.toString())
}
}*/