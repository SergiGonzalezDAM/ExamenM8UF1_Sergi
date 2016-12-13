package com.sergigonzalez.examenm8uf1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private int DIFICULTADDEF = 1;
    private int TEMADEF = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView nombre = (TextView) findViewById(R.id.player);
        Intent parametros = getIntent();
        EditText editText = (EditText) findViewById(R.id.respuesta);
        int dificultad = parametros.getIntExtra("dificultad",DIFICULTADDEF);
        int tema = parametros.getIntExtra("tema", TEMADEF);
        String nombreJugador = parametros.getStringExtra("nombreJugadorPartida");
        nombre.setText(nombreJugador);
        Level level = new Level(dificultad,tema,editText.getText().toString());

    }
}
