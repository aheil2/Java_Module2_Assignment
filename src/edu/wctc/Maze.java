package edu.wctc;


import java.util.Scanner;

public class Maze {
    private Room currentRoom;
    private Player player;

    private boolean isFinished;

    //A constructor that accepts a Player object as an argument and assigns it to the field. The Maze constructor creates all of the Room objects in the game and connects them using the Rooms' setter methods. The Room in which the Player begins the game is assigned to the currentRoom field. (See below for instructions on creating concrete Room classes.)
    public Maze(Player player) {
        isFinished = false;
        this.player = player;
    }

    public Maze() {
        Room dark = new DarkRoom();
        Room gray = new GrayRoom();
        Room light = new LightRoom();
        Room exit = new EscapeRoom();

        dark.setNorth(dark);
        dark.setUp(gray);
        gray.setDown(gray);
        gray.setSouth(gray);
        gray.setUp(light);
        light.setDown(gray);
        light.setWest(light);
        light.setUp(exit);

        currentRoom = dark;

        System.out.println("You have entered " + currentRoom.getName());
        System.out.println(getCurrentRoomDescription());
        System.out.println("1. Interact with room");
        System.out.println("2. Loot room");
        System.out.println("3. Check doors");
        System.out.println("4. Take escape route");
        Scanner keyboard = new Scanner(System.in);
        int choice = Integer.parseInt(keyboard.nextLine());
        switch (choice) {
            case 1:
                System.out.println(interactWithCurrentRoom());
                break;
            case 2:
                System.out.println(lootCurrentRoom());
                break;
            case 3:
                System.out.println(getCurrentRoomExits());;
                break;
            case 4:
                System.out.println(exitCurrentRoom());;
                break;
        }


    }
    //A method named exitCurrentRoom that returns a String. If the currentRoom is an Exit, it returns the result of calling exit() on the Room. If not, it returns a message that the current room is not exitable.
    public String exitCurrentRoom() {
        if (currentRoom instanceof Exit) {
            isFinished = true;
            System.out.println("Score: " + player.getScore());
            System.out.println("Inventory: " + player.getInventory());
            System.out.println("Goodbye");
            return ((Exit)currentRoom).exit(player);
        }
        return "Current room is not exitable.";
    }
    //A method named interactWithCurrentRoom that returns a String. If the currentRoom is Interactable, it returns the result of calling interact on the Room. If not, it returns a message that no interactions are possible.
    public String interactWithCurrentRoom() {
        if (currentRoom instanceof Interactable) {
            return ((Interactable)currentRoom).interact(player);
        }
        return "No interactions are possible.";
    }
    //A method named lootCurrentRoom that returns a String. If the currentRoom is Lootable, it returns the result of calling loot on the Room. If not, it returns a message that the current room is not lootable.
    public String lootCurrentRoom() {
        if (currentRoom instanceof Lootable) {
            return ((Lootable)currentRoom).loot(player);
        }
        return "Current room is not lootable.";
    }
    //A method named move that accepts a char argument for the direction and returns a boolean. If the direction is valid to move from within the currentRoom, the adjoining Room becomes the new currentRoom and the method returns true. If not, the method returns false.
//    public boolean move() {
//
//    }
    
    public String getPlayerInventory() {
        return String.valueOf(player.getInventory());
    }
    public int getPlayerScore() {
        return player.getScore();
    }
    public String getCurrentRoomDescription() {
        return currentRoom.getDescription();
    }
    public String getCurrentRoomExits() {
        return currentRoom.getExits();
    }
    public boolean isFinished() {
        return true;
    }
}
