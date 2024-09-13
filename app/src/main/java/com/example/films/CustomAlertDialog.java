package com.example.films;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CustomAlertDialog {

    private AlertDialog dialog;
    private EditText editText;
    private String input;

    public CustomAlertDialog(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.custom_alert, null);

        editText = view.findViewById(R.id.editTextTitle);

        builder.setView(view);

        builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                input = editText.getText().toString();
            }
        });

        builder.setNegativeButton("Cancel", (dialogInterface, i) -> dialogInterface.dismiss());

        this.dialog = builder.create();
    }

    public void showDialog() {
        dialog.show();
    }

    public String getText() {
        return input;
    }
}

