package com.example.proyectoasosiacion.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.proyectoasosiacion.AccionesGenerales.Acciones;
import com.example.proyectoasosiacion.R;

public class InicioSesion extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);

        Acciones.context = this;

        Acciones.home = findViewById(R.id.BTNHomeIS);
        Acciones.contact = findViewById(R.id.BTNContactIS);
        Acciones.info = findViewById(R.id.BTNInfoIS);

        Acciones.activar();
    }
}