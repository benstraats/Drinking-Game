package com.straats.ben.testapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button startGameButton;
    private Button addPlayerButton;
    private EditText playerText;
    private TextView textView;
    private ArrayList<String> players = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerText = findViewById(R.id.playerBox);

        startGameButton = findViewById(R.id.startGameButton);
        addPlayerButton = findViewById(R.id.addPlayerButton);

        textView = findViewById(R.id.textView);

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
        addPlayer(v);

        if (players.size() < 2) {
            Toast.makeText(getApplicationContext(), "You must have atleast 2 players to play", Toast.LENGTH_LONG).show();
        } else {
            String[] playerNames = players.toArray(new String[players.size()]);

            Intent startGameIntent = new Intent(this, GameActivity.class);
            startGameIntent.putExtra(Utils.PLAYERS, playerNames);
            startActivity(startGameIntent);
        }
    }

    private void addPlayer(View v) {
        String parsedPerson = playerText.getText().toString().trim();

        if (!parsedPerson.equals("")) {
            players.add(parsedPerson);
            playerText.setText("");

            String newTextViewString = textView.getText().toString() + "\n";

            if (players.size() == 1) {
                newTextViewString += "Players:\n";
            }

            newTextViewString += parsedPerson;

            textView.setText(newTextViewString);
        }
    }
}
