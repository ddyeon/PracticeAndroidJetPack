package com.example.pagingtestproject

import androidx.lifecycle.ViewModel
import androidx.paging.PagingData
import com.example.pagingtestproject.data.Covid
import kotlinx.coroutines.flow.Flow

class CovidViewModel: ViewModel() {
    private val repository = CovidRepository()

    fun getCovidList() : Flow<PagingData<Covid>> {
        return repository.getCovidItemByPaging()
    }
}