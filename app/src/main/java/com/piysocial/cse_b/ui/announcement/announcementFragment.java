package com.piysocial.cse_b.ui.announcement;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;


import com.google.android.gms.ads.AdView;
import com.piysocial.cse_b.R;
import com.piysocial.cse_b.ui.details.faculty;
import com.piysocial.cse_b.ui.details.students;

public class announcementFragment extends Fragment {
    private WebView mywebview;
    private android.widget.ProgressBar ProgressBar;
    private announcementViewModel announcementViewModel;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        announcementViewModel =
                ViewModelProviders.of(this).get(announcementViewModel.class);
        View root = inflater.inflate(R.layout.fragment_announcement, container, false);

        Button classannouncements = (Button) root.findViewById(R.id.classannouncements);
        Button collegeannouncements = (Button) root.findViewById(R.id.collegeannouncements);

        classannouncements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), classupdates.class);
                startActivity(intent);
            }
        });
        collegeannouncements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), collegeupdates.class);
                startActivity(intent);
            }
        });

        return root;

    }
}
