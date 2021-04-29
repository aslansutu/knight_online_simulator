import java.awt.*;

public class Priest extends BasicKnight
{
    /**
     * Constructor for the Priest object
     * @param colorOfTeam color of the team
     * @param startingCoordinate the initial starting coordinate
     */
    Priest(Color colorOfTeam, int[] startingCoordinate){

        super(colorOfTeam, startingCoordinate);

        this.health = 350;
        this.speed = 50;
        this.typeOfKnight = "Priest";

    }
}
