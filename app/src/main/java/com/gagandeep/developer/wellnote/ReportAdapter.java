package com.gagandeep.developer.wellnote;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by gagandeep on 2/11/2017.
 */

public class ReportAdapter extends ArrayAdapter<ReportStructure> {

    ReportAdapter(Activity context, ArrayList<ReportStructure> reportStructures){
        super(context, 0, reportStructures);
    }
    private String formatDate(Date dateObject)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.report_item, parent, false);
        }

        ReportStructure reportStructure = getItem(position);

        TextView head, date, detail;
        head = (TextView) listItemView.findViewById(R.id.head);
        head.setText(reportStructure.getHead());

        date = (TextView) listItemView.findViewById(R.id.date);
        Date dateObject = new Date(reportStructure.getDate());
        String formattedDate = formatDate(dateObject);
        date.setText(formattedDate);

        detail = (TextView) listItemView.findViewById(R.id.detail);
        detail.setText(reportStructure.getDetails());
        return listItemView;
    }
}
