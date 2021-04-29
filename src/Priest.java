import java.awt.*;

public class Priest extends BasicKnight
{

    Priest(Color colorOfTeam, int[] startingCoordinate){

        super(colorOfTeam, startingCoordinate);

        this.health = 350;
        this.speed = 50;
        this.typeOfKnight = "Priest";

    }

}
