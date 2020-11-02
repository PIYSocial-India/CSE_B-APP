package com.piysocial.cse_b.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.piysocial.cse_b.R;
import com.piysocial.cse_b.SplashScreen;
import com.piysocial.cse_b.ui.details.detailsViewModel;

public class HomeFragment extends Fragment {
    private HomeViewModel homeViewModel;
    @Override
    public View onCreateView( LayoutInflater inflater,
                              ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        Button ttmonday_btn1 = (Button) root.findViewById(R.id.ttmonday_btn1);
        Button tttuesday_btn2 = (Button) root.findViewById(R.id.tttuesday_btn2);
        Button ttwednesday_btn3 = (Button) root.findViewById(R.id.ttwednesday_btn3);
        Button ttthrusday_btn4 = (Button) root.findViewById(R.id.ttthrusday_btn4);
        Button ttfriday_btn5 = (Button) root.findViewById(R.id.ttfriday_btn5);
        Button ttsaturday_btn6 = (Button) root.findViewById(R.id.ttsaturday_btn6);
        ttmonday_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ttmonday.class);
                startActivity(intent);
            }
        });
        tttuesday_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),tttuesday.class);
                startActivity(intent);
            }
        });
        ttwednesday_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ttwednesday.class);
                startActivity(intent);
            }
        });
        ttthrusday_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ttthrusday.class);
                startActivity(intent);
            }
        });
        ttfriday_btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ttfriday.class);
                startActivity(intent);
            }
        });
        ttsaturday_btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ttsaturday.class);
                startActivity(intent);
            }
        });
        return root;
    }
}