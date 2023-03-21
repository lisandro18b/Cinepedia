package alk.cinepedia.API

import alk.cinepedia.Model.ListaPeliculas
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiPeliculas {
    @GET("movie/popular?language=en-US&page=1")
    fun getPeliculas(@Query ("api_key") apiKey:String): Call<ListaPeliculas>
}