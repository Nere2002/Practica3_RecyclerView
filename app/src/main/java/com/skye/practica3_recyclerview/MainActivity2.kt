package com.skye.practica3_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.skye.practica3_recyclerview.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Recupera la lista de extras del intent
        val listaPersonas = intent.getStringArrayListExtra("listaPersonas")

        // Convierte la lista de strings a una lista de IntemsLista
        val listaIntems = listaPersonas?.map {
            val (nombre, edad) = it.split(", ")
            IntemsLista(nombre, edad)
        } ?: emptyList()

        // Configura el RecyclerView
        val recyclerView = binding.lista
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = PersonasAdapter(listaIntems)
        recyclerView.adapter = adapter
    }
}