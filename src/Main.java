import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLocation(500, 200);

        MyPanel panel = new MyPanel();
        frame.add(panel);

        frame.setVisible(true);

    }
}
