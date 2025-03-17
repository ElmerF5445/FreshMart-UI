package com.example.freshmart.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.freshmart.AddItemFragment;
import com.example.freshmart.R;
import com.example.freshmart.model.ItemList;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.ViewHolder> {

    private ArrayList<ItemList> items;

    public ItemListAdapter(ArrayList<ItemList> items){
        this.items = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView itemName;
        TextView itemCategory;
        TextView itemMPrice;
        TextView itemSRP;
        TextView itemQuant;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            itemName = itemView.findViewById(R.id.itemName);
            itemCategory = itemView.findViewById(R.id.itemCategory);
            itemMPrice = itemView.findViewById(R.id.itemMPrice);
            itemSRP = itemView.findViewById(R.id.itemSRP);
            itemQuant = itemView.findViewById(R.id.itemQuant);

        }

        public TextView getItemName() {return itemName;}
        public TextView getItemCategory() {return itemCategory;}
        public TextView getItemMPrice() {return itemMPrice;}
        public TextView getItemSRP() {return itemSRP;}
        public TextView getItemQuant() {return itemQuant;}
    }

    @NonNull
    @Override
    public ItemListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemListAdapter.ViewHolder holder, int position) {
        holder.itemName.setText(items.get(position).getItemName().toString());
        holder.itemCategory.setText(items.get(position).getCategory().toString());
        holder.itemMPrice.setText(String.valueOf(items.get(position).getmPrice()));
        holder.itemSRP.setText(String.valueOf(items.get(position).getSRP()));
        holder.itemQuant.setText(String.valueOf(items.get(position).getQuantity()));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}
