package com.example.mikhno_ua.p0072_list

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class RecyclerViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val textView: TextView = itemView.findViewById(R.id.recycler_text)

    fun bind(textToShow: String) {
        if(textToShow.isEmpty()) {
            textView.visibility = View.GONE
        } else {
            textView.visibility = View.VISIBLE
        }

        textView.text = textToShow
    }
}
