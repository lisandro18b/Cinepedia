package alk.cinepedia.ViewModel

import alk.cinepedia.API.ApiPeliculas
import alk.cinepedia.API.Implementation.PeliculasImp
import alk.cinepedia.Model.ListaPeliculas
import alk.cinepedia.Model.Pelicula
import androidx.lifecycle.ViewModel
import retrofit2.Call

class PeliculaViewModel:ViewModel(){

    val listaPeliculas:ArrayList<Pelicula> = ArrayList()

    fun getAllPeliculas(): Call<ListaPeliculas> {
        return PeliculasImp().getPeliculas("26d38f3b58812d9d3f62ce4ccbda3490")
    }
}