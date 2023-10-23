package com.example.myapplication;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public class PlumbingFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_plumbing, container, false);

        Toast.makeText(getActivity(), "Plumbing Category", Toast.LENGTH_SHORT).show();
        ;

        // Initialize ArrayList and add items
        ArrayList<String> productItems = new ArrayList<>();
        productItems.add("Pipe wrenches");
        productItems.add("Pipe cutters");
        productItems.add("Pipe benders");
        productItems.add("Plungers");
        productItems.add("Pipe threaders");
        productItems.add("Hacksaws");
        productItems.add("Copper pipes");
        productItems.add("PVC pipes");
        productItems.add("PEX pipes");
        productItems.add("Galvanized steel pipes");

        // Create an ArrayAdapter to populate the ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, productItems);

        // Get the ListView and set the adapter
        ListView listView = view.findViewById(R.id.ViewProducts);
        listView.setAdapter(adapter);

        return view;

    }
}