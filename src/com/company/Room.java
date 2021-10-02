package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Room {

    private int id;
    private String description;
    private String north;
    private String south;
//    private String[] objects;
    private ArrayList<String> objects;
//    private HashMap<String, String> monster;
    private Monster monster;


//    public Room(int id, String description, String north, String south, String[] objects) {
//        this.id = id;
//        this.description = description;
//        this.north = north;
//        this.south = south;
////        this.objects = objects;
//    }

//    public Room(int id, String description, String north, String south, ArrayList<String> objects) {
//        this.id = id;
//        this.description = description;
//        this.north = north;
//        this.south = south;
//        this.objects = objects;
//    }


    public Room(int id, String description, String north, String south, ArrayList<String> objects, Monster monster) {
        this.id = id;
        this.description = description;
        this.north = north;
        this.south = south;
        this.objects = objects;
        this.monster = monster;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNorth() {
        return north;
    }

    public void setNorth(String north) {
        this.north = north;
    }

    public String getSouth() {
        return south;
    }

    public void setSouth(String south) {
        this.south = south;
    }

//    public ArrayList<String> getObjects() {
//        return Arrays.toString(objects);
//    }
//
//    public void setObjects(String[] objects) {
//        this.objects = objects;
//    }

    public ArrayList<String> getObjects() {
        return objects;
    }

    public void setObjects(ArrayList<String> objects) {
        this.objects = objects;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }
}

