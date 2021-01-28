package com.example;

import android.content.Context;

public class Pozycja_table {
    private String IDPozycja;
    private String CenaProduktu;
    private String Ilosc;
    private String Produkt;
    private String Nazwa;

    public static String database_table2 = "Lista";

    public static final String KEY_IDPOZYCJA = "IDPozycja";
    public static final String KEY_CENAPRODUKTU = "CenaProduktu";
    public static final String KEY_ILOSC = "Ilosc";
    public static final String KEY_PRODUKT = "Produkt";
    public static final String KEY_NAZWA = "Nazwa";


    public Pozycja_table(String idpozycja, String cenaProduktu, String ilosc, String produkt, String nazwa,  Context context) {

        IDPozycja = idpozycja;

        CenaProduktu = cenaProduktu;
        Ilosc = ilosc;
        Produkt = produkt;
        Nazwa = nazwa;


    }

    public String getIDPozycja() {
        return IDPozycja;
    }

    public void setIDPozycja(String IDPozycja) {
        this.IDPozycja = IDPozycja;
    }

    public String getCenaProduktu() {
        return CenaProduktu;
    }

    public void setCenaProduktu(String cenaProduktu) {
        CenaProduktu = cenaProduktu;
    }

    public String getIlosc() {
        return Ilosc;
    }

    public void setIlosc(String ilosc) {
        Ilosc = ilosc;
    }

    public String getProdukt() {
        return Produkt;
    }

    public void setProdukt(String produkt) {
        Produkt = produkt;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }
}
