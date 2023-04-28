package com.example.laboratorio05.repositories

import android.util.Log
import com.example.laboratorio05.data.model.MovieModel

class MovieRepository(private val movies: MutableList<MovieModel>) {

    fun getMovies() = movies.forEach{
        Log.v("MOVIES", "${it.name}, ${it.category}, ${it.description}, ${it.qualification}")
    }

    fun addMovies(movie: MovieModel) = movies.add(movie)
}