package com.piysocial.cse_b.ui.resources;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.piysocial.cse_b.R;

public class solutions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solutions);
        Button scsw1 = findViewById(R.id.scsw1);
        Button sdl =findViewById(R.id.sdl);
        Button sala =findViewById(R.id.sala);
        Button sps =findViewById(R.id.sps);
        Button sesdm =findViewById(R.id.sesdm);
        Button spme =findViewById(R.id.spme);
        scsw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.solutions.this, scsw1.class);
                startActivity(intent);
            }
        });
        sdl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.solutions.this, sdl.class);
                startActivity(intent);
            }
        });
        sala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.solutions.this, sala.class);
                startActivity(intent);
            }
        });
        sps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.solutions.this, sps.class);
                startActivity(intent);
            }
        });
        sesdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.solutions.this, sesdm.class);
                startActivity(intent);
            }
        });
        spme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.solutions.this, spme.class);
                startActivity(intent);
            }
        });
    }
}