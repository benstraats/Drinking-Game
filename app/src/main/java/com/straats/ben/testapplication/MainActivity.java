package com.straats.ben.testapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
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

        LinearLayout ll = findViewById(R.id.linearLayout);
        for (int i=0; i<Utils.CATEGORIES.length; i++) {
            CheckBox cb = new CheckBox(getApplicationContext());
            cb.setText(Utils.CATEGORIES[i]);
            cb.setId(Utils.CHECKLIST_ID + i);
            ll.addView(cb);
        }
    }

    private void startGame(View v) {
        addPlayer(v);

        if (players.size() < 2) {
            Toast.makeText(getApplicationContext(), "You must have atleast 2 players to play", Toast.LENGTH_LONG).show();
        } else {
            ArrayList<String> categories = new ArrayList<>();
            for (int i=0; i<Utils.CATEGORIES.length; i++) {
                CheckBox cb = findViewById(Utils.CHECKLIST_ID + i);
                if (cb.isChecked()) {
                    categories.add(Utils.CATEGORIES[i]);
                }
            }

            if (categories.size() < 1) {
                Toast.makeText(getApplicationContext(), "You must choose atleast 1 category", Toast.LENGTH_LONG).show();
                return;
            }

            String[] playerNames = players.toArray(new String[players.size()]);
            String[] categoryNames = categories.toArray(new String[categories.size()]);

            Intent startGameIntent = new Intent(this, GameActivity.class);
            startGameIntent.putExtra(Utils.PLAYERS_KEY, playerNames);
            startGameIntent.putExtra(Utils.CATEGORIES_KEY, categoryNames);
            startActivity(startGameIntent);
        }
    }

    private void addPlayer(View v) {
        String parsedPerson = playerText.getText().toString().trim();

        if (!parsedPerson.equals("")) {
            players.add(parsedPerson);
            playerText.setText("");

            String newTextViewString = textView.getText().toString();

            if (players.size() == 1) {
                newTextViewString = "Players: ";
            } else {
                newTextViewString += ", ";
            }

            newTextViewString += parsedPerson;

            textView.setText(newTextViewString);
        }
    }
}
