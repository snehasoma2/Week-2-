import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GridLayoutExample
{
	JFrame fr;
	public static void main(String args[])
	{
		new GridLayoutExample();
	}
	public GridLayoutExample()
	{
		fr = new JFrame("Grid Layout");
		fr.setLayout(new GridLayout());
		fr.setDefaultCloseOperation(3);
		fr.setExtendedState(fr.MAXIMIZED_BOTH);
		JButton j1 = new JButton("Add");
		JButton j2 = new JButton("Subtract");
		JButton j3 = new JButton("Multiply");
		JButton j4 = new JButton("Divide");
		fr.add(j1);
		fr.add(j2);
		fr.add(j3);
		fr.add(j4);
		
		fr.setVisible(true);
	}
	

}