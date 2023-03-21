package alk.cinepedia.API.Implementation

import alk.cinepedia.API.ApiPeliculas
import alk.cinepedia.Model.ListaPeliculas
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PeliculasImp {
    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl("https://api.themoviedb.org/3/").build()
    }

    fun getPeliculas(apiKey:String): Call<ListaPeliculas> {
        return getRetrofit().create(ApiPeliculas::class.java).getPeliculas(apiKey)
    }
}