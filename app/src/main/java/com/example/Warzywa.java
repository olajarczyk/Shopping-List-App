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
 * Klasa kategorii Warzywa, w której wyświetlane są artykuły z tej kategorii. Pozwala na dodawanie i usuwanie produktów z listy. Umożliwia wybór ilości każdego z dodawanych produktów.
 */
public class Warzywa extends AppCompatActivity {

    public int liczbaMarchewka =0;
    public int liczbaSalata=0;
    public int liczbaCebula=0;
    public int liczbaZiemniaki=0;
    public int liczbaBaklazan=0;
    public int liczbaPapryka=0;
    public int liczbaKukurydza=0;
    String lista;
    private TextView marchewka, salata, cebula, ziemniaki, baklazan, papryka, kukurydza;
    /**
     *  Metoda używana do inicjalizacji składników aktywności. Definiuje interfejs użytkownika za pomocą setContentView(). W metodzie zaimplementowano interfejs onClickListener pozwalający na przechwytywanie prostych zdarzeń związanych z dotknięciem ekranu. Dzięki temu po przyciśnięciu na przyciski zostana uruchomione aktywności do nich przypisane.
     * @param savedInstanceState odniesienie do obiektu Bundle
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warzywa);
        setTitle("Warzywa");

        lista = getIntent().getStringExtra("name");
        if(lista == null) lista="";

        findViewById(R.id.dodajZiemniaki).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaZiemniaki++;
                        ziemniaki = findViewById(R.id.ile_ziemniaki);
                        ziemniaki.setText("ilosc: " + liczbaZiemniaki);
                    }
                });
        findViewById(R.id.usunZiemniaki).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaZiemniaki--;
                        ziemniaki= findViewById(R.id.ile_ziemniaki);
                        if (liczbaZiemniaki <1) ziemniaki.setText("");
                        else ziemniaki.setText("ilosc: " + liczbaZiemniaki);
                    }
                });
        findViewById(R.id.dodajPapryka).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaPapryka++;
                        papryka= findViewById(R.id.ile_papryka);
                        papryka.setText("ilosc: " + liczbaPapryka);
                    }
                });
        findViewById(R.id.usunPapryka).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaPapryka--;
                        papryka= findViewById(R.id.ile_papryka);
                        if (liczbaZiemniaki <1) papryka.setText("");
                        else papryka.setText("ilosc: " + liczbaPapryka);
                    }
                });
        findViewById(R.id.dodajKukurydza).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaKukurydza++;
                        kukurydza = findViewById(R.id.ile_kukurydza);
                        kukurydza.setText("ilosc: " + liczbaKukurydza);
                    }
                });
        findViewById(R.id.usunKukurydza).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaKukurydza--;
                        kukurydza= findViewById(R.id.ile_kukurydza);
                        if (liczbaKukurydza <1) kukurydza.setText("");
                        else kukurydza.setText("ilosc: " + liczbaKukurydza);
                    }
                });
        findViewById(R.id.dodajCebula).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaCebula++;
                        cebula = findViewById(R.id.ile_cebula);
                        cebula.setText("ilosc: " + liczbaCebula);
                    }
                });
        findViewById(R.id.usunCebula).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaCebula--;
                        cebula= findViewById(R.id.ile_cebula);
                        if (liczbaCebula <1) cebula.setText("");
                        else cebula.setText("ilosc: " + liczbaCebula);
                    }
                });
        findViewById(R.id.dodajBaklazan).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaBaklazan++;
                        baklazan = findViewById(R.id.ile_baklazan);
                        baklazan.setText("ilosc: " + liczbaBaklazan);
                    }
                });
        findViewById(R.id.usunBaklazan).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaBaklazan--;
                        baklazan= findViewById(R.id.ile_baklazan);
                        if (liczbaBaklazan <1) baklazan.setText("");
                        else baklazan.setText("ilosc: " + liczbaBaklazan);
                    }
                });
        findViewById(R.id.dodajMarchewka).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaMarchewka++;
                        marchewka = findViewById(R.id.ile_marchewka);
                        marchewka.setText("ilosc: " + liczbaMarchewka);
                    }
                });
        findViewById(R.id.usunMarchewka).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaMarchewka--;
                        marchewka= findViewById(R.id.ile_marchewka);
                        if (liczbaMarchewka <1) marchewka.setText("");
                        else marchewka.setText("ilosc: " + liczbaMarchewka);
                    }
                });

        findViewById(R.id.DodajSalata).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaSalata++;
                        salata = findViewById(R.id.ile_salata);
                        salata.setText("ilosc: " + liczbaSalata);
                    }
                });
        findViewById(R.id.usunSalata).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaSalata--;
                        salata= findViewById(R.id.ile_salata);
                        if (liczbaSalata <1) salata.setText("");
                        else salata.setText("ilosc: " + liczbaSalata);
                    }
                });

        findViewById(R.id.zatwierdz).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Warzywa.this, listaZakupow.class);
                        if (liczbaMarchewka != 0) lista = lista + liczbaMarchewka + ";Marchewka;0;0\n";
                        if (liczbaCebula != 0) lista = lista + liczbaCebula + ";Cebula;0;0\n";
                        if (liczbaBaklazan != 0) lista = lista + liczbaBaklazan + ";Baklazan;0;0\n";
                        if (liczbaKukurydza != 0) lista = lista + liczbaKukurydza + ";Kukurydza;0;0\n";
                        if (liczbaPapryka != 0) lista = lista + liczbaPapryka + ";Papryka;0;0\n";
                        if (liczbaZiemniaki != 0) lista = lista + liczbaZiemniaki + ";Ziemniaki;0;0\n";
                        if (liczbaSalata != 0) lista = lista + liczbaSalata + ";Salata;0;0\n";

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
