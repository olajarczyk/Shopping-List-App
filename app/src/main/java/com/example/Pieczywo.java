package com.example;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pz1.R;
import com.example.listaZakupow;
/**
 * Klasa kategorii Pieczywo, w której wyświetlane są artykuły z tej kategorii. Pozwala na dodawanie i usuwanie produktów z listy. Umożliwia wybór ilości każdego z dodawanych produktów.
 */
public class Pieczywo extends AppCompatActivity {
    public int liczbaBagietka_c = 0;
    public int liczbaBagietka_j = 0;
    public int liczbaKajzerka = 0;
    public int liczbaBulka_c = 0;
    public int liczbaBulka_j = 0;
    public int liczbaChleb_j = 0;
    public int liczbaChleb_c = 0;
    String lista = "";
    private TextView bagietka_c, bagietka_j, kajzerka, bulka_c, bulka_j, chleb_j, chleb_c;
    Database_Pomocnik_Zakupowicza db;
    /**
     *  Metoda używana do inicjalizacji składników aktywności. Definiuje interfejs użytkownika za pomocą setContentView(). W metodzie zaimplementowano interfejs onClickListener pozwalający na przechwytywanie prostych zdarzeń związanych z dotknięciem ekranu. Dzięki temu po przyciśnięciu na przyciski zostana uruchomione aktywności do nich przypisane.
     * @param savedInstanceState odniesienie do obiektu Bundle
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pieczywo);
        setTitle("Pieczywo");

        lista = getIntent().getStringExtra("name");
        db=new Database_Pomocnik_Zakupowicza(this);

        if(lista == null) lista="";
        findViewById(R.id.dodaj_bagietke_j).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaBagietka_j++;
                        bagietka_j = findViewById(R.id.ile_bagietka_j);
                        bagietka_j.setText("ilosc: " + liczbaBagietka_j);
                    }
                });
        findViewById(R.id.usun_bagietke_j).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaBagietka_j--;
                        bagietka_j = findViewById(R.id.ile_bagietka_j);
                        if (liczbaBagietka_j <1) bagietka_j.setText("");
                        else bagietka_j.setText("ilosc: " + liczbaBagietka_j);
                    }
                });
        findViewById(R.id.dodajKajzerka).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaKajzerka++;
                        kajzerka = findViewById(R.id.ile_kajzerka);
                        kajzerka.setText("ilosc: " + liczbaKajzerka);
                    }
                });
        findViewById(R.id.usunKajzerka).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaKajzerka--;
                        kajzerka = findViewById(R.id.ile_kajzerka);
                        if (liczbaKajzerka <1) kajzerka.setText("");
                        else kajzerka.setText("ilosc: " + liczbaKajzerka);
                    }
                });
        findViewById(R.id.dodaj_bulka_c).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaBulka_c++;
                        bulka_c = findViewById(R.id.ile_bulka_c);
                        bulka_c.setText("ilosc: " + liczbaBulka_c);
                    }
                });
        findViewById(R.id.usun_bulka_c).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaBulka_c--;
                        bulka_c = findViewById(R.id.ile_bulka_c);
                        if (liczbaBulka_c <1) bulka_c.setText("");
                        else bulka_c.setText("ilosc: " + liczbaBulka_c);
                    }
                });

        findViewById(R.id.dodaj_bulka_j).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaBulka_j++;
                        bulka_j = findViewById(R.id.ile_bulka_j);
                        bulka_j.setText("ilosc: " + liczbaBulka_j);
                    }
                });
        findViewById(R.id.usun_bulka_j).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaBulka_j--;
                        bulka_j = findViewById(R.id.ile_bulka_j);
                        if (liczbaBulka_j <1) bulka_j.setText("");
                        else bulka_j.setText("ilosc: " + liczbaBulka_j);
                    }
                });

        findViewById(R.id.dodaj_chleb_c).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaChleb_c++;
                        chleb_c = findViewById(R.id.ile_chleb_c);
                        chleb_c.setText("ilosc: " + liczbaChleb_c);
                    }
                });
        findViewById(R.id.usun_chleb_c).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaChleb_c--;
                        chleb_c = findViewById(R.id.ile_chleb_c);
                        if (liczbaChleb_c <1) chleb_c.setText("");
                        else chleb_c.setText("ilosc: " + liczbaChleb_c);
                    }
                });

        findViewById(R.id.dodaj_chleb_j).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaChleb_j++;
                        chleb_j = findViewById(R.id.ile_chleb_j);
                        chleb_j.setText("ilosc: " + liczbaChleb_j);
                    }
                });
        findViewById(R.id.usun_chleb_j).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaChleb_j--;
                        chleb_j = findViewById(R.id.ile_chleb_j);
                        if (liczbaChleb_j <1) chleb_j.setText("");
                        else chleb_j.setText("ilosc: " + liczbaChleb_j);
                    }
                });
        findViewById(R.id.dodaj_bagietke_c).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaBagietka_c++;
                        bagietka_c = findViewById(R.id.ile_bagietka_c);
                        bagietka_c.setText("ilosc: " + liczbaBagietka_c);
                    }
                });
        findViewById(R.id.usun_bagietke_c).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaBagietka_c--;
                        bagietka_c = findViewById(R.id.ile_bagietka_c);
                        if (liczbaBagietka_c <1) bagietka_j.setText("");
                        else bagietka_c.setText("ilosc: " + liczbaBagietka_c
                        );
                    }
                });



        findViewById(R.id.zatwierdz).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(Pieczywo.this, listaZakupow.class);
                        if (liczbaBagietka_c != 0) lista = lista + liczbaBagietka_c + ";Bagietka ciemna;0;0\n";
                        if (liczbaBagietka_j != 0) lista = lista + liczbaBagietka_j + ";Bagietka jasna;0;0\n";
                        if (liczbaKajzerka != 0) lista = lista + liczbaKajzerka + ";Kajzerka;0;0\n";
                        if (liczbaBulka_j != 0) lista = lista + liczbaBulka_j + ";Bulka jasna;0;0\n";
                        if (liczbaBulka_c != 0) lista = lista + liczbaBulka_c + ";Bulka ciemna;0;0\n";
                        if (liczbaChleb_j != 0) lista = lista + liczbaChleb_j + ";Chleb jasny;0;0\n";
                        if (liczbaChleb_c != 0) lista = lista + liczbaChleb_c + ";Chleb ciemny;0;0\n";

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


