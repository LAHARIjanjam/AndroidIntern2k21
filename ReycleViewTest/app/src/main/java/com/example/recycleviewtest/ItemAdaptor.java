package com.example.recycleviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemAdaptor extends RecyclerView.Adapter<ItemAdaptor.MyViewHolder> {
    Context ct;
    int[] myImages;
    String[] myNames,myPrices;
    public ItemAdaptor(MainActivity mainActivity, int[] images, String[] itemnames, String[] itemprice) {
        ct = mainActivity;
        myImages = images;
        myNames = itemnames;
        myPrices = itemprice;

    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public ItemAdaptor.MyViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(ct).inflate(R.layout.item_row,parent,false);
        MyViewHolder holder = new MyViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull ItemAdaptor.MyViewHolder holder, int position) {
        holder.iv.setImageResource(myImages[position]);
        holder.tv1.setText(myNames[position]);
        holder.tv2.setText(myPrices[position]);
    }

    @Override
    public int getItemCount() {
        return myImages.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView tv1,tv2;
        public MyViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.itemimage);
            tv1 = itemView.findViewById(R.id.itemname);
            tv2 = itemView.findViewById(R.id.itemprice);
        }
    }
}