package com.example.examen

import android.graphics.Color
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
        tvCategoria.text = tasca.categoria as CharSequence?
        tvData.text = tasca.data
        val color = when (tvEstat.text){
            "No començada" -> "#FF9800"
            "En curs" -> "#2196F3"
            "Finalitzada" -> "#4CAF50"
            else -> {"#000000"}
        }
        tvEstat.setTextColor(Color.parseColor(color))
        tvEstat.text = tasca.estat as CharSequence?
    }
}
