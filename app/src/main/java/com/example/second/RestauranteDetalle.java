package com.example.second;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RestauranteDetalle extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurantre_detalle);

        Bundle parametros = getIntent().getExtras();


        String nombre = parametros.getString("nombre");
        String tipoComida = parametros.getString("tipoComida");
        String resumen = parametros.getString("resumen");
        //Nuevo
        String tarjetas = parametros.getString("tarjetas");
        boolean estacionamiento = parametros.getBoolean("estacionamiento");
        boolean wifi = parametros.getBoolean("wifi");
        boolean fumar = parametros.getBoolean("fumar");
        //Nuevo

        TextView nombre_detalle = findViewById(R.id.nombre_relativeLayout);
        TextView tipoComida_detalle = findViewById(R.id.tipoComida_relativeLayout);
        TextView resumen_detalle = findViewById(R.id.resumen_relativeLayout);
        //Nuevo
        CheckBox tarjetas_detalle = findViewById(R.id.tarjetas_checkbox);
        CheckBox estacionamiento_detalle = findViewById(R.id.estacionamiento_checkbox);
        CheckBox wifi_detalle = findViewById(R.id.wifi_checkbox);
        CheckBox fumar_detalle = findViewById(R.id.fumar_checkbox);
        //Nuevo

        nombre_detalle.setText(nombre);
        tipoComida_detalle.setText(tipoComida);
        resumen_detalle.setText(resumen);

        //Nuevo
        // Check checkbox tarjetas
        if (tarjetas.equals("Si")) {
            tarjetas_detalle.setChecked(true);
            tarjetas_detalle.setClickable(false);
        } else {
            tarjetas_detalle.setEnabled(false);
        }

        // Check checkbox estacionamiento
        if (estacionamiento) {
            estacionamiento_detalle.setChecked(true);
            estacionamiento_detalle.setClickable(false);
        } else {
            estacionamiento_detalle.setEnabled(false);
        }

        // Check checkbox wifi
        if (wifi) {
            wifi_detalle.setChecked(true);
            wifi_detalle.setClickable(false);
        } else {
            wifi_detalle.setEnabled(false);
        }

        // Check checkbox fumar
        if (fumar) {
            fumar_detalle.setChecked(true);
            fumar_detalle.setClickable(false);
        } else {
            fumar_detalle.setEnabled(false);
        }
        //Nuevo
    }
}
