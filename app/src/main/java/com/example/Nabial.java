package com.example;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.pz1.R;

public class Nabial extends AppCompatActivity {
    public int liczbaJajek=0;
    public int liczbaMleka=0;
    public int liczbaSera_b=0;
    public int liczbaJogurtu_n=0;
    public int liczbaMaslanka=0;
    public int liczbaSer_z=0;
    public int liczbaSer_w=0;
    String lista="";

    private TextView jajo, mleko, ser_b,jogurt_n,maslanka, ser_z, ser_w;
  //  private Button dodajNowy;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nabial);
        setTitle("Nabiał");
        lista = getIntent().getStringExtra("name");

        if(lista == null) lista="";

        findViewById(R.id.dodajMleko).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        liczbaMleka++;
                        mleko=findViewById(R.id.ileMleka);
                        mleko.setText("ilosc: " + liczbaMleka);
                    }
                });
        findViewById(R.id.usunMleko).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        liczbaMleka--;
                        mleko=findViewById(R.id.ileMleka);
                        if(liczbaMleka<1) mleko.setText("");
                        else mleko.setText("ilosc: " + liczbaMleka);
                    }
                });
        findViewById(R.id.dodajSer_b).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        liczbaSera_b++;
                        ser_b=findViewById(R.id.ileSera_b);
                        ser_b.setText("ilosc: " + liczbaSera_b);
                    }
                });
        findViewById(R.id.usunSer_b).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        liczbaSera_b--;
                        ser_b=findViewById(R.id.ileSera_b);
                        if(liczbaSera_b<1) ser_b.setText("");
                        else ser_b.setText("ilosc: " + liczbaSera_b);
                    }
                });
        findViewById(R.id.dodajJajka).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        liczbaJajek++;
                        jajo=findViewById(R.id.ileJajek);
                        jajo.setText("ilosc: " + liczbaJajek);
                    }
                });
        findViewById(R.id.usunJajka).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        liczbaJajek--;
                        jajo=findViewById(R.id.ileJajek);
                        if(liczbaJajek<1) jajo.setText("");
                        else jajo.setText("ilosc: " + liczbaJajek);
                    }
                });

        findViewById(R.id.dodajJogurt).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        liczbaJogurtu_n++;
                        jogurt_n=findViewById(R.id.ile_jogurt);
                        jogurt_n.setText("ilosc: " + liczbaJogurtu_n);
                    }
                });
        findViewById(R.id.usunJogurt).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        liczbaJogurtu_n--;
                        jogurt_n=findViewById(R.id.ile_jogurt);
                        if(liczbaJogurtu_n<1) jogurt_n.setText("");
                        else jogurt_n.setText("ilosc: " + liczbaJogurtu_n);
                    }
                });

        findViewById(R.id.dodajMaslanka).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        liczbaMaslanka++;
                       maslanka=findViewById(R.id.ile_maslanka);
                        maslanka.setText("ilosc: " + liczbaMaslanka);
                    }
                });
        findViewById(R.id.usunMaslanka).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        liczbaMaslanka--;
                        maslanka=findViewById(R.id.ile_maslanka);
                        if(liczbaMaslanka<1) maslanka.setText("");
                        else maslanka.setText("ilosc: " + liczbaMaslanka);
                    }
                });

        findViewById(R.id.dodaj_ser_z).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        liczbaSer_z++;
                        ser_z=findViewById(R.id.ile_ser_z);
                        ser_z.setText("ilosc: " + liczbaSer_z);
                    }
                });
        findViewById(R.id.usun_ser_z).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        liczbaSer_z--;
                        ser_z=findViewById(R.id.ile_ser_z);
                        if(liczbaSer_z<1) ser_z.setText("");
                        else ser_z.setText("ilosc: " + liczbaSer_z);
                    }
                });

        findViewById(R.id.dodaj_serek_w).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        liczbaSer_w++;
                        ser_w=findViewById(R.id.ile_serek_w);
                        ser_w.setText("ilosc: " + liczbaSer_w);
                    }
                });
        findViewById(R.id.usun_serek_w).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        liczbaSer_w--;
                        ser_w=findViewById(R.id.ile_serek_w);
                        if(liczbaSer_w<1) ser_w.setText("");
                        else ser_w.setText("ilosc: " + liczbaSer_w);
                    }
                });




        findViewById(R.id.zatwierdz).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(Nabial.this, listaZakupow.class);
                        if(liczbaMleka!=0) lista= lista + liczbaMleka+ ";Mleko;0;0\n";
                        if(liczbaSera_b!=0) lista= lista + liczbaSera_b+ ";Ser bialy;0;0\n";
                        if(liczbaJajek!=0) lista= lista + liczbaJajek+ ";Jajka;0;0\n";
                        if(liczbaJogurtu_n!=0) lista= lista + liczbaJogurtu_n+ ";Jogurt;0;0\n";
                        if(liczbaMaslanka!=0) lista= lista + liczbaMaslanka+ ";Maslanka;0;0\n";
                        if(liczbaSer_z!=0) lista= lista + liczbaSer_z+ ";Ser zolty;0;0\n";
                        if(liczbaSer_w!=0) lista= lista + liczbaSer_w+ ";Serek wiejski;0;0\n";

                        intent.putExtra("name", lista);
                        intent.putExtra("klasa", "Nabial");
                        startActivityForResult(intent, 1);
                    }
                });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}

