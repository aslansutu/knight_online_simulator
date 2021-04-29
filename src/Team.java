import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Team
{
    ArrayList<Knight> members;
    private int totalDamage;
    private int kills;
    private int score;
    public Color teamColor;

    private final int armyCapacity = 8;

    private final int xCoordinateRed = 500;
    private final int yCoordinateRed = 250;
    private final int xCoordinateBlue = 850;
    private final int yCoordinateBlue = 400;

    //TODO

    /**
     * Is the constructor for the Team class
     * @param teamColor a specific color of the Color class
     */
    Team(Color teamColor){
        members = new ArrayList<>(armyCapacity);
        totalDamage = 0;
        kills = 0;
        score = 0;
        this.teamColor = teamColor;
    }

    /**
     * Returns the starting location of the knight. Depending on its's team,
     * a specific part of the map is chosen with a random offset
     *
     * @param teamColor color of team
     * @return  the starting coordinates of the knight as a list
     */
    public int[] getStartingCoordinate(Color teamColor){
        int[] startingPoint = new int[2];
        Random random = new Random();
        int radiusSize = 50;


        if (teamColor.equals(Color.RED)){
            startingPoint[0] = xCoordinateRed;
            startingPoint[1] = yCoordinateRed;
        }
        else if (teamColor.equals(Color.BLUE)){
            startingPoint[0] = xCoordinateBlue;
            startingPoint[1] = yCoordinateBlue;
        }

        startingPoint[0] *= random.nextInt(radiusSize);
        startingPoint[1] *= random.nextInt(radiusSize);

        return startingPoint;
    }

    /**
     * Returns the overall team score
     * @return score the overall team score
     */
    public int getScore(){
        int newScore = 0;
        for (Knight member : members) {
            newScore += member.getNationalPoints();
        }
        this.score = newScore;
        return newScore;
    }

    /**
     * Returns the total damage done by the team
     * @return totaldamage
     */
    public int getTotalDamage(){
        int newTotalDamage = 0;
        for (Knight member : members) {
            newTotalDamage += member.getTotalDamage();
        }
        this.totalDamage = newTotalDamage;
        return newTotalDamage;
    }

    /**
     * Returns the total kills by the team
     * @return kills by the team
     */
    public int getKills(){
        int newKills = 0;
        for (Knight member : members) {
            newKills += member.getKills();
        }
        this.kills = newKills;
        return newKills;
    }
}