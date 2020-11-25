package com.ssquare.sarrccountries

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CountryAdaptor(private val context: Context, private val arrayList: ArrayList<Country> ):BaseAdapter() {
    private lateinit var flag: ImageView
    private lateinit var countryName: TextView


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View ? {
        var cv: View = LayoutInflater.from(context).inflate(R.layout.row,null)
        countryName = cv.findViewById(R.id.countryName)
        flag = cv.findViewById(R.id.flagId)

        countryName.setText(arrayList[position].getCountryName())
        flag.setImageResource(arrayList[position].getCountryFlag())

        return  cv
    }

    override fun getItem(position: Int): Any {
        return  position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return arrayList.size
    }

}