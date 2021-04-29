import java.awt.*;

public class BasicKnight extends Knight
{
    /**
     * Constructor for a BasicKnight
     * @param colorOfTeam color of the knight's team
     * @param startingCoordinate spawn location of the knight
     */
    BasicKnight(Color colorOfTeam, int[] startingCoordinate){
        this.setTeamColor(colorOfTeam);
        this.setNationalPoints(0);
        this.setTotalDamage(0);
        this.setKills(0);

        this.setxCoordinate(startingCoordinate[0]);
        this.setyCoordinate(startingCoordinate[1]);
    }

}
