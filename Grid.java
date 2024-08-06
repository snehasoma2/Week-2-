import javax.swing.*;
import java.awt.*;

public class Grid {
 
    Grid() {
        JFrame obj = new JFrame("Grid layout");
        obj.setSize(300, 300);
        obj.setLayout(new GridLayout(3, 3, 10, 10));
        obj.setVisible(true);

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");

        obj.add(b1);
        obj.add(b2);
        obj.add(b3);
        obj.add(b4);
        obj.add(b5);
        obj.add(b6);
        obj.add(b7);
        obj.add(b8);
        obj.add(b9);

        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new Grid();
    }
}
