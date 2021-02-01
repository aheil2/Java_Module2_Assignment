package edu.wctc;

public class EscapeRoom extends Room implements Exit{
    public EscapeRoom() {
        super("Escape Room");
    }

    public String exit(Player player) {

        return player.toString();
    }

    @Override
    public String getDescription() {
        return "The room is dark and cold.";
    }
}
