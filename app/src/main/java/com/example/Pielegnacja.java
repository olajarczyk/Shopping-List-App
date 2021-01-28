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
 * Klasa kategorii Pielęgnacja, w której wyświetlane są artykuły z tej kategorii. Pozwala na dodawanie i usuwanie produktów z listy. Umożliwia wybór ilości każdego z dodawanych produktów.
 */
public class Pielegnacja extends AppCompatActivity {


    public int liczbaSzampon =0;
    public int liczbaMydlo=0;
    public int liczbaBalsam=0;
    public int liczbaKrem=0;
    public int liczbaDomestos=0;
    public int liczbaPapier=0;
    public int liczbaHusteczki=0;
    String lista;
    private TextView szampon, mydlo, balsam, krem, domestos, papier, husteczki;
    /**
     *  Metoda używana do inicjalizacji składników aktywności. Definiuje interfejs użytkownika za pomocą setContentView(). W metodzie zaimplementowano interfejs onClickListener pozwalający na przechwytywanie prostych zdarzeń związanych z dotknięciem ekranu. Dzięki temu po przyciśnięciu na przyciski zostana uruchomione aktywności do nich przypisane.
     * @param savedInstanceState odniesienie do obiektu Bundle
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pielegnacja);
        setTitle("Pielęgnacja");

        lista = getIntent().getStringExtra("name");
        if(lista == null) lista="";

        findViewById(R.id.dodaj_szampon).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaSzampon++;
                        szampon = findViewById(R.id.ile_szampon);
                        szampon.setText("ilosc: " + liczbaSzampon);
                    }
                });
        findViewById(R.id.usun_szampon).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaSzampon--;
                        szampon= findViewById(R.id.ile_szampon);
                        if (liczbaSzampon <1) szampon.setText("");
                        else szampon.setText("ilosc: " + liczbaSzampon);
                    }
                });
        findViewById(R.id.dodaj_mydlo).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaMydlo++;
                        mydlo= findViewById(R.id.ile_mydlo);
                        mydlo.setText("ilosc: " + liczbaMydlo);
                    }
                });
        findViewById(R.id.usun_mydlo).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaMydlo--;
                        mydlo= findViewById(R.id.ile_mydlo);
                        if (liczbaMydlo <1) mydlo.setText("");
                        else mydlo.setText("ilosc: " + liczbaMydlo);
                    }
                });
        findViewById(R.id.dodaj_balsam).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaBalsam++;
                        balsam = findViewById(R.id.ile_balsam);
                        balsam.setText("ilosc: " + liczbaBalsam);
                    }
                });
        findViewById(R.id.usun_balsam).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaBalsam--;
                        balsam= findViewById(R.id.ile_balsam);
                        if (liczbaBalsam<1) balsam.setText("");
                        else balsam.setText("ilosc: " + liczbaBalsam);
                    }
                });
        findViewById(R.id.dodaj_krem).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaKrem++;
                        krem = findViewById(R.id.ile_krem);
                        krem.setText("ilosc: " + liczbaKrem);
                    }
                });
        findViewById(R.id.usun_krem).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaKrem--;
                        krem = findViewById(R.id.ile_krem);
                        if (liczbaKrem <1) krem.setText("");
                        else krem.setText("ilosc: " + liczbaKrem);
                    }
                });
        findViewById(R.id.dodaj_domestos).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaDomestos++;
                        domestos = findViewById(R.id.ile_domestos);
                        domestos.setText("ilosc: " + liczbaDomestos);
                    }
                });
        findViewById(R.id.usun_domestos).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaDomestos--;
                        domestos= findViewById(R.id.ile_domestos);
                        if (liczbaDomestos <1) domestos.setText("");
                        else domestos.setText("ilosc: " + liczbaDomestos);
                    }
                });
        findViewById(R.id.dodaj_papier).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaPapier++;
                        papier = findViewById(R.id.ile_papier);
                        papier.setText("ilosc: " + liczbaPapier);
                    }
                });
        findViewById(R.id.usun_papier).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaPapier--;
                        papier= findViewById(R.id.ile_papier);
                        if (liczbaPapier <1) papier.setText("");
                        else papier.setText("ilosc: " + liczbaPapier);
                    }
                });

        findViewById(R.id.dodaj_husteczki).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaHusteczki++;
                        husteczki = findViewById(R.id.ile_husteczki);
                        husteczki.setText("ilosc: " + liczbaHusteczki);
                    }
                });
        findViewById(R.id.usun_husteczki).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaHusteczki--;
                        husteczki= findViewById(R.id.ile_husteczki);
                        if (liczbaHusteczki <1) husteczki.setText("");
                        else husteczki.setText("ilosc: " + liczbaHusteczki);
                    }
                });

        findViewById(R.id.zatwierdz).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Pielegnacja.this, listaZakupow.class);
                        if (liczbaSzampon != 0) lista = lista + liczbaSzampon + ";Szampon;0;0\n";
                        if (liczbaMydlo != 0) lista = lista + liczbaMydlo + ";Mydlo;0;0\n";
                        if (liczbaBalsam != 0) lista = lista + liczbaBalsam + ";Balsam;0;0\n";
                        if (liczbaKrem != 0) lista = lista + liczbaKrem + ";Krem;0;0\n";
                        if (liczbaDomestos != 0) lista = lista + liczbaDomestos + ";Domestos;0;0\n";
                        if (liczbaPapier != 0) lista = lista + liczbaPapier + ";Papier;0;0\n";
                        if (liczbaHusteczki != 0) lista = lista + liczbaHusteczki + ";Husteczki;0;0\n";

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
