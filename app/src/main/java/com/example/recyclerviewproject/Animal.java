package com.example.recyclerviewproject;

import android.content.Context;
import android.view.View;

import java.net.ContentHandler;
import java.util.ArrayList;

public class Animal {
    private String animal;
    private int image ;

    public Animal(String animal, int image) {
        this.animal = animal;
        this.image = image;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
    public static ArrayList<Animal> getData(){
        ArrayList<Animal> returnElements = new ArrayList<>();

        String[] animals = {"At", "Fil" , "Kedi"};
        int[] images = {R.drawable.at , R.drawable.fil , R.drawable.kedi};

        for (int i = 0; i <animals.length ; i++) {
            Animal myanimal = new Animal(animals[i] , images[i]);
            returnElements.add(myanimal);
        }
        return returnElements;
    }
}
