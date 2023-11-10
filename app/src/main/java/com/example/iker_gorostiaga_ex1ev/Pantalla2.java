package com.example.iker_gorostiaga_ex1ev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Pantalla2 extends AppCompatActivity {

    //variables

        //puppy
            ImageView puppy;
            TextView puppy_titulo;
            TextView puppy_puntuacion;

        //guggenheim
            ImageView guggenheim;
            TextView guggenheim_titulo;
            TextView guggenheim_puntuacion;

        //ayuntamiento
            ImageView ayuntamiento;
            TextView ayuntamiento_titulo;
            TextView ayuntamiento_puntuacion;

        //artxanda
            ImageView artxanda;
            TextView artxanda_titulo;
            TextView artxanda_puntuacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        //inicializacion

            //imagenes
            puppy = findViewById(R.id.imgVw_puppy);
            guggenheim = findViewById(R.id.imgVw_bilbao);
            ayuntamiento = findViewById(R.id.imgVw_ayuntamiento);
            artxanda = findViewById(R.id.imgVw_artxanda);

            //titulos
            puppy_titulo = findViewById(R.id.txtVw_puppy);
            guggenheim_titulo = findViewById(R.id.txtVw_bilbao);
            ayuntamiento_titulo = findViewById(R.id.txtVw_ayuntamiento);
            artxanda_titulo = findViewById(R.id.txtVw_artxanda);

            //puntuaciones
            puppy_puntuacion = findViewById(R.id.txtVw_Puppy_puntuacion);
            guggenheim_puntuacion = findViewById(R.id.txtVw_Bilbao_puntuacion);
            ayuntamiento_puntuacion = findViewById(R.id.txtVw_Ayuntamiento_puntuacion);
            artxanda_puntuacion = findViewById(R.id.txtVw_Artxanda_puntuacion);

        //eventos

            //evento (puppy onclick)
            puppy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    // Obtén el recurso de la imagen desde el ImageView
                    Drawable drawable = puppy.getDrawable();

                    if(drawable instanceof BitmapDrawable){

                        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();

                        // Crea un Intent para iniciar la segunda actividad
                        Intent intent = new Intent(Pantalla2.this, Pantalla3.class);

                        // Pasa el bitmap a la segunda actividad
                        //intent.putExtra("bitmap",bitmap);

                        //texto a pasar
                        intent.putExtra("Titulo", puppy_titulo.getText().toString());
                        intent.putExtra("Puntuacion", puppy_puntuacion.getText().toString());

                        startActivity(intent); //ir a pantalla 3

                    }


                }
            });

            //evento (guggenheim onclick)
            guggenheim.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    // Obtén el recurso de la imagen desde el ImageView
                    Drawable drawable = guggenheim.getDrawable();

                    if(drawable instanceof BitmapDrawable){

                        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();

                        // Crea un Intent para iniciar la segunda actividad
                        Intent intent = new Intent(Pantalla2.this, Pantalla3.class);

                        // Pasa el bitmap a la segunda actividad
                        //intent.putExtra("bitmap",bitmap);

                        //texto a pasar
                        intent.putExtra("Titulo", guggenheim_titulo.getText().toString());
                        intent.putExtra("Puntuacion", guggenheim_puntuacion.getText().toString());

                        startActivity(intent);//ir a pantalla 3

                    }


                }
            });


            //evento (ayuntamiento onclick)
            ayuntamiento.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    // Obtén el recurso de la imagen desde el ImageView
                    Drawable drawable = ayuntamiento.getDrawable();

                    if(drawable instanceof BitmapDrawable){

                        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();

                        // Crea un Intent para iniciar la segunda actividad
                        Intent intent = new Intent(Pantalla2.this, Pantalla3.class);

                        // Pasa el bitmap a la segunda actividad
                        //intent.putExtra("bitmap",bitmap);

                        //texto a pasar
                        intent.putExtra("Titulo", ayuntamiento_titulo.getText().toString());
                        intent.putExtra("Puntuacion", ayuntamiento_puntuacion.getText().toString());

                        startActivity(intent);//ir a pantalla 3

                    }


                }
            });


            //evento (artxanda onclick)
            artxanda.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    // Obtén el recurso de la imagen desde el ImageView
                    Drawable drawable = artxanda.getDrawable();

                    if(drawable instanceof BitmapDrawable){

                        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();

                        // Crea un Intent para iniciar la segunda actividad
                        Intent intent = new Intent(Pantalla2.this, Pantalla3.class);

                        // Pasa el bitmap a la segunda actividad
                        //intent.putExtra("bitmap",bitmap);

                        //texto a pasar
                        intent.putExtra("Titulo", artxanda_titulo.getText().toString());
                        intent.putExtra("Puntuacion", artxanda_puntuacion.getText().toString());

                        startActivity(intent);//ir a pantalla 3

                    }


                }
            });


    }
}