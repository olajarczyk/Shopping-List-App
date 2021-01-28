package com.example;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.pz1.R;
import com.example.listaZakupow;

public class Owoce extends AppCompatActivity {

    public int liczbaJablko =0;
    public int liczbaBanan=0;
    public int liczbaPomarancza=0;
    public int liczbaKiwi=0;
    public int liczbaAnanas=0;
    public int liczbaWinogrono=0;
    public int liczbaCytryna=0;
    String lista;
    private TextView jablko, banan, pomarancza, kiwi, ananas, winogrono, cytryna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owoce);
        setTitle("Owoce");

        lista = getIntent().getStringExtra("name");
        if(lista == null) lista="";

        findViewById(R.id.dodaj_jablko).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaJablko++;
                        jablko = findViewById(R.id.ile_jablko);
                        jablko.setText("ilosc: " + liczbaJablko);
                    }
                });
        findViewById(R.id.usun_jablko).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaJablko--;
                        jablko= findViewById(R.id.ile_jablko);
                        if (liczbaJablko <1) jablko.setText("");
                        else jablko.setText("ilosc: " + liczbaJablko);
                    }
                });
        findViewById(R.id.dodaj_banan).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaBanan++;
                        banan= findViewById(R.id.ile_banan);
                        banan.setText("ilosc: " + liczbaBanan);
                    }
                });
        findViewById(R.id.usun_banan).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaBanan--;
                        banan= findViewById(R.id.ile_banan);
                        if (liczbaBanan <1) banan.setText("");
                        else banan.setText("ilosc: " + liczbaBanan);
                    }
                });
        findViewById(R.id.dodaj_pomarancza).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaPomarancza++;
                        pomarancza = findViewById(R.id.ile_pomarancza);
                        pomarancza.setText("ilosc: " + liczbaPomarancza);
                    }
                });
        findViewById(R.id.usun_pomarancza).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaPomarancza--;
                        pomarancza= findViewById(R.id.ile_pomarancza);
                        if (liczbaPomarancza<1) pomarancza.setText("");
                        else pomarancza.setText("ilosc: " + liczbaPomarancza);
                    }
                });
        findViewById(R.id.dodaj_kiwi).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaKiwi++;
                        kiwi = findViewById(R.id.ile_kiwi);
                        kiwi.setText("ilosc: " + liczbaKiwi);
                    }
                });
        findViewById(R.id.usun_kiwi).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaKiwi--;
                        kiwi= findViewById(R.id.ile_kiwi);
                        if (liczbaKiwi <1) kiwi.setText("");
                        else kiwi.setText("ilosc: " + liczbaKiwi);
                    }
                });
        findViewById(R.id.dodaj_ananas).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaAnanas++;
                        ananas = findViewById(R.id.ile_ananas);
                        ananas.setText("ilosc: " + liczbaAnanas);
                    }
                });
        findViewById(R.id.usun_ananas).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaAnanas--;
                        ananas= findViewById(R.id.ile_ananas);
                        if (liczbaAnanas <1) ananas.setText("");
                        else ananas.setText("ilosc: " + liczbaAnanas);
                    }
                });
        findViewById(R.id.dodaj_winogrono).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaWinogrono++;
                        winogrono = findViewById(R.id.ile_winogrono);
                        winogrono.setText("ilosc: " + liczbaWinogrono);
                    }
                });
        findViewById(R.id.usun_winogrono).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaWinogrono--;
                        winogrono= findViewById(R.id.ile_winogrono);
                        if (liczbaWinogrono <1) winogrono.setText("");
                        else winogrono.setText("ilosc: " + liczbaWinogrono);
                    }
                });

        findViewById(R.id.dodaj_cytryna).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaCytryna++;
                        cytryna = findViewById(R.id.ile_cytryna);
                        cytryna.setText("ilosc: " + liczbaCytryna);
                    }
                });
        findViewById(R.id.usun_cytryna).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaCytryna--;
                        cytryna= findViewById(R.id.ile_cytryna);
                        if (liczbaCytryna <1) cytryna.setText("");
                        else cytryna.setText("ilosc: " + liczbaCytryna);
                    }
                });

        findViewById(R.id.zatwierdz).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Owoce.this, listaZakupow.class);
                        if (liczbaJablko != 0) lista = lista + liczbaJablko + ";Jablko;0;0\n";
                        if (liczbaBanan != 0) lista = lista + liczbaBanan + ";Banan;0;0\n";
                        if (liczbaPomarancza != 0) lista = lista + liczbaPomarancza + ";Pomarancza;0;0\n";
                        if (liczbaKiwi!= 0) lista = lista + liczbaKiwi + ";Kiwi;0;0\n";
                        if (liczbaAnanas != 0) lista = lista + liczbaAnanas + ";Ananas;0;0\n";
                        if (liczbaWinogrono != 0) lista = lista + liczbaWinogrono + ";Winogrono;0;0\n";
                        if (liczbaCytryna != 0) lista = lista + liczbaCytryna + ";Cytryna;0;0\n";

                        intent.putExtra("name", lista);
                        startActivityForResult(intent, 1);
                    }
                });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
