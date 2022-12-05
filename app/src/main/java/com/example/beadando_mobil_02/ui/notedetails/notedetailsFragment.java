package com.example.beadando_mobil_02.ui.notedetails;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.beadando_mobil_02.MainActivity;
import com.example.beadando_mobil_02.R;
import com.example.beadando_mobil_02.data.NotebookManager;
import com.example.beadando_mobil_02.domain.Notebook;
import com.example.beadando_mobil_02.ui.notelist.notelistadapter;

import java.util.List;


public class notedetailsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notedetails, container, false);
        // ez a textview megszünt ... notebooktitleTextView.. (vagyis már másikat fogunk használni.)
        TextView displaytextView = view.findViewById(R.id.displaytextView);
        TextView memorytextView = view.findViewById(R.id.memorytextView);
        TextView tarhelytextview = view.findViewById(R.id.tarhelytextview);
        TextView videotextview = view.findViewById(R.id.videotextview);



        //Ez mar a reszletes listazashoz kell elvileg
        MainActivity mainActivity = (MainActivity) getActivity();
        Notebook selectedNotebook = mainActivity.getSelectedNotebook();
       displaytextView.setText(selectedNotebook.getKijelzo());
        memorytextView.setText(selectedNotebook.getMemoria());
        tarhelytextview.setText(selectedNotebook.getMerevlemez());
        videotextview.setText(selectedNotebook.getVideovezerlo());


        //adathalmaz




        return view;



    }
}