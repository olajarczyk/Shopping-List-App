package com.example;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.pz1.R;
import com.example.listaZakupow;
/**
 * Klasa kategorii Słodycze, w której wyświetlane są artykuły z tej kategorii. Pozwala na dodawanie i usuwanie produktów z listy. Umożliwia wybór ilości każdego z dodawanych produktów.
 */
public class Slodycze extends AppCompatActivity {


    public int liczbaBaton =0;
    public int liczbaChipsy=0;
    public int liczbaCiastka=0;
    public int liczbaCukierki=0;
    public int liczbaCzekolada=0;
    public int liczbaHerbatniki=0;
    public int liczbaKrakersy=0;
    String lista;
    private TextView baton,chipsy, ciastka, cukierki, czekolada, herbatniki, krakersy;
    /**
     *  Metoda używana do inicjalizacji składników aktywności. Definiuje interfejs użytkownika za pomocą setContentView(). W metodzie zaimplementowano interfejs onClickListener pozwalający na przechwytywanie prostych zdarzeń związanych z dotknięciem ekranu. Dzięki temu po przyciśnięciu na przyciski zostana uruchomione aktywności do nich przypisane.
     * @param savedInstanceState odniesienie do obiektu Bundle
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slodycze);
        setTitle("Słodycze");

        lista = getIntent().getStringExtra("name");
        if(lista == null) lista="";

        findViewById(R.id.dodaj_baton).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaBaton++;
                        baton = findViewById(R.id.ile_baton);
                        baton.setText("ilosc: " + liczbaBaton);
                    }
                });
        findViewById(R.id.usun_baton).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaBaton--;
                        baton= findViewById(R.id.ile_baton);
                        if (liczbaBaton <1) baton.setText("");
                        else baton.setText("ilosc: " + liczbaBaton);
                    }
                });
        findViewById(R.id.dodaj_chipsy).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaChipsy++;
                        chipsy= findViewById(R.id.ile_chipsy);
                        chipsy.setText("ilosc: " + liczbaChipsy);
                    }
                });
        findViewById(R.id.usun_chipsy).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaChipsy--;
                        chipsy= findViewById(R.id.ile_chipsy);
                        if (liczbaChipsy <1) chipsy.setText("");
                        else chipsy.setText("ilosc: " + liczbaChipsy);
                    }
                });
        findViewById(R.id.dodaj_ciastka).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaCiastka++;
                        ciastka = findViewById(R.id.ile_ciastka);
                        ciastka.setText("ilosc: " + liczbaCiastka);
                    }
                });
        findViewById(R.id.usun_ciastka).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaCiastka--;
                        ciastka= findViewById(R.id.ile_ciastka);
                        if (liczbaCiastka<1) ciastka.setText("");
                        else ciastka.setText("ilosc: " + liczbaCiastka);
                    }
                });
        findViewById(R.id.dodaj_cukierki).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaCukierki++;
                        cukierki = findViewById(R.id.ile_cukierki);
                        cukierki.setText("ilosc: " + liczbaCukierki);
                    }
                });
        findViewById(R.id.usun_cukierki).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaCukierki--;
                        cukierki= findViewById(R.id.ile_cukierki);
                        if (liczbaCukierki <1) cukierki.setText("");
                        else cukierki.setText("ilosc: " + liczbaCukierki);
                    }
                });
        findViewById(R.id.dodaj_czekolada).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaCzekolada++;
                        czekolada = findViewById(R.id.ile_czekolada);
                        czekolada.setText("ilosc: " + liczbaCzekolada);
                    }
                });
        findViewById(R.id.usun_czekolada).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaCzekolada--;
                        czekolada= findViewById(R.id.ile_czekolada);
                        if (liczbaCzekolada <1) czekolada.setText("");
                        else czekolada.setText("ilosc: " + liczbaCzekolada);
                    }
                });
        findViewById(R.id.dodaj_herbatniki).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaHerbatniki++;
                        herbatniki = findViewById(R.id.ile_herbatniki);
                        herbatniki.setText("ilosc: " + liczbaHerbatniki);
                    }
                });
        findViewById(R.id.usun_herbatniki).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaHerbatniki--;
                        herbatniki= findViewById(R.id.ile_herbatniki);
                        if (liczbaHerbatniki <1) herbatniki.setText("");
                        else herbatniki.setText("ilosc: " + liczbaHerbatniki);
                    }
                });

        findViewById(R.id.dodaj_krakersy).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaKrakersy++;
                        krakersy = findViewById(R.id.ile_krakersy);
                        krakersy.setText("ilosc: " + liczbaKrakersy);
                    }
                });
        findViewById(R.id.usun_krakersy).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaKrakersy--;
                        krakersy= findViewById(R.id.ile_krakersy);
                        if (liczbaKrakersy <1) krakersy.setText("");
                        else krakersy.setText("ilosc: " + liczbaKrakersy);
                    }
                });

        findViewById(R.id.zatwierdz).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Slodycze.this, listaZakupow.class);
                        if (liczbaBaton != 0) lista = lista + liczbaBaton + ";Baton;0;0\n";
                        if (liczbaChipsy != 0) lista = lista + liczbaChipsy + ";Chipsy;0;0\n";
                        if (liczbaCiastka != 0) lista = lista + liczbaCiastka + ";Ciastka;0;0\n";
                        if (liczbaCukierki != 0) lista = lista + liczbaCukierki + ";Cukierki;0;0\n";
                        if (liczbaCzekolada != 0) lista = lista + liczbaCukierki + ";Czekolada;0;0\n";
                        if (liczbaHerbatniki != 0) lista = lista + liczbaHerbatniki + ";Herbatniki;0;0\n";
                        if (liczbaKrakersy != 0) lista = lista + liczbaKrakersy + ";Krakersy;0;0\n";

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
