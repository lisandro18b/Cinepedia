package alk.cinepedia
import alk.cinepedia.Model.Pelicula
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PeliculaAdapter(private val listaPeliculas: ArrayList<Pelicula>): RecyclerView.Adapter<PeliculaAdapter.ViewHolder>(){
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){

        var titulo:TextView
        var portada:ImageView
        var vista:View

        init {
            titulo=view.findViewById(R.id.p_titulo)
            portada=view.findViewById(R.id.p_portada)
            vista=view
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.pelicula_layout,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listaPeliculas.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.titulo.setText(listaPeliculas[position].title)
        Glide.with(holder.vista.context).load(listaPeliculas[position].poster_path).into(holder.portada)
    }
}
