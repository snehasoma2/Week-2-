import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;

public class GreetingFrame extends JFrame {

    public GreetingFrame() {
        setTitle("Time Greeting");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel greetingLabel = new JLabel(getGreetingMessage());
       // greetingLabel.setHorizontalAlignment(SwingConstants.CENTER);
        //greetingLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        getContentPane().add(greetingLabel);
    }

    private String getGreetingMessage() {
        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();

        if (hour >= 6 && hour < 12) {
            return "Good Morning";
        } else if (hour >= 12 && hour < 18) {
            return "Good Afternoon";
        } else {
            return "Good Evening";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GreetingFrame frame = new GreetingFrame();
            frame.setVisible(true);
        });
    }
}
