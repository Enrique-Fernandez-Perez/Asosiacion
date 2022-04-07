package com.example.proyectoasosiacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.proyectoasosiacion.AccionesGenerales.Acciones;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Acciones.context = this;

        Acciones.home = findViewById(R.id.BTNHome);
        Acciones.contact = findViewById(R.id.BTNContact);
        Acciones.info = findViewById(R.id.BTNInfo);

        Acciones.iconoISesion = R.drawable.ic_launcher_foreground;
        Acciones.iconoInvitadx = R.drawable.ic_launcher_foreground;
        Acciones.iconoRegistro = R.drawable.ic_launcher_foreground;

        Acciones.RVPantallaInicial = findViewById(R.id.RCVInicio);

        Acciones.activarInicio();
    }
}