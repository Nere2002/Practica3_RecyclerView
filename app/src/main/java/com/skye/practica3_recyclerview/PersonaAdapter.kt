package com.skye.practica3_recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PersonasAdapter(private val listaPersonas: List<IntemsLista>) :
    RecyclerView.Adapter<PersonasAdapter.PersonaViewHolder>() {

    class PersonaViewHolder(private val binding: ItemPersonaBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: IntemsLista) {
            binding.textViewNombre.text = item.nombre
            binding.textViewEdad.text = "Edad: ${item.edad}"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonaViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemPersonaBinding.inflate(inflater, parent, false)
        return PersonaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonaViewHolder, position: Int) {
        holder.bind(listaPersonas[position])
    }

    override fun getItemCount(): Int {
        return listaPersonas.size
    }
}
