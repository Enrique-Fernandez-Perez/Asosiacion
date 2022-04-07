package com.example.proyectoasosiacion.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.proyectoasosiacion.AccionesGenerales.Acciones;
import com.example.proyectoasosiacion.R;

public class Informacion extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        Acciones.context = this;

        /**Acciones.home = findViewById(R.id.BTNHomeContac);
        Acciones.contact = findViewById(R.id.BTNContact);
        Acciones.info = findViewById(R.id.BTNInfo);

        Acciones.activar();*/
    }
}