package alk.cinepedia.View

import alk.cinepedia.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomappbar.BottomAppBar

class MainActivity : AppCompatActivity() {

    lateinit var topAppBar:BottomAppBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*
        topAppBar.setNavigationOnClickListener {
            // Handle navigation icon press
        }

        topAppBar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.favorite -> {
                    // Handle favorite icon press
                    true
                }
                R.id.search -> {
                    // Handle search icon press
                    true
                }
                else -> false
            }
        }*/
    }
}