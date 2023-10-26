package com.example.maisum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.maisum.annotation.AnnotationAdapter
import com.example.maisum.databinding.ActivityMainBinding
import com.example.maisum.fragments.BibleFragment
import com.example.maisum.fragments.HomeFragment
import com.example.maisum.fragments.InfoFragment
import com.example.maisum.fragments.MusicFragment

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    private val adapter by lazy {
        AnnotationAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> openFragment(HomeFragment.newInstance())
                R.id.music -> openFragment(MusicFragment.newInstance())
                R.id.bible -> openFragment(BibleFragment.newInstance())
                R.id.annotation -> openFragment(AnnotationActivity.newInstance())
                R.id.info -> openFragment(InfoFragment.newInstance())
            }
            true
        }

        binding.fabAnnotation.setOnClickListener { view ->
            val intent = Intent(this, AddAnnotationActivity::class.java)
            startActivity(intent)
        }

        binding.bottomNavigation.selectedItemId = R.id.home
    }

    private fun openFragment(fragment: Fragment) {
        val transition = supportFragmentManager.beginTransaction()
        transition.replace(R.id.container, fragment)
        transition.commit()
    }
}