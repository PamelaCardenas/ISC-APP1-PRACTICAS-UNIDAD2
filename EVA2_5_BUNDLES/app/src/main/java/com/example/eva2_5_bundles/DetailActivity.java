package com.example.eva2_5_bundles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView txtVwDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        txtVwDatos = findViewById(R.id.txtVwEt);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        txtVwDatos.append(bundle.getString("CIUDAD"));
        txtVwDatos.append(bundle.getInt("POSICION")+"");
    }
}