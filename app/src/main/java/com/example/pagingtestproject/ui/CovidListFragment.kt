package com.example.pagingtestproject.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pagingtestproject.adapter.CovidAdapter
import com.example.pagingtestproject.R
import com.example.pagingtestproject.api.CovidRetrofit
import com.example.pagingtestproject.data.Covid
import com.example.pagingtestproject.databinding.FragmentCovidListBinding
import com.example.pagingtestproject.utilities.Constants
import com.example.pagingtestproject.viewmodel.CovidViewModel
import com.google.gson.JsonObject
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CovidListFragment : Fragment() {
    private lateinit var binding : FragmentCovidListBinding

    private val viewModel : CovidViewModel by viewModels()
    private lateinit var  adapter : CovidAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_covid_list, container, false)
        
        setAdapter()
        getCovidData()

        return binding.root
    }

    private fun setAdapter() {
        adapter = CovidAdapter()
        binding.covidListRecyclerview.adapter = adapter
    }

    private fun getCovidData() {
        lifecycleScope.launch {
            viewModel.getCovidList().collectLatest {
                adapter.submitData(it)
            }
        }
    }

}