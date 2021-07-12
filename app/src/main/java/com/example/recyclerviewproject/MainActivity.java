package com.example.recyclerviewproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycle ;
    private AnimalAdapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycle = findViewById(R.id.activity_main_recycler);
        adapter = new AnimalAdapter(Animal.getData() , this);

        recycle.setHasFixedSize(true);
        LinearLayoutManager manager = new LinearLayoutManager(this , LinearLayoutManager.VERTICAL , false);
        recycle.setLayoutManager(manager);
        recycle.setAdapter(adapter);


    }
}