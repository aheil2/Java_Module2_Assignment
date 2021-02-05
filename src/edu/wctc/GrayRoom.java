package edu.wctc;

public class GrayRoom extends Room implements Interactable{
    public GrayRoom() {
        super("Gray Room");
    }

    public String interact(Player player) {
        player.addToScore();
        return(player.toString());
    }

    @Override
    public String getDescription() {
        return "The room is gray and lukewarm";
    }
}
