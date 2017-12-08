package com.straats.ben.testapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button startGameButton;
    private Button addPlayerButton;
    private ArrayList<EditText> players = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText player1Text = findViewById(R.id.player1);
        EditText player2Text = findViewById(R.id.player2);

        players.add(player1Text);
        players.add(player2Text);

        startGameButton = findViewById(R.id.startGameButton);
        addPlayerButton = findViewById(R.id.addPlayerButton);

        startGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startGame(v);
            }
        });

        addPlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPlayer(v);
            }
        });
    }

    private void startGame(View v) {
        String[] playerNames = new String[players.size()];

        for (int i=0; i<players.size(); i++) {
            playerNames[i] = players.get(i).getText().toString();
        }

        Intent startGameIntent = new Intent(this, GameActivity.class);
        startGameIntent.putExtra(Utils.PLAYERS, playerNames);
        startActivity(startGameIntent);
    }

    private void addPlayer(View v) {
    }
}
