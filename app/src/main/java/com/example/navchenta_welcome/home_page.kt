package com.example.navchenta_welcome


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import com.example.navchenta_welcome.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import androidx.navigation.ui.setupWithNavController


class home_page : AppCompatActivity(){

    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val drawerLayout: DrawerLayout=findViewById(R.id.drawerLayout)
        val navView: NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

//        navView.setNavigationItemSelectedListener {
//
//            when(it.itemId){
//
//                R.id.nav_home -> Toast.makeText(applicationContext,"Clicked Home",Toast.LENGTH_SHORT).show()
//                R.id.nav_message -> Toast.makeText(applicationContext,"Clicked Message",Toast.LENGTH_SHORT).show()
//                R.id.nav_sync -> Toast.makeText(applicationContext,"Clicked Sync",Toast.LENGTH_SHORT).show()
//                R.id.nav_trash -> Toast.makeText(applicationContext,"Clicked Delete",Toast.LENGTH_SHORT).show()
//                R.id.nav_setting -> Toast.makeText(applicationContext,"Clicked Setting",Toast.LENGTH_SHORT).show()
//                R.id.nav_Login -> Toast.makeText(applicationContext,"Clicked Login",Toast.LENGTH_SHORT).show()
//                R.id.nav_share -> Toast.makeText(applicationContext,"Clicked Share",Toast.LENGTH_SHORT).show()
//                R.id.nav_rate_us -> Toast.makeText(applicationContext,"Clicked Rate us",Toast.LENGTH_SHORT).show()
//
//            }
//            true
//        }
//        var Navcontroller : NavController = findNavController(R.id.fragment_containe)
//        var bottomNav : BottomNavigationView = findViewById(bottom_navigatio)
//        bottomNav.setupWithNavController(Navcontroller)

//        val quiz_btn = findViewById<Button>(R.id.quiz_button)
//        quiz_btn.setOnClickListener {
//            val intent = Intent(this, quiz_page::class.java)
////            intent.putExtra("USER", enteredName)
//            startActivity(intent)
//        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
