package com.company;

import java.util.ArrayList;

public class Monster {

    public String name;
    public ArrayList<String> killedBy;
    public boolean alive;

    public Monster(String name, ArrayList<String> killedBy, boolean alive) {
        this.name = name;
        this.killedBy = killedBy;
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getKilledBy() {
        return killedBy;
    }

    public void setKilledBy(ArrayList<String> killedBy) {
        this.killedBy = killedBy;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
