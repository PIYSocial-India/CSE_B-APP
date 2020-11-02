package com.piysocial.cse_b.ui.resources;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.piysocial.cse_b.R;

public class notes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        Button ncsw1 = findViewById(R.id.ncsw1);
        Button ndl =findViewById(R.id.ndl);
        Button nala =findViewById(R.id.nala);
        Button nps =findViewById(R.id.nps);
        Button nesdm =findViewById(R.id.nesdm);
        Button npme =findViewById(R.id.npme);
        ncsw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.notes.this, notescsw1.class);
                startActivity(intent);
            }
        });
        ndl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.notes.this, notesdl.class);
                startActivity(intent);
            }
        });
        nala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.notes.this, notesala.class);
                startActivity(intent);
            }
        });
        nps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.notes.this, notesps.class);
                startActivity(intent);
            }
        });
        nesdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.notes.this, notesesdm.class);
                startActivity(intent);
            }
        });
        npme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.notes.this, notespme.class);
                startActivity(intent);
            }
        });
    }
}