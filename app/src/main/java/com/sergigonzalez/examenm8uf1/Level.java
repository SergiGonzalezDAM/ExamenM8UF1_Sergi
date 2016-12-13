package com.sergigonzalez.examenm8uf1;

import java.util.ArrayList;

/**
 * Created by ALUMNEDAM on 13/12/2016.
 */

public class Level {
    private int nivel;
    private int tema;
    private String respuestaJugador;
    public Level(int nivel, int tema, String respuestaJugador)
    {
        this.nivel = nivel;
        this.tema = tema;
        this.respuestaJugador = respuestaJugador;
    }
    String preguntas [];
    String respuestas [];
    private void declararArray()
    {
        switch (nivel)
        {
            case 1:
                preguntas = new String[5];
                respuestas = new String[5];
                break;
            case 2:
                preguntas = new String[10];
                respuestas = new String[10];
                break;
            case 3:
                preguntas = new String[20];
                respuestas = new String[20];
                break;
        }
    }
    private String[] generarPreguntas()
    {
        switch (tema)
        {
            case 1: //Suma
                for (int i = 0; i < preguntas.length; i++)
                {
                    preguntas[i] = "Prueba";
                }
                break;
            case 2:
                for (int i = 0; i < preguntas.length; i++)
                {
                    preguntas[i] = "Prueba";
                }
                break;
            case 3:
                for (int i = 0; i < preguntas.length; i++)
                {
                    preguntas[i] = "Prueba";
                }
                break;
            case 4:
                for (int i = 0; i < preguntas.length; i++)
                {
                    preguntas[i] = "Prueba";
                }
                break;
        }
        return preguntas;
    }
    public String[] imprimirPregunta(int numeroPregunta)
    {
        return preguntas[numeroPregunta];
    }
    public boolean verificarPregunta (int numeroPregunta)
    {
        boolean verificacion = false;
        if (respuestas[numeroPregunta].equals(respuestaJugador))
        {
            verificacion = true;
        }
        return verificacion;
    }

}
