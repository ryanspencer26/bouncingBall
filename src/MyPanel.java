import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    Ball[] myBalls;
    public MyPanel() {

        setBackground(Color.LIGHT_GRAY);
        myBalls = new Ball[20];
        for(int i = 0; i < myBalls.length; i++){

            myBalls[i] = new Ball((int)(Math.random() * 200),(int)(Math.random() * 200));
            myBalls[i].setSize((int)(Math.random() * 30 + 1));
            myBalls[i].setColor(new Color((int)(Math.random() * 256),(int)(Math.random() * 256),(int)(Math.random() * 256)));
            myBalls[i].setSpeed((int)(Math.random() * 20 + 1), (int)(Math.random() * 20 + 1));

        }

    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        for(int i = 0; i < myBalls.length; i++){

            myBalls[i].draw(g);
            myBalls[i].move(getWidth(), getHeight());

        }

        g.drawString("Hello World!", 200, 250);

        try {
            Thread.sleep(25);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        repaint();

    }

}
