package com.example.pagingtestproject.data

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.pagingtestproject.R
import com.example.pagingtestproject.databinding.ItemCovidListBinding

class CovidAdapter(diffCallback: DiffUtil.ItemCallback<T>) : PagingDataAdapter<Covid, CovidAdapter.CovidViewHolder>(
    diffCallback) {

    override fun onBindViewHolder(holder: CovidAdapter.CovidViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CovidAdapter.CovidViewHolder {
        val binding = DataBindingUtil.inflate<ItemCovidListBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_covid_list,
            parent,
            false
        )

        return CovidViewHolder(binding)
    }

    class CovidViewHolder(private val binding : ItemCovidListBinding) : RecyclerView.ViewHolder(binding.root){

    }
}