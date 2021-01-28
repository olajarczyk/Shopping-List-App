package com.example;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.pz1.R;
import com.example.listaZakupow;

public class Napoje extends AppCompatActivity {

    public int liczbaWoda =0;
    public int liczbaSok_p=0;
    public int liczbaSok_j=0;
    public int liczbaPiwo=0;
    public int liczbaHerbata=0;
    public int liczbaKawa=0;
    public int liczbaLemoniada=0;
    String lista;
    private TextView woda, sok_p, sok_j, piwo, herbata, kawa, lemoniada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_napoje);
        setTitle("Napoje");

        lista = getIntent().getStringExtra("name");
        if(lista == null) lista="";

        findViewById(R.id.dodaj_woda).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaWoda++;
                        woda = findViewById(R.id.ile_woda);
                        woda.setText("ilosc: " + liczbaWoda);
                    }
                });
        findViewById(R.id.usun_woda).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaWoda--;
                        woda= findViewById(R.id.ile_woda);
                        if (liczbaWoda <1) woda.setText("");
                        else woda.setText("ilosc: " + liczbaWoda);
                    }
                });
        findViewById(R.id.dodaj_sok_p).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaSok_p++;
                        sok_p=findViewById(R.id.ile_sok_p);
                        sok_p.setText("ilosc: " + liczbaSok_p);
                    }
                });
        findViewById(R.id.usun_sok_p).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaSok_p--;
                        sok_p= findViewById(R.id.ile_sok_p);
                        if (liczbaSok_p <1) sok_p.setText("");
                        else sok_p.setText("ilosc: " + liczbaSok_p);
                    }
                });
        findViewById(R.id.dodaj_sok_j).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaSok_j++;
                        sok_j = findViewById(R.id.ile_sok_j);
                        sok_j.setText("ilosc: " + liczbaSok_j);
                    }
                });
        findViewById(R.id.usun_sok_j).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaSok_j--;
                        sok_j= findViewById(R.id.ile_sok_j);
                        if (liczbaSok_j<1) sok_j.setText("");
                        else sok_j.setText("ilosc: " + liczbaSok_j);
                    }
                });
        findViewById(R.id.dodaj_piwo).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaPiwo++;
                        piwo = findViewById(R.id.ile_piwo);
                        piwo.setText("ilosc: " + liczbaPiwo);
                    }
                });
        findViewById(R.id.usun_piwo).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaPiwo--;
                        piwo = findViewById(R.id.ile_piwo);
                        if (liczbaPiwo<1) piwo.setText("");
                        else piwo.setText("ilosc: " + liczbaPiwo);
                    }
                });
        findViewById(R.id.dodaj_herbata).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaHerbata++;
                        herbata = findViewById(R.id.ile_herbata);
                        herbata.setText("ilosc: " + liczbaHerbata);
                    }
                });
        findViewById(R.id.usun_herbata).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaHerbata--;
                        herbata= findViewById(R.id.ile_herbata);
                        if (liczbaHerbata <1) herbata.setText("");
                        else herbata.setText("ilosc: " + liczbaHerbata);
                    }
                });
        findViewById(R.id.dodaj_kawa).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaKawa++;
                        kawa= findViewById(R.id.ile_kawa);
                        kawa.setText("ilosc: " + liczbaKawa);
                    }
                });
        findViewById(R.id.usun_kawa).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaKawa--;
                        kawa= findViewById(R.id.ile_kawa);
                        if (liczbaKawa <1) kawa.setText("");
                        else kawa.setText("ilosc: " + liczbaKawa);
                    }
                });

        findViewById(R.id.dodaj_lemoniada).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaLemoniada++;
                        lemoniada = findViewById(R.id.ile_lemoniada);
                        lemoniada.setText("ilosc: " + liczbaLemoniada);
                    }
                });
        findViewById(R.id.usun_lemoniada).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaLemoniada--;
                        lemoniada= findViewById(R.id.ile_lemoniada);
                        if (liczbaLemoniada<1) lemoniada.setText("");
                        else lemoniada.setText("ilosc: " + liczbaLemoniada);
                    }
                });

        findViewById(R.id.zatwierdz).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Napoje.this, listaZakupow.class);
                        if (liczbaWoda != 0) lista = lista + liczbaWoda + ";Woda;0;0\n";
                        if (liczbaSok_j != 0) lista = lista + liczbaSok_j + ";Sok jablkowy;0;0\n";
                        if (liczbaSok_p != 0) lista = lista + liczbaSok_p + ";Sok pomaranczowy;0;0\n";
                        if (liczbaPiwo != 0) lista = lista + liczbaPiwo + ";Piwo;0;0\n";
                        if (liczbaHerbata != 0) lista = lista + liczbaHerbata + ";Herbata;0;0\n";
                        if (liczbaKawa != 0) lista = lista + liczbaKawa + ";Kawa;0;0\n";
                        if (liczbaLemoniada != 0) lista = lista + liczbaLemoniada + ";Lemoniada;0;0\n";

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
