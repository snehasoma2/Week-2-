import javax.swing.*;
import java.awt.*;

class  JFrameSubClass
extends JFrame
{
	JFrameSubClass()
	{
		super(" welcome"); //title
		setLayout(new FlowLayout());
		JButton b1=new JButton("Add");
		add(new JLabel("Enter n1: "));
		
		add(b1);
		
		setVisible(true);
		setSize(500,600);
		
	}

    public static void main(String args[])
    {
	
	JFrameSubClass obj=new JFrameSubClass();
    }
}