package com.straats.ben.testapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class GameActivity extends AppCompatActivity {

    private TextView stepText;
    private Button nextButton;
    private String[] players;
    private String[] categories;
    private TaskManager taskManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Intent intent = getIntent();
        players = intent.getStringArrayExtra(Utils.PLAYERS_KEY);
        categories = intent.getStringArrayExtra(Utils.CATEGORIES_KEY);

        stepText = findViewById(R.id.stepText);
        nextButton = findViewById(R.id.nextButton);

        taskManager = new TaskManager(categories, players);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stepText.setText(taskManager.getNextTaskText());
            }
        });

        stepText.setText(taskManager.getNextTaskText());
    }
}
