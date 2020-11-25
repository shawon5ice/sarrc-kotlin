package com.ssquare.sarrccountries

class Country(private var name:String,
              private var flag:Int) {
    fun getCountryName() : String{return name}
    fun getCountryFlag() : Int{return flag}
}