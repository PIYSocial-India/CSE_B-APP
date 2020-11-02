package com.piysocial.cse_b.ui.details;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.piysocial.cse_b.R;

public class detailsFragment extends Fragment {
    private detailsViewModel detailsViewModel;
    @Override
    public View onCreateView( LayoutInflater inflater,
                              ViewGroup container, Bundle savedInstanceState) {
        detailsViewModel =
                ViewModelProviders.of(this).get(detailsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_details, container, false);
        Button student = (Button) root.findViewById(R.id.student);
        Button faculty = (Button) root.findViewById(R.id.faculty);
        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), students.class);
                startActivity(intent);
            }
        });
        faculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), faculty.class);
                startActivity(intent);
            }
        });
        return root;
    }
}