import java.awt.*;
import java.io.IOException;

public abstract class KnightDecorator extends Knight
{
    protected Knight tempKnight;
    protected int pieceSize = 15;
    protected int symbolSize = 5;

 /**
  * Constructor for knightDecorator
  * @param newKnight specific knight
  */
 public KnightDecorator(Knight newKnight){
        tempKnight = newKnight;
    }

 /**
  * Sets the knight's new x coordinate
  * @param x integer for x coordinate
  */
 @Override
    public void setxCoordinate(int x){ tempKnight.setxCoordinate(x); }

 /**
  * Set the knight's y coordinate
  * @param y integer for y coordinate
  */
    @Override
    public void setyCoordinate(int y){ tempKnight.setyCoordinate(y); }

 /**
  * Returns the x coordinate value for the knight
  * @return integer x coordinate value
  */
    @Override
    public int getxCoordinate(){ return tempKnight.getxCoordinate(); }

 /**
  * Returns the y coordinate value for the knight
  * @return y integer y coordinate value
  */
    @Override
    public int getyCoordinate(){ return tempKnight.getyCoordinate(); }
}
