package com.example.guia1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Declaracion de variables
    private Button btnCalculadora;
    private Button btnLogin;
    private Button btnDatos;
    private final String TAG = "EVENTOS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializamos los controles
        this.btnCalculadora = findViewById(R.id.btnCalculadora);
        this.btnLogin = findViewById(R.id.btnLogin);
        this.btnDatos = findViewById(R.id.btnDatos);

        this.btnCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Calculadora.class);
                startActivityForResult(intent, 0);
            }
        });
        this.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Login.class);
                startActivityForResult(intent, 0);
            }
        });
        this.btnDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Datos.class);
                startActivityForResult(intent, 0);
            }
        });
    }
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "Ejecutando evento onStart");
    }
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "Ejecutando evento onResume");
    }
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "Ejecutando evento onPause");
    }
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "Ejecutando evento onStop");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "Ejecutando evento onDestroy");
    }
}
