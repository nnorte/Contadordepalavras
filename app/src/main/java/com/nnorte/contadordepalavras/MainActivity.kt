package com.nnorte.contadordepalavras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_calcular_palavra.setOnClickListener(View.OnClickListener {
            val fraseUtil = ed_frase.text.toString()
            tv_num_palavra.text = contaPalavra(fraseUtil).toString()
            Snackbar.make(it,"Escreveu ${contaPalavra(fraseUtil)} palavra (s)",Snackbar.LENGTH_INDEFINITE).show()
        })

    }


    fun contaPalavra(frase : String): Int{

        val palavra = frase.split(" ")

        var contadorPalavra : Int = 0

        for(P in palavra){
            if (!P.equals("")){

                contadorPalavra ++

            }
        }
        return contadorPalavra
    }
}
