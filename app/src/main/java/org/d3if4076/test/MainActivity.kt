package org.d3if4076.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.d3if4076.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener { test() }
    }
    private fun test() {
        val hambatan = binding.hambatanInp.text.toString().toFloat()
        val tegangan= binding.teganganInp.text.toString().toFloat()
        val hitung = hambatan / tegangan
        binding.kuataruslistrikTextView.text = getString(R.string.Arus_x, hitung)

    }

}