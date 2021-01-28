package com.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;;
import com.example.pz1.R;


public class Kategorie extends AppCompatActivity {
String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategorie);
        setTitle("Kategorie");

        name = getIntent().getStringExtra("name");

        findViewById(R.id.przyciskNabial).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(
                                Kategorie.this, Nabial.class);
                        intent.putExtra("name", name);
                        startActivityForResult(intent, 1);
                    }
                });
        findViewById(R.id.przyciskPieczywo).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(
                                Kategorie.this, Pieczywo.class);
                        intent.putExtra("name", name);
                        startActivityForResult(intent, 1);
                    }
                });
        findViewById(R.id.przyciskWarzywa).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(
                                Kategorie.this, Warzywa.class);
                        intent.putExtra("name", name);
                        startActivityForResult(intent, 1);
                    }
                });
        findViewById(R.id.przyciskOwoce).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(
                                Kategorie.this, Owoce.class);
                        intent.putExtra("name", name);
                        startActivityForResult(intent, 1);
                    }
                });
        findViewById(R.id.przyciskMieso).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(
                                Kategorie.this, Mieso.class);
                        intent.putExtra("name", name);
                        startActivityForResult(intent, 1);
                    }
                });
        findViewById(R.id.przyciskNapoje).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(
                                Kategorie.this, Napoje.class);
                        intent.putExtra("name", name);
                        startActivityForResult(intent, 1);
                    }
                });
        findViewById(R.id.przyciskSlodycze).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(
                                Kategorie.this, Slodycze.class);
                        intent.putExtra("name", name);
                        startActivityForResult(intent, 1);
                    }
                });
        findViewById(R.id.przyciskPielegnacja).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(
                                Kategorie.this, Pielegnacja.class);
                        intent.putExtra("name", name);
                        startActivityForResult(intent, 1);
                    }
                });
        findViewById(R.id.przyciskZiola).setOnClickListener(
                new android.view.View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(
                                Kategorie.this, Ziola.class);
                        intent.putExtra("name", name);
                        startActivityForResult(intent, 1);
                    }
                });
    }
}
