package edu.wctc;


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
        dark.setEast(dark);
        dark.setSouth(dark);
        dark.setWest(dark);
        dark.setUp(gray);
        gray.setDown(gray);
        gray.setNorth(gray);
        gray.setEast(gray);
        gray.setSouth(gray);
        gray.setWest(gray);
        gray.setUp(light);
        light.setDown(gray);
        light.setNorth(light);
        light.setEast(light);
        light.setSouth(light);
        light.setWest(light);
        light.setUp(exit);


        currentRoom = dark;

    }
    //A method named exitCurrentRoom that returns a String. If the currentRoom is an Exit, it returns the result of calling exit() on the Room. If not, it returns a message that the current room is not exitable.
    public String exitCurrentRoom() {
        if (currentRoom instanceof Exit) {
            isFinished = true;
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
    public boolean move() {
        Room temp = currentRoom.getAdjoiningRoom();
        if(temp != null) {
            currentRoom = temp;
            return true;
        }
        else {
            return false;
        }
    }
    
    public String getPlayerInventory() {
        return String.valueOf(player.getInventory());
    }
    public int getPlayerScore() {
        return player.getScore();
    }
    public String getCurrentRoomDescription() {
        return currentRoom.getDescription();
    }
//    public String getCurrentRoomExits() {
//        //
//    }
    public boolean isFinished() {
        return true;
    }
}
