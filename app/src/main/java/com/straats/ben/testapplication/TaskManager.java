package com.straats.ben.testapplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by ben_s on 2017-12-10.
 */

class TaskManager {

    private ArrayList<Task> tasks = new ArrayList<>();
    private String[] players;

    private int taskCounter;
    private HashMap<Integer, String> taskEnding;

    TaskManager(String[] categories, String[] players) {

        this.players = players;
        this.taskCounter = 0;
        this.taskEnding = new HashMap<Integer, String>();

        ArrayList<Task> allTasks = Utils.getAllTasks();

        for (Task task : allTasks) {
            if (task.getNumPlayers() <= players.length && Arrays.asList(categories).contains(task.getCategory())) {
                for (int i=0; i<task.getPopularity(); i++) {
                    tasks.add(task);
                }
            }
        }
    }

    String getNextTaskText() {
        int taskIndex = Utils.rand.nextInt(tasks.size());
        taskCounter++;

        if (taskEnding.get(taskCounter) != null) {
            String taskEndingString = taskEnding.get(taskCounter);
            taskEnding.remove(taskCounter);
            return taskEndingString;
        }

        Task task = tasks.get(taskIndex);
        String taskText = task.getFormattedTask(players);

        if (task.getDuration() != -1) {
            taskEnding.put(taskCounter + task.getDuration(), "The following rule no longer applies: " + taskText);
        }

        return taskText;
    }

}
