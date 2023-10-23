package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import android.widget.Button;


public class UserAddFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_useradd, container, false);

        // Find the createUserButton and set an OnClickListener
        Button createUserButton = view.findViewById(R.id.createUserButton);
        createUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display the success dialog
                showSuccessDialog();
            }
        });

        // Set an OnTouchListener to detect touches on the background
        view.setOnTouchListener((v, event) -> {
            // Hide the keyboard when touched
            hideKeyboard(view);
            return false;
        });

        return view;
    }

    // Function to show the success dialog
    private void showSuccessDialog() {
        UserAddModalFragment dialog = new UserAddModalFragment();
        dialog.show(getParentFragmentManager(), "SuccessDialog");
    }

    // Function to hide the keyboard
    private void hideKeyboard(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) requireContext()
                .getSystemService(Context.INPUT_METHOD_SERVICE);

        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}