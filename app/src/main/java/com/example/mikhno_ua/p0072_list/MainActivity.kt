package com.example.mikhno_ua.p0072_list

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = layoutManager

        //val items = (1..100).map{i -> "Element #$i пришёл поздно?"}
        val items = listOf<Forecast>(
                Forecast("QWE", 29, "RTY"),
                Forecast("QWE", 29, "RTY"),
                Forecast("QWE", 29, "RTY"),
                Forecast("QWE", 29, "RTY"),
                Forecast("QWE", 29, "RTY"),
                Forecast("QWE", 29, "RTY"),
                Forecast("QWE", 29, "RTY"),
                Forecast("QWE", 29, "RTY"),
                Forecast("QWE", 29, "RTY"),
                Forecast("QWE", 29, "RTY"),
                Forecast("QWE", 29, "RTY")
        )

        val adapter = RecyclerAdapter()
        adapter.setItems(items)
        recyclerView.adapter = adapter
        adapter.setOnRecyclerClicked(object:RecyclerAdapter.OnRecyclerClicked {
            override fun onClick(text: String) {
                Toast.makeText(this@MainActivity, text, Toast.LENGTH_SHORT).show()
            }
        })
    }
}
