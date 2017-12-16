package com.straats.ben.testapplication;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ben_s on 2017-12-07.
 */

class Utils {

    //Want a static seed
    static Random rand = new Random();

    static String PLAYERS_KEY = "come.straats.ben.testapplication.PLAYERS";
    static String CATEGORIES_KEY = "come.straats.ben.testapplication.CATEGORIES";

    static int CHECKLIST_ID = 2398;

    static String[] PLAYER_SEPERATORS = {"SsSs",
            "TtTt",
            "XxXx",
            "YyYy"
    };

    static String[] CATEGORIES = {"General",
            "Sexual",
            "Categories",
            "Voting",
            "Rules"
    };

    static ArrayList<Task> getAllTasks() {
        ArrayList<Task> allTasks = new ArrayList<>();

        allTasks.add(new Task(PLAYER_SEPERATORS[0] + " drink 1 time.", 1, 5, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " drink 2 times.", 1, 4, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " drink 3 times.", 1, 3, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " drink 4 times.", 1, 2, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " give out 1 drink.", 1, 5, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " give out 2 drink.", 1, 4, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " give out 3 drink.", 1, 3, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " give out 4 drink.", 1, 2, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " take a shot.", 1, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " give out a shot.", 1, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " give out a shot.", 1, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " and " + Utils.PLAYER_SEPERATORS[1] + " have to high five within 3 seconds or drink twice.", 2, 2, "General", -1));
        allTasks.add(new Task("Categories of cars. " + Utils.PLAYER_SEPERATORS[0] + " starts. Loser drinks 3 times.", 1, 1, "Categories", -1));
        allTasks.add(new Task("Last one to put their finger on their nose drinks 2 times", 0, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " must put someone else\'s finger in their mouth or finish their drink", 1, 1, "Sexual", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " must suck someone else\'s finger or finish their drink", 1, 1, "Sexual", -1));
        allTasks.add(new Task("Everyone drink until " + Utils.PLAYER_SEPERATORS[0] + " says stop.", 1, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " now drinks whenever " + Utils.PLAYER_SEPERATORS[1] + " has to drink.", 2, 1, "Rules", 5));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " take 1 drink of " + Utils.PLAYER_SEPERATORS[1] + "'s drink.", 2, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " take 2 drinks of " + Utils.PLAYER_SEPERATORS[1] + "'s drink.", 2, 1, "General", -1));
        allTasks.add(new Task("Songs by the Beatles. " + Utils.PLAYER_SEPERATORS[0] + " starts. Loser drinks 5 times", 1, 1, "Categories", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " and " + Utils.PLAYER_SEPERATORS[1] + " have to swap drinks.", 2, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " and " + Utils.PLAYER_SEPERATORS[1] + " have to swap seats.", 2, 1, "General", -1));
        allTasks.add(new Task("Types of cereal, loser drinks 4 times. " + Utils.PLAYER_SEPERATORS[0] + " starts.", 1, 1, "Categories", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " must clap between each word or drink for each missed clap.", 1, 1, "Rules", 5));
        allTasks.add(new Task("Everyone has raise their glass to " + Utils.PLAYER_SEPERATORS[0] + " before they drink or they have do double their drinking task.", 1, 1, "Rules", 5));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " can ask any question to anyone. If they get it wrong they have to drink twice.", 1, 1, "Rules", 5));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " drink 1 time and hand out 1 drink.", 1, 3, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " drink 2 times and hand out 2 drinks.", 1, 2, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " drink 3 times and hand out 3 drinks.", 1, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " choose a person and you both have to chug for as long as you choose.", 1, 1, "General", -1));
        allTasks.add(new Task("2 drinks for the boys.", 0, 1, "General", -1));
        allTasks.add(new Task("2 drinks for the girls.", 0, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " pour one out for the boys into "  + Utils.PLAYER_SEPERATORS[0] + "'s mouth. Pour for as long as you feel necessary.", 2, 1, "General", -1));
        allTasks.add(new Task("Drink 2 times if you support feminism.", 0, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " name someones birthday that\'s playing the game or drink 4 times.", 1, 1, "General", -1));
        allTasks.add(new Task("Everyone can give away 1 drink.", 0, 1, "General", -1));
        allTasks.add(new Task("Everyone can give away 2 drinks.", 0, 1, "General", -1));
        allTasks.add(new Task("Everyone drink 1 time.", 0, 2, "General", -1));
        allTasks.add(new Task("Everyone drink 2 times.", 0, 1, "General", -1));
        allTasks.add(new Task("Compliments about " + Utils.PLAYER_SEPERATORS[0] + ", first person to not have a compliment within 3 seconds drinks 3 times." + Utils.PLAYER_SEPERATORS[1] + " starts.", 2, 1, "General", -1));
        allTasks.add(new Task("Drink 2 times if you drank earlier this week.", 0, 1, "General", -1));
        allTasks.add(new Task("Drink once if you're wearing a piece of blue clothing.", 0, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " give " + Utils.PLAYER_SEPERATORS[1] + " your drink to try for 3 sips.", 2, 1, "General", -1));
        allTasks.add(new Task("Everyone take a sip of " + Utils.PLAYER_SEPERATORS[0] + "'s drink.", 1, 1, "General", -1));
        allTasks.add(new Task("Drink if you think " + Utils.PLAYER_SEPERATORS[0] + " is a good person.", 1, 1, "General", -1));
        allTasks.add(new Task("Drink if you think " + Utils.PLAYER_SEPERATORS[0] + " is a bad person.", 1, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " try everyones drink.", 1, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " is immune to drinking.", 1, 1, "Rules", 5));
        allTasks.add(new Task("Name the persons middle name thats sitting to the right of you or drink 3 times.", 0, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " and " + Utils.PLAYER_SEPERATORS[1] + " have to rock, paper, scissors. Loser drink 3 times.", 2, 1, "General", -1));
        allTasks.add(new Task("Types of flowers, loser drinks 2 times. " + Utils.PLAYER_SEPERATORS[0] + " starts.", 1, 1, "Categories", -1));
        allTasks.add(new Task("Movies in the marvel universe, loser drinks 4 times. " + Utils.PLAYER_SEPERATORS[0] + " starts.", 1, 1, "Categories", -1));
        allTasks.add(new Task("Person who lives the farthest give out 4 drinks.", 0, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " pour some of your drink into the communal cup.", 1, 6, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " drink the communal cup.", 1, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " flip a coin and call the result. If you're correct give out 3 drinks, if you're wrong drink 3 times.", 1, 1, "General", -1));
        allTasks.add(new Task("Name Jedis or Siths. " + Utils.PLAYER_SEPERATORS[0] + " goes first. Loser drinks 3 times.", 1, 1, "Categories", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " has to stroke their wizard beard constantly.", 1, 1, "Rules", 5));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " and " + Utils.PLAYER_SEPERATORS[1] + " have to swap seats or drink 5 times each.", 2, 1, "General", -1));
        allTasks.add(new Task("Everyone vote at the same time. Best star wars movie. Winning group hands out 5 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Best Lord of the Rings character. Winning group hands out 5 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Best president of the US. Winning group hands out 5 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Best car company. Winning group hands out 5 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Best Harry Potter movie. Winning group hands out 5 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Best . Winning group hands out 5 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Worst spiderman actor. Losers drink 3 times.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Worst . Winning group hands out 5 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Worst . Winning group hands out 5 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Worst . Winning group hands out 5 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Worst . Winning group hands out 5 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Worst . Winning group hands out 5 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Worst . Winning group hands out 5 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Justin Bieber or Miley Cyrus. Winning group hands out 5 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Beer or wine. Winning group hands out 5 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Summer or winter. Winning group hands out 5 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Money of fame. Winning group hands out 5 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " and " + Utils.PLAYER_SEPERATORS[1] + " have to swap seats or drink 5 times each.", 2, 1, "General", -1));

        return allTasks;
    }
}
