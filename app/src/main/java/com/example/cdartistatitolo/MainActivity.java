package com.example.cdartistatitolo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Prodotto> prodotti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listViewDemo);


        prodotti = new LinkedList<Prodotto>();
        prodotti.add(new Prodotto(1, "American Idiot", "Green Day", "2008", "|| 20 $ ||" ));
        prodotti.add(new Prodotto(2, "Vita Vera", "Tedua", "2020", "|| 25 $ ||" ));
        prodotti.add(new Prodotto(3, "Scorpion", "Drake", "2018", "|| 15 $ ||" ));
        prodotti.add(new Prodotto(4, "Mowgli", "Tedua", "2018", "|| 27 $ ||" ));
        prodotti.add(new Prodotto(5, "Scialla Semper", "Massimo Pericolo", "2020", "|| 18 $ ||" ));
        prodotti.add(new Prodotto(6, "Cd Pezzotto di Nino D'angelo", "Nino D'angelo", "1996", "|| 5 $ ||" ));


        ProdottoAdapter adapter = new ProdottoAdapter(this, R.layout.row_layout, prodotti);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Price: " + prodotti.get(position).getPrezzo(), Toast.LENGTH_LONG).show();
            }
        });





    }
}