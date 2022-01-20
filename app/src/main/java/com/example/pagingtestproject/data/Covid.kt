package com.example.pagingtestproject.data

data class Covid(
    val page: Int,
    val totalCount: Int,
    val data: List<CovidData>
)

data class CovidData(
    val id: String,
    val centerName: String,
    val facilityName: String,
    val address: String,
    val sigungu: String,
    val phoneNumber: String
)