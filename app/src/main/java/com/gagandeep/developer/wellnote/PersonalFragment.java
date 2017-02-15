package com.gagandeep.developer.wellnote;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class PersonalFragment extends Fragment {

    public PersonalFragment(){}

    ArrayList<String> pDetails;
    int yearThis, yearBorn;
    TextView aId, name, gender, age, state, pinCode;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_personal_fragment, container, false);

        yearThis = Calendar.getInstance().get(Calendar.YEAR);

        TinyDB tinyDB = new TinyDB(getContext());
        pDetails = tinyDB.getListString("personalDetail");

        aId = (TextView) rootView.findViewById(R.id.a_id);
        aId.setText(pDetails.get(0));

        name = (TextView) rootView.findViewById(R.id.name);
        name.setText(pDetails.get(1));

        gender = (TextView) rootView.findViewById(R.id.gender);
        if (pDetails.get(2).equals("M"))
            gender.setText("Male");
        else
            gender.setText("Female");

        age = (TextView) rootView.findViewById(R.id.age);
        yearBorn = Integer.parseInt(pDetails.get(3));
        age.setText(Integer.toString(yearThis - yearBorn));

        state = (TextView) rootView.findViewById(R.id.state);
        state.setText(pDetails.get(6));

        pinCode = (TextView) rootView.findViewById(R.id.pincode);
        pinCode.setText(pDetails.get(7));

        return rootView;
    }
}
