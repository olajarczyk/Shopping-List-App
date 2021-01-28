package com.example;

import android.content.Intent;
import android.database.sqlite.SQLiteCursor;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.example.pz1.R;
import java.util.ArrayList;

/**
 * Klasa wyświetlająca wszystkie stworzone listy
 */
public class wszystkieListy extends AppCompatActivity {


    Database_Pomocnik_Zakupowicza db;
    ArrayList <String> listaTytulow;
    String [] nazwaListy=new String[100];
    /**
     *  Metoda używana do inicjalizacji składników aktywności. Definiuje interfejs użytkownika za pomocą setContentView(). W metodzie zaimplementowano interfejs onClickListener pozwalający na przechwytywanie prostych zdarzeń związanych z dotknięciem ekranu. Dzięki temu po przyciśnięciu na przyciski zostana uruchomione aktywności do nich przypisane.
     * @param savedInstanceState odniesienie do obiektu Bundle
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wszystkie_listy);
        setTitle("Moje Listy");
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.action_list:
                        return true;
                    case R.id.action_home:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.action_map:
                        startActivity(new Intent(getApplicationContext(), MapActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }

        });
        db=new Database_Pomocnik_Zakupowicza(this);
        ListView theList = (ListView) findViewById(R.id.listalista);

        WcyztajTytuly();

        ListAdapter theAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaTytulow);


        theList.setAdapter(theAdapter);

        theList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {


                Intent intent = new Intent(wszystkieListy.this, WyswietlListe.class);
                intent.putExtra("NazwaListy", nazwaListy[position]);
                startActivityForResult(intent, 1);


            }
        });
    }

    /**
     * Metoda wczytująca tytuły wszystkich utworzonych list
     */
    public void WcyztajTytuly() {
        listaTytulow=new ArrayList<String>();
        int i=0;
        SQLiteCursor kursor = db.grupuj_tytuly();
        if(kursor.getCount()>0){
            StringBuffer buff =new StringBuffer();
            while(kursor.moveToNext()){
                buff.append("Tytul: "+ kursor.getString(0)+"\n");
                buff.append("Liczba produktow: "+ kursor.getString(1)+"\n\n");
                listaTytulow.add(kursor.getString(0));
                nazwaListy[i]=kursor.getString(0);
                i++;
            }

        }
        else{
        }
    }
}