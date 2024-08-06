import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonExample {
		
    public static void main(String[] args) {
        JFrame frame = new JFrame("JRadioButton Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JRadioButton radioButton1 = new JRadioButton("1st year");
        JRadioButton radioButton2 = new JRadioButton("2nd year");
        JRadioButton radioButton3 = new JRadioButton("3rd year");
		JRadioButton radioButton4 = new JRadioButton("4th year");
		
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
		buttonGroup.add(radioButton4);
		
        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("you have selected 1st year");
            }
        });

        radioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("you have selected  2nd year");
            }
        });

        radioButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("you have selected 3rd year");
            }
        });
		radioButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("you have  selected 4th year");
            }
        });

        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);
		panel.add(radioButton4);
		
        frame.getContentPane().add(panel);
        frame.setSize(300, 150);
        frame.setVisible(true);
		
    }
}