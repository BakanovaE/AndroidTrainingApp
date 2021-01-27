package com.example.studyapp;

import java.util.ArrayList;
import java.util.List;

public class PetChooser {

    List<String> getPet (String type) {
        List <String> pets = new ArrayList<>();
        if (type.equals("cats")) {
            pets.add("Tom");
            pets.add("Jerry the cat");
        } else if (type.equals("dogs")) {
            pets.add("Beethoven");
            pets.add("Lassie");
        } else {
            pets.add("Loch Ness monster");
        }
        return pets;
    }
}
