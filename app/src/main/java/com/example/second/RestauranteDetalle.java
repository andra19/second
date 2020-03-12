package com.example.second;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RestauranteDetalle extends AppCompatActivity {

    @Override

    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurantre_detalle);

        Bundle parametros = getIntent().getExtras();

        String nombre = parametros.getString("nombre");
        String tipoComida = parametros.getString("tipoComida");
        String resumen = parametros.getString("resumen");

        TextView nombre_detalle = findViewById(R.id.nombre_relativeLayout);
        TextView tipoComida_detalle = findViewById(R.id.tipoComida_relativeLayout);
        TextView resumen_detalle = findViewById(R.id.resumen_relativeLayout);

        nombre_detalle.setText(nombre);
        tipoComida_detalle.setText(tipoComida);
        resumen_detalle.setText(resumen);
    }

}
