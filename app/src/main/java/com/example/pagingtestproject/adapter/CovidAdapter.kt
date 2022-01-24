package com.example.pagingtestproject.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.pagingtestproject.R
import com.example.pagingtestproject.data.Covid
import com.example.pagingtestproject.data.CovidData
import com.example.pagingtestproject.databinding.ItemCovidListBinding

class CovidAdapter : PagingDataAdapter<CovidData, CovidAdapter.CovidViewHolder>(COVID_DIFF) {

    override fun onBindViewHolder(holder: CovidViewHolder, position: Int) {
        getItem(position)?.let { holder.bind(it) }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CovidViewHolder {
        val binding = DataBindingUtil.inflate<ItemCovidListBinding>(LayoutInflater.from(parent.context), R.layout.item_covid_list,
            parent, false)
        return CovidViewHolder(binding)
    }

    class CovidViewHolder(private val binding : ItemCovidListBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(covid: CovidData) {
            binding.covidInfo = covid
        }
    }

    companion object {
        private val COVID_DIFF = object : DiffUtil.ItemCallback<CovidData>() {
            override fun areItemsTheSame(oldItem: CovidData, newItem: CovidData): Boolean {
               return  oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: CovidData, newItem: CovidData): Boolean {
                return  oldItem == newItem
            }

        }
    }
}