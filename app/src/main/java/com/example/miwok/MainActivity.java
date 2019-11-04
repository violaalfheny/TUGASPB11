package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        //Set a clicklistner on that View
       numbers.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               //Create a new intent to open the {@Link NumbersActivity}
               Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);

               //Start the new Activity
               startActivity(numbersIntent);
           }

       });

        //Find the View that shows the family category
        TextView family = (TextView) findViewById(R.id.family);

        //Set a clicklistner on that View
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@Link NumbersActivity}
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);

                //Start the new Activity
                startActivity(familyIntent);
            }

        });

        //Find the View that shows the numbers category
        TextView colors = (TextView) findViewById(R.id.colors);

        //Set a clicklistner on that View
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@Link NumbersActivity}
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);

                //Start the new Activity
                startActivity(colorsIntent);
            }

        });

        //Find the View that shows the numbers category
        TextView phrases = (TextView) findViewById(R.id.phrases);

        //Set a clicklistner on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@Link NumbersActivity}
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);

                //Start the new Activity
                startActivity(phrasesIntent);
            }

        });


    }

}


