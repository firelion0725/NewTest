package com.leo.test

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("MainActivity life cycle", "onCreate")
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity life cycle", "onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity life cycle", "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MainActivity life cycle", "onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity life cycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity life cycle", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity life cycle", "onDestroy")
    }
}