package com.example.proyectoasosiacion.Adaptadores;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectoasosiacion.Datos.Listas;
import com.example.proyectoasosiacion.Activities.InicioSesion;
import com.example.proyectoasosiacion.R;

import java.util.Vector;

public class AdaptadorInicio extends RecyclerView.Adapter<AdaptadorInicio.ViewHolder>
{

    LayoutInflater inflador = null;
    Vector<Listas> libros = null;

    Context con;

    public AdaptadorInicio(Context context, Vector<Listas> libros)
    {
       inflador =  (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       this.libros = libros;
       con = context;
    }

    private void lanzarFamilias(int posicion)
    {
        try
        {
            if(posicion == 1)
            {
                Intent i = new Intent(con, InicioSesion.class);
                con.startActivity(i);
            }
            if(posicion == 2)
            {

            }
            if(posicion == 3)
            {

            }
        }
        catch(Exception e){}
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflador.inflate(R.layout.elemento_inicial, null);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        Listas libro = libros.elementAt(position);
        holder.img.setImageResource(libro.getImagen());
        holder.titulo.setText(libro.getTitulo());
        int pos = libro.posicion;
        holder.titulo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                lanzarFamilias(pos);
            }
        });
    }

    @Override
    public int getItemCount() {
        return libros.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        public Button titulo;
        public ImageView img;

        public ViewHolder(View itemView)
        {
            super(itemView);
            titulo = (Button) itemView.findViewById(R.id.titulo);
            img = (ImageView)itemView.findViewById(R.id.Imagen);
        }
    }
}
