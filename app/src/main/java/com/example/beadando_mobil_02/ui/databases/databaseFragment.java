package com.example.beadando_mobil_02.ui.databases;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.beadando_mobil_02.R;

public class databaseFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.new_notebook_database,container, false);
        //TextView view.findViewById(R.id.)

        return view;


    }
}
