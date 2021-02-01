package edu.wctc;

public class LightRoom extends Room {
    public LightRoom() {
        super("Light Room");
    }

    public String loot(Player player) {
        player.addToInventory();
        return player.toString();
    }

    @Override
    public String getDescription() {
        return "The room is light and warm.";
    }
}
