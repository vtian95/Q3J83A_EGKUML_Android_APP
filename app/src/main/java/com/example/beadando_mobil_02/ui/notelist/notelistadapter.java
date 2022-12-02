package com.example.beadando_mobil_02.ui.notelist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beadando_mobil_02.R;
import com.example.beadando_mobil_02.domain.Notebook;

import java.util.List;

public class notelistadapter extends RecyclerView.Adapter<notelistadapter.NotebookHolder>  {

    private List<Notebook> notebookList ;

    public notelistadapter(List<Notebook> notebookList) {
        this.notebookList = notebookList;
    }

    @NonNull
    @Override
    public NotebookHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.notebook_list_row, parent, false);

        return new NotebookHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull NotebookHolder holder, int position) {

        Notebook notebook = notebookList.get(position);
        holder.titleTextView.setText(notebook.getGyarto());
        holder.idTextView.setText(notebook.getId());
        holder.costTextView.setText(notebook.getAr());
        holder.typeTextView.setText(notebook.getTipus());
    }

    @Override
    public int getItemCount() {
        return notebookList.size();
    }

    public class NotebookHolder extends RecyclerView.ViewHolder
    {   public TextView titleTextView;
        public TextView typeTextView;
        public TextView costTextView;
        public TextView idTextView;

        public NotebookHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            typeTextView = itemView.findViewById(R.id.typeTextView);
            costTextView = itemView.findViewById(R.id.costTextView);
            idTextView = itemView.findViewById(R.id.idtextView);
        }
    }
}
