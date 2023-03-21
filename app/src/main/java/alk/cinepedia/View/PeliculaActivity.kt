package alk.cinepedia.View

import alk.cinepedia.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.*

class PeliculaActivity : AppCompatActivity() {

    lateinit var titulo:TextView
    lateinit var portada:ImageView
    lateinit var vista:CheckBox
    lateinit var info:Button
    lateinit var frameInfo:FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pelicula_layout)
        inicializar()
        info.setOnClickListener(){
            val viewInfo:View=LayoutInflater.from(this).inflate(R.layout.info_layout,null)
            var genero:EditText=viewInfo.findViewById(R.id.i_genero)
            var idioma:EditText=viewInfo.findViewById(R.id.i_idioma)
            var popularidad:EditText=viewInfo.findViewById(R.id.i_popularidad)
            var estreno:EditText=viewInfo.findViewById(R.id.i_estreno)
        }

    }

    fun inicializar(){
        titulo=findViewById(R.id.p_titulo)
        portada=findViewById(R.id.p_portada)
        vista=findViewById(R.id.p_vista)
        info=findViewById(R.id.p_info)
        frameInfo=findViewById(R.id.p_frame)
    }
}