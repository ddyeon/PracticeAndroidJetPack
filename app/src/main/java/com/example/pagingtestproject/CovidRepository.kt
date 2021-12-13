package com.example.pagingtestproject

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.pagingtestproject.data.Covid
import kotlinx.coroutines.flow.Flow

class CovidRepository {

    fun getCovidItemByPaging() : Flow<PagingData<Covid>> {
        return Pager(config = PagingConfig(pageSize = 10, enablePlaceholders = false),
        pagingSourceFactory = {CovidPagingSource()}).flow
    }
}