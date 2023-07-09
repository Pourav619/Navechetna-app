package com.example.navchenta_welcome.bottom

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.navchenta_welcome.R
import com.example.navchenta_welcome.databinding.ActivityBottomNavBinding
import com.example.navchenta_welcome.navigation.Drawer
import com.example.navchenta_welcome.quiz_page

class BottomNav : AppCompatActivity() {

    private lateinit var binding: ActivityBottomNavBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        var button1_dashboard=findViewById<Button>(R.id.dashbord_button1)

        binding = ActivityBottomNavBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView1

        val navController = findNavController(R.id.nav_host_fragment_activity_bottom_nav)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications,
            )
        )

//        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

//        button1_dashboard.setOnClickListener {
//            val i = Intent(this, quiz_page::class.java)
//            startActivity(i)
//            this
////            val intent = Intent(this, quiz_page::class.java)
//////            intent.putExtra("USER", enteredName)
////            startActivity(intent)
//        }
    }

}