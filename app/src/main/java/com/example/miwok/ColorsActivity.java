package com.example.miwok;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red", "weṭeṭṭi", R.drawable.color_red));
        words.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));
        words.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow));
        words.add(new Word("green", "chokokki", R.drawable.color_green));
        words.add(new Word("brown", "ṭakaakki", R.drawable.color_brown));
        words.add(new Word("gray", "ṭopoppi", R.drawable.color_gray));
        words.add(new Word("black", "kululli", R.drawable.color_black));
        words.add(new Word("white", "kelelli", R.drawable.color_white));

        //create an {@Link ArrayAdapter}, whose data source is a list of strings,
        //The adapter knows how to create layouts for each item in the list,
        //using the simple_list_item_1.xml layout resource defined in the Android framework.
        //This list item layout contains a single {@link TextView}, which the adapter will set display a single word.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        //find the {@link ListView} object in the view hierarchy of the {@link Activity},
        //there should be a {!link ListView} with the view ID called list, which is declared in
        //word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // make the {@link_ListView} object in the view herarchy of the
        // There should be a {@link ListView} with the view ID called
        // word_list.xml
        listView.setAdapter(adapter);

    }
}
