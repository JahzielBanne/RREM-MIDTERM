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

public class MasonryFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_masonry, container, false);

        Toast.makeText(getActivity(), "Masonry and Concrete Hardware Category", Toast.LENGTH_SHORT).show();


        ArrayList<String> productItems = new ArrayList<>();
        productItems.add("Cement");
        productItems.add("Mortar mixers");
        productItems.add("Rebar (reinforcing bars)");
        productItems.add("Bagged concrete mix");
        productItems.add("Ready-mix concrete");
        productItems.add("Mortar mix");
        productItems.add("Masonry hammers");
        productItems.add("Masonry chisels");
        productItems.add("Mortar mixers");
        productItems.add("Wire mesh");

        // Create an ArrayAdapter to populate the ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, productItems);

        // Get the ListView and set the adapter
        ListView listView = view.findViewById(R.id.ViewProducts);
        listView.setAdapter(adapter);

        return view;

    }
}