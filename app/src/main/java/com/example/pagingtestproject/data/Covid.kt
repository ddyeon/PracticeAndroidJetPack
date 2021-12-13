package com.example.pagingtestproject.data

data class Covid(
    val page: Int,
    val totalCount: Int,
    val data: ArrayList<CovidData>
)

data class CovidData(
    val id: String,
    val centerName: String,
    val facilityName: String,
    val address: String,
    val phoneNumber: String
)