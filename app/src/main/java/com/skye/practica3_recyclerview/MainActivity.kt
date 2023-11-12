package com.skye.practica3_recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.skye.practica3_recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val listaPersonas = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAnadir.setOnClickListener{
            val nombre = binding.editTextNombre.text.toString()
            val edad = binding.editTextedad.text.toString()

            // Añadir nombre y edad a la lista
            val persona = "$nombre, $edad años"
            listaPersonas.add(persona)

            // Limpiar campos después de añadir
            binding.editTextNombre.text.clear()
            binding.editTextedad.text.clear()
        }
        binding.buttonSiguiente.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            // Pasa la lista como extra al intent
            intent.putStringArrayListExtra("listaPersonas", ArrayList(listaPersonas))

            startActivity(intent)

        }
    }
}