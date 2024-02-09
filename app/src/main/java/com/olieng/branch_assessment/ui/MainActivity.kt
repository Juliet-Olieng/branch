package com.olieng.branch_assessment.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.olieng.branch_assessment.R
import com.olieng.branch_assessment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnSignUp.setOnClickListener{
         validateSignUp()
            val intent=Intent(this@MainActivity,Login::class.java)
            startActivity(intent)

        }
    }
    fun validateSignUp(){
        val firstName=binding.etFirstName.text.toString()
        val lastName=binding.etLastName.text.toString()
        val email=binding.etEmailAdress.text.toString()
        val passWord=binding.etPassword.text.toString()
        val confirmPassword=binding.etConfirmPassword.text.toString()
        var error=false

        if (firstName.isBlank()){
            binding.TILFirstName.error="FirstName is required"
            error=true
        }
        if (lastName.isBlank()){
            binding.TILLastName.error="LastName is required"
            error=true
        }
        if (email.isBlank()){
            binding.TILEmailAdress.error="Email is required"
            error=true
        }
        if (passWord.isBlank()){
            binding.TILPassword.error="passWord is required"
            error=true
        }
        if (confirmPassword.isBlank()){
            binding.TILConfirmPassword.error="password do not much"
            error=true
        }


    }

}