package com.piysocial.cse_b.ui.assignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.piysocial.cse_b.R;

public class assignmentFragment extends Fragment {

    private assignmentViewModel assignmentViewModel;
    @Override
    public View onCreateView( LayoutInflater inflater,
                              ViewGroup container, Bundle savedInstanceState) {
        assignmentViewModel =
                ViewModelProviders.of(this).get(assignmentViewModel.class);
        View root = inflater.inflate(R.layout.fragment_assignment, container, false);
        Button assignment = (Button) root.findViewById(R.id.assignment);
        Button assignmentsolution = (Button) root.findViewById(R.id.assignmentsolutions);
        assignment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), assignment.class);
                startActivity(intent);
            }
        });
        assignmentsolution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), assignmentsolutions.class);
                startActivity(intent);
            }
        });

        return root;
    }
}