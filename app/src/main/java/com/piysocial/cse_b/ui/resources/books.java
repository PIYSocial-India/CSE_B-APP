package com.piysocial.cse_b.ui.resources;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdView;
import com.piysocial.cse_b.R;

public class books extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        Button bkcsw1 = findViewById(R.id.bkcsw1);
        Button bkdl =findViewById(R.id.bkdl);
        Button bkala =findViewById(R.id.bkala);
        Button bkps =findViewById(R.id.bkps);
        Button bkesdm =findViewById(R.id.bkesdm);
        Button bkpme =findViewById(R.id.bkpme);
        bkcsw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.books.this, bookscsw1.class);
                startActivity(intent);
            }
        });
        bkdl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.books.this, booksdl.class);
                startActivity(intent);
            }
        });
        bkala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.books.this, booksala.class);
                startActivity(intent);
            }
        });
        bkps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.books.this, booksps.class);
                startActivity(intent);
            }
        });
        bkesdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.books.this, booksesdm.class);
                startActivity(intent);
            }
        });
        bkpme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.books.this, bookspme.class);
                startActivity(intent);
            }
        });
    }
}