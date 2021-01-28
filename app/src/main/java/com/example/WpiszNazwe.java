package com.example;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import com.example.pz1.R;

/**
 * Okno dialogowe umożliwiające nadanie nazwy liście
 */
public class WpiszNazwe extends AppCompatDialogFragment  {
    private EditText editTextCena;

    private ExampleDialogListener listener;
    /**
     *  Metoda używana do inicjalizacji okna dialogowego.
     * @param savedInstanceState argumenty dialogowe
     * @return dialog
     */
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.activity_wpisz_nazwe, null);

        builder.setView(view)
                .setTitle("Podaj nazwę listy")
                .setNegativeButton("ANULUJ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                })
                .setPositiveButton("OKEJ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String name = editTextCena.getText().toString();
                        listener.applyTexts(name);
                    }
                });
        editTextCena = view.findViewById(R.id.wpiszNazwe);
        return builder.create();
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            listener = (ExampleDialogListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() +
                    "must implement ExampleDialogListener");
        }
    }
    /**
     * Interfejs przekazujący wpisaną nazwę klasie listaZakupów
     */
    public interface ExampleDialogListener {
        void applyTexts( String name);
    }
}