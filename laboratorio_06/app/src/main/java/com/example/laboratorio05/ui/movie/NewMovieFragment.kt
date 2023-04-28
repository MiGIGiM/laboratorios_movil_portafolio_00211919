package com.example.laboratorio05.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.example.laboratorio05.R
import com.example.laboratorio05.data.model.MovieModel
import com.google.android.material.textfield.TextInputLayout

class NewMovieFragment : Fragment() {
    private lateinit var nameTextInputLayout: TextInputLayout
    private lateinit var categoryTextInputLayout: TextInputLayout
    private lateinit var descriptionTextInputLayout: TextInputLayout
    private lateinit var qualificationTextInputLayout: TextInputLayout
    private lateinit var submitButton: Button

    private val movieVM: MovieViewModel by activityViewModels {
        MovieViewModel.Factory
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bind(view)

        submitButton.setOnClickListener {
            addMovie()

            movieVM.getMovies()
        }
    }

    private fun bind(view: View) {
        nameTextInputLayout = view.findViewById(R.id.nameTv)
        categoryTextInputLayout = view.findViewById(R.id.CategoryTv)
        descriptionTextInputLayout = view.findViewById(R.id.DescriptionTv)
        qualificationTextInputLayout = view.findViewById(R.id.CalificationTv)

        submitButton = view.findViewById(R.id.submit_btn)
    }

    private fun addMovie() {
        movieVM.addMovies(MovieModel(
            nameTextInputLayout.editText?.text.toString(),
            categoryTextInputLayout.editText?.text.toString(),
            descriptionTextInputLayout.editText?.text.toString(),
            qualificationTextInputLayout.editText?.text.toString(),
        ))
    }
}