package com.example.maisum

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.maisum.databinding.FragmentHomeBinding

class HomeActivity : AppCompatActivity() {

    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    companion object {
        fun newInstance() = HomeActivity()
    }
}