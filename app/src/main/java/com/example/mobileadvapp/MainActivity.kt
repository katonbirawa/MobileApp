package com.example.mobileadvapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.mobileadvapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var contentView: ConstraintLayout
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCheckConfig.setOnClickListener {
            binding.tvStatus.text = "Konfigurasi berhasil dicek!"
            Toast.makeText(this, "Konfigurasi Project & ViewBinding Berhasil", Toast.LENGTH_SHORT).show()
        }
    }
}

