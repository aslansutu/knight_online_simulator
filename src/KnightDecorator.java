import java.awt.*;
import java.io.IOException;

public abstract class KnightDecorator extends Knight
{
   //TODO
    protected Knight tempKnight;
    protected int pieceSize = 20;
    protected int symbolSize = 5;

    public KnightDecorator(Knight newKnight){
        tempKnight = newKnight;
    }

    @Override
    public void setxCoordinate(int x){ tempKnight.setxCoordinate(x); }

    @Override
    public void setyCoordinate(int y){ tempKnight.setyCoordinate(y); }

    @Override
    public int getxCoordinate(){ return tempKnight.getxCoordinate(); }

    @Override
    public int getyCoordinate(){ return tempKnight.getyCoordinate(); }
}
