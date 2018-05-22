package com.duy.ccppcompiler.ui.examples;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.duy.ccppcompiler.R;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ViewHolder> {

    private final ExampleActivity activity;
    private final ArrayList<ExampleItem> exampleItems;

    public ExampleAdapter(ExampleActivity activity, ArrayList<ExampleItem> exampleItems) {
        this.activity = activity;
        this.exampleItems = exampleItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.list_item_example, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ExampleItem exampleItem = exampleItems.get(position);
        holder.txtTitle.setText(exampleItem.getTitle().replaceAll("[\n]", " "));
        holder.txtDesc.setText(exampleItem.getDesc().replaceAll("[\n]", " "));
    }

    @Override
    public int getItemCount() {
        return exampleItems.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle, txtDesc;

        ViewHolder(View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.txt_title);
            txtDesc = itemView.findViewById(R.id.txt_desc);
        }
    }
}