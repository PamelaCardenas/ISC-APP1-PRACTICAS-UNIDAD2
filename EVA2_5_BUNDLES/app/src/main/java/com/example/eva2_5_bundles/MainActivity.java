package com.example.eva2_5_bundles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
/*
* Karla Pamela Cárdenas Leyva 18550338
* Uso de Bundles para una lista */

public class MainActivity extends AppCompatActivity {

    String[] datos = {
            "Rosa",
            "Amarillo",
            "Negro",
            "Azul",
            "Turquesa",
            "Rojo",
            "Gris",
            "Blanco",
            "Morado",
            "Lila",
            "Dorado",
            "Plateado",
            "Rosa pastel",
            "Verde",
            "Esmeralda",
            "Anaranjado",
            "Cafe",
            "Azul rey",
            "Verde militar",
            "Beige"
    };
    ListView lstVwDatos;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent(this,DetailActivity.class);
        lstVwDatos = findViewById(R.id.lstVwDatos);
        lstVwDatos.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, datos));

        lstVwDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Bundle bundle = new Bundle();
                bundle.putString("CIUDAD",datos[i]);
                bundle.putInt("POSICION",i);
                intent.putExtras(bundle);
                startActivity(intent);

        }
    });
    }
}