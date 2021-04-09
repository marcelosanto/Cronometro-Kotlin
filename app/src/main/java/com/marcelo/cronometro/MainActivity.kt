package com.marcelo.cronometro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marcelo.cronometro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        botaoIninciar = binding.btnIniciar
        botaoPausar = binding.btnPausar
        botaoReiniciar = binding.btnReiniciar
    }
}