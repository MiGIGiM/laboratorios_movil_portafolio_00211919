package com.example.laboratorio05.ui.movie.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.laboratorio05.MovieReviewerApplication
import com.example.laboratorio05.data.model.MovieModel
import com.example.laboratorio05.repositories.MovieRepository

class MovieViewModel(private val repository: MovieRepository) : ViewModel() {
    var name = MutableLiveData("")
    var category = MutableLiveData("")
    var description = MutableLiveData("")
    var qualification = MutableLiveData("")
    var status = MutableLiveData("")

    fun getMovies() = repository.getMovies()

    private fun addMovies(movie: MovieModel) = repository.addMovies(movie)

    fun createMovie() {
        if (!validateData()) {
            status.value = WRONG_INFO
            Log.d("ASD", "Name: ${name.value}")

            Log.d("ASD", "Category: ${category.value}")

            Log.d("ASD", "Desc: ${description.value}")

            Log.d("ASD", "Qua: ${qualification.value}")

            return
        }

        val movie = MovieModel(
            name.value!!,
            category.value!!,
            description.value!!,
            qualification.value!!
        )

        Log.d("Laboratorio_06", movie.toString())

        addMovies(movie)

        clearData()

        status.value = MOVIE_CREATED
    }

    fun clearData() {
        name.value = ""
        description.value = ""
        qualification.value = ""
        category.value = ""
    }

    private fun validateData(): Boolean {
        when {
            name.value.isNullOrEmpty() -> return false
            category.value.isNullOrEmpty() -> return false
            description.value.isNullOrEmpty() -> return false
            qualification.value.isNullOrEmpty() -> return false
        }
        return true
    }

    fun clearStatus() {
        status.value = INACTIVE
    }

    fun setSelectedMovie(movie: MovieModel) {
        name.value = movie.name
        description.value = movie.description
        category.value = movie.category
        qualification.value = movie.qualification
    }

    companion object {
        val Factory = viewModelFactory {
            initializer {
                val app = this[APPLICATION_KEY] as MovieReviewerApplication
                MovieViewModel(app.movieRepository)
            }
        }

        const val MOVIE_CREATED = "Movie created"
        const val WRONG_INFO = "Wrong information"
        const val INACTIVE = ""
    }
}