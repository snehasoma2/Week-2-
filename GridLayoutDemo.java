import java.awt.*;
import java.awt.event.*;
public class GridLayoutDemo extends Frame
{
	static int n=4;
	public GridLayoutDemo()
	{
		setLayout(new GridLayout(n,n));
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				int k = i*n+j;
				if(k>0)
				{
					add(new Button(" "+k));
				}
			}
		}
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0); //terminate the current Java Virtual Machine (JVM) with an exit status of 0.
			}
		});
	}
	public static void main(String args[])
	{
		GridLayoutDemo gd = new GridLayoutDemo();
		gd.setSize(500,500);
		gd.setTitle("GridLayout");
		gd.setVisible(true);
	}
}