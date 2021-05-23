package com.example.diffutilcallback

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.diffutilcallback.databinding.MainActivityLayoutBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val adapter: ParentAdapter by lazy {
        ParentAdapter()
    }
    private var binding: MainActivityLayoutBinding ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val viewModel = MainViewModel()

        binding?.recyclerView?.adapter = adapter
        binding?.recyclerView?.layoutManager = LinearLayoutManager(this@MainActivity)

        viewModel.listLiveData.observe(this, {
            adapter.updateList(it)
        })


        binding?.fab?.setOnClickListener {
            val randomNo = Random.nextInt(0, 8)
            showToastL("position at ${randomNo+1}")
            viewModel.updateList(randomNo)
        }
    }
}

fun Activity.showToastL(message: String){
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}