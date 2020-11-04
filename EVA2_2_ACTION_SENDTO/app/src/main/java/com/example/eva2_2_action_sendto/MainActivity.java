package com.example.eva2_2_action_sendto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
/*
* Karla Pamela Cárdenas Leyva 18550338
* Mediante intentos realiza la accion para mandar un mensaje de texto*/
public class MainActivity extends AppCompatActivity {

    EditText editTextTel, editTextMens;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMens = findViewById(R.id.editTextMens);
        editTextTel = findViewById(R.id.editTextTel);


    }

    //CREAR INTENTO Y LANZAR LA ACTIVIDAD
    public void OnClick(View v){
        String sTel = "smsto:" + editTextTel.getText().toString();
        String sMens = editTextMens.getText().toString();

                                //Accion            datos
        intent = new Intent(Intent.ACTION_SENDTO, Uri.parse(sTel)); //Intento implicito
        //Extra para cuerpo del mensaje
        intent.putExtra("sms_body",sMens);

        startActivity(intent);
    }
}