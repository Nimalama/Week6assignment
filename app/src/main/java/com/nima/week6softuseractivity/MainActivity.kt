package com.nima.week6softuseractivity

import android.graphics.Insets.add
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.nima.week6softuseractivity.Class.add
import com.nima.week6softuseractivity.ui.dashboard.DashboardFragment
import com.nima.week6softuseractivity.ui.home.HomeFragment
import com.nima.week6softuseractivity.ui.notifications.NotificationsFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        val home = HomeFragment()
        val notification = NotificationsFragment()
        val dash = DashboardFragment()
        add()
        makeCurrentFrag(home)
        navView.setOnNavigationItemSelectedListener(){

            when(it.itemId)
            {
                R.id.navigation_home->{
                    makeCurrentFrag(home)
                }

                R.id.navigation_dashboard->{
                    makeCurrentFrag(dash)
                }
                R.id.navigation_notifications->{
                    makeCurrentFrag(notification)
                }


            }

            true
        }





    }
    fun makeCurrentFrag(frag: Fragment)
    {
        supportFragmentManager.beginTransaction().apply{

            replace(R.id.nav_host_fragment,frag)
            addToBackStack(null)
            commit()

        }

    }

}