package com.example.myapplication;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.DialogFragment;

public class ReceiveModalFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());

        // Inflate the custom layout for the dialog
        LayoutInflater inflater = requireActivity().getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.fragment_recmodal, null);

        // Find your EditText fields from the inflated layout
        EditText recmbtn1 = dialogView.findViewById(R.id.recmbtn1);
        EditText recmbtn2 = dialogView.findViewById(R.id.recmbtn2);
        EditText recmbtn3 = dialogView.findViewById(R.id.recmbtn3);

        builder.setView(dialogView)
                .setTitle("Supplier Details")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String text1 = recmbtn1.getText().toString();
                        String text2 = recmbtn2.getText().toString();
                        String text3 = recmbtn3.getText().toString();
                        // Handle the OK button click with the entered text values
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Handle the Cancel button click here
                    }
                });

        return builder.create();
    }
}
