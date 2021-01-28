package com.example;

import android.content.Context;

public class Kategoria_table {
    private String IDKategoria;
    private String KategoriaProduktu;

    public static String database_table3 = "Kategoria";

    public static final String KEY_KATEGORIAID = "IDKategoria";
    public static final String KEY_KATEGORIAPRODUKTU = "KategoriaProduktu";


    public Kategoria_table(String idkategoria, String kategoriaProduktu,  Context context) {

        IDKategoria = idkategoria;
        KategoriaProduktu = kategoriaProduktu;
    }

    public String getIDKategoria() {
        return IDKategoria;
    }

    public void setIDKategoria(String IDKategoria) {
        this.IDKategoria = IDKategoria;
    }

    public String getKategoriaProduktu() {
        return KategoriaProduktu;
    }

    public void setKategoriaProduktu(String kategoriaProduktu) {
        KategoriaProduktu = kategoriaProduktu;
    }
}
