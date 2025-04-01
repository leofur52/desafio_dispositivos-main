package com.example.desafio.DAO

import com.example.desafio.entities.Colecionavel

class ColecionavelDAOImpl : ColecionavelDAO {
    companion object {
        private val colecionaveis = mutableListOf<Colecionavel>()
    }

    override fun getColecionaveis(): List<Colecionavel> {
        return Companion.colecionaveis;
    }

    override fun addColecionavel(colecionavel: Colecionavel) {
        Companion.colecionaveis.add(colecionavel)
    }

}