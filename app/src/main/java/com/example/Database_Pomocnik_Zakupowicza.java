package com.example;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database_Pomocnik_Zakupowicza extends SQLiteOpenHelper {
    public static final String database_name = "Pomocnik_Zakupowicza5";
    private Context c;

    public Database_Pomocnik_Zakupowicza(Context context) {
        super(context, database_name, null, 1);
        SQLiteDatabase db = this.getReadableDatabase();
        this.c = context;

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE_PRODUKT = "CREATE TABLE " + Produkt_table.database_table1 + "("
                + Produkt_table.KEY_PRODUKTID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Produkt_table.KEY_NAZWAPRODUKTU + " TEXT, "
                + Produkt_table.KEY_KATEGORIAPRODUKTU + " INTEGER, "
                + " FOREIGN KEY (" + Produkt_table.KEY_KATEGORIAPRODUKTU  + ") REFERENCES " + Kategoria_table.database_table3 + " (" + Kategoria_table.KEY_KATEGORIAID + "))";

        String CREATE_TABLE_POZYCJA = "CREATE TABLE " + Pozycja_table.database_table2 + "("
                + Pozycja_table.KEY_IDPOZYCJA + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Pozycja_table.KEY_PRODUKT + " INTEGER, "
                + Pozycja_table.KEY_ILOSC + " INTEGER, "
                + Pozycja_table.KEY_CENAPRODUKTU + " INTEGER, "
                + Pozycja_table.KEY_NAZWA + " TEXT, "
                + " FOREIGN KEY (" + Pozycja_table.KEY_PRODUKT  + ") REFERENCES " + Produkt_table.database_table1 + " (" + Produkt_table.KEY_PRODUKTID + " ))";

        String CREATE_TABLE_KATEGORIA = "CREATE TABLE " + Kategoria_table.database_table3 + "("
                + Kategoria_table.KEY_KATEGORIAID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Kategoria_table.KEY_KATEGORIAPRODUKTU + " TEXT )";



        db.execSQL(CREATE_TABLE_PRODUKT);
        db.execSQL(CREATE_TABLE_POZYCJA);
        db.execSQL(CREATE_TABLE_KATEGORIA);

        dodaj_kategorie("Nabial",db);
        dodaj_kategorie("Pieczywo",db);
        dodaj_kategorie("Warzywa",db);
        dodaj_kategorie("Owoce",db);
        dodaj_kategorie("Mieso",db);
        dodaj_kategorie("Napoje",db);
        dodaj_kategorie("Slodycze",db);
        dodaj_kategorie("Pielegnacja",db);
        dodaj_kategorie("Ziola",db);
        dodaj_produkt("Mleko",0,db);
        dodaj_produkt("Ser bialy",0,db);
        dodaj_produkt("Jajka",0,db);
        dodaj_produkt("Jogurt",0,db);
        dodaj_produkt("Maslanka",0,db);
        dodaj_produkt("Ser zolty",0,db);
        dodaj_produkt("Serek wiejski",0,db);
        dodaj_produkt("Bagietka ciemna",1,db);
        dodaj_produkt("Bagietka jasna",1,db);
        dodaj_produkt("Kajzerka",1,db);
        dodaj_produkt("Bulka jasna",1,db);
        dodaj_produkt("Bulka ciemna",1,db);
        dodaj_produkt("Chleb jasny",1,db);
        dodaj_produkt("Chleb ciemny",1,db);
        dodaj_produkt("Ziemniaki",2,db);
        dodaj_produkt("Salata",2,db);
        dodaj_produkt("Marchewka",2,db);
        dodaj_produkt("Cebula",2,db);
        dodaj_produkt("Papryka",2,db);
        dodaj_produkt("Kukurydza",2,db);
        dodaj_produkt("Baklazan",2,db);
        dodaj_produkt("Jablko",3,db);
        dodaj_produkt("Banan",3,db);
        dodaj_produkt("Pomarancza",3,db);
        dodaj_produkt("Kiwi",3,db);
        dodaj_produkt("Ananas",3,db);
        dodaj_produkt("Winogrono",3,db);
        dodaj_produkt("Cytryna",3,db);
        dodaj_produkt("Kurczak",4,db);
        dodaj_produkt("Ges",4,db);
        dodaj_produkt("Indyk",4,db);
        dodaj_produkt("Jagniecina",4,db);
        dodaj_produkt("Kaczka",4,db);
        dodaj_produkt("Wieprzowina",4,db);
        dodaj_produkt("Wolowina",4,db);
        dodaj_produkt("Woda mineralna",5,db);
        dodaj_produkt("Oranzada",5,db);
        dodaj_produkt("Sok jablkowy",5,db);
        dodaj_produkt("Piwo",5,db);
        dodaj_produkt("Herbata",5,db);
        dodaj_produkt("Kawa",5,db);
        dodaj_produkt("Lemoniada",5,db);
        dodaj_produkt("Baton",6,db);
        dodaj_produkt("Chipsy",6,db);
        dodaj_produkt("Ciastka",6,db);
        dodaj_produkt("Cukierki",6,db);
        dodaj_produkt("Czekolada",6,db);
        dodaj_produkt("Herbatniki",6,db);
        dodaj_produkt("Krakersy",6,db);
        dodaj_produkt("Szampon",7,db);
        dodaj_produkt("Mydlo",7,db);
        dodaj_produkt("Balasam",7,db);
        dodaj_produkt("Krem",7,db);
        dodaj_produkt("Domestos",7,db);
        dodaj_produkt("Papier toaletowy",7,db);
        dodaj_produkt("Husteczki",7,db);
        dodaj_produkt("Bazylia",8,db);
        dodaj_produkt("Chili",8,db);
        dodaj_produkt("Cukier",8,db);
        dodaj_produkt("Bulion",8,db);
        dodaj_produkt("Czosnek",8,db);
        dodaj_produkt("Ketchup",8,db);
        dodaj_produkt("Kurkuma",8,db);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(" DROP TABLE IF EXISTS " + Produkt_table.database_table1);
        onCreate(db);
        db.execSQL(" DROP TABLE IF EXISTS " + Pozycja_table.database_table2);
        onCreate(db);
        db.execSQL(" DROP TABLE IF EXISTS " + Kategoria_table.database_table3);
        onCreate(db);
    }
    //Metody wyswietlajace
    public SQLiteCursor pobierz_kategorie(){
        SQLiteDatabase db = this.getReadableDatabase();//pobiera baze danych
        SQLiteCursor kursor =(SQLiteCursor) db.rawQuery("SELECT * FROM " + Kategoria_table.database_table3, null);
        return kursor;
    }
    public SQLiteCursor pobierz_produkt(){
        SQLiteDatabase db = this.getReadableDatabase();//pobiera baze danych
        SQLiteCursor kursor =(SQLiteCursor) db.rawQuery("SELECT * FROM " + Produkt_table.database_table1, null);
        return kursor;
    }

    public SQLiteCursor pobierz_liste(){
        SQLiteDatabase db = this.getReadableDatabase();//pobiera baze danych
        SQLiteCursor kursor =(SQLiteCursor) db.rawQuery("SELECT * FROM " + Pozycja_table.database_table2, null);
        return kursor;
    }


    //metody wstawiajace dane do np. TextEdit po przypisaniu ich
    public boolean wstaw_produkt(String nazwa_produktu, String kategoria) {
        SQLiteDatabase db = this.getReadableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("NazwaProduktu", nazwa_produktu);
        cv.put("KategoriaProduktu", kategoria);
        if (db.insert(Produkt_table.database_table1, null, cv) == -1) {
            return false;
        } else {
            return true;
        }
    }


    public boolean wstaw_pozycja(int cena_produktu, int ilosc, int nazwa_produktu, String nazwa_listy) {
        SQLiteDatabase db = this.getReadableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("CenaProduktu", cena_produktu);
        cv.put("Ilosc", ilosc);
        cv.put("Produkt", nazwa_produktu);
        cv.put("Nazwa", nazwa_listy);
        if (db.insert(Pozycja_table.database_table2, null, cv) == -1) {
            return false;
        } else {
            return true;
        }
    }

    public boolean aktualizuj_pozycja(String id, int cena_produktu, int ilosc, String nazwa_produktu, String nazwa_listy) {
        SQLiteDatabase db = this.getReadableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("IDPozycja",id);
        cv.put("CenaProduktu", cena_produktu);
        cv.put("Ilosc", ilosc);
        cv.put("Produkt", nazwa_produktu);
        cv.put("Nazwa", nazwa_listy);
        if (db.update(Pozycja_table.database_table2, cv, "Produkt = ? and Nazwa = ?", new String[]{nazwa_produktu,nazwa_listy}) == -1) {
            return false;
        } else {
            return true;
        }
    }

    public boolean wstaw_kategoria(String kategoria_produktu) {
        SQLiteDatabase db = this.getReadableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("KategoriaProduktu", kategoria_produktu);
        if (db.insert(Kategoria_table.database_table3, null, cv) == -1) {
            return false;
        } else {
            return true;
        }
    }


    public void dodaj_kategorie(String nazwa, SQLiteDatabase db){

        ContentValues cv = new ContentValues();
        cv.put("KategoriaProduktu", nazwa);
        db.insert(Kategoria_table.database_table3, null, cv);
    }

    public void dodaj_produkt(String nazwa, int kategoria, SQLiteDatabase db){

        ContentValues cv = new ContentValues();
        cv.put("NazwaProduktu", nazwa);
        cv.put("KategoriaProduktu", kategoria);
        db.insert(Produkt_table.database_table1, null, cv);
    }

    //wyszukaj produkt w bazie - id
    public SQLiteCursor wyszukaj_produkt (String nazwa){
        SQLiteDatabase db = this.getReadableDatabase();//pobiera baze danych
       // if(klasa==)

        SQLiteCursor kursor =(SQLiteCursor) db.rawQuery("SELECT * FROM " + Produkt_table.database_table1 + " where NazwaProduktu = '" + nazwa +"'", null);
        return kursor;
    }

    //wyszukaj produkt w bazie - nazwa
    public SQLiteCursor wyszukaj_nazweProduktu (String id){
        SQLiteDatabase db = this.getReadableDatabase();//pobiera baze danych
        SQLiteCursor kursor =(SQLiteCursor) db.rawQuery("SELECT * FROM " + Produkt_table.database_table1 + " where IDProduktu = '" + id +"'", null);
        return kursor;
    }

    //wyszukaj liste
    public SQLiteCursor wyszukaj_liste (String nazwa){
        SQLiteDatabase db = this.getReadableDatabase();//pobiera baze danych
        SQLiteCursor kursor =(SQLiteCursor) db.rawQuery("SELECT * FROM " + Pozycja_table.database_table2 + " where Nazwa = '" + nazwa +"'", null);
        return kursor;
    }

    //pogrupuj tytuły
    public SQLiteCursor grupuj_tytuly (){
        SQLiteDatabase db = this.getReadableDatabase();//pobiera baze danych
        SQLiteCursor kursor =(SQLiteCursor) db.rawQuery("SELECT Nazwa, COUNT(IDPOZYCJA) FROM " + Pozycja_table.database_table2 + " GROUP BY Nazwa", null);
        return kursor;
    }

    public SQLiteCursor policz (String nazwa){
        SQLiteDatabase db = this.getReadableDatabase();//pobiera baze danych
        SQLiteCursor kursor =(SQLiteCursor) db.rawQuery("SELECT COUNT(IDPOZYCJA) FROM " + Pozycja_table.database_table2 + " GROUP BY Nazwa", null);
        return kursor;
    }

}

