import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Simulation extends JPanel {
    private static Simulation instance;
    public Display display;

    public Team ElMorad;
    public Team Karus;

    public Simulation() {
        instance = this;
        this.ElMorad = new Team(Color.BLUE);
        this.Karus = new Team(Color.RED);

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
                Thread.sleep(40);
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
        Random random = new Random();
        int numberOfKnights = 3;
        int knightNumber;


        // Summon new knights if necessary
        if (ElMorad.members.size() < 8){
            knightNumber = random.nextInt(numberOfKnights);

            if (knightNumber == 0){
                MageFactory newMage = new MageFactory();
                newMage.produce(ElMorad);
            }
            else if (knightNumber == 1){
                PriestFactory newPriest = new PriestFactory();
                newPriest.produce(ElMorad);
            }
            else {
                RogueFactory newRogue = new RogueFactory();
                newRogue.produce(ElMorad);
            }
        }

        if (Karus.members.size() < 8){
            knightNumber = random.nextInt(numberOfKnights);

            if (knightNumber == 0){
                MageFactory newMage = new MageFactory();
                newMage.produce(Karus);
            }
            else if (knightNumber == 1){
                PriestFactory newPriest = new PriestFactory();
                newPriest.produce(Karus);
            }
            else {
                RogueFactory newRogue = new RogueFactory();
                newRogue.produce(Karus);
            }
        }

        // Update Movement
        RandomMove newMovement = new RandomMove();
        for (int i = 0; i < ElMorad.members.size(); i++){
            Knight knight = ElMorad.members.get(i);
            newMovement.act(knight);

            if (knight.getNationalPoints() >= 301){
                new Grade1Decorator(new Noob(knight));
            }
            else if (knight.getNationalPoints() >= 151){
                new Grade2Decorator(new Noob(knight));
            }
            else if (knight.getNationalPoints() >= 76){
                new Grade3Decorator(new Noob(knight));
            }
            else{
                new Noob(knight);
            }
        }
        for (int i = 0; i < Karus.members.size(); i++){
            Knight knight = Karus.members.get(i);
            newMovement.act(knight);
        }

        // calculate attacks and lower hp can attack only every second
        // if hp is 0, then remove from map
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
