package com.blez.loginpage.model.dashboard

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.databinding.DataBindingUtil
import com.blez.loginpage.R
import com.blez.loginpage.databinding.ActivityDashBoardBinding
import com.blez.loginpage.model.login.LoginActivity

class DashBoardActivity : AppCompatActivity() {
    private lateinit var actionBarDrawerToggle : ActionBarDrawerToggle
    private lateinit var binding: ActivityDashBoardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_dash_board)
         actionBarDrawerToggle = ActionBarDrawerToggle(this,binding.drawerlayout,R.string.nav_open,R.string.nav_close)
        binding.drawerlayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.navigationView.setNavigationItemSelectedListener {
            when (it.itemId)
            {
                R.id.nav_logout -> {
                    Toast.makeText(this, "Clicked log out", Toast.LENGTH_LONG).show()
                    intent(this)
                }
                

            }
           true
        }

    }
    private fun intent(context: Context){
        val intent = Intent(context,LoginActivity::class.java)
        startActivity(intent)
        finish()
    }




    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(actionBarDrawerToggle.onOptionsItemSelected(item))
        {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}