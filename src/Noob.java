import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

public class Noob extends KnightDecorator{

    public Noob(Knight knight) {
        super(knight);
        Graphics g = Display.getInstance().getGraphics();

        drawKnight(g);
    }

    public void drawKnight(Graphics g){

        switch (tempKnight.typeOfKnight) {
            case "Rogue" -> paintRogue(g);
            case "Mage" -> paintMage(g);
            case "Priest" -> paintPriest(g);
        }
    }

    public void paintMage(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint(this.tempKnight.getTeamColor());
        g2d.translate(this.tempKnight.getxCoordinate(), this.tempKnight.getyCoordinate());   // This is required so that when rotating, it will rotate by taking the center of our shape
        g2d.rotate(Math.toRadians(45));                     //Rotates to diamond shape
        g2d.fillRect(0,0,pieceSize,pieceSize);        // (0,0) will always be the location due to translation
    }

    public void paintPriest(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint(this.tempKnight.getTeamColor());
        g2d.fillRect(tempKnight.getxCoordinate(), tempKnight.getyCoordinate(), pieceSize, pieceSize);
    }

    public void paintRogue(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        // The x and y coordinates to form a triangle using three points
        int[] x = {tempKnight.getxCoordinate()-(pieceSize), tempKnight.getxCoordinate(), tempKnight.getxCoordinate()+(pieceSize)};
        int[] y = {tempKnight.getyCoordinate()+(pieceSize/2), tempKnight.getyCoordinate()-(pieceSize), tempKnight.getyCoordinate()+(pieceSize/2)};

        g2d.setPaint(this.tempKnight.getTeamColor());
        g2d.fillPolygon(x,y,3);
    }
}
