package com.blez.loginpage.model.register

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.blez.loginpage.R
import com.blez.loginpage.databinding.ActivityRegisterBinding
import com.blez.loginpage.model.dashboard.DashBoardActivity
import com.blez.loginpage.model.login.LoginActivity
import com.klinker.android.link_builder.Link
import com.klinker.android.link_builder.applyLinks

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_register)

        binding.backBtn.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.registerBtn.setOnClickListener {
            val intent = Intent(this,DashBoardActivity::class.java)
            startActivity(intent)
        }

        linkSetup()
    }
    private fun linkSetup()
    {
        val login = Link("Login Here")
            .setTextColor(Color.CYAN)
            .setTextColorOfHighlightedLink(Color.CYAN)
            .setHighlightAlpha(.4f)
            .setUnderlined(false)
            .setBold(true)
            .setOnClickListener {
                val intent = Intent(this,LoginActivity::class.java)
                startActivity(intent)
            }
        binding.existingloginText.applyLinks(login)
    }
}