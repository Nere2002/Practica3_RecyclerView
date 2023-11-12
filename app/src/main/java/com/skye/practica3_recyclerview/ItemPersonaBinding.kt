package com.skye.practica3_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class ItemPersonaBinding private constructor(
    cardView: CardView,
    val textViewEdad: TextView,
    val textViewNombre: TextView
) : RecyclerView.ViewHolder(cardView) {

    val root: View

    init {
        root = cardView
    }

    companion object {
        fun bind(rootView: View): ItemPersonaBinding {
            return ItemPersonaBinding(
                rootView as CardView,
                rootView.findViewById(R.id.textViewEdad),
                rootView.findViewById(R.id.textViewNombre)
            )
        }

        fun inflate(inflater: LayoutInflater, parent: ViewGroup, attachToRoot: Boolean): ItemPersonaBinding {
            val view = inflater.inflate(R.layout.item_persona, parent, attachToRoot)
            return bind(view)
        }
    }
}
