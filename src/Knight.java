import java.awt.*;

public abstract class Knight
{
    protected int health;
    protected int speed;
    private Color teamColor;
    protected String typeOfKnight;

    private int nationalPoints;
    private int totalDamage;
    private int kills;

    private int xCoordinate;
    private int yCoordinate;

//--------------------------------------------------------------------------//

    /**
     * Sets the team color
     * @param colorOfTeam team color
     */
    protected void setTeamColor(Color colorOfTeam){ this.teamColor = colorOfTeam; }

    /**
     * Returns the team color of knight
     * @return teamcolor
     */
    protected Color getTeamColor(){ return this.teamColor; }

    /**
     * Sets the national points that a knight has earned
     * @param nationalPoints nationalpoints
     */
    protected void setNationalPoints(int nationalPoints){ this.nationalPoints = nationalPoints; }

    /**
     * Sets the total damage done by a knight
     * @param totalDamage total damage
     */
    protected void setTotalDamage(int totalDamage){ this.totalDamage = totalDamage; }

    /**
     * Sets the kills a knight has done
     * @param kills kill
     */
    protected void setKills(int kills){ this.kills = kills; }

    /**
     * Returns a knights national points
     * @return nationalpoints
     */
    protected int getNationalPoints(){ return this.nationalPoints; }

    /**
     * Returns a knights kills
     * @return kills
     */
    protected int getKills(){ return this.kills; }

    /**
     * Returns a knights total damage
     * @return totaldamage
     */
    protected int getTotalDamage(){ return this.totalDamage; }


    /**
     * Returns a knights x-Coordinate
     * @return xCoordinate
     */
    public int getxCoordinate() { return this.xCoordinate; }

    /**
     * Sets a knights x-coordinate
     * @param xCoordinate x Coordinate
     */
    public void setxCoordinate(int xCoordinate) { this.xCoordinate = xCoordinate; }

    /**
     * Sets a knights y coordinate
     * @param yCoordinate y Coordinate
     */
    public void setyCoordinate(int yCoordinate) { this.yCoordinate = yCoordinate; }

    /**
     * Returns a knights y coordinate
     * @return y Coordinate
     */
    public int getyCoordinate() { return this.yCoordinate; }

    /**
     * Draws the knights
     * @param g graphic component
     */
    public void drawKnight(Graphics g) {

    }
}
