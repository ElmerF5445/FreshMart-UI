package com.example.freshmart.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.freshmart.model.LogList;
import com.example.freshmart.*;

import java.util.ArrayList;

public class LogListAdapter extends RecyclerView.Adapter<LogListAdapter.ViewHolder> {

    private ArrayList<LogList> DataSet;

    public LogListAdapter(ArrayList<LogList> DataSet){
        this.DataSet = DataSet;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView itemName;
        TextView itemCategory;
        TextView itemMPrice;
        TextView itemSRP;
        TextView itemQuant;
        TextView itemLogDate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemName = itemView.findViewById(R.id.itemName);
            itemCategory = itemView.findViewById(R.id.itemCategory);
            itemMPrice = itemView.findViewById(R.id.itemMPrice);
            itemSRP = itemView.findViewById(R.id.itemSRP);
            itemQuant = itemView.findViewById(R.id.itemQuant);
            itemLogDate = itemView.findViewById(R.id.itemLogDate);
        }

        public TextView getItemName() {return itemName;}
        public TextView getItemCategory() {return itemCategory;}
        public TextView getItemMPrice() {return itemCategory;}
        public TextView getItemSRP() {return itemSRP;}
        public TextView getItemQuant() {return itemQuant;}
        public TextView getItemLogDate() {return itemLogDate;}
    }

    @NonNull
    @Override
    public LogListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_log, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LogListAdapter.ViewHolder holder, int position) {
        holder.itemName.setText(DataSet.get(position).getItemName().toString());
        holder.itemCategory.setText(DataSet.get(position).getItemCategory().toString());
        holder.itemMPrice.setText(String.valueOf(DataSet.get(position).getItemMPrice()));
        holder.itemSRP.setText(String.valueOf(DataSet.get(position).getItemSRP()));
        holder.itemQuant.setText(String.valueOf(DataSet.get(position).getItemQuant()));
        holder.itemLogDate.setText(String.valueOf(DataSet.get(position).getItemLogDate()));
    }

    @Override
    public int getItemCount() {
        return DataSet.size();
    }
}
