package com.example.navchenta_welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.navchenta_welcome.navigation.Drawer

class verification_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification_page)

        var verifybtn = findViewById<Button>(R.id.verification_verify_button)
        .setOnClickListener {
            val intent = Intent(this, Drawer::class.java)
//            intent.putExtra("USER", enteredName)
            startActivity(intent)
        }
    }
}