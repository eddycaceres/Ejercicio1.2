package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnenviar;
    EditText txtnombre, txtapellido, txtedad, txtcorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnenviar = (Button) findViewById(R.id.btnenviar);
        txtnombre = (EditText) findViewById(R.id.txtnombre);
        txtapellido = (EditText) findViewById(R.id.txtapellido);
        txtedad = (EditText) findViewById(R.id.txtedad);
        txtcorreo = (EditText) findViewById(R.id.txtcorreo);

        btnenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("nombre", txtnombre.getText().toString());
                intent.putExtra("apellido", txtapellido.getText().toString());
                intent.putExtra("edad", txtedad.getText().toString());
                intent.putExtra("correo", txtcorreo.getText().toString());
                startActivity(intent);
            }
        });

    }
}