package com.example;


import android.content.Intent;
import android.database.sqlite.SQLiteCursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import com.example.pz1.R;

/**
 * Klasa wyświetlająca artykuły, które dodano do listy. Pozwala zapisać listę w tym momencie, lub dodać do niej kolejne artykuły z innych kategorii i dopiero wtedy zapisać.
 */
public class listaZakupow extends AppCompatActivity implements WpiszNazwe.ExampleDialogListener{
    TextView lista;
    private TextView NazwaListy;
    TextView nazwa1;
    String tytul="";
    String listazakupow, klasa;
    private ImageButton button;
    String t1="";
    Database_Pomocnik_Zakupowicza db;
    static final String [][] t2= new String[100][3];
    /**
     * Metoda używana do inicjalizacji składników aktywności. Definiuje interfejs użytkownika za pomocą setContentView(). W metodzie zaimplementowano interfejs onClickListener pozwalający na przechwytywanie prostych zdarzeń związanych z dotknięciem ekranu. Dzięki temu po przyciśnięciu na przyciski zostana uruchomione aktywności do nich przypisane.
     * @param savedInstanceState odniesienie do obiektu Bundle
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_zakupow);

        listazakupow = getIntent().getStringExtra("name");
        klasa = getIntent().getStringExtra("klasa");
        final String[] tabela = listazakupow.split("\n");
        for (int i = 0; i < tabela.length; i++) {
            lista=findViewById(R.id.lista);
            t2[i]= tabela[i].split(";");
            t1=t1+"\n"+ t2[i][0] + " x "+ t2[i][1];
        }
        lista.setText(t1);
        db=new Database_Pomocnik_Zakupowicza(this);

        findViewById(R.id.powrotKategorie).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(listaZakupow.this, Kategorie.class);
                        intent.putExtra("name", listazakupow);
                        startActivityForResult(intent, 1);
                    }
                });
        findViewById(R.id.anulujListe).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(listaZakupow.this, Kategorie.class);
                        listazakupow="";
                        intent.putExtra("name", listazakupow);
                        startActivityForResult(intent, 1);
                    }
                });


        NazwaListy= (TextView) findViewById(R.id.nazwaListy);

        button = (ImageButton) findViewById(R.id.nazwijListe);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });

        findViewById(R.id.zapiszListe).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {


                        nazwa1 = (TextView) findViewById(R.id.nazwaListy);
                        tytul = nazwa1.getText().toString();

                        //ZAPIS DO BAZY
                        for (int i = 0; i < tabela.length; i++) {
                            boolean czySieUdalo;
                            SQLiteCursor kursor = db.wyszukaj_produkt(t2[i][1]);
                            if (kursor.moveToFirst()) {
                                String na = kursor.getString(0);
                                int nazwa = Integer.parseInt(na);
                                czySieUdalo = db.wstaw_pozycja(Integer.parseInt(t2[i][2]), Integer.parseInt(t2[i][0]), nazwa, tytul);
                                if (czySieUdalo) {
                                   // Toast.makeText(listaZakupow.this, "Udało się " + i, Toast.LENGTH_LONG).show();
                                }
                                else {
                                    Toast.makeText(listaZakupow.this, "Błąd! Nie udało się dodać listy", Toast.LENGTH_LONG).show();
                                }
                            }
                        }
                        Intent intent = new Intent(listaZakupow.this, wszystkieListy.class);
                        startActivityForResult(intent, 1);
                    }
                });

    }


    /**
     * Metoda otwierająca okno dialogowe, które umożliwia nadanie nazwy liście
     */
    public void openDialog() {
        WpiszNazwe exampleDialog = new WpiszNazwe();
        exampleDialog.show(getSupportFragmentManager(),"");
    }
    /**
     * Metoda zatwierdzająca wpisaną w oknie dialogowym nazwę listy
     * @param name nazwa listy
     */
    public void applyTexts(String name) {
        String total2 = String.valueOf(name);
        NazwaListy.setText(total2);
    }




}