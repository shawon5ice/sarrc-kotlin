package com.ssquare.sarrccountries

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import java.time.temporal.Temporal
import java.util.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val res: Resources = resources
        setContentView(R.layout.activity_main)

        val countryNames = res.getStringArray(R.array.country_name)
        var listView = findViewById<ListView>(R.id.listViewId)
        val adaptor = ArrayAdapter(this,android.R.layout.simple_list_item_1,countryNames)
        listView.adapter = adaptor
    }
}