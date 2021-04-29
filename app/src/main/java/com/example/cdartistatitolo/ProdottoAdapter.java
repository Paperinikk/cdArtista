package com.example.cdartistatitolo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ProdottoAdapter extends ArrayAdapter<Prodotto> {


    public ProdottoAdapter(@NonNull Context context, int resource, @NonNull List<Prodotto> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.row_layout, null);
        TextView textViewCd = (TextView)convertView .findViewById(R.id.txtCd);
        TextView textViewArtista = (TextView)convertView .findViewById(R.id.txtArtista);
        TextView textViewAnno = (TextView)convertView .findViewById(R.id.txtAnno);
        TextView textViewPrezzo = (TextView)convertView .findViewById(R.id.txtPrezzo);
        Prodotto p = getItem(position);
        textViewCd.setText(p.getCd());
        textViewArtista.setText("Artista: " + p.getArtista());
        textViewAnno.setText("Anno di pubblicazione: " + p.getAnno());
        textViewPrezzo.setText("Prezzo: " + p.getPrezzo());
        return convertView;
    }
}
