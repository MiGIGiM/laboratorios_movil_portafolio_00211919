package com.example.laboratorio05.ui.movie.newmovie

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.laboratorio05.databinding.FragmentNewMovieBinding
import com.example.laboratorio05.ui.movie.viewmodel.MovieViewModel

class NewMovieFragment : Fragment() {
    private lateinit var binding: FragmentNewMovieBinding
    private val APP_TAG = "Laboratorio_06"

    private val movieVM: MovieViewModel by activityViewModels {
        MovieViewModel.Factory
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewMovieBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setViewModel()
        observeStatus()
    }


    private fun setViewModel() {
        binding.viewmodel = movieVM
    }

    private fun observeStatus() {
        movieVM.status.observe(viewLifecycleOwner) { status ->
            when {
                status.equals(MovieViewModel.MOVIE_CREATED) -> {
                    Log.d(APP_TAG, status)
                    Log.d(APP_TAG, movieVM.getMovies().toString())

                    movieVM.clearStatus()
                    findNavController().popBackStack()
                }
                status.equals(MovieViewModel.WRONG_INFO) -> {
                    Log.d(APP_TAG, status)
                    Log.d(APP_TAG, "${movieVM.name.value}, ${movieVM.description.value}, ${movieVM.category.value}, ${movieVM.qualification.value}")
                    movieVM.clearStatus()
                }
            }
        }
    }

}