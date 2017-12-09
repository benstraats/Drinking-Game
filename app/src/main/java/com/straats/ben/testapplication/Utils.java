package com.straats.ben.testapplication;

import java.util.Random;

/**
 * Created by ben_s on 2017-12-07.
 */

class Utils {

    //Want a static seed
    static Random rand = new Random();

    static String PLAYERS = "come.straats.ben.testapplication.PLAYERS";

    static String PLAYER_SEPERATOR = "SsSs";

    static String[] tasks = {
            PLAYER_SEPERATOR + " drink 3 times.",
            PLAYER_SEPERATOR + " hand out 2 drinks.",
            PLAYER_SEPERATOR + " and " + PLAYER_SEPERATOR + " have to high five within 3 seconds or drink.",
            "Categories of cars. " + PLAYER_SEPERATOR + " starts.",
            "Last one to put their finger on their nose drinks 2 times",
            PLAYER_SEPERATOR + " do a shot.",
            PLAYER_SEPERATOR + " must put someone elses toe in their mouth or finish their drink",
            "Everyone drink until " + PLAYER_SEPERATOR + " says \"Moo\"",
            PLAYER_SEPERATOR + " now drinks whenever " + PLAYER_SEPERATOR + " has to drink.",
            PLAYER_SEPERATOR + " take two drinks of " + PLAYER_SEPERATOR + "'s drink."
    };
}
