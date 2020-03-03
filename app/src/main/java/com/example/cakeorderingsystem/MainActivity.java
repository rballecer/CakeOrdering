package com.example.cakeorderingsystem;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
RadioGroup radioshapegroup, radioflavorgroup, radiotoppingsgroup;
RadioButton radiobtnshape, radiobtnflavor, radiobtntoppings;
EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {
        radioshapegroup = findViewById(R.id.radiogroupshape);
        radioflavorgroup = findViewById(R.id.radiogroupflavor);
        radiotoppingsgroup = findViewById(R.id.radiogrouptoppings);
        et1 = findViewById(R.id.editText);

        int selectedId1 = radioflavorgroup.getCheckedRadioButtonId();
        int selectedId2 = radioshapegroup.getCheckedRadioButtonId();
        int selectedId3 = radiotoppingsgroup.getCheckedRadioButtonId();

      radiobtnshape = findViewById(selectedId2);
      radiobtnflavor =  findViewById(selectedId1);
      radiobtntoppings  = findViewById(selectedId3);

        AlertDialog.Builder alertdialogbuilder = new AlertDialog.Builder(MainActivity.this);
        alertdialogbuilder.setMessage("Shape: " + radiobtnshape.getText().toString() + "\n" + "Flavor: " + radiobtnflavor.getText().toString() + "\n" +
                "Toppings: " + radiobtntoppings.getText().toString()+ "\n" + "Message: " + et1.getText().toString());
        alertdialogbuilder.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog alertDialog = alertdialogbuilder.create();
        alertDialog.show();




    }
}
