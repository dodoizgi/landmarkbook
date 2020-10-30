package com.dodo.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.ListView);

        //DATA

        final ArrayList<String> landmarknames = new ArrayList<>();
        landmarknames.add("GALATA");
        landmarknames.add("SAAT_KULESİ");
        landmarknames.add("SUR");
        landmarknames.add("MALTA");

        final ArrayList<String> countryNames = new ArrayList<>();
        countryNames.add("İSTANBUL");
        countryNames.add("İZMİR");
        countryNames.add("DİYARBAKIR");
        countryNames.add("MALTA");


        Bitmap GALATA = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.galata);
        Bitmap SAAT_KULESİ = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.saat);
        Bitmap SUR = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.sur);
        Bitmap MALTA = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.malta);

        final ArrayList<Bitmap> landmarkimages = new ArrayList<>();

        landmarkimages.add(GALATA);
        landmarkimages.add(SAAT_KULESİ);
        landmarkimages.add(SUR);
        landmarkimages.add(MALTA);


        //ArrayList

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarknames);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                //System.out.println(landmarknames.get(position));
                //System.out.println(countryNames.get(position));

                Intent intent = new Intent(getApplicationContext(),DeatailActivity.class);
                intent.putExtra("name",landmarknames.get(position));
                intent.putExtra("country",countryNames.get(position));
                Singelton singelton = Singelton.getInstance();
                singelton.setChoosenImage(landmarkimages.get(position));


                startActivity(intent);
            }
        });

    }

}
