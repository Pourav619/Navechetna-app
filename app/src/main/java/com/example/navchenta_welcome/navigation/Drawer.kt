package com.example.navchenta_welcome.navigation

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.example.navchenta_welcome.R
import com.example.navchenta_welcome.databinding.ActivityMain2Binding
import com.example.navchenta_welcome.navigation.ui.about_us
import com.example.navchenta_welcome.navigation.ui.certificate.Certificate
import com.example.navchenta_welcome.navigation.ui.help
import com.example.navchenta_welcome.navigation.ui.resources
import com.example.navchenta_welcome.quiz_page
import com.google.android.material.bottomnavigation.BottomNavigationView

class Drawer : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMain.toolbar)

//        binding.appBarMain.fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
//        }
        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView

        val navView2: BottomNavigationView=drawerLayout.findViewById(R.id.nav_view1)


        val navController = findNavController(R.id.nav_host_fragment_content_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_pretest, R.id.nav_posttest,R.id.nav_resources,R.id.nav_about_us,R.id.nav_help,R.id.nav_certificate,R.id.dashboardFragment,R.id.notificationsFragment,R.id.homeFragment

            ), drawerLayout
        )
        navView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_certificate -> {
                    // Open the new activity here
                    val intent = Intent(this, Certificate::class.java)
                    startActivity(intent)
                }
                R.id.nav_resources -> {
                    // Handle Resources selection
                    val intent = Intent(this, resources::class.java)
                    startActivity(intent)
                }
                R.id.nav_about_us -> {
                    // Handle About Us selection
                    val intent = Intent(this, about_us::class.java)
                    startActivity(intent)
                }
                R.id.nav_help -> {
                    // Handle Help selection
                    val intent = Intent(this, help::class.java)
                    startActivity(intent)
                }
            }
            // Close the navigation drawer
            drawerLayout.closeDrawer(GravityCompat.START)
            true
        }
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        navView2.setupWithNavController(navController)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}
