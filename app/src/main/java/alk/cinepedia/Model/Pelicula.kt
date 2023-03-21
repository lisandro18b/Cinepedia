package alk.cinepedia.Model

import java.io.Serializable

data class Pelicula(
    val poster_path: String,
    val release_date: String,
    val id: Int,
    val original_language: String,
    val title: String,
    val popularity: Float
) : Serializable
