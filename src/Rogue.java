import java.awt.*;

public class Rogue extends BasicKnight
{
    Rogue(Color colorOfTeam, int[] startingCoordinate) {

        super(colorOfTeam, startingCoordinate);

        this.health = 500;
        this.speed = 100;
        this.typeOfKnight = "Rogue";
    }
    //TODO
}
