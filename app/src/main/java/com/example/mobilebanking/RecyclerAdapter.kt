package com.example.mobilebanking

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(
    private var names: List<String>,
    private var banks: List<String>,
    private var transactions: List<String>,
    private var images: List<Int>
) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemName: TextView = itemView.findViewById(R.id.tv_name)
        val itemBank: TextView = itemView.findViewById(R.id.tv_bank)
        val itemTransaction: TextView = itemView.findViewById(R.id.tv_transaction)
        val itemImage: ImageView = itemView.findViewById(R.id.iv_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_activity, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return names.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemName.text = names[position]
        holder.itemBank.text = banks[position]
        holder.itemTransaction.text = transactions[position]
        holder.itemImage.setImageResource(images[position])
    }
}