package com.example.second;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    DatabaseReference reference;
    RecyclerView restaurante_recyclerView;
    ArrayList<Restaurante> restaurantesLista;
    Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        restaurante_recyclerView = findViewById(R.id.restaurantes_recyclerView);

        restaurante_recyclerView.setLayoutManager(new LinearLayoutManager(this));
        restaurantesLista = new ArrayList<Restaurante>();


      // Spinner

        Spinner spinner = findViewById(R.id.comidas_spinner);
        ArrayAdapter<CharSequence> adapterSpinner = ArrayAdapter.createFromResource(this, R.array.comidas,
                android.R.layout.simple_spinner_item);
        adapterSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapterSpinner);


        // Referencia al DB Restaurantes en Firebase y agregar los restaurantes al array restaurantesLista
        reference = FirebaseDatabase.getInstance().getReference().child("Restaurantes");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
                    Restaurante restaurante = dataSnapshot1.getValue(Restaurante.class);
                    restaurantesLista.add(restaurante);
                }
            // Agrega los restaurantes al RecyclerView
                adaptador = new com.example.second.Adaptador(MainActivity.this, restaurantesLista);
                restaurante_recyclerView.setAdapter(adaptador);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(MainActivity.this, "Algo salio mal", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
