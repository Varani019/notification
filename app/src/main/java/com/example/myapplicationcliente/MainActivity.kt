package com.example.myapplicationcliente

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplicationcliente.showNotification as showNotification1

class MainActivity : AppCompatActivity() {

    lateinit var  btSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btSend = findViewById(R.id.button_send_notification)
        btSend.setOnClickListener{
            this.showNotification1("1234", "booticamp Android", "Kotlin Android curso")
        }

    }
}