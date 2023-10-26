package com.example.maisum

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.maisum.annotation.AnnotationAdapter
import com.example.maisum.annotation.AnnotationFragment
import com.example.maisum.databinding.ActivityAnnotationBinding


class AnnotationActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAnnotationBinding.inflate(layoutInflater) }

//    private val adapter by lazy {
//        AnnotationAdapter()
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val recyclerView = binding.rvAnnotation

        // Layout
        binding.rvAnnotation.layoutManager = LinearLayoutManager(applicationContext)

        // Adapter
        //binding.rvAnnotation.adapter = adapter

//        binding.fabAnnotation.setOnClickListener {
//            val intent = Intent(this, AddAnnotatinActivity::class.java)
//            startActivity(intent)
//        }
    }

    companion object {
        fun newInstance() = AnnotationFragment()
    }

}