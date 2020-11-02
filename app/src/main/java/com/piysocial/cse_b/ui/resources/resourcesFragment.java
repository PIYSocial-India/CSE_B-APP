package com.piysocial.cse_b.ui.resources;

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
import com.piysocial.cse_b.ui.details.detailsViewModel;
import com.piysocial.cse_b.ui.home.ttfriday;
import com.piysocial.cse_b.ui.home.ttmonday;
import com.piysocial.cse_b.ui.home.ttsaturday;
import com.piysocial.cse_b.ui.home.ttthrusday;
import com.piysocial.cse_b.ui.home.tttuesday;
import com.piysocial.cse_b.ui.home.ttwednesday;

public class resourcesFragment extends Fragment {

    private resourcesViewModel resourcesViewModel;
    @Override
    public View onCreateView( LayoutInflater inflater,
                              ViewGroup container, Bundle savedInstanceState) {
        resourcesViewModel =
                ViewModelProviders.of(this).get(resourcesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_resources, container, false);

        Button notes = (Button) root.findViewById(R.id.notes);
        Button lessonplans = (Button) root.findViewById(R.id.lessonplans);
        Button books = (Button) root.findViewById(R.id.books);
        Button questionpapers = (Button) root.findViewById(R.id.questionpapers);
        Button solutions = (Button) root.findViewById(R.id.solutions);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), notes.class);
                startActivity(intent);
            }
        });
        lessonplans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), leesonplans.class);
                startActivity(intent);
            }
        });
        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), books.class);
                startActivity(intent);
            }
        });
        questionpapers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), questionpapers.class);
                startActivity(intent);
            }
        });
        solutions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), solutions.class);
                startActivity(intent);
            }
        });

        return root;
    }
}