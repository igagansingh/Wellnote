package com.gagandeep.developer.wellnote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MedicinesDetail extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<CustomMedicine> arrayAdapter;
    ArrayList<CustomMedicine> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicines_detail);

        //TODO: set custom adapter for the following and set alarm service

        listView = (ListView) findViewById(R.id.medicines_list);
        arrayList = new ArrayList<>();
        arrayList.add(new CustomMedicine("Crocin", "5/2/17", "15/2/17"));
        arrayList.add(new CustomMedicine("Crocin", "5/2/17", "15/2/17"));
        arrayList.add(new CustomMedicine("Crocin", "5/2/17", "15/2/17"));
        arrayList.add(new CustomMedicine("Crocin", "5/2/17", "15/2/17"));
        arrayList.add(new CustomMedicine("Crocin", "5/2/17", "15/2/17"));
        arrayList.add(new CustomMedicine("Crocin", "5/2/17", "15/2/17"));
        arrayList.add(new CustomMedicine("Crocin", "5/2/17", "15/2/17"));
        arrayList.add(new CustomMedicine("Crocin", "5/2/17", "15/2/17"));
        arrayList.add(new CustomMedicine("Crocin", "5/2/17", "15/2/17"));
        arrayList.add(new CustomMedicine("Crocin", "5/2/17", "15/2/17"));
        arrayAdapter = new ArrayAdapter<>(getApplication(), android.R.layout.simple_list_item_1, arrayList);
    }

    class CustomMedicine{
        String name;
        String dateStart;
        String dateLast;

        CustomMedicine(String name, String dateStart, String dateLast){
            this.name = name;
            this.dateStart = dateStart;
            this.dateLast = dateLast;
        }

        public String getName() {
            return name;
        }

        public String getDateLast() {
            return dateLast;
        }

        public String getDateStart() {
            return dateStart;
        }
    }
}
