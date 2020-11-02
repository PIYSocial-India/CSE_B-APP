package com.piysocial.cse_b.ui.resources;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.piysocial.cse_b.R;

public class questionpapers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionpapers);
        Button qpcsw1 = findViewById(R.id.qpcsw1);
        Button qpdl =findViewById(R.id.qpdl);
        Button qpala =findViewById(R.id.qpala);
        Button qpps =findViewById(R.id.qpps);
        Button qpesdm =findViewById(R.id.qpesdm);
        Button qppme =findViewById(R.id.qppme);
        qpcsw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.questionpapers.this, qpcsw1.class);
                startActivity(intent);
            }
        });
        qpdl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.questionpapers.this, qpdl.class);
                startActivity(intent);
            }
        });
        qpala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.questionpapers.this, qpala.class);
                startActivity(intent);
            }
        });
        qpps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.questionpapers.this, qpps.class);
                startActivity(intent);
            }
        });
        qpesdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.questionpapers.this, qpesdm.class);
                startActivity(intent);
            }
        });
        qppme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.piysocial.cse_b.ui.resources.questionpapers.this, qppme.class);
                startActivity(intent);
            }
        });
    }
}