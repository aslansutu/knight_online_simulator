import java.awt.*;

public class Mage extends BasicKnight
{
    Mage(Color colorOfTeam, int[] startingCoordinate) {

        super(colorOfTeam, startingCoordinate);

        this.health = 400;
        this.speed = 75;
        this.typeOfKnight = "Mage";
    }
    //TODO
}
