package com.devani.coingame

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.devani.coingame.databinding.CoinMainBinding


class CoinGame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = CoinMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            flip()
        }
    }

    private fun flip() {
        val result = flipCoin()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = if (result == 1) "heads" else "tails"
    }

    private fun flipCoin(): Int {
        return (0..1).random()
    }
}