package com.straats.ben.testapplication;

import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * Created by ben_s on 2017-12-13.
 */

class Task {

    private String text;
    private int numPlayers;
    private int popularity;
    private String category;
    private int duration;

    Task(String text, int numPlayers, int popularity, String category, int duration) {
        this.text = text;
        this.numPlayers = numPlayers;
        this.popularity = popularity;
        this.category = category;
        this.duration = duration;
    }

    String getFormattedTask(String[] players) {
        String formattedText = text;
        ArrayList<Integer> chosenPlayers = new ArrayList<>();

        for (int i=0; i<numPlayers; i++) {
            int chosenPlayer = Utils.rand.nextInt(players.length);
            if (chosenPlayers.contains(chosenPlayer)) {
                i--;
            } else {
                formattedText = formattedText.replaceAll(Pattern.quote(Utils.PLAYER_SEPERATORS[i]), players[chosenPlayer]);
                chosenPlayers.add(chosenPlayer);
            }
        }

        return formattedText;
    }

    int getNumPlayers() {
        return numPlayers;
    }

    int getPopularity() {
        return popularity;
    }

    String getCategory() { return category; }

    int getDuration() { return duration; }
}
