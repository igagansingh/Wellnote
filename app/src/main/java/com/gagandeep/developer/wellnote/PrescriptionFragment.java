package com.gagandeep.developer.wellnote;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PrescriptionFragment extends Fragment {

    ListView listView;
    ArrayList<String> prescriptions;
    ArrayAdapter<String> arrayAdapter;
    public PrescriptionFragment(){}
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_prescription_fragment, container, false);

        listView = (ListView) rootView.findViewById(R.id.listview);
        prescriptions = new ArrayList<>();
        prescriptions.add("Headache");
        prescriptions.add("Stomach Ache");
        prescriptions.add("Constipation");
        prescriptions.add("Data-4");
        prescriptions.add("Data-5");
        prescriptions.add("Data-6");
        prescriptions.add("Data-7");
        prescriptions.add("Data-8");
        prescriptions.add("Data-9");
        arrayAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, prescriptions);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(getActivity(), MedicinesDetail.class));
            }
        });

        return rootView;
    }
}
