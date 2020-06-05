package com.dakusuno.dakusunosubmition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navController = findNavController(R.id.nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration(navController.graph)
        toolbar.setupWithNavController(navController,appBarConfiguration)
        navController.addOnDestinationChangedListener(){_,destination,_->
            when(destination.id){
                R.id.mainFragment ->{
                    toolbar.menu.clear()
                    toolbar.inflateMenu(R.menu.menu_main)
                }
                else -> toolbar.menu.clear()
            }
        }
        toolbar.setOnMenuItemClickListener {
            when(it.itemId)
            {
                R.id.menu_person -> {
                    findNavController(R.id.nav_host_fragment).navigate(R.id.action_mainFragment_to_profileFragment)
                    true
                }
                else -> {super.onOptionsItemSelected(it)}
            }
        }
    }

}