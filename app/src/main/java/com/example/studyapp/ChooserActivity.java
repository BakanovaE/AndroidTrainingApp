package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class ChooserActivity extends AppCompatActivity {

    private PetChooser petChooser = new PetChooser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooser);
    }

    public void onClickChooser (View view) {
        TextView choices = (TextView) findViewById(R.id.choices);
        Spinner spinnerChooser = (Spinner) findViewById(R.id.spinner_chooser);
        String type = String.valueOf(spinnerChooser.getSelectedItem());
        List<String> pets = petChooser.getPet(type);
        StringBuilder petsFormatter = new StringBuilder();
        for (String pet : pets) {
            petsFormatter.append(pet).append('\n');
        }
        choices.setText(petsFormatter);
    }
}