package com.company;

import java.util.ArrayList;

public class Player {

    private String initialRoom;
    private String currentRoom;
//    private String[] equipment;
    private ArrayList<String> inventory;
    // Change equipement to arraylist
    // Is alive?

    public Player(String initialRoom, String currentRoom, ArrayList<String> inventory) {
        this.initialRoom = initialRoom;
        this.currentRoom = currentRoom;
//        this.equipment = equipment;
        this.inventory = inventory;
    }

    public String getInitialRoom() {
        return initialRoom;
    }

    public void setInitialRoom(String initialRoom) {
        this.initialRoom = initialRoom;
    }

    public String getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(String currentRoom) {
        this.currentRoom = currentRoom;
    }

//    public String[] getEquipment() {
//        return equipment;
//    }
//
//    public void setEquipment(String[] equipment) {
//        this.equipment = equipment;
//    }

    public ArrayList<String> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<String> inventory) {
        this.inventory = inventory;
    }
}
