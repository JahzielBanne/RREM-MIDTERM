package com.example.myapplication;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    ArrayList<BarEntry> barArraylist;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        BarChart barChart = view.findViewById(R.id.barchart);
        getData();

        BarDataSet barDataSet = new BarDataSet(barArraylist, "Most bought products");

        BarData barData = new BarData(barDataSet);

        // Create a list of labels for each bar
        final String[] labels = new String[]{"Cement", "Nails", "PVC Pipe", "Hollowblocks"};

        // Set custom labels for the X-axis
        XAxis xAxis = barChart.getXAxis();
        xAxis.setValueFormatter(new IndexAxisValueFormatter(labels));

        barChart.setData(barData);

        // Color bar data set
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        // Text color
        barDataSet.setValueTextColor(Color.BLACK);
        // Setting text size
        barDataSet.setValueTextSize(16f);
        barChart.getDescription().setEnabled(true);
        return view;
    }

    private void getData() {
        barArraylist = new ArrayList<>();
        barArraylist.add(new BarEntry(0f, 40)); // Cement
        barArraylist.add(new BarEntry(1f, 30)); // Nails
        barArraylist.add(new BarEntry(2f, 20)); // PVC Pipe
        barArraylist.add(new BarEntry(3f, 10)); // Ready Mix Concrete
    }
}
