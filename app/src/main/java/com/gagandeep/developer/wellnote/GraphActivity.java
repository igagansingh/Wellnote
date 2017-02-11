package com.gagandeep.developer.wellnote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class GraphActivity extends AppCompatActivity {

    StatisticsGraph statisticsGraph;
    String graphType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);

        statisticsGraph = (StatisticsGraph) getIntent().getSerializableExtra("graphType");
        graphType = statisticsGraph.getName();
        GraphView graph = (GraphView) findViewById(R.id.graph);

        if (graphType.equals("Pulse")){
            LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                    new DataPoint(72,81),
                    new DataPoint(81,70),
                    new DataPoint(70,75),
                    new DataPoint(75,80),
                    new DataPoint(80,78)
            });
            graph.addSeries(series);
        }
        if(graphType.equals("Blood Pressure")){
            LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                    new DataPoint(78,91),
                    new DataPoint(91,80),
                    new DataPoint(80,78),
                    new DataPoint(78,80),
                    new DataPoint(80,84)
            });
            graph.addSeries(series);
        }
        if(graphType.equals("Weight")){
            LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                    new DataPoint(0,57),
                    new DataPoint(57,59),
                    new DataPoint(59,59),
                    new DataPoint(59,60),
                    new DataPoint(60,59)
            });
            graph.addSeries(series);
        }
    }
}
