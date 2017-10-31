package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Numbers listener
        TextView numbersTextView = findViewById(R.id.numbers);
        numbersTextView.setOnClickListener(v -> startActivity(new Intent(this, NumbersActivity.class)));

        // Family listener
        TextView familyTextView = findViewById(R.id.family);
        familyTextView.setOnClickListener(v -> startActivity(new Intent(this, FamilyActivity.class)));

        // Colors listener
        TextView colorsTextView = findViewById(R.id.colors);
        colorsTextView.setOnClickListener(v -> startActivity(new Intent(this, ColorsActivity.class)));

        // Phrases listener
        TextView phrasesTextView = findViewById(R.id.phrases);
        phrasesTextView.setOnClickListener(v -> startActivity(new Intent(this, PhrasesActivity.class)));
    }
}
