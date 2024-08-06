import javax.swing.*;
import java.awt.*;

class LayoutDisplay2 extends JFrame {
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new LayoutDisplay2());
    }

    LayoutDisplay2() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 3));
        setSize(500, 500);

        for (int i = 9; i >= 0; i--) {
            JButton b = new JButton(" " + i);
            add(b);
        }

        // Display the frame after setting up components
        setVisible(true);
    }
}