package com.example.proyectoasosiacion.AccionesGenerales;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.proyectoasosiacion.Activities.Contacto;
import com.example.proyectoasosiacion.Activities.Informacion;
import com.example.proyectoasosiacion.Adaptadores.AdaptadorInicio;
import com.example.proyectoasosiacion.Datos.Listas;
import com.example.proyectoasosiacion.MainActivity;

import java.util.Vector;

public class Acciones extends Application
{
    public static Context context;

    public static Button home;
    public static Button info;
    public static Button contact;

    public static RecyclerView RVPantallaInicial;
    public static RecyclerView.LayoutManager LMInicio;

    public static int iconoISesion;
    public static int iconoInvitadx;
    public static int iconoRegistro;

    public static void activar()
    {
        home.setOnClickListener(v -> irInicio());
        info.setOnClickListener(v -> irInformacion());
        contact.setOnClickListener(v -> irContacto());
    }

    public static void activarInicio()
    {
        info.setOnClickListener(v -> irInformacion());
        contact.setOnClickListener(v -> irContacto());


        cargarDatos();
    }

    public static void activarInfo()
    {
        home.setOnClickListener(v -> irInicio());
        contact.setOnClickListener(v -> irContacto());
    }

    public static void activarContact()
    {
        home.setOnClickListener(v -> irInicio());
        info.setOnClickListener(v -> irInformacion());
    }

    public static void irInformacion()
    {
        Intent i = new Intent(context, Informacion.class);
        context.startActivity(i);
    }

    public static void irContacto()
    {
        Intent i = new Intent(context, Contacto.class);
        context.startActivity(i);
    }

    public static void irInicio()
    {
        Intent i = new Intent(context, MainActivity.class);
        context.startActivity(i);
    }

    private static void cargarDatos()
    {
        RVPantallaInicial.setAdapter(new AdaptadorInicio(context, setDatos()));
        LMInicio = new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL);
        RVPantallaInicial.setLayoutManager(LMInicio);
    }

    private static Vector<Listas> setDatos()
    {
        Vector<Listas> v = new Vector<Listas>();

        v.add(new Listas("Iniciar Sesion",iconoISesion,1));
        v.add(new Listas("Invitado",iconoInvitadx,2));
        v.add(new Listas("Registrase",iconoRegistro,3));


        return v;
    }
}
