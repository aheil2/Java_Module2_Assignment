package edu.wctc;

public abstract class Room {
    private String name;
    private Room north, east, south, west, up, down;

    public Room(String name) {
        this.name = name;
    }

    public abstract String getDescription();

    // ??? is this even right?
    //A method named getAdjoiningRoom that accepts a char argument for the direction. If this Room is connected to another Room in the given direction, that Room is returned. Otherwise, return null.
    public Room getAdjoiningRoom() {
        if (north != null) return this.north;
        if (east != null) return  this.east;
        if (south != null) return  this.south;
        if (west != null) return  this.west;
        if (up != null) return  this.up;
        if (down != null) return  this.down;
        else return null;
    }
//
//    //A method named getExits that returns a String. The String should be a list of all of the directions the Player could exit from this Room to another Room.
    public String getExits() {
        return toString();
    }

    //A method named getName that returns the name of the Room.
    public String getName() {
        return name;
    }

    //A method named isValidDirection that accepts a char argument for the direction. If this Room is connected to another Room in the given direction, return true. Otherwise, return false.
//    public boolean isValidDirection() {
//
//    }

    //Setters
    public void setNorth(Room north) {
        this.north = north;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void setUp(Room up) {
        this.up = up;
    }

    public void setDown(Room down) {
        this.down = down;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (north != null) {
            sb.append(north.name);
        }
        else if (east != null) {
            sb.append(east.name);
        }
        else if (south != null) {
            sb.append(south.name);
        }
        else if (west != null) {
            sb.append(west.name);
        }
        else if (up != null) {
            sb.append(up.name);
        }
        else if (down != null) {
            sb.append(down.name);
        }
        return sb.toString();
    }
}
