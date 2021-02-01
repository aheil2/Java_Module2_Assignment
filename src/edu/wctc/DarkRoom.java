package edu.wctc;

public class DarkRoom extends Room {
    public DarkRoom() {
        super("Dark Room");
    }

    public String interact(Player player) {
        player.addToScore();
        return player.toString();
    }

    @Override
    public String getDescription() {
        return "The room is dark and cold.";
    }
}
