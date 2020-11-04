package com.example.eva2_1_intentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/*
*
* Intentos implicitos
* Karla Pamela Cárdenas Leyva 18550338
* Al presionar el botón utiliza un intento para poder realizar una llamada*/

public class MainActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Solicita el teclado numerico para marcar
        //Accion y datos
        //URI - Identificador Uniforme de Recursos
        //Protocolo: indentificador
        //URL - Localizador de Recursos Uniforme
        //https://www.google.com
        String sTel = "tel:45525382";
                                //Accion            Datos
        intent = new Intent(Intent.ACTION_DIAL, Uri.parse(sTel)); //Intento implicito
    }

    public void onClick(View v){
        startActivity(intent);
    }
}