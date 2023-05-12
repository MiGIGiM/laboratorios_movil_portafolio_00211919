package com.example.laboratorio05.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.laboratorio05.R
import com.example.laboratorio05.databinding.FragmentMovieBinding
import com.example.laboratorio05.ui.movie.viewmodel.MovieViewModel

class MovieFragment : Fragment() {
    private lateinit var binding: FragmentMovieBinding

    private val movieVM: MovieViewModel by activityViewModels {
        MovieViewModel.Factory
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMovieBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setViewModel()
        bindData()
    }

    private fun setViewModel() {
        binding.viewmodel = movieVM
    }

    private fun bindData() {
        binding.textView7.text = movieVM.name.value
        binding.textView6.text = movieVM.category.value
        binding.textView5.text = movieVM.qualification.value
        binding.textView8.text = movieVM.description.value
    }

}