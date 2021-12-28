package com.example.foodshopautomation;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class holder extends RecyclerView.ViewHolder {

    ImageView image;
    TextView Name, Price, Decs;
    public holder(@NonNull View itemView) {
        super(itemView);
        Name = itemView.findViewById(R.id.item_name);
        Price = itemView.findViewById(R.id.item_price);
        Decs = itemView.findViewById(R.id.item_desc);
        image = itemView.findViewById(R.id.item_img);
    }
}
