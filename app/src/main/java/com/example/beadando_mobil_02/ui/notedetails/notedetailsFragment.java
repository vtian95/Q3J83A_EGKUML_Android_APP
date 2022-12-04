package com.example.beadando_mobil_02.ui.notedetails;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.beadando_mobil_02.MainActivity;
import com.example.beadando_mobil_02.R;
import com.example.beadando_mobil_02.domain.Notebook;


public class notedetailsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notedetails, container, false);

        TextView notebooktitleTextView = view.findViewById(R.id.notebooktitleTextView);

        MainActivity mainActivity = (MainActivity) getActivity();
        Notebook selectedNotebook = mainActivity.getSelectedNotebook();
        notebooktitleTextView.setText(selectedNotebook.getGyarto());
        return view;

    }
}