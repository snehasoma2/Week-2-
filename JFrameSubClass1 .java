import javax.swing.*;
import java.awt.*;

class  JFrameSubClass1 extends JFrame
{
	JFrameSubClass1()
	{
		super(" welcome"); //title
		setLayout(new FlowLayout());
		JButton b1=new JButton("factorial");
		add(new JLabel("Enter number: "));
		
		JTextField text=new JTextField(10);
		add(text);
		//add(b1);
		//add(new JLabel("Enter n2: "));
		//JTextField text1=new JTextField(10);
		//add(text1);
		add(b1);
		
		add(new JLabel("result "));
		JTextField text2=new JTextField(10);
		add(text2);
		setVisible(true);
		setSize(500,600);
		
	}

    public static void main(String args[])
    {
	
	JFrameSubClass1 obj=new JFrameSubClass1();
    }
}