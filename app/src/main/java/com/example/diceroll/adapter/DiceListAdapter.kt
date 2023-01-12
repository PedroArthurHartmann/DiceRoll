package com.example.diceroll.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.diceroll.R
import com.example.diceroll.databinding.ItemListBinding

class DiceListAdapter(private val sides: Int) : RecyclerView.Adapter<DiceListAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemListBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvItemText.text =
            holder.binding.root.context.getString(R.string.possibility_n, position + 1)
    }

    override fun getItemCount(): Int = sides

}