package com.example.beadando_mobil_02.ui.notelist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.beadando_mobil_02.MainActivity;
import com.example.beadando_mobil_02.R;
import com.example.beadando_mobil_02.data.NotebookManager;
import com.example.beadando_mobil_02.domain.Notebook;

import java.util.List;


public class notelistFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_notelist, container, false);
        //adathalmaz
        List<Notebook> notebookList = NotebookManager.loadMockData();

        RecyclerView noterecyclerView = view.findViewById(R.id.Notebookrecycleview);

        notelistadapter adapter = new notelistadapter(notebookList, this);
        //egy oszlopos megjelenítés
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(
                getActivity());

        noterecyclerView.setLayoutManager(layoutManager);
        noterecyclerView.setAdapter(adapter);




        return view;

    }
    public void navigateToNotebookDetails(Notebook notebook)
    {
        MainActivity mainActivity = (MainActivity) getActivity();
        mainActivity.navigateToNotebookDetails(notebook);
    }
}