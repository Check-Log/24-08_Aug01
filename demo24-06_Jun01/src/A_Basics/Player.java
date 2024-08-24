package A_Basics;

import java.util.ArrayList;
import java.util.Map;

public class Player {

    private int playerId;
    private String playerName;
    private double power;
    private float experiencePoints;
    private ArrayList<String> perks;
    private Map<Integer, String> moves;

    //polymorphic constructors
    public Player(int playerId, String playerName,ArrayList<String>perks){
        this.playerId = playerId;
        this.playerName = playerName;
        this.perks = perks;
    }

    public Player(int playerId, String playerName, double power, float experiencePoints, ArrayList<String> perks, Map<Integer, String> moves) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.power = power;
        this.experiencePoints = experiencePoints;
        this.perks = perks;
        this.moves = moves;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(float experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public ArrayList<String> getPerks() {
        return perks;
    }

    public void setPerks(ArrayList<String> perks) {
        this.perks = perks;
    }

    public Map<Integer, String> getMoves() {
        return moves;
    }

    public void setMoves(Map<Integer, String> moves) {
        this.moves = moves;
    }




}
