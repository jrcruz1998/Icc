package com.example.maisum.annotation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.maisum.R
import com.example.maisum.databinding.ActivityAnnotationBinding

class AnnotationFragment : Fragment() {

    private var _binding: ActivityAnnotationBinding? = null
    private val binding get() = _binding!!

    private val adapter = AnnotationAdapter()

    override fun onCreateView(inflater: LayoutInflater, group: ViewGroup?, state: Bundle?): View? {
        return inflater.inflate(R.layout.activity_annotation, group, false)
    }

    companion object {
        fun newInstance() = AnnotationFragment()
    }

}