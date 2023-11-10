package com.example.iker_gorostiaga_ex1ev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class P1_inicio extends AppCompatActivity {

//variables
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inicializacion
        logo = findViewById(R.id.imgVw_logo);

        //eventos

            //evento (logo onclick)
            logo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //definir a que pantalla pasa al pulsar el logo
                    Intent intent=new Intent(P1_inicio.this, P2_Principal.class);
                    startActivity(intent); //pasamos a la segunda pantalla
                }
            });


    }
}