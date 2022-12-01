package com.example.practical

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = "This is a Toast!"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            
            val uri = "http://maps.google.com/maps?saddr=" + "9982878" + "," + "76285774" + "&daddr=" + "9992084" + "," + "76286455"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
            intent.setClassName(
                "com.google.android.apps.maps",
                "com.google.android.maps.MapsActivity"
            )
            startActivity(intent)
        }
    }
}