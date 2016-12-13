package com.sergigonzalez.examenm8uf1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

        public class SelectLevel extends AppCompatActivity implements View.OnClickListener
        {

            @Override
            protected void onCreate(Bundle savedInstanceState)
            {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_select_level);
                //Localizamos al botón y le ponemos un listener
                Button buttonEnviar = (Button) findViewById(R.id.buttonSend);
                buttonEnviar.setOnClickListener(this);
            }


            @Override
            /**
             * Método para enviar el dato seleccionado por el usuario, depende del checkbox envía más o menos tiempo de juego
             */
            public void onClick(View v)
            {
                if (v.getId() == R.id.buttonSend) //Verificamos que el botón (aun que solo haya uno) ha sido seleccionado.
                {
                    Intent i = new Intent(this,MainActivity.class);
                    RadioGroup radioGroupDif = (RadioGroup) findViewById(R.id.radioGroupDificultad);
                    RadioGroup radioGroupTem = (RadioGroup) findViewById(R.id.radioGroupTema);
                    EditText nombre = (EditText) findViewById(R.id.editTextJugador);

                    i.putExtra("nombreJugadorPartida",nombre.getText().toString());
                    boolean salirDif = false;
                    boolean salirTem = false;

                    switch (radioGroupTem.getCheckedRadioButtonId()) //Recivimos el id del elemento seleccinado
                    {
                        case R.id.radioButtonSuma:
                        {
                            i.putExtra("tema",1);
                            salirTem = true;
                            break;
                        }
                        case R.id.radioButtonResta:
                        {
                            i.putExtra("tema",2);
                            salirTem = true;
                            break;
                        }
                        case R.id.radioButtonMulti:
                        {
                            i.putExtra("tema",3);
                            salirTem = true;
                            break;
                        }
                        case R.id.radioButtonDivision:
                        {
                            i.putExtra("tema",4);
                            salirTem = true;
                            break;
                        }
                        default:
                        {
                            //Imprimir con TOAST mensaje de error (0) seleccionadas

                            Toast.makeText(getApplicationContext(), "Tiene que seleccionar un tema", Toast.LENGTH_SHORT).show();
                            break;
                        }
                    }


                    switch (radioGroupDif.getCheckedRadioButtonId()) //Recivimos el id del elemento seleccinado
                    {
                        case R.id.radioButtonFacil:
                        {
                            i.putExtra("dificultad",5);
                            salirDif = true;
                            break;
                        }
                        case R.id.radioButtonNormal:
                        {
                            i.putExtra("dificultad",10);
                            salirDif = true;

                            break;
                        }
                        case R.id.radioButtonDificil:
                        {
                            i.putExtra("dificultad",20);
                            salirDif = true;

                            break;
                        }
                        default:
                        {
                            //Imprimir con TOAST mensaje de error (0) seleccionadas

                            Toast.makeText(getApplicationContext(), "Tiene que seleccionar una dificultad", Toast.LENGTH_SHORT).show();
                            break;
                        }
                    }



                    if(salirDif && salirTem)
                    {
                        startActivity(i);
                        System.exit(0);
                    }
                }
            }
        }