package com.example.maisum.annotation

import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.example.maisum.databinding.ItemAnnotationBinding

class AnnotationViewHolder(
    private val bind: ItemAnnotationBinding,
    private val listener: OnAnnotationListener
) :
    RecyclerView.ViewHolder(bind.root) {

        fun bind(annotation: AnnotationModel){
            bind.textDescricao.text = annotation.description

            bind.btnEditar.setOnClickListener {
                listener.onClick(annotation.id)
            }

            // Apagar ao clicar no botão "Apagar"
            bind.btnExcluir.setOnClickListener {

                // Confirmação de remoção
                AlertDialog.Builder(itemView.context)
                    .setTitle("Remoção de nota")
                    .setMessage("Tem certeza que deseja remover?")
                    .setPositiveButton("Sim") { dialog, which ->
                        listener.onDelete(annotation.id)
                    }
                    .setNegativeButton("Não", null)
                    .create()
                    .show()
            }
        }

}
