package com.example.eva2_7_activity_result;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class infoActivity extends AppCompatActivity {


    EditText editTextDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        editTextDatos = findViewById(R.id.editTextDatos);

    }

    public void onClick2(View v){
        //Devolver los datos
        Intent intent = new Intent();
        String sCade = editTextDatos.getText().toString();
        intent.putExtra("DATOS",sCade);

        setResult(Activity.RESULT_OK,intent);
        finish();
    }
}