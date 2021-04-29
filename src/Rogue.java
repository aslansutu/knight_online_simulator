import java.awt.*;

public class Rogue extends BasicKnight
{
    /**
     * Constructor for the Rogue object
     * @param colorOfTeam color of the team
     * @param startingCoordinate the initial starting coordinate
     */
    Rogue(Color colorOfTeam, int[] startingCoordinate) {

        super(colorOfTeam, startingCoordinate);

        this.health = 500;
        this.speed = 100;
        this.typeOfKnight = "Rogue";
    }
}
