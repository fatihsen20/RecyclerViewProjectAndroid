package com.example.recyclerviewproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalHolder>{

    private ArrayList<Animal> animalslist;
    private Context context ;

    public AnimalAdapter(ArrayList<Animal> animalslist, Context context) {
        this.animalslist = animalslist;
        this.context = context;
    }

    @NonNull
    @Override
    public AnimalHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.animals, parent , false);

        return new AnimalHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalHolder holder, int position) {
        Animal animal = animalslist.get(position);
        holder.setData(animal);
    }

    @Override
    public int getItemCount() {
        return animalslist.size();
    }

    class AnimalHolder extends RecyclerView.ViewHolder{
        TextView animal_name ;
        ImageView animal_image ;
        public AnimalHolder(@NonNull View itemView) {
            super(itemView);

            animal_name = itemView.findViewById(R.id.hayvanlar_txtviewName);
            animal_image = itemView.findViewById(R.id.hayvanlar_imageview_animal);
        }

        public void setData(Animal animal){
            this.animal_name.setText(animal.getAnimal());
            this.animal_image.setBackgroundResource(animal.getImage());

        }
    }
}
