import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Simulation extends JPanel {
    private static Simulation instance;
    public Display display;

    public Simulation() {
        // TODO

    }

    public void setDisplay(Display displayInstance) {
        display = displayInstance;
    }

    public synchronized static Simulation getInstance() {
        if (instance == null) {
            instance = new Simulation();
        }
        return instance;

    }

    public static void main(String[] args) {
        Display.getInstance();

        while (true) {
            try {
                Thread.sleep(30);
                Display.getInstance().repaint();
                Simulation.getInstance().stepAll();

                // TODO
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }



    public void stepAll() {
        // TODO
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 600);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        try {
            Image image = ImageIO.read(new File("src/background.jpg"));
            g.drawImage(image, 0, 0, 800, 600, null);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
