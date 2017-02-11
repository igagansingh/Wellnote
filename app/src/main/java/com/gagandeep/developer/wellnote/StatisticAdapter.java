package com.gagandeep.developer.wellnote;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.nio.InvalidMarkException;
import java.util.ArrayList;

/**
 * Created by gagandeep on 2/11/2017.
 */

public class StatisticAdapter extends ArrayAdapter<StatisticsGraph> {

    public StatisticAdapter(Activity context, ArrayList<StatisticsGraph> statsGraph){
        super(context,0,statsGraph);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View gridView = convertView;
        if (gridView == null)
        {
            gridView = LayoutInflater.from(getContext()).inflate(R.layout.stats_graph_item, parent, false);
        }

        StatisticsGraph statsGraphItem = getItem(position);

        TextView textView = (TextView) gridView.findViewById(R.id.graphName);
        textView.setText(statsGraphItem.getName());

        ImageView imageView = (ImageView) gridView.findViewById(R.id.imageStat);
        imageView.setImageResource(statsGraphItem.getFlatIcon());
        return gridView;
    }
}
