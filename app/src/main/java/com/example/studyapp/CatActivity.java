package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CatActivity extends AppCompatActivity {

    public static final String EXTRA_CATID = "catId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);

        int catId = (Integer) getIntent().getExtras().get(EXTRA_CATID);
        Cat cat = Cat.cats[catId];

        TextView command = (TextView) findViewById(R.id.command);
        command.setText(cat.getCommand());

        TextView description = (TextView) findViewById(R.id.description);
        description.setText(cat.getDescription());

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(cat.getImageResourceId());
        photo.setContentDescription(cat.getCommand());
    }
}