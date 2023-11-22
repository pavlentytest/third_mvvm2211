package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding
import android.util.*
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var myViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("RRR","onCreate()")
        myViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.button.setOnClickListener {
            myViewModel.setCounter()
        }
        myViewModel.counter.observe(this, Observer {
            binding.textView.text = it.toString()
        })
    }
}