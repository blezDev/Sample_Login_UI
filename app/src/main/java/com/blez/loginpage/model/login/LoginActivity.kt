package com.blez.loginpage.model.login

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.blez.loginpage.R
import com.blez.loginpage.databinding.ActivityLoginBinding
import com.blez.loginpage.model.register.RegisterActivity
import com.klinker.android.link_builder.Link
import com.klinker.android.link_builder.applyLinks

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        val button = findViewById<Button>(R.id.registerBtn)
        button.setOnClickListener {
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
        linksetup()
    }
    fun linksetup()
    {
        val signup = Link("Sign Up")
            .setTextColor(Color.CYAN)
            .setTextColorOfHighlightedLink(Color.CYAN)
            .setHighlightAlpha(.4f)
            .setUnderlined(false)
            .setBold(true)
            .setOnClickListener {
                val intent = Intent(this,RegisterActivity::class.java)
                startActivity(intent)
            }
        binding.newSignText.applyLinks(signup)


    }
}