package com.example.eva2_7_activity_result;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/*
* Karla Pamela Cárdenas Leyva 18550338
* Abre un nuevo Activity, una imagen desde galería y la lista de contactos*/

public class MainActivity extends AppCompatActivity {

    final int INFO_ACTIVITY = 100, INFO_CONTACTOS=200, INFO_IMAGENES=300;
    Intent intent,intentContact, intentImage;
    ImageView imgVwMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgVwMostrar = findViewById(R.id.imgVwMostrar);
        intent = new Intent(this, infoActivity.class);
        intentContact = new Intent(Intent.ACTION_PICK,
                android.provider.ContactsContract.Contacts.CONTENT_URI);

        intentImage = new Intent(Intent.ACTION_PICK,
                android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    }

    public void  onClick(View v){
        startActivityForResult(intent, INFO_ACTIVITY);

    }

    public void onClickContact(View v){
        startActivityForResult(intentContact, INFO_CONTACTOS);
    }

    public void onClickImage(View v){
        startActivityForResult(intentImage, INFO_IMAGENES);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){//Identifica la actividad
            case INFO_ACTIVITY:
                //Si regresaron resultados o no
                if(resultCode == Activity.RESULT_OK) {//Si se enviarion resultados o el usuario cancelo la accion
                    //Aqui se hace algo con los datos que nos regresaron
                    Toast.makeText(this,data.getStringExtra("DATOS"), Toast.LENGTH_SHORT).show();
                }
                break;
            case INFO_CONTACTOS:
                    if(resultCode == Activity.RESULT_OK){
                        Toast.makeText(this, data.getDataString(), Toast.LENGTH_SHORT).show();
                    }
                break;
            case INFO_IMAGENES:
                if(resultCode == Activity.RESULT_OK){
                    Toast.makeText(this, data.getDataString(), Toast.LENGTH_SHORT).show();
                    imgVwMostrar.setImageURI(Uri.parse(data.getDataString()));
                }
            default:
        }
    }
}