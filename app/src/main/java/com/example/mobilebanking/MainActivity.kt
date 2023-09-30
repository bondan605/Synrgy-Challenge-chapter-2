package com.example.mobilebanking

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private var namesList = mutableListOf<String>()
    private var banksList = mutableListOf<String>()
    private var transactionsList = mutableListOf<String>()
    private var imagesList = mutableListOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        postToList()
        rv_recyclerView.layoutManager = LinearLayoutManager(this)
        rv_recyclerView.adapter =
            RecyclerAdapter(namesList, banksList, transactionsList, imagesList)

    }

    private fun addToList(name: String, bank: String, transaction: String, image: Int) {
        namesList.add(name)
        banksList.add(bank)
        transactionsList.add(transaction)
        imagesList.add(image)
    }

    private fun postToList() {
        for (i in 1..7) {
            addToList(
                "Bondan Gunawan",
                "BCA - 34298493583",
                "+ \$154.50",
                R.drawable.bondanpersegi
            )
        }
    }

}