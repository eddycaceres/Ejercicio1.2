package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tnombre, tapellido, tedad, tcorreo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tnombre = (TextView) findViewById(R.id.tnombre);
        String nom = getIntent().getStringExtra("nombre");
        tnombre.setText("Nombre: " + nom);

        tapellido = (TextView) findViewById(R.id.tapellido);
        String ape = getIntent().getStringExtra("apellido");
        tapellido.setText("Apellido: " + ape);

        tedad =(TextView) findViewById(R.id.tedad);
        String ed = getIntent().getStringExtra("edad");
        tedad.setText("Edad: " + ed);

        tcorreo = (TextView) findViewById(R.id.tcorreo);
        String cor = getIntent().getStringExtra("correo");
        tcorreo.setText("Correo Electronico: " +cor);


    }
}