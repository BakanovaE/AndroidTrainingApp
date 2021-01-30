package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.studyapp.workout.WorkoutActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickMainChooser(View view) {
        Intent intent = new Intent(this, ChooserActivity.class);
        startActivity(intent);
    }

    public void onClickMainMessage(View view) {
        Intent intent = new Intent(this, CreateMessageActivity.class);
        startActivity(intent);
    }

    public void onClickMainStopwatch(View view) {
        Intent intent = new Intent(this, StopwatchActivity.class);
        startActivity(intent);
    }

    public void onClickMainPictureAndText(View view) {
        Intent intent = new Intent(this, PictureAndTextActivity.class);
        startActivity(intent);
    }

    public void onClickMainConstraintLayout(View view) {
        Intent intent = new Intent(this, ConstraintLayoutActivity.class);
        startActivity(intent);
    }

    public void onClickMainTrainingOFPets(View view) {
        Intent intent = new Intent(this, TrainingOfPetsActivity.class);
        startActivity(intent);
    }

    public void onClickMainBitsAndPizza(View view) {
        Intent intent = new Intent(this, BitsAndPizzasActivity.class);
        startActivity(intent);
    }
    public void onClickMainWorkout(View view) {
        Intent intent = new Intent(this, WorkoutActivity.class);
        startActivity(intent);
    }
}