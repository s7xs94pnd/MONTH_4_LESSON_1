package com.example.month_4_lesson_1.ui.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.month_4_lesson_1.R
import com.example.month_4_lesson_1.databinding.ActivityMainBinding
import com.example.month_4_lesson_1.ui.fragments.HomeFragmentDirections

class MainActivity : AppCompatActivity() {
    private  var binding: ActivityMainBinding?=null

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment

        navController = navHostFragment.navController

        binding!!.bottomNav.setupWithNavController(navController)


        binding!!.bottomNav.setupWithNavController(navController)

/*
        // Handle custom behavior for each bottom navigation item
        binding.bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.acInfoFragment -> {
                    val default =AcData("name","dwad","123123123")
                    findNavController().navigate(R.id.action_homeFragment_to_acInfoFragment)
                    true
                }
                else -> false
            }
        }*/
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}