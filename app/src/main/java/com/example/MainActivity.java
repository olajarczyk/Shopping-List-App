package com.example;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.example.pz1.R;

/**
 * Klasa głównej aktywności. Pozwala na przejście do tworzenia nowej listy, lub przeglądania list już utworzonych.
 */
public class MainActivity extends AppCompatActivity {
    /**
     *  Metoda używana do inicjalizacji składników aktywności. Definiuje interfejs użytkownika za pomocą setContentView(). W metodzie zaimplementowano interfejs onClickListener pozwalający na przechwytywanie prostych zdarzeń związanych z dotknięciem ekranu. Dzięki temu po przyciśnięciu na przyciski zostaną uruchomione aktywności do nich przypisane.
     * @param savedInstanceState odniesienie do obiektu Bundle
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.dodajListe).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(
                                MainActivity.this, Kategorie.class);
                                 startActivityForResult(intent, 1);
                    }
                });

        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.action_list:
                        startActivity(new Intent(getApplicationContext(), wszystkieListy.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.action_home:
                        return true;
                    case R.id.action_map:
                        startActivity(new Intent(getApplicationContext(), MapActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }

        });

    }
}
