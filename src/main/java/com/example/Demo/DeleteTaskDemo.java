package com.example.Demo;

import java.util.ArrayList;

public class DeleteTaskDemo {
    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Buy groceries");
        tasks.add("Call doctor");
        tasks.add("Finish report");

        System.out.println("Initial Task List:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }

        String targetTask = "Call doctor";
        boolean found = false;

        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).equalsIgnoreCase(targetTask)) {
                tasks.remove(i);
                found = true;
                System.out.println("\nTask \"" + targetTask + "\" deleted successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("\nTask not found, no deletion performed.");
        }

        System.out.println("\nFinal Task List:");
        for (String task : tasks) {
            System.out.println("- " + task);

        }
    }

}
