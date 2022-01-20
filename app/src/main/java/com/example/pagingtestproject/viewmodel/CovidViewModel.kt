package com.example.pagingtestproject.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.pagingtestproject.data.CovidData
import com.example.pagingtestproject.data.CovidRepository
import kotlinx.coroutines.flow.Flow

class CovidViewModel: ViewModel() {
    private val repository = CovidRepository()

    fun getCovidList() : Flow<PagingData<CovidData>> {
        return repository.getCovidItemByPaging().cachedIn(viewModelScope)
    }
}