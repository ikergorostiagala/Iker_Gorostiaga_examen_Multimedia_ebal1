package com.example.iker_gorostiaga_ex1ev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Pantalla3 extends AppCompatActivity {

    //variables
    ImageView image_a_recibir;
    TextView titulo;
    TextView puntuacion;
    TextView descripcion;

    Button volver;
    Button puntuar_y_volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);

        //inicializacion
            //imagen
                image_a_recibir = findViewById(R.id.imgVw_img_seleccionada);
            //texto
                titulo = findViewById(R.id.txtVw_img_pasada);
                puntuacion = findViewById(R.id.txtVw_img_pasada_puntuacion);
                descripcion= findViewById(R.id.txtVw_img_pasada_descripcion);
            //botones
                volver = findViewById(R.id.btn_volver);
                puntuar_y_volver = findViewById(R.id.btn_puntuar_volver);


        //get text(strings del intent de pantalla2)
            String Titulo = getIntent().getStringExtra("Titulo");
            //descripcion se vera en el set text de mas abajo(va segun el titulo)
            String Puntuacion = getIntent().getStringExtra("Puntuacion");



        //PARA PONER LA IMAGEN DEL INTENT DE PANTALLA2
        Bitmap imagenBitmap  = getIntent().getParcelableExtra("bitmap");
        if (imagenBitmap != null) {
            image_a_recibir.setImageBitmap(imagenBitmap);
        }

        //set text(titulo+descripcion) de los datos recogidos del intent de la pantalla 2
            //titulo
                titulo.setText(Titulo);
            //descripcion segun titulo
                puntuacion.setText(Puntuacion);
                //descripcion segun los titulos recibidos(revisar titulos pantalla2)
                if(titulo.getText().toString().equals("Puppy")){
                    descripcion.setText(R.string.p3_descripcion_puppy);

                } else if (titulo.getText().toString().equals("Guggenheim")) {
                    descripcion.setText(R.string.p3_descripcion_guggenheim);

                } else if (titulo.getText().toString().equals("Ayuntamiento")) {
                    descripcion.setText(R.string.p3_descripcion_ayuntamiento);

                } else if (titulo.getText().toString().equals("Arxtanda")) {
                    descripcion.setText(R.string.p3_descripcion_artxanda);

                }else { //el titulo no coincide con la pantalla 2
                    descripcion.setText(R.string.p3_descripcion_error);
                }


        //botones

            //volvera a la pantalla 2 sin hacer nada
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Pantalla3.this, Pantalla2.class);
                    startActivity(intent);//ir a pantalla 2
                }
            });

            //volvera a la pantalla 2 sumando +1 a la puntuaccion del lugar turistico seleccionado
            puntuar_y_volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Pantalla3.this, Pantalla2.class);
                    startActivity(intent);//ir a pantalla 2
                }
            });


    }
}