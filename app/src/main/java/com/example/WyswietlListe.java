package com.example;

import android.content.Intent;
import android.database.sqlite.SQLiteCursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.example.pz1.R;
import java.util.ArrayList;

/**
 * Klasa wyświetlająca wybraną liste. Pozwala na odznaczanie kupionych już produktów i wpisanie ich ceny. Wyświetla łączną cenę za wszystkie odznaczone już produkty.
 */
public class WyswietlListe extends AppCompatActivity {


    Database_Pomocnik_Zakupowicza db;
    String nazwaListy, nazwaProduktu;
    double [] cenyProduktow= new double[100];
    ArrayList <String> listaZakupow;
    ArrayList<CheckBox> listacheck = new ArrayList<CheckBox>();
    LinearLayout linearMain;
    CheckBox checkBox;
    int id;
    String [] nazwyProduktow;
    String [][] baza=new String[100][4];
    int liczba;

    /**
     * Metoda używana do inicjalizacji składników aktywności. Definiuje interfejs użytkownika za pomocą setContentView(). W metodzie zaimplementowano interfejs onClickListener pozwalający na przechwytywanie prostych zdarzeń związanych z dotknięciem ekranu. Dzięki temu po przyciśnięciu na przyciski zostana uruchomione aktywności do nich przypisane.
     *
     * @param savedInstanceState odniesienie do obiektu Bundle
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wyswietl_liste);
        setTitle("Twoja Lista");
        db = new Database_Pomocnik_Zakupowicza(this);

        nazwaListy = getIntent().getStringExtra("NazwaListy");
        nazwaProduktu = getIntent().getStringExtra("NazwaProduktu"); //Nazwa odznaczonego produktu, któremu wpisaliśmy cene
        double cena = getIntent().getDoubleExtra("cena",0); //Cena jednego produktu
        double cenaLaczna = getIntent().getDoubleExtra("cenaLaczna",0);
        id = getIntent().getIntExtra("id",0);
        int ilosc=0;

        WczytajListe();

        linearMain = (LinearLayout) findViewById(R.id.linear_main);

        //Obliczenie łacznej ceny zakupów
        cenaLaczna=cenaLaczna+cena;

        if(cena==0) {
            SQLiteCursor kursor = db.policz(nazwaListy);
            if (kursor.moveToFirst()) {
                ilosc = kursor.getInt(0);
            }
            for (int i = 0; i < liczba; i++) {
                cenaLaczna = cenaLaczna + Double.parseDouble(baza[i][3]);
            }
        }
        TextView wyswietlcene = findViewById(R.id.cena);
        wyswietlcene.setText(Double.toString(cenaLaczna));




        //Zapis do bazy ceny produktu
        if(cena!=0){
            boolean czySieUdalo;
            SQLiteCursor kursor3 = db.wyszukaj_produkt(nazwaProduktu);
            int cenaInt=(int)cena;
            if (kursor3.moveToFirst()) {
                String nazwaID = kursor3.getString(0);

                czySieUdalo=db.aktualizuj_pozycja(baza[id][0],cenaInt,Integer.parseInt(baza[id][2]),baza[id][1],nazwaListy);
                if (czySieUdalo) {
                    Toast.makeText(WyswietlListe.this, "Udało się " , Toast.LENGTH_LONG).show();

                    SQLiteCursor kursor2 = db.wyszukaj_liste(nazwaListy);
                    if (kursor2.getCount() > 0) {
                        while (kursor2.moveToNext()) {
                            cenyProduktow[id] = Double.parseDouble(kursor2.getString(3));
                        }
                    }
                }
                else {
                    Toast.makeText(WyswietlListe.this, "Nie udało się", Toast.LENGTH_LONG).show();
                }
            }

        }

        WczytajListe();


        for (int i = 0; i < listaZakupow.size(); i++) {
            checkBox = new CheckBox(this);
            checkBox.setId(i);
            checkBox.setText(listaZakupow.get(i));

            if(cenyProduktow[i]!=0) { //Sprawdzenie czy nie zostało już wczesniej kupione (czy ma cene zapisana w bazie) i czy ma być już zaznaczone
                checkBox.setChecked(true);
            }
            listacheck.add(checkBox);
            checkBox.setOnClickListener(getOnClickDoSomething(checkBox,  listaZakupow, nazwaListy, cenaLaczna, i));
            linearMain.addView(checkBox);
        }


        findViewById(R.id.okej).setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(
                                WyswietlListe.this, MainActivity.class);
                        startActivityForResult(intent, 1);
                    }
                });

    }

    View.OnClickListener getOnClickDoSomething (final Button button, final ArrayList<String> lista, final String nazwa, final double cenaLaczna, final int i){
        return new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("ON_CLICK", "Checbox ID" +button.getId()+ "Tekst"+button.getText().toString());
                for(CheckBox cb : listacheck) {
                    if (cb.isChecked()){
                        int j=cb.getId();

                        //if(cenyProduktow[j]!=0) {
                            Intent intent = new Intent(WyswietlListe.this, WpiszCene.class);
                            intent.putExtra("id", i);
                            intent.putExtra("NazwaListy", nazwa);
                            intent.putExtra("cenaLaczna", cenaLaczna);
                            intent.putExtra("NazwaProduktu", nazwyProduktow[j]);
                            startActivityForResult(intent, 1);
                        //}
                        System.out.println(cb.getId());
                    }else{
                        System.out.println(cb.getId()+" jest nieklikniete");
                    }
                }

            }
        };
    }

    //Wczyta produkty z bazy ktore sa przypisane do tej listy
    public void WczytajListe() {
        listaZakupow=new ArrayList<String>();
        int i=0;
        nazwyProduktow=new String[100];
        SQLiteCursor kursor2 = db.wyszukaj_liste(nazwaListy);
        liczba=kursor2.getCount();
        if (kursor2.getCount() > 0) {
            while (kursor2.moveToNext()){
                SQLiteCursor kursor= db.wyszukaj_nazweProduktu(kursor2.getString(1));

                if(kursor.moveToFirst()){

                    listaZakupow.add( kursor2.getString(2)+ " x " + kursor.getString(1) );
                    nazwyProduktow[i]=kursor.getString(1);
                    cenyProduktow[i]=Double.parseDouble(kursor2.getString(3));

                    baza[i][0]=kursor2.getString(0); //id
                    baza[i][1]=kursor2.getString(1); //produkt
                    baza[i][2]=kursor2.getString(2); //ilosc
                    baza[i][3]=kursor2.getString(3); //cena
                    i++;
                }

            }
        } else {
        }
    }
}

