package com.george.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toolbar;

public class TopLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //Создать OnItemClickListener
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    public void onItemClick(AdapterView<?> listView,
                                            View itemView,
                                            int position,
                                            long id) {
                        if (position == 0) {
                            Intent intent = new Intent(TopLevelActivity.this,
                                    DrinkCategoryActivity.class);
                            startActivity(intent);
                        }
                    }
                };
        //Добавить слушателя к списковому представлению
        ListView listView = (ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }

    private void setSupportActionBar(Toolbar toolbar) {
        //Судя по всему многое что изменилось с момента написания книги и что бы в toolbar
        // что-то отображалось тут должен быть код
    }
}