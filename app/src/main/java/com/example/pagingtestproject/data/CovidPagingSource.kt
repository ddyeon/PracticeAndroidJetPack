package com.example.pagingtestproject.data

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.pagingtestproject.api.CovidRetrofit
import com.example.pagingtestproject.utilities.Constants

class CovidPagingSource : PagingSource<Int, CovidData>() {
    override fun getRefreshKey(state: PagingState<Int, CovidData>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, CovidData> {
        return try {
            val next = params.key ?: 0
            val response = CovidRetrofit.covidapi.getCovidHospitalList(next, Constants.COVID_DECODING_APIKEY)
            LoadResult.Page( data = response.data,
                prevKey = if (next == 0) null else next - 1,
                nextKey = next + 1 )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }

    }
}