package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

    Room Room1 = new Room(1, "On the wall are these words in red: KILL ALL MONSTERS OR DIE. There is a door to the south.", "", "room2", new ArrayList<String>(Collections.singleton("sword")));
    Room Room2 = new Room(2, "You are in another room.", "room1", "", new ArrayList<String>());

    Player Player1 = new Player("room1", "", new ArrayList<String>());

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to Jays adventure!");
        enterRoom(Room1);
//        System.out.println("You are currently in a room: " + Room1.getDescription());
//        System.out.println("There is a door to the south.");
//        System.out.println("The item(s) in the room are: " + Room1.getObjects());
//        System.out.println("You have 2 options: 'go south' or 'take weapon'");

        System.out.println("You have 2 options: 'go south' or take " + Room1.getObjects());


        // Hashmap of the options (option: room)/ (option: take)

        HashMap<String, Room> options = new HashMap<String, Room>();
        options.put("take weapon", Room1);
        options.put("go south", Room2);
        options.put("go north", Room1);

        String option = myScanner.nextLine();
        executeOption(option, options, Player1);

    }

    public static void executeOption(String option, HashMap<String, Room> rooms, Player Player1) {
        switch (option) {
            case "go south":
                enterRoom(rooms.get(option.toLowerCase()));
//                executeOption(option, rooms, Player1);
                break;
            case "take weapon":
                pickItem(Player1, rooms.get(option.toLowerCase()));
                break;
            case "go north":
                enterRoom(rooms.get(option.toLowerCase()));
//                executeOption(option, rooms, Player1);
            default:
                System.out.println("Pick one of the options");
                printControls();
//                String option = myScanner.nextLine();
//                executeOption(option, options, Player1);
        }
    }


//    public static void executeOption(String option) {
//        switch (option) {
//            case "go south":
//                enterRoom(Room2);
//                break;
//            case "take ":
//                pickItem(Player1, Room1);
//                break;
//            default:
//                System.out.println("Pick one of the options");
//        }
//
//    }


    public static void enterRoom(Room room) {
        System.out.println("You are in a room");
        System.out.println(room.getDescription());

        if (room.getObjects().size() != 0) {
            System.out.println("The object(s) in the room: " + room.getObjects());
        }
        if (room.getNorth().length() != 0) {
            System.out.println("There is a door to the North.");
        }
        if (room.getSouth().length() != 0) {
            System.out.println("There is a door to the South.");
        }
        System.out.println("What's your move?");
//        Scanner myScanner = new Scanner(System.in);
//        String option = myScanner.nextLine();
//        Scanner myScanner = new Scanner(System.in);
//        String option = myScanner.nextLine();
//        executeOption(option, options,);
    }


    // Get the items from the room
    // Add the item to the students inventory array
    // Remove object from room
    // Return the student with item
    // Give them details of the room and what to do next
    public static void pickItem(Player currentPlayer, Room currentRoom) {
        System.out.println("You have picked up a " + currentRoom.getObjects());
        System.out.println("What's your move?");
        currentPlayer.getInventory().add(currentRoom.getObjects().toString());
        System.out.println(currentPlayer.getInventory());
        currentRoom.getObjects().remove(0);
        System.out.println(currentRoom.getObjects());
    }



    // Player has 50/50 chance of living
    // if probability is > 50 then they live and can move on to the other room
    // else they die and game ends
//    public static void playerkilled(Player currentPlayer, Room currentRoom) {
//        double deathProbability = ((Math.random() * (100 - 0)) + 0);
//        if (currentRoom.getEnemy.size != 0) {
//            if (deathProbability > 50) {
//                System.out.println("You have been killed by the " + currentRoom.getEnemy);
//                System.out.println("Game over!");
//
//            } else {
//                System.out.println("You managed to escape the monster");
//            }
//        }
//    }

    // Prints the instructions the user can input to play
    public static void printControls() {
        System.out.println("You can either, take weapon, go 'room direction' or kill enemy");
    }


    // Player can kill enemy if they have right weapon
    // Check if player has a weapon
    // If player has weapon kill the enemy
    // Else player is killed
    public static void killMonster(Player currentPlayer, Room currentRoom) {

    }

}
