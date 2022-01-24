package com.example.pagingtestproject.api

import com.example.pagingtestproject.data.Covid
import com.example.pagingtestproject.data.CovidData
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface CovidApi {
    @GET("15077586/v1/centers")
    suspend fun getCovidHospitalList(
        @Query("page") page: Int,
        @Query("serviceKey") key : String) : Covid
    
}