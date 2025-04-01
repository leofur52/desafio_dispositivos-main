package com.example.desafio.DAO

import com.example.desafio.entities.Colecionavel

interface ColecionavelDAO {
    public fun getColecionaveis(): List<Colecionavel>
    public fun addColecionavel(colecionavel: Colecionavel)
}