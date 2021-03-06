import java.util.Random;

public class RandomMove extends Strategy
{
    /**
     * Determines a knights new location based on current position
     * @param knight specific knight
     */
    @Override
    public void act(Knight knight) {
        Random random = new Random();
        int movementMultiplier = 5;
        int displacement;

        displacement = knight.getxCoordinate() +(random.nextInt(knight.speed * 2) - knight.speed) / movementMultiplier;
        if (displacement <= 350){
            displacement = 351;
        }
        else if (displacement >= 750){
            displacement = 749;
        }
        knight.setxCoordinate(displacement);



        displacement = knight.getyCoordinate() + (random.nextInt(knight.speed * 2) - knight.speed) / movementMultiplier;
        if (displacement <= 20){
            displacement = 21;
        }
        else if (displacement >= 550){
            displacement = 549;
        }
        knight.setyCoordinate(displacement);
    }
}
