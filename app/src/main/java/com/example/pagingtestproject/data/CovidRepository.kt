package com.example.pagingtestproject.data

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow

class CovidRepository {
    fun getCovidItemByPaging() : Flow<PagingData<CovidData>> {
        return Pager(config = PagingConfig(pageSize = 10, enablePlaceholders = false),
        pagingSourceFactory = { CovidPagingSource() }).flow
    }
}