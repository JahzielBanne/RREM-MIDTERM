package com.example.myapplication;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class ReceiveFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_receive, container, false);

        Button recbtn1 = view.findViewById(R.id.recbtn1);

        recbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReceiveModalFragment dialogFragment = new ReceiveModalFragment();
                dialogFragment.show(requireActivity().getSupportFragmentManager(), "myDialog");
            }
        });

        return view;
    }
}