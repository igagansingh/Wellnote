package com.gagandeep.developer.wellnote;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ReportsFragment extends Fragment {

    public ReportsFragment(){}
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_reports_fragment, container, false);

        final ArrayList<ReportStructure> reportStructures = new ArrayList<>();
        reportStructures.add(new ReportStructure("Mata Chandan Devi", 1486800990, "Heart Diagnosis"));
        reportStructures.add(new ReportStructure("AIIMS", 1486541790, "Cold, Fever Diagnosis"));
        reportStructures.add(new ReportStructure("RML", 1485936990, "Back Pain Diagnosis"));
        reportStructures.add(new ReportStructure("Fortis", 1485245790, "Heart Diagnosis"));
        reportStructures.add(new ReportStructure("Safdarjung Hospital", 1484640990, "Malaria Diagnosis"));
        reportStructures.add(new ReportStructure("Nobel Medicare", 1484036190, "Dengue Diagnosis"));
        reportStructures.add(new ReportStructure("Sukhmani", 1484036190, "Chicken Pox Diagnosis"));
        reportStructures.add(new ReportStructure("BLK", 1482826590, "Stones Diagnosis"));

        ReportAdapter reportAdapter = new ReportAdapter(getActivity(), reportStructures);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(reportAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(), "Report from "+reportStructures.get(i).getHead(), Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}
