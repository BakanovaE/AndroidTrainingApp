package com.example.studyapp.bits_and_pizzas;

import com.example.studyapp.R;

public class Pizza {

    private String name;
    private int imageResourceId;

    private Pizza (String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public static final Pizza[] pizzas ={
            new Pizza("Diavolo", R.drawable.diavolo),
            new Pizza("Fungi", R.drawable.funghi)
    };
}
