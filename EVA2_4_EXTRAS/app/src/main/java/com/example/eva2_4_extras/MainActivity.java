package com.example.eva2_4_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/*
* Karla Pamela Cárdenas Leyva 18550338
* Muestra la función de extras, mostrando mensajes en otra actividad*/
public class MainActivity extends AppCompatActivity {

    Intent intent;
    Button btnLanzar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLanzar = findViewById(R.id.btnLanzar);
        btnLanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(),DetailActivity.class);
                intent.putExtra("MENSAJE","Hola mundo!!!");
                intent.putExtra("ENTERO",100);
                intent.putExtra("PRECIO",10.24f);
                startActivity(intent);
            }
        });

    }
}