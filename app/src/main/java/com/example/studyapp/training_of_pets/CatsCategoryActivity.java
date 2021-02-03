package com.example.studyapp.training_of_pets;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.studyapp.R;

public class CatsCategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cats_category);
        ArrayAdapter<Cat> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Cat.cats);
        ListView listView = (ListView) findViewById(R.id.list_cats);
        listView.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(CatsCategoryActivity.this, CatActivity.class);
                intent.putExtra(CatActivity.EXTRA_CATID, (int) id);
                startActivity(intent);
            }
        };
        listView.setOnItemClickListener(itemClickListener);
    }

}