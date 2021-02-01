package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int score;
    private List<String> inventory;

    public Player(int score, List<String> inventory) {
        this.score = score;
        this.inventory = inventory;
    }
    public Player() {
        score = 0;
        inventory = new ArrayList<String>();
    }

    public void addToInventory() {
        inventory.add("Gold");
    }

    public void addToScore() {
        score += 1;
    }

    public List<String> getInventory() {
        return inventory;
    }

    public int getScore() {
        return score;
    }
}
