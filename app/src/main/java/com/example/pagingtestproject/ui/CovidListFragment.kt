package com.example.pagingtestproject.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pagingtestproject.CovidAdapter
import com.example.pagingtestproject.CovidViewModel
import com.example.pagingtestproject.R
import com.example.pagingtestproject.data.Covid
import com.example.pagingtestproject.databinding.FragmentCovidListBinding
import kotlinx.coroutines.launch

class CovidListFragment : Fragment() {
    private lateinit var binding : FragmentCovidListBinding
    //private lateinit var viewModel : CovidViewModel by viewModel(Covid)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_covid_list, container, false)
        
        setAdapter()

        return binding.root
    }

    private fun setAdapter() {
        val adapter = CovidAdapter()
        binding.covidListRecyclerview.adapter = adapter
    }

    private fun getCovidData() {
        lifecycleScope.launch {
        }
    }


}