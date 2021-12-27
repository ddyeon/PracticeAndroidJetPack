package com.example.pagingtestproject.api

import com.example.pagingtestproject.Constants
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object CovidRetrofit {
    private val retrofit : Retrofit.Builder by lazy {
        Retrofit.Builder()
            .baseUrl(Constants.COVID_OPEN_API_DOMAIN)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())

    }
    val covidapi  = retrofit.build().create(CovidApi::class.java)
}