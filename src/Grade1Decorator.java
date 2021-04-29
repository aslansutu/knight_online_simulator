import java.awt.*;

public class Grade1Decorator extends KnightDecorator
{
    /**
     * Constructor for the Grade1Decorator Class
     * @param knight specific knight
     */
    public Grade1Decorator(Knight knight) {
        super(knight);
        Graphics g = Display.getInstance().getGraphics();

        drawKnight(g);
    }

    /**
     * Draws the symbol of the knight according to its national points
     * @param g graphic component
     */
    public void drawKnight(Graphics g){
        System.out.println("Grade1");

        this.tempKnight.drawKnight(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint(Color.BLACK);
        g2d.fillRect(this.tempKnight.getxCoordinate()-symbolSize/2,this.tempKnight.getyCoordinate()-symbolSize/2,symbolSize,symbolSize);


    }

    //TODO
    // draw symbol and health
}
