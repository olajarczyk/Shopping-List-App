package com.example;

import android.content.Context;

public class Produkt_table {
    private String IDProduktu;
    private String NazwaProduktu;
    private String KategoriaProduktu;


    public static String database_table1 = "Produkt";

    public static final String KEY_PRODUKTID = "IDProduktu";
    public static final String KEY_NAZWAPRODUKTU = "NazwaProduktu";
    public static final String KEY_KATEGORIAPRODUKTU = "KategoriaProduktu";



    public Produkt_table(String idproduktu, String nazwaProduktu, String kategoriaProduktu, Context context) {

        IDProduktu = idproduktu;
        NazwaProduktu = nazwaProduktu;
        KategoriaProduktu = kategoriaProduktu;


    }

    public String getIDProduktu() {
        return IDProduktu;
    }

    public void setIDProduktu(String IDProduktu) {
        this.IDProduktu = IDProduktu;
    }

    public String getNazwaProduktu() {
        return NazwaProduktu;
    }

    public void setNazwaProduktu(String nazwaProduktu) {
        NazwaProduktu = nazwaProduktu;
    }

    public String getKategoriaProduktu() {
        return KategoriaProduktu;
    }

    public void setKategoriaProduktu(String kategoriaProduktu) {
        KategoriaProduktu = kategoriaProduktu;
    }

}

