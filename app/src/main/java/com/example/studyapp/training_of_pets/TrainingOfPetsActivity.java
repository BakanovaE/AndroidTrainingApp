package com.example.studyapp.training_of_pets;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.studyapp.R;

public class TrainingOfPetsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_of_pets);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(TrainingOfPetsActivity.this, CatsCategoryActivity.class);
                    startActivity(intent);
                }
            }
        };

        ListView lv = (ListView) findViewById((R.id.list_options));
        lv.setOnItemClickListener(itemClickListener);
    }
}