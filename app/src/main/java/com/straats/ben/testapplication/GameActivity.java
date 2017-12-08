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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        stepText = findViewById(R.id.stepText);
        nextButton = findViewById(R.id.nextButton);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stepText.setText(getNextTask());
            }
        });

        Intent intent = getIntent();
        players = intent.getStringArrayExtra(Utils.PLAYERS);

        stepText.setText(getNextTask());
    }

    private String getNextTask() {
        ArrayList<Integer> indicesUsed = new ArrayList<>();

        String task = Utils.tasks[Utils.rand.nextInt(Utils.tasks.length)];
        String[] splitString = task.split(Pattern.quote(Utils.PLAYER_SEPERATOR));

        String formattedTask = splitString[0];
        for (int i=0; i<splitString.length-1; i++) {
            int randomIndex = Utils.rand.nextInt(players.length);

            if (!indicesUsed.contains(randomIndex)) {
                indicesUsed.add(randomIndex);
                formattedTask += players[randomIndex] + splitString[i+1];
            } else {
                i--;
            }
        }

        return formattedTask;
    }
}
