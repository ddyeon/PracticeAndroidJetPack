package com.example.pagingtestproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.pagingtestproject.data.Covid
import com.example.pagingtestproject.data.CovidData
import com.example.pagingtestproject.databinding.ItemCovidListBinding

class CovidAdapter : PagingDataAdapter<Covid, CovidAdapter.CovidViewHolder>(
    COVID_DIFF) {

    override fun onBindViewHolder(holder: CovidViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CovidViewHolder {
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

    companion object {
        private val COVID_DIFF = object : DiffUtil.ItemCallback<Covid>() {
            override fun areItemsTheSame(oldItem: Covid, newItem: Covid): Boolean {
               return  oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: Covid, newItem: Covid): Boolean {
                return  oldItem == newItem
            }

        }
    }
}