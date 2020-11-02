package com.piysocial.cse_b.ui.resources;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.piysocial.cse_b.R;

public class leesonplans extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leesonplans);
        //lp is written as ls.
        Button lpcsw1 = findViewById(R.id.lscsw1);
        Button lpdl =findViewById(R.id.lsdl);
        Button lpala =findViewById(R.id.lsala);
        Button lpps =findViewById(R.id.lsps);
        Button lpesdm =findViewById(R.id.lsesdm);
        Button lppme =findViewById(R.id.lspme);
        lpcsw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.leesonplans.this, lpcsw1.class);
                startActivity(intent);
            }
        });
        lpdl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.leesonplans.this, lpdl.class);
                startActivity(intent);
            }
        });
        lpala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.leesonplans.this, lpala.class);
                startActivity(intent);
            }
        });
        lpps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.leesonplans.this, lpps.class);
                startActivity(intent);
            }
        });
        lpesdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.leesonplans.this, lpesdm.class);
                startActivity(intent);
            }
        });
        lppme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.leesonplans.this, lppme.class);
                startActivity(intent);
            }
        });
    }
}