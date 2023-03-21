package alk.cinepedia.View

import alk.cinepedia.Model.ListaPeliculas
import alk.cinepedia.Model.Pelicula
import alk.cinepedia.PeliculaAdapter
import alk.cinepedia.R
import alk.cinepedia.ViewModel.PeliculaViewModel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.android.material.bottomappbar.BottomAppBar
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var topAppBar:BottomAppBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rvLista:RecyclerView=findViewById(R.id.m_rv)
        val peliculaVM:PeliculaViewModel= ViewModelProvider(this).get(PeliculaViewModel::class.java)
        rvLista.layoutManager= LinearLayoutManager(this)
        peliculaVM.getAllPeliculas().enqueue(object: Callback<ListaPeliculas> {
            override fun onFailure(call: Call<ListaPeliculas>, t: Throwable) {
                Log.e("Error-invocando-API",t.message.toString())
            }
            override fun onResponse(call: Call<ListaPeliculas>, response: Response<ListaPeliculas>) {
                if (response.body()!=null){
                    val data=response.body()
                    rvLista.adapter=PeliculaAdapter(data!!.results)
                }
            }
        })


/*
        topAppBar.setNavigationOnClickListener {
            // Handle navigation icon press
        }

        topAppBar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.favorite -> {
                    // Handle favorite icon press
                    true
                }
                R.id.search -> {
                    // Handle search icon press
                    true
                }
                else -> false
            }
        }*/
    }
}