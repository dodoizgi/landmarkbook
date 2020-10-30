package com.dodo.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DeatailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deatail);

        ImageView imageView = findViewById(R.id.imageView);
        TextView landmarkNameText = findViewById(R.id.landmarkNameText);
        TextView CountryNameText= findViewById(R.id.CountryNameText);

        Intent intent = getIntent();
        String landmarkName = intent.getStringExtra("name");
        landmarkNameText.setText(landmarkName);

        String countryName = intent.getStringExtra("country");
        CountryNameText.setText(countryName);

        Singelton singelton = Singelton.getInstance();
        imageView.setImageBitmap(singelton.getChoosenImage());

    }
}
