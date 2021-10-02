package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Game {

    public ArrayList<Room> rooms;
    public Player player;

    public Game(ArrayList<Room> rooms, Player player) {
        this.rooms = rooms;
        this.player = player;
    }

    public HashMap<String, ArrayList<Room>> getOptions() {
        return options;
    }

    public void setOptions(HashMap<String, ArrayList<Room>> options) {
        this.options = options;
    }

    HashMap<String, ArrayList<Room>> options = new HashMap<String, ArrayList<Room>>();
}

// use array of rooms to build a hash map
