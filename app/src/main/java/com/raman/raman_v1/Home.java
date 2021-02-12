package com.raman.raman_v1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cardListening();
    }

    private void cardListening(){
        CardView card_view_accelerator = (CardView) findViewById(R.id.card_view_accelerator);
        card_view_accelerator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainBar.fragmentEnum = MainBar.FragmentEnum.ACCELERATION;
                startActivity(new Intent(Home.this, MainBar.class));
                finish();
            }
        });

        CardView card_view_international = (CardView) findViewById(R.id.card_view_international);
        card_view_international.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainBar.fragmentEnum = MainBar.FragmentEnum.INTERNATIONAL;
                startActivity(new Intent(Home.this, MainBar.class));
                finish();
            }
        });

        CardView card_view_education = (CardView) findViewById(R.id.card_view_education);
        card_view_education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainBar.fragmentEnum = MainBar.FragmentEnum.EDUCTION;
                startActivity(new Intent(Home.this, MainBar.class));
                finish();
            }
        });

    }
}
