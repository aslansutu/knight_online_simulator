import java.util.Random;

public class RandomMove extends Strategy
{
    //TODO
    @Override
    public void act(Knight knight) {
        Random random = new Random();
        int movementMultiplier = 1;
        int displacement;

        displacement = knight.getxCoordinate() + random.nextInt(knight.speed/movementMultiplier);
        if (displacement <= 250){
            displacement = 251;
        }
        else if (displacement >= 800){
            displacement = 799;
        }
        knight.setxCoordinate(displacement);



        displacement = knight.getyCoordinate() + random.nextInt(knight.speed/movementMultiplier);
        if (displacement <= 0){
            displacement = 1;
        }
        else if (displacement >= 600){
            displacement = 599;
        }
        knight.setyCoordinate(displacement);
    }
}
