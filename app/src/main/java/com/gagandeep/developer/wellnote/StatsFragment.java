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
import android.widget.GridView;

import java.io.Serializable;
import java.util.ArrayList;

public class StatsFragment extends Fragment {

    public StatsFragment(){}

    GridView gridView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_stats_fragment, container, false);
        gridView = (GridView) rootView.findViewById(R.id.gridview);

        final ArrayList<StatisticsGraph> statsGraphIcons = new ArrayList<>();
        statsGraphIcons.add(new StatisticsGraph("Pulse",R.drawable.pulse));
        statsGraphIcons.add(new StatisticsGraph("Blood Pressure",R.drawable.bp));
        statsGraphIcons.add(new StatisticsGraph("Weight",R.drawable.weight));

        StatisticAdapter adapter = new StatisticAdapter(getActivity(), statsGraphIcons);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                StatisticsGraph statisticsGraph = statsGraphIcons.get(i);
                Intent intent = new Intent(getActivity(), GraphActivity.class);
                intent.putExtra("graphType", (Serializable) statisticsGraph);
                startActivity(intent);
            }
        });


        return rootView;
    }
}
