package com.example.desafio.Adapter

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio.R
import com.example.desafio.entities.Colecionavel
import com.squareup.picasso.Picasso

class ColecionavelAdapter(private val colecionaveis: List<Colecionavel>) :
    RecyclerView.Adapter<ColecionavelAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageView>(R.id.image)
        val txvNome = itemView.findViewById<TextView>(R.id.txv_nome)
        val txvValor = itemView.findViewById<TextView>(R.id.txv_valor)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_catalago, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val colecionavel = colecionaveis[position]
        Picasso.get().load(colecionavel.imagemUrl).into(holder.image)
        //holder.image.setImageURI(colecionavel.imagemUrl.toUri())

        holder.txvNome.text = colecionavel.nome
        holder.txvValor.text = colecionavel.valor.toString()
    }

    override fun getItemCount(): Int {
        return colecionaveis.size
    }
}