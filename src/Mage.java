import java.awt.*;

public class Mage extends BasicKnight
{
    /**
     * Constructor for the Mage object
     * @param colorOfTeam color of the team
     * @param startingCoordinate the initial starting coordinate
     */
    Mage(Color colorOfTeam, int[] startingCoordinate) {

        super(colorOfTeam, startingCoordinate);

        this.health = 400;
        this.speed = 75;
        this.typeOfKnight = "Mage";
    }
}
