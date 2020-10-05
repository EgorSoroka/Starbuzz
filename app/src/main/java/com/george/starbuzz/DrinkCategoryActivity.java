package com.george.starbuzz;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;


public class DrinkCategoryActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Drink.drinks);
        ListView listDrinks = (ListView) findViewById(R.id.list_drinks);
        listDrinks.setAdapter(listAdapter);
        //Создание слушателя
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    public void onItemClick(AdapterView<?> listDrinks,
                                            View itemView,
                                            int position,
                                            long id) {
                        //Передача напитка, выбранного пользователем, DrinkActivity
                        Intent intent = new Intent(DrinkCategoryActivity.this,
                                DrinkActivity.class);
                        intent.putExtra(DrinkActivity.EXTRA_DRINKID, (int) id);
                        startActivity(intent);
                    }
                };
        //Назначение слушателя для спискового представления
        listDrinks.setOnItemClickListener(itemClickListener);
    }

    private void setSupportActionBar(Toolbar toolbar) {
        //Судя по всему многое что изменилось с момента написания книги и что бы в toolbar
        // что-то отображалось тут должен быть код
    }
}