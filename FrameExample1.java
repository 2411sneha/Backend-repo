package com.oit;
import java.awt.*;

//First method 
public class FrameExample1 
{
	FrameExample1()
	{
		Frame frm=new Frame();
		frm.setLayout(null);
		frm.setVisible(true);
		frm.setSize(500,500);
		frm.setTitle("Login form");
		frm.setLocation(300,100);
	}
	public static void main(String[] args) 
	{
		new FrameExample1();
	}

}
