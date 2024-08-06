import java.awt.*;
import javax.swing.*;
public class Demo3
{
	public static void main(String args[])
	{
		JFrame jf = new JFrame("Welcome");
		jf.setVisible(true);
		jf.setSize(500,600);
		jf.setDefaultCloseOperation(3);
		jf.setLayout(new FlowLayout());
		JLabel lab1 = new JLabel("Enter the value of a: ");    
		jf.add(lab1);
		JLabel lab2 = new JLabel("Enter the value of b");
		jf.add(lab2);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		//jf.add(new TextField("Enter number"));
		
	}
}