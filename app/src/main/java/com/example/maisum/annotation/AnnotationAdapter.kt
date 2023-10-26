package com.example.maisum.annotation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.maisum.databinding.ItemAnnotationBinding

class AnnotationAdapter : RecyclerView.Adapter<AnnotationViewHolder>() {

    private var annotationList: List<AnnotationModel> = listOf()
    private lateinit var listener: OnAnnotationListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnnotationViewHolder {
        val item = ItemAnnotationBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AnnotationViewHolder(item, listener)
    }

    override fun onBindViewHolder(holder: AnnotationViewHolder, position: Int) {
        holder.bind(annotationList[position])
    }

    override fun getItemCount(): Int {
        return annotationList.size
    }

    fun updateAnnotation(list: List<AnnotationModel>) {
        annotationList = list
        // Notifica para que realize as atualizações
        notifyDataSetChanged()
    }

    fun attachListener(annotationListener: OnAnnotationListener) {
        listener = annotationListener
    }

}
