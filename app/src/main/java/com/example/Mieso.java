package com.example;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.pz1.R;


public class Mieso extends AppCompatActivity {

    public int liczbaKurczak=0;
    public int liczbaGes=0;
    public int liczbaIndyk=0;
    public int liczbaJagniecina=0;
    public int liczbaKaczka=0;
    public int liczbaWieprzowina=0;
    public int liczbaWolowina=0;
    String lista;
    private  static  final String plik="pliczek.txt";
    private TextView kurczak, ges, indyk, jagniecina, kaczka, wieprzowina, wolowina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mieso);
        setTitle("Mięso");

        lista = getIntent().getStringExtra("name");
        if(lista == null) lista="";

        findViewById(R.id.dodaj_kurczak).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaKurczak++;
                        kurczak = findViewById(R.id.ile_kurczak);
                        kurczak.setText("ilosc: " + liczbaKurczak);
                    }
                });
        findViewById(R.id.usun_kurczak).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaKurczak--;
                        kurczak= findViewById(R.id.ile_szampon);
                        if (liczbaKurczak <1) kurczak.setText("");
                        else kurczak.setText("ilosc: " + liczbaKurczak);
                    }
                });
        findViewById(R.id.dodaj_ges).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaGes++;
                        ges= findViewById(R.id.ile_ges);
                        ges.setText("ilosc: " + liczbaGes);
                    }
                });
        findViewById(R.id.usun_ges).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaGes--;
                        ges= findViewById(R.id.ile_ges);
                        if (liczbaGes<1) ges.setText("");
                        else ges.setText("ilosc: " + liczbaGes);
                    }
                });
        findViewById(R.id.dodaj_indyk).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaIndyk++;
                        indyk = findViewById(R.id.ile_indyk);
                        indyk.setText("ilosc: " + liczbaIndyk);
                    }
                });
        findViewById(R.id.usun_indyk).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaIndyk--;
                        indyk= findViewById(R.id.ile_indyk);
                        if (liczbaIndyk<1) indyk.setText("");
                        else indyk.setText("ilosc: " + liczbaIndyk);
                    }
                });
        findViewById(R.id.dodaj_jagniecina).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaJagniecina++;
                        jagniecina = findViewById(R.id.ile_jagniecina);
                        jagniecina.setText("ilosc: " + liczbaJagniecina);
                    }
                });
        findViewById(R.id.usun_jagniecina).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaJagniecina--;
                        jagniecina = findViewById(R.id.ile_jagniecina);
                        if (liczbaJagniecina <1) jagniecina.setText("");
                        else jagniecina.setText("ilosc: " + liczbaJagniecina);
                    }
                });
        findViewById(R.id.dodaj_kaczka).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaKaczka++;
                        kaczka = findViewById(R.id.ile_kaczka);
                        kaczka.setText("ilosc: " + liczbaKaczka);
                    }
                });
        findViewById(R.id.usun_kaczka).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaKaczka--;
                        kaczka= findViewById(R.id.ile_kaczka);
                        if (liczbaKaczka <1) kaczka.setText("");
                        else kaczka.setText("ilosc: " + liczbaKaczka);
                    }
                });
        findViewById(R.id.dodaj_wieprzowina).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaWieprzowina++;
                        wieprzowina = findViewById(R.id.ile_wieprzowina);
                        wieprzowina.setText("ilosc: " + liczbaWieprzowina);
                    }
                });
        findViewById(R.id.usun_wieprzowina).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaWieprzowina--;
                        wieprzowina= findViewById(R.id.ile_wieprzowina);
                        if (liczbaWieprzowina <1) wieprzowina.setText("");
                        else wieprzowina.setText("ilosc: " + liczbaWieprzowina);
                    }
                });

        findViewById(R.id.dodaj_wolowina).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaWolowina++;
                        wolowina = findViewById(R.id.ile_wolowina);
                        wolowina.setText("ilosc: " + liczbaWolowina);
                    }
                });
        findViewById(R.id.usun_wolowina).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaWolowina--;
                        wolowina= findViewById(R.id.ile_wolowina);
                        if (liczbaWolowina <1) wolowina.setText("");
                        else wolowina.setText("ilosc: " + liczbaWolowina);
                    }
                });

        findViewById(R.id.zatwierdz).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Mieso.this, listaZakupow.class);
                        if (liczbaKurczak != 0) lista = lista + liczbaKurczak + ";Kurczak;0;0\n";
                        if (liczbaGes != 0) lista = lista + liczbaGes + ";Ges;0;0\n";
                        if (liczbaIndyk != 0) lista = lista + liczbaIndyk + ";Indyk;0;0\n";
                        if (liczbaJagniecina != 0) lista = lista + liczbaJagniecina + ";Jagniecina;0;0\n";
                        if (liczbaKaczka != 0) lista = lista + liczbaKaczka + ";Kaczka;0;0\n";
                        if (liczbaWieprzowina != 0) lista = lista + liczbaWieprzowina + ";Wieprzowina;0;0\n";
                        if (liczbaWolowina != 0) lista = lista + liczbaWolowina + ";Wolowina;0;0\n";

                        intent.putExtra("name", lista);
                        intent.putExtra("klasa", "Mieso");
                        startActivityForResult(intent, 1);
                    }
                });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
