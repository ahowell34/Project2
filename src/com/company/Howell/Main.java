//Alysyn Howell 1/30/2020 Prog Fundamentals for Android
package com.company.Howell;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static  ArrayList<Task> list = new ArrayList<>();

    public static void main(String[] args) {
        try {
        Scanner input = new Scanner(System.in);
        int answer = userInput();
            while (answer >= 0 || answer < 6) {
                if (answer == 0) {
                    exit();
                }
                if (answer == 1) {
                    Task task1 = add();
                    list.add(task1);
                    System.out.println("Your task has been added.");
                    answer = userInput();

                }
                if (answer == 2) {
                    int removeTask = remove();
                    list.remove(removeTask);
                    System.out.println("Your task has been removed.");
                    answer = userInput();
                }
                if (answer == 3) {
                    int task = update();
                    System.out.println("What would you like to set the new task to:");
                    String newTask = input.nextLine();
                    System.out.println("What would you like to set the new description to:");
                    String newDesc = input.nextLine();
                    System.out.println("What would you like to set the new priority to:");
                    int newP = input.nextInt();
                    list.get(task).setName(newTask);
                    list.get(task).setDescription(newDesc);
                    list.get(task).setPriority(newP);
                    System.out.println("Your task has been updated.");
                    answer = userInput();
                }
                if (answer == 4) {
                    list();
                    answer = userInput();
                }
                if (answer == 5) {
                    listP();
                    answer = userInput();
                }
                if (answer < 0 || answer >= 6) {
                    System.out.println("Sorry but you entered an invalid option. Please try again.");
                    answer = userInput();
                }
            }
        }

    catch (Exception e){

        System.out.println("You entered the wrong data, try again, you buffoon.");
        userInput();

    }

    }
    private static int userInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose an option:\n" +
                "(1) Add a task.\n" +
                "(2) Remove a task.\n" +
                "(3) Update a task.\n" +
                "(4) List all tasks.\n" +
                "(5) List tasks in a certain priority.\n" +
                "(0) Exit.");
        return input.nextInt();
    }
    private static Task add(){
        String name = addName();
        String description = addDescription();
        int priority = addPriority();
        return new Task(name, description, priority);
    }
    private static String addName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please name your task.");
        return input.nextLine();
    }
    private static String addDescription(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please describe your task.");
        return input.nextLine();
    }
    private static int addPriority(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please rate your tasks priority from 0-5.");
        return input.nextInt();
    }
    private static int remove(){
        Scanner input = new Scanner(System.in);
        System.out.println("Which item would you like to remove.");
        return input.nextInt();
    }

    private static int update(){
        Scanner input = new Scanner(System.in);
        System.out.println("Which item would you like to update.");
        return input.nextInt();
    }
    private static void list(){
        System.out.println("Here is your list.");
        for(Task task1 : list){
            System.out.println(task1);
        }

    }
    private static void listP(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the task priority that you want to see.");
        int priority = input.nextInt();
            for (Task task1 : list) {
                if (task1.getPriority() == priority){
                    System.out.println("Here is your list.");
                    System.out.println(task1);
                }
            }
        }
    private static void exit(){
        System.exit(0);
    }
}
