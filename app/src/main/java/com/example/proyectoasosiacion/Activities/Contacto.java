package com.example.proyectoasosiacion.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.proyectoasosiacion.AccionesGenerales.Acciones;
import com.example.proyectoasosiacion.R;

public class Contacto extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        Acciones.context = this;

        Acciones.home = findViewById(R.id.BTNHomeContact);
        Acciones.contact = findViewById(R.id.BTNContactNo);
        Acciones.info = findViewById(R.id.BTNInfoContact);

        Acciones.activar();
    }
}