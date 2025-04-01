package com.example.desafio

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio.Adapter.ColecionavelAdapter
import com.example.desafio.DAO.ColecionavelDAOImpl

class CatalogoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_catalogo)
        val colecionavelDAO = ColecionavelDAOImpl()
        val recyclerViewColecionavel = findViewById<RecyclerView>(R.id.recyclerView_colecionaveis)
        val colecionaveis = colecionavelDAO.getColecionaveis()
        recyclerViewColecionavel.layoutManager = LinearLayoutManager(this)
        recyclerViewColecionavel.adapter = ColecionavelAdapter(colecionaveis)
    }
}