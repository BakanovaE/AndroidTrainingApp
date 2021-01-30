package com.example.studyapp.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.studyapp.R;

public class WorkoutActivity extends AppCompatActivity implements WorkoutListFragment.Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
    }


    @Override
    public void itemClicked(long id) {
        Intent intent = new Intent(this, WorkoutDetailActivity.class);
        intent.putExtra(WorkoutDetailActivity.EXTRA_WORKOUT_ID, (int) id);
        startActivity(intent);
    }
}