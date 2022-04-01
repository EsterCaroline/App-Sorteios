package com.example.aplicativosorteios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SortearNumero(View view){
        int x= new Random().nextInt(11);

        TextView texto = findViewById(R.id.textViewValor);
        texto.setText(" Seu Numero da Sorte é:" + x);

    }
}