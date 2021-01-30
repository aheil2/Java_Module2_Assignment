package edu.wctc;

import java.util.Arrays;

public class Maze {
    private Room currentRoom;
    private Player player;
    //where does this bool get initialized false?
    private boolean isFinished;

    //A constructor that accepts a Player object as an argument and assigns it to the field. The Maze constructor creates all of the Room objects in the game and connects them using the Rooms' setter methods. The Room in which the Player begins the game is assigned to the currentRoom field. (See below for instructions on creating concrete Room classes.)
    public Maze(Player player) {
        this.player = player;
    }
    //A method named exitCurrentRoom that returns a String. If the currentRoom is an Exit, it returns the result of calling exit() on the Room. If not, it returns a message that the current room is not exitable.
//    public String exitCurrentRoom() {
//
//    }
    //A method named interactWithCurrentRoom that returns a String. If the currentRoom is Interactable, it returns the result of calling interact on the Room. If not, it returns a message that no interactions are possible.
//    public String interactWithCurrentRoom() {
//
//    }
    //A method named lootCurrentRoom that returns a String. If the currentRoom is Lootable, it returns the result of calling loot on the Room. If not, it returns a message that the current room is not lootable.
//    public String lootCurrentRoom() {
//
//    }
    //A method named move that accepts a char argument for the direction and returns a boolean. If the direction is valid to move from within the currentRoom, the adjoining Room becomes the new currentRoom and the method returns true. If not, the method returns false.
//    public boolean move() {
//
//    }
    
    public String getPlayerInventory() {

    }
    public int getPlayerScore() {

    }
    public String getCurrentRoomDescription() {

    }
    public String getCurrentRoomExits() {

    }
    public boolean isFinished() {

    }
}
