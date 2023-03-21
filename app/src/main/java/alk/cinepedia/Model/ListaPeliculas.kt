package alk.cinepedia.Model

import java.io.Serializable

data class ListaPeliculas(val page:Int, val results:ArrayList<Pelicula>, val total_results:Int, val total_pages:Int):Serializable