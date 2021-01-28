package com.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.pz1.R;

/**
 * Klasa umożliwiająca wprowadzenie ceny danego artykułu
 */
public class WpiszCene extends AppCompatActivity {
    EditText nazwa1;
    String cena;
    String listazakupow, nazwaListy, nazwaProduktu;
    int  id,i;
    double cenalaczna;
    /**
     * Metoda używana do inicjalizacji składników aktywności. Definiuje interfejs użytkownika za pomocą setContentView(). W metodzie zaimplementowano interfejs onClickListener pozwalający na przechwytywanie prostych zdarzeń związanych z dotknięciem ekranu. Dzięki temu po przyciśnięciu na przycisk zostanie uruchomiona aktywność do niego przypisana.
     * @param savedInstanceState odniesienie do obiektu Bundle
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wpisz_cene);

        nazwaListy = getIntent().getStringExtra("NazwaListy");
        nazwaProduktu = getIntent().getStringExtra("NazwaProduktu");
        cenalaczna = getIntent().getDoubleExtra("cenaLaczna",0);
        id = getIntent().getIntExtra("id",0);


        findViewById(R.id.okej).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(WpiszCene.this, WyswietlListe.class);


                        nazwa1 = (EditText)findViewById(R.id.cena);
                        double cena = Double.parseDouble(nazwa1.getText().toString());
                        intent.putExtra("id", id);
                        intent.putExtra("NazwaListy", nazwaListy);
                        intent.putExtra("NazwaProduktu", nazwaProduktu);
                        intent.putExtra("cena", cena);
                        intent.putExtra("cenaLaczna", cenalaczna);

                        startActivityForResult(intent, 1);
                    }
                });

    }


}