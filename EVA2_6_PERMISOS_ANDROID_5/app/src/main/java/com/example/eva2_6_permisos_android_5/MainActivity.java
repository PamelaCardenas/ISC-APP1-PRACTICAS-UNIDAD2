package com.example.eva2_6_permisos_android_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
/*
 * Karla Pamela Cárdenas Leyva 18550338
 * Realiza una llamada utilizando permisos en el Manifest*/
public class MainActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:5554"));
    }

    public void onClick(View v){
        startActivity(intent);

    }
}