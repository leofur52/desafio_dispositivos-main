package com.example.desafio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.desafio.DAO.ColecionavelDAOImpl
import com.example.desafio.entities.Colecionavel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val edtNome = findViewById<EditText>(R.id.edt_nome)
        val edtValor = findViewById<EditText>(R.id.edt_valor)
        val edtImagem = findViewById<EditText>(R.id.edt_imagem)
        val btnCadastrar = findViewById<Button>(R.id.btn_cadastrar)
        val txvLista = findViewById<TextView>(R.id.txv_lista)

        val colecionavelDAO = ColecionavelDAOImpl()

        btnCadastrar.setOnClickListener {
            val nome = edtNome.text.toString()
            val valorStr = edtValor.text.toString()
            val imagem = edtImagem.text.toString()

            try {
                val valor = valorStr.toDouble()

                val colecionavel = Colecionavel(
                    nome,
                    valor,
                    imagem
                )

                colecionavelDAO.addColecionavel(colecionavel)
            } catch (e: Exception) {

            }
        }

        txvLista.setOnClickListener {
            val intent = Intent(this, CatalogoActivity::class.java)
            startActivity(intent)
        }
    }
}