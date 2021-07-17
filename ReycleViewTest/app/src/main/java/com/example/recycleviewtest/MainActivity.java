package com.example.recycleviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.recyclerview);

        int[]  images = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j};
        String[] itemnames = {"Chicken Biryani","Chicken Lolypop","Egg fried Rice","Chicken 65","Mutton curry","Mutton Biryani","Fish curry","Prawns Curry","Veg Noodels","Chicken Noodels"};
        String[] itemprice = {"200","250","100","350","400","250","250","200","150","100"};
        rv.setLayoutManager(new LinearLayoutManager(this));
        ItemAdaptor adaptor = new ItemAdaptor(this,images,itemnames,itemprice);
        rv.setAdapter(adaptor);
    }
}