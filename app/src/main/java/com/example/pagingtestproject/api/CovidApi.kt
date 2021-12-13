package com.example.pagingtestproject.api

import com.example.pagingtestproject.data.Covid
import com.example.pagingtestproject.data.CovidData
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header

interface CovidApi {
    @GET("15077586/v1/centers")
    fun getCovidHospitalList(
        @Header("Authorization") authToken : String) : Call<JsonObject>
}