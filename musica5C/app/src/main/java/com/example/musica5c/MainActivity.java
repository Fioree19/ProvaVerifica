package com.example.musica5c;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GestioneBrani gb;
    EditText testo;6+

    Button brnRicerca;
    Spinner spnGen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        brnRicerca = (Button)findViewById(R.id.button);

        gb = new GestioneBrani();

        spnGen=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> aa = new ArrayAdapter<>( this, android.R.layout.simple_spinner_item,genMusicali);
        spnGen.setAdapter(aa);


        brnRicerca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "funzionaaaaa", Toast.LENGTH_SHORT).show();
            }
        });







        }





    }
