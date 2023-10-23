package com.example.myapplication;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class ReleaseFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_release, container, false);

        Button recbtn1 = view.findViewById(R.id.relbtn1);

        recbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReleaseModalFragment dialogFragment = new ReleaseModalFragment();
                dialogFragment.show(requireActivity().getSupportFragmentManager(), "myDialog");
            }
        });

        return view;
    }
}