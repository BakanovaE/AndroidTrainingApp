package com.example.studyapp.training_of_pets;

import com.example.studyapp.R;

public class Cat {
    private String command;
    private String description;
    private int imageResourceId;

    public static final Cat[] cats = {
            new Cat ("Voice", "Show the sausage", R.drawable.catvoice),
            new Cat("Purr", "Rub the belly", R.drawable.catpurr),
            new Cat("Eat", "Put the food in the bowl", R.drawable.cateat)
    };

    private Cat(String command, String description, int imageResourceId) {
        this.command = command;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getCommand() {
        return command;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.command;
    }
}
