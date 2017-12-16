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
            "Categories",
            "Sexual",
            "Rules",
            "Voting",
            "Truth or Dare"
    };

    static ArrayList<Task> getAllTasks() {
        ArrayList<Task> allTasks = new ArrayList<>();

        //GENERAL
        allTasks.add(new Task(PLAYER_SEPERATORS[0] + " drink 1 time.", 1, 3, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " drink 2 times.", 1, 2, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " drink 3 times.", 1, 2, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " drink 4 times.", 1, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " give out 1 drink.", 1, 3, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " give out 2 drinks.", 1, 2, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " give out 3 drinks.", 1, 2, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " give out 4 drinks.", 1, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " take a shot.", 1, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " give out a shot.", 1, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " and " + Utils.PLAYER_SEPERATORS[1] + " have to high five within 3 seconds or drink twice.", 2, 2, "General", -1));
        allTasks.add(new Task("Last one to put their finger on their nose drinks 2 times", 0, 1, "General", -1));
        allTasks.add(new Task("Everyone drink until " + Utils.PLAYER_SEPERATORS[0] + " says stop.", 1, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " take 1 drink of " + Utils.PLAYER_SEPERATORS[1] + "'s drink.", 2, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " take 2 drinks of " + Utils.PLAYER_SEPERATORS[1] + "'s drink.", 2, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " and " + Utils.PLAYER_SEPERATORS[1] + " have to swap drinks.", 2, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " and " + Utils.PLAYER_SEPERATORS[1] + " have to swap seats.", 2, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " drink 1 time and hand out 1 drink.", 1, 3, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " drink 2 times and hand out 2 drinks.", 1, 2, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " drink 3 times and hand out 3 drinks.", 1, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " choose a person and you both have to chug for as long as you choose.", 1, 1, "General", -1));
        allTasks.add(new Task("2 drinks for the boys.", 0, 1, "General", -1));
        allTasks.add(new Task("2 drinks for the girls.", 0, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " pour one out for the boys into "  + Utils.PLAYER_SEPERATORS[1] + "'s mouth. Pour for as long as you feel necessary.", 2, 1, "General", -1));
        allTasks.add(new Task("Drink 2 times if you support feminism.", 0, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " name someones birthday that\'s playing the game or drink 4 times.", 1, 1, "General", -1));
        allTasks.add(new Task("Everyone can give away 1 drink.", 0, 1, "General", -1));
        allTasks.add(new Task("Everyone can give away 2 drinks.", 0, 1, "General", -1));
        allTasks.add(new Task("Everyone drink 1 time.", 0, 2, "General", -1));
        allTasks.add(new Task("Everyone drink 2 times.", 0, 1, "General", -1));
        allTasks.add(new Task("Compliments about " + Utils.PLAYER_SEPERATORS[0] + ", first person to not have a compliment within 3 seconds drinks 3 times." + Utils.PLAYER_SEPERATORS[1] + " starts.", 2, 1, "General", -1));
        allTasks.add(new Task("Drink 2 times if you drank earlier this week.", 0, 1, "General", -1));
        allTasks.add(new Task("Drink 2 times if you live alone.", 0, 1, "General", -1));
        allTasks.add(new Task("Drink 4 times if you live with your parents.", 0, 1, "General", -1));
        allTasks.add(new Task("Drink once if you're wearing a piece of blue clothing.", 0, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " give " + Utils.PLAYER_SEPERATORS[1] + " your drink to try for 3 sips.", 2, 1, "General", -1));
        allTasks.add(new Task("Everyone take a sip of " + Utils.PLAYER_SEPERATORS[0] + "'s drink.", 1, 1, "General", -1));
        allTasks.add(new Task("Drink if you think " + Utils.PLAYER_SEPERATORS[0] + " is a good person.", 1, 1, "General", -1));
        allTasks.add(new Task("Drink if you think " + Utils.PLAYER_SEPERATORS[0] + " is a bad person.", 1, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " try everyones drink.", 1, 1, "General", -1));
        allTasks.add(new Task("Name the persons middle name thats sitting to the right of you or drink 3 times.", 0, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " and " + Utils.PLAYER_SEPERATORS[1] + " have to rock, paper, scissors. Loser drink 3 times.", 2, 1, "General", -1));
        allTasks.add(new Task("Person who lives the farthest give out 4 drinks.", 0, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " pour some of your drink into the communal cup.", 1, 6, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " drink the communal cup.", 1, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " flip a coin and call the result. If you're correct give out 3 drinks, if you're wrong drink 3 times.", 1, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " and " + Utils.PLAYER_SEPERATORS[1] + " have to swap seats or drink 5 times each.", 2, 1, "General", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " and " + Utils.PLAYER_SEPERATORS[1] + " have to swap seats or drink 5 times each.", 2, 1, "General", -1));

        //CATEGORIES
        allTasks.add(new Task("Car companies. " + Utils.PLAYER_SEPERATORS[0] + " starts. Loser drinks 3 times.", 1, 1, "Categories", -1));
        allTasks.add(new Task("Songs by the Beatles. " + Utils.PLAYER_SEPERATORS[0] + " starts. Loser drinks 5 times", 1, 1, "Categories", -1));
        allTasks.add(new Task("Types of cereal, loser drinks 4 times. " + Utils.PLAYER_SEPERATORS[0] + " starts.", 1, 1, "Categories", -1));
        allTasks.add(new Task("Types of flowers, loser drinks 2 times. " + Utils.PLAYER_SEPERATORS[0] + " starts.", 1, 1, "Categories", -1));
        allTasks.add(new Task("Movies in the marvel universe, loser drinks 4 times. " + Utils.PLAYER_SEPERATORS[0] + " starts.", 1, 1, "Categories", -1));
        allTasks.add(new Task("Name Jedis or Siths. " + Utils.PLAYER_SEPERATORS[0] + " goes first. Loser drinks 3 times.", 1, 1, "Categories", -1));
        allTasks.add(new Task("Categories of cars. " + Utils.PLAYER_SEPERATORS[0] + " starts. Loser drinks 3 times.", 1, 1, "Categories", -1));
        allTasks.add(new Task("Different types of juice. " + Utils.PLAYER_SEPERATORS[0] + " starts. Loser drinks 3 times.", 1, 1, "Categories", -1));
        allTasks.add(new Task("Bad movie remakes. " + Utils.PLAYER_SEPERATORS[0] + " starts. Loser drinks 3 times.", 1, 1, "Categories", -1));
        allTasks.add(new Task("Name fast food chains. " + Utils.PLAYER_SEPERATORS[0] + " starts. Loser drinks 3 times.", 1, 1, "Categories", -1));
        allTasks.add(new Task("Name company slogans. " + Utils.PLAYER_SEPERATORS[0] + " starts. Loser drinks 3 times.", 1, 1, "Categories", -1));
        allTasks.add(new Task("Words that rhyme with bat. " + Utils.PLAYER_SEPERATORS[0] + " starts. Loser drinks 3 times.", 1, 1, "Categories", -1));
        allTasks.add(new Task("Words that start with Q. " + Utils.PLAYER_SEPERATORS[0] + " starts. Loser drinks 3 times.", 1, 1, "Categories", -1));
        allTasks.add(new Task("Types of salad. " + Utils.PLAYER_SEPERATORS[0] + " starts. Loser drinks 3 times.", 1, 1, "Categories", -1));
        allTasks.add(new Task("Types of trees. " + Utils.PLAYER_SEPERATORS[0] + " starts. Loser drinks 3 times.", 1, 1, "Categories", -1));
        allTasks.add(new Task("Types of birds. " + Utils.PLAYER_SEPERATORS[0] + " starts. Loser drinks 3 times.", 1, 1, "Categories", -1));

        //SEXUAL
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " must put someone else\'s finger in their mouth or finish their drink", 1, 1, "Sexual", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " must suck someone else\'s finger or finish their drink", 1, 1, "Sexual", -1));
        allTasks.add(new Task("Never have I ever. First to 3 strikes drinks 5 times. " + Utils.PLAYER_SEPERATORS[0] + " starts.", 1, 1, "Sexual", -1));
        allTasks.add(new Task("Drink 2 times if you've sucked dick.", 0, 1, "Sexual", -1));
        allTasks.add(new Task("Drink 2 times if you've eaten dat puss.", 0, 1, "Sexual", -1));
        allTasks.add(new Task("Drink 4 times if you've eaten ass.", 0, 1, "Sexual", -1));
        allTasks.add(new Task("Drink 1 time if you've kissed someone playing the game.", 0, 1, "Sexual", -1));
        allTasks.add(new Task("Drink 3 times if you've had sex with someone playing the game.", 0, 1, "Sexual", -1));
        allTasks.add(new Task("Drink 2 times if you've had sex within the past week.", 0, 1, "Sexual", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " remove a piece of clothing or drink 4 times", 1, 5, "Sexual", -1));
        allTasks.add(new Task("If you want to bang someone tonight give out 2 drinks", 0, 1, "Sexual", -1));
        allTasks.add(new Task("Dink 2 times if you've ever sent a nude.", 0, 1, "Sexual", -1));
        allTasks.add(new Task("Dink 3 times if you've ever recieved a nude.", 0, 1, "Sexual", -1));
        allTasks.add(new Task("Dink 1 time for each partner you've had.", 0, 1, "Sexual", -1));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " has to refer to everyone as daddy or mistress", 1, 1, "Sexual", 15));
        allTasks.add(new Task("Everyone vote at the same time. Whose got a bigger dick: " + Utils.PLAYER_SEPERATORS[0] + " or " + Utils.PLAYER_SEPERATORS[1] + ". Smaller dick drinks 3 times.", 2, 1, "Sexual", -1));
        allTasks.add(new Task("Everyone vote at the same time. Who sucks dick better: " + Utils.PLAYER_SEPERATORS[0] + " or " + Utils.PLAYER_SEPERATORS[1] + ". Loser drinks 3 times.", 2, 1, "Sexual", -1));
        allTasks.add(new Task("Categories of sex positions. " + Utils.PLAYER_SEPERATORS[0] + " starts. Loser drinks 3 times.", 1, 1, "Categories", -1));

        //RULES
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " now drinks whenever " + Utils.PLAYER_SEPERATORS[1] + " has to drink.", 2, 1, "Rules", 10));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " must clap between each word or drink for each missed clap.", 1, 1, "Rules", 5));
        allTasks.add(new Task("Everyone has raise their glass to " + Utils.PLAYER_SEPERATORS[0] + " before they drink or they have do double their drinking task.", 1, 1, "Rules", 5));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " can ask any question to anyone. If they get it wrong they have to drink twice.", 1, 1, "Rules", 15));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " is immune to drinking.", 1, 1, "Rules", 3));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " has to stroke their wizard beard constantly. Drink 3 times each time they stop.", 1, 1, "Rules", 5));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " has to agree with everything " + Utils.PLAYER_SEPERATORS[1] + " says and does. Or drink 3 times for each time they don't.", 2, 1, "Rules", 10));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " has to talk in a british accent. Or drink 3 times they don't.", 1, 1, "Rules", 15));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " has to talk in a australian accent. Or drink 3 times they don't.", 1, 1, "Rules", 15));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " has to talk in a swahili accent. Or drink 3 times they don't.", 1, 1, "Rules", 15));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " has to keep their mouth open or double all drink punishments.", 1, 1, "Rules", 10));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " and " + Utils.PLAYER_SEPERATORS[1] + " have to ask each other permission to talk. They drink 2 times each time they forget", 2, 1, "Rules", 10));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " and " + Utils.PLAYER_SEPERATORS[1] + " have to hold hands. They drink 3 times if they forget.", 2, 1, "Rules", 10));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " cant look anyone in the eye. They drink 4 times each time they don't.", 1, 1, "Rules", 10));
        allTasks.add(new Task(Utils.PLAYER_SEPERATORS[0] + " has to constantly look someone in the eye. They drink 4 times each time they don't.", 1, 1, "Rules", 10));


        //VOTING
        allTasks.add(new Task("Everyone vote at the same time. Best star wars movie. Winning group hands out 5 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Best Lord of the Rings character. Winning group hands out 5 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Best president of the US. Winning group hands out 5 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Best car company. Winning group hands out 5 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Best Harry Potter movie. Winning group hands out 5 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Chocolate or ice cream . Winning group hands out 5 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Worst spiderman actor. Losers drink 3 times.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Worst star wars movie. Winning group hands out 5 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Worst friend playing the game. Most voted person drinks 4 times.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Dumbest person playing the game. Most voted person drink 3 times.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Worst season. Winning group hands out 5 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Justin Bieber or Miley Cyrus. Winning group hands out 2 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Beer or wine. Winning group hands out 3 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Summer or winter. Winning group hands out 5 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Money or fame. Winning group hands out 5 drinks as a team.", 0, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Who\'s a better friend: " + Utils.PLAYER_SEPERATORS[0] + " or " + Utils.PLAYER_SEPERATORS[1] + ". Loser drinks 3 times.", 2, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Who\'s a funnier person: " + Utils.PLAYER_SEPERATORS[0] + " or " + Utils.PLAYER_SEPERATORS[1] + ". Loser drinks 3 times.", 2, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Who\'s a dumber person: " + Utils.PLAYER_SEPERATORS[0] + " or " + Utils.PLAYER_SEPERATORS[1] + ". Loser drinks 3 times.", 2, 1, "Voting", -1));
        allTasks.add(new Task("Everyone vote at the same time. Who\'s more successful: " + Utils.PLAYER_SEPERATORS[0] + " or " + Utils.PLAYER_SEPERATORS[1] + ". Loser drinks 3 times.", 2, 1, "Voting", -1));

        //TRUTH OR DARE
        allTasks.add(new Task(PLAYER_SEPERATORS[0] + " ask " + PLAYER_SEPERATORS[1] + " a truth or dare. If they don't do it they have to drink 1 time.", 2, 7, "Truth or Dare", -1));
        allTasks.add(new Task(PLAYER_SEPERATORS[0] + " ask " + PLAYER_SEPERATORS[1] + " a truth or dare. If they don't do it they have to drink 2 times.", 2, 5, "Truth or Dare", -1));
        allTasks.add(new Task(PLAYER_SEPERATORS[0] + " ask " + PLAYER_SEPERATORS[1] + " a truth or dare. If they don't do it they have to drink 3 times.", 2, 2, "Truth or Dare", -1));
        allTasks.add(new Task(PLAYER_SEPERATORS[0] + " ask " + PLAYER_SEPERATORS[1] + " a truth or dare. If they don't do it they have to drink 6 times.", 2, 1, "Truth or Dare", -1));

        return allTasks;
    }
}
