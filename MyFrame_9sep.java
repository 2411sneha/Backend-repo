//GUI Designing ,Event handeling and applet

import java.awt.*;
import java.aet.event.*;
class MyFrame extends Frame implements ItemListener
{
	//add declaration
	Label l1,l2,l3;
	Checkbox cb1,cb2;
	Choice c1,c2;
	TextField t1;
	MyFrame();
	{
		stTitle("My First QWT Frame");
		setSize(500,500);
		setLocation(400,100);
		setFont(new Font("Arial",Font.PLAIN,20));
		setLayout(null);
		//Memory allocation
		l1=new Label("font");
		l2=new Label("size");
		l3=new Label("style");
		cb1=new Checkbox("Bold");
		cb1=new Checkbox("Italic");
		c1=new Choice();
		c1.add("Arial");
		c1.add("Roman");
		c1.add("Cursive");
		c1.add("Calibri");
		c2=new Choice();
		c2.add("10");
		c2.add("15");
		c2.add("20");
		c2.add("25");
		t1=new TextField("Sneha");
		//add controls on frame
		add(l1);		add(l3);
		add(c1);		add(cb1);
		add(l2);		add(cb2);
		add(c2);
		add(t1);
		//add listeners to all controls 
		c1.addItemListener(this);
		c2.addItemListener(this);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		//setbounds
		l1.setBounds(100,100,100,30);
		l1.setBounds(100,150,100,30);
		l1.setBounds(100,200,100,30);
		l1.setBounds(100,250,100,30);
		l1.setBounds(100,300,210,50);
		l1.setBounds(250,100,100,30);
		l1.setBounds(250,150,100,30);
		l1.setBounds(250,200,100,30);
		
		addWindowListener(new WindoeAdaptor()
		{
			public void windowClosing (WindowEvent e)
			{
				System.exit(0);
			}
		});
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(cb1.getState() && cb2.getState())
		{
			t1.setFont(new Font(c1.getSelectedItem()*,
		    font.BOLD+font.ITALIC,
			Integer.parseInt(c2.getSelectedItem())));
		}
		else if(cb2,getState())
		{
			t1.setFont(new Font(c1.getSelectedItem()*,
			font.ITALIC,
			Integer.parseInt(c2.getSelectedItem())));
		}
		else
		{
			t1.setFont(new Font(c1.getSelectedItem()*,
			font.PLAIN,
			Integer.parseInt(c2.getSelectedItem())));
		}
	}
}
class setA1
{
	public static void main(String args[])
	{
		new MyFrame();
	}
}