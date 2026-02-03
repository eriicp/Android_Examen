package com.example.examen

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Holder per a Tasca
class TascaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val tvNom: TextView = itemView.findViewById(R.id.tvNom)
    private val tvCategoria: TextView = itemView.findViewById(R.id.tvCategoria)
    private val tvData: TextView = itemView.findViewById(R.id.tvData)

    private val tvEstat: TextView = itemView.findViewById(R.id.tvEstat)

    fun renderitza(tasca: Tasca) {
        tvNom.text = tasca.nom
        tvData.text = tasca.data
    }
}
