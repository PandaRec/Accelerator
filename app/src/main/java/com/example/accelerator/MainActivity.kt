package com.example.accelerator

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.*
import com.example.accelerator.databinding.ActivityMainBinding
import com.example.accelerator.utils.OnSwipeTouchListener
import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMain.toolbar)

//        binding.appBarMain.fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show()
//        }
        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(setOf(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow), drawerLayout)
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)


        //to show color in side navigation
        navView.itemIconTintList = null
        //add smth to side navigation
        val m = navView.menu
        createSideMenu(m)
        //swipes to open side navigation
        drawerLayout.setOnTouchListener(object: OnSwipeTouchListener(this@MainActivity) {
            override fun onSwipeLeft() {
                drawerLayout.closeDrawer(GravityCompat.START)
                Toast.makeText(this@MainActivity, "onSwipeLeft", Toast.LENGTH_SHORT).show()
            }
            override fun onSwipeRight() {
                drawerLayout.openDrawer(GravityCompat.START)
                Toast.makeText(this@MainActivity, "onSwipeRight", Toast.LENGTH_SHORT).show()


            }

        })
//

        //this is for click
        navView.setNavigationItemSelectedListener {
            //it.itemId
            Log.d("MYTAG",it.title.toString())
            Log.d("MYTAG",it.itemId.toString())
            when(it.itemId){
                1->{
                    it.isCheckable=true
                    navController.navigate(R.id.nav_gallery)
                    drawerLayout.closeDrawer(GravityCompat.START)
                }
                2->{
                    it.isCheckable=true
                    navController.navigate(R.id.nav_gallery)
                    drawerLayout.closeDrawer(GravityCompat.START)
                }
            }


            true
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    private fun createSideMenu(m:Menu){
        val menuViews = m.addSubMenu("views")
        menuViews.add("Month").setIcon(R.color.purple_700)
        menuViews.add("TimeTable").setIcon(R.color.purple_500)
        val menuGroups = m.addSubMenu("groups")
        menuGroups.add(Menu.NONE,1,Menu.NONE,"Group 1").setIcon(R.color.purple_200)
        menuGroups.add(Menu.NONE,2,Menu.NONE,"Group 2").setIcon(R.color.purple_200)

        val menuSettings = m.addSubMenu("settings")
        menuSettings.add("Settings").setIcon(R.color.black)
    }
}