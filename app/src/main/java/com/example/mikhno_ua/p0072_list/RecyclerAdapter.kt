package com.example.mikhno_ua.p0072_list

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast

class RecyclerAdapter : RecyclerView.Adapter<RecyclerViewHolder>() {

    private var items: MutableList<String> = mutableListOf()
    private var onRecyclerClicked: OnRecyclerClicked? = null

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val textToShow = items[position]
        holder.bind(textToShow)
        holder.itemView.setOnClickListener({
            onRecyclerClicked?.onClick(textToShow)
        })
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_recycler, parent, false)
        return RecyclerViewHolder(view)
    }

    fun setOnRecyclerClicked(onRecyclerClicked: OnRecyclerClicked?) {
        this.onRecyclerClicked = onRecyclerClicked
    }

    fun setItems(newItems:List<String>) {
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }

    interface OnRecyclerClicked {
        fun onClick(text: String)
    }
}