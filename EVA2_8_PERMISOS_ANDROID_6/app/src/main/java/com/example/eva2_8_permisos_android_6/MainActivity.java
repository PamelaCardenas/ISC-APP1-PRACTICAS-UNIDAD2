package com.example.eva2_8_permisos_android_6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
/*
* Karla Pamela Cárdenas Leyva 18550338
* Realiza llamadas solicitando permisos para Android 6 o mayores */
public class MainActivity extends AppCompatActivity {

    EditText edTxtTel;
    Intent intent;
    final int PERMISO_LLAMAR = 1000;
    boolean bande = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edTxtTel = findViewById(R.id.edTxtTel);
        //verificar los permisos
        if(ContextCompat.checkSelfPermission(this,
                Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
            //no tenemos el permiso, hay que solicitarlo
            ActivityCompat.requestPermissions(this,
                    new String[] {Manifest.permission.CALL_PHONE},PERMISO_LLAMAR);
        }
    }

    public void llamar(View v){
        if(bande) {
            String sTel = "tel:" + edTxtTel.getText().toString();
            intent = new Intent(Intent.ACTION_CALL, Uri.parse(sTel));
            startActivity(intent);
        }else{
            Toast.makeText(this,"No tienes permisos para realizar la llamada",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == PERMISO_LLAMAR){
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                bande = true;
            }
        }
    }
}