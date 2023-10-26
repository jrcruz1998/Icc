package com.example.maisum

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.maisum.databinding.ActivityAdicionarTarefaBinding

class AddAnnotationActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAdicionarTarefaBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        clickSalvar()
    }

    private fun clickSalvar() {
        binding.btnSalvar.setOnClickListener {
            Toast.makeText(this, "Clicakdo", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}