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
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val res: Resources = resources
        setContentView(R.layout.activity_main)

        val countryNames = res.getStringArray(R.array.country_name)
        val flags = listOf<Int>(R.drawable.afghanistan,R.drawable.bangladesh,R.drawable.bhutan,
                            R.drawable.india,R.drawable.maldives,R.drawable.nepal,R.drawable.pakistan,
                            R.drawable.srilanka)

        var listView = findViewById<ListView>(R.id.listViewId)
//        val adaptor = ArrayAdapter(this,android.R.layout.simple_list_item_1,countryNames)

        var arrayList:ArrayList<Country> = ArrayList()

        for (i in 0..countryNames.size-1){
            arrayList.add(Country(countryNames[i].toString(),flags[i]))
        }

        val adaptor = CountryAdaptor(this,arrayList)
        listView.adapter = adaptor

    }
}