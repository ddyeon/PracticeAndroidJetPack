package com.example.pagingtestproject

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.pagingtestproject.api.CovidApi
import com.example.pagingtestproject.api.CovidRetrofit
import com.example.pagingtestproject.data.Covid

class CovidPagingSource : PagingSource<Int, Covid>() {
    override fun getRefreshKey(state: PagingState<Int, Covid>): Int? {
        TODO("Not yet implemented")
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Covid> {
        val page = params.key ?: 1

    }
}