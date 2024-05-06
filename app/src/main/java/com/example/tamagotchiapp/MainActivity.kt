package com.example.tamagotchiapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getStartedButton: Button = findViewById(R.id.getstartedButton)

        getStartedButton.setOnClickListener {
// create the explicit intent
            val intent = Intent( this, MainActivity2::class.java)
            startActivity(intent)
// start the activity

        }
    }
}

class MainActivity2 {

}
