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
 * Klasa kategorii Zioła, w której wyświetlane są artykuły z tej kategorii. Pozwala na dodawanie i usuwanie produktów z listy. Umożliwia wybór ilości każdego z dodawanych produktów.
 */
public class Ziola extends AppCompatActivity {


    public int liczbaBazylia = 0;
    public int liczbaChili = 0;
    public int liczbaCukier = 0;
    public int liczbaBulion = 0;
    public int liczbaCzosnek = 0;
    public int liczbaKetchup = 0;
    public int liczbaKurkuma = 0;
    String lista;
    private TextView bazylia, chili, cukier, bulion, czosnek, ketchup, kurkuma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ziola);

        setTitle("Przyprawy");
        lista = getIntent().getStringExtra("name");
        if (lista == null) lista = "";

        findViewById(R.id.dodaj_bazylia).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaBazylia++;
                        bazylia = findViewById(R.id.ile_bazylia);
                        bazylia.setText("ilosc: " + liczbaBazylia);
                    }
                });
        findViewById(R.id.usun_bazylia).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaBazylia--;
                        bazylia = findViewById(R.id.ile_ziemniaki);
                        if (liczbaBazylia < 1) bazylia.setText("");
                        else bazylia.setText("ilosc: " + liczbaBazylia);
                    }
                });
        findViewById(R.id.dodaj_chili).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaChili++;
                        chili = findViewById(R.id.ile_chili);
                        chili.setText("ilosc: " + liczbaChili);
                    }
                });
        findViewById(R.id.usun_chili).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaChili--;
                        chili = findViewById(R.id.ile_chili);
                        if (liczbaChili < 1) chili.setText("");
                        else chili.setText("ilosc: " + liczbaChili);
                    }
                });
        findViewById(R.id.dodaj_cukier).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaCukier++;
                        cukier = findViewById(R.id.ile_cukier);
                        cukier.setText("ilosc: " + liczbaCukier);
                    }
                });
        findViewById(R.id.usun_cukier).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaCukier--;
                        cukier = findViewById(R.id.ile_cukier);
                        if (liczbaCukier < 1) cukier.setText("");
                        else cukier.setText("ilosc: " + liczbaCukier);
                    }
                });
        findViewById(R.id.dodaj_bulion).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaBulion++;
                        bulion = findViewById(R.id.ile_bulion);
                        bulion.setText("ilosc: " + liczbaBulion);
                    }
                });
        findViewById(R.id.usun_bulion).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaBulion--;
                        bulion = findViewById(R.id.ile_bulion);
                        if (liczbaBulion < 1) bulion.setText("");
                        else bulion.setText("ilosc: " + liczbaBulion);
                    }
                });
        findViewById(R.id.dodaj_czosnek).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaCzosnek++;
                        czosnek = findViewById(R.id.ile_czosnek);
                        czosnek.setText("ilosc: " + liczbaCzosnek);
                    }
                });
        findViewById(R.id.usun_czosnek).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaCzosnek--;
                        czosnek = findViewById(R.id.ile_ketchup);
                        if (liczbaCzosnek < 1) czosnek.setText("");
                        else czosnek.setText("ilosc: " + liczbaCzosnek);
                    }
                });
        findViewById(R.id.dodaj_ketchup).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaKetchup++;
                        ketchup = findViewById(R.id.ile_ketchup);
                        ketchup.setText("ilosc: " + liczbaKetchup);
                    }
                });
        findViewById(R.id.usun_ketchup).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaKetchup--;
                        ketchup = findViewById(R.id.ile_ketchup);
                        if (liczbaKetchup < 1) ketchup.setText("");
                        else ketchup.setText("ilosc: " + liczbaKetchup);
                    }
                });

        findViewById(R.id.dodaj_kurkuma).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaKurkuma++;
                        kurkuma = findViewById(R.id.ile_kurkuma);
                        kurkuma.setText("ilosc: " + liczbaKurkuma);
                    }
                });
        findViewById(R.id.usun_kurkuma).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        liczbaKurkuma--;
                        kurkuma = findViewById(R.id.ile_kurkuma);
                        if (liczbaKurkuma < 1) kurkuma.setText("");
                        else kurkuma.setText("ilosc: " + liczbaKurkuma);
                    }
                });

        findViewById(R.id.zatwierdz).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Ziola.this, listaZakupow.class);
                        if (liczbaBulion != 0) lista = lista + liczbaBulion + ";Bulion;0;0\n";
                        if (liczbaBazylia != 0) lista = lista + liczbaBazylia + ";Bazylia;0;0\n";
                        if (liczbaChili != 0) lista = lista + liczbaChili + ";Chili;0;0\n";
                        if (liczbaCukier != 0) lista = lista + liczbaCukier + ";Kukurydza;0;0\n";
                        if (liczbaCzosnek != 0) lista = lista + liczbaCzosnek + ";Czosnek;0;0\n";
                        if (liczbaKetchup != 0) lista = lista + liczbaKetchup + ";Ketchup;0;0\n";
                        if (liczbaKurkuma != 0) lista = lista + liczbaKurkuma + ";Kurkuma;0;0\n";

                        intent.putExtra("name", lista);
                        startActivityForResult(intent, 1);
                    }
                });
    }
    @Override
    protected void onActivityResult ( int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode, data);
    }
}
