package com.oit;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class FrameExample2 extends JFrame
{
	JLabel lblun,lblpsw,lblgen,lblhb,lbldob,lblsub,lbladd,lblmail;
	JTextField txtun,txtmail;
	JPasswordField txtpsw;
	JRadioButton rdbml,rdbfml;
	JCheckBox chkb1,chkb2,chkb3,chkb4;
	JComboBox<String>cmbday;
	JList jlsub;
	DefaultListModel<String>l1=new DefaultListModel<>();
	JTextArea jtadd;
	JButton btnlogin,btnrst;
	Font f1=new Font("Times New Roman",Font.BOLD,15);
	FrameExample2()
	{
		setLayout(null);
		setVisible(true);
		setSize(900,1400);
		setTitle("Login Form");
		setLocation(10,10);
		
		lblun=new JLabel("UserName :");
		add(lblun);
		lblun.setBounds(100,100,100,30);
		lblun.setForeground(Color.BLUE);
		lblun.setOpaque(true);
		lblun.setBackground(Color.PINK);
		lblun.setFont(f1);
		
		txtun=new JTextField(20);
		add(txtun);
		txtun.setBounds(230,100,100,30);
				
		lblpsw=new JLabel("Password :");
		add(lblpsw);
		lblpsw.setBounds(100,150,100,30);
		lblpsw.setForeground(Color.BLUE);
		lblpsw.setOpaque(true);
		lblpsw.setBackground(Color.PINK);
		lblpsw.setFont(f1);
		
		txtpsw=new JPasswordField(20);
		add(txtpsw);
		txtpsw.setBounds(230,150,100,30);
		
		lblgen=new JLabel("Gender");
		add(lblgen);
		lblgen.setBounds(100,200,100,30);
		lblgen.setForeground(Color.BLUE);
		lblgen.setOpaque(true);
		lblgen.setBackground(Color.PINK);
		lblgen.setFont(f1);
		
		rdbml=new JRadioButton("A) Male");
		add(rdbml);
		rdbml.setBounds(220,200,100,30);	
		rdbfml=new JRadioButton("B) Female");
		add(rdbfml);
		rdbfml.setBounds(340,200,100,30);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbfml);
		bg.add(rdbml);
		
		lblhb=new JLabel("Hobbies");
		add(lblhb);
		lblhb.setBounds(100,250,100,30);
		lblhb.setForeground(Color.BLUE);
		lblhb.setOpaque(true);
		lblhb.setBackground(Color.PINK);
		lblhb.setFont(f1);
		
		chkb1=new JCheckBox("Reading");
		add(chkb1);
		chkb1.setBounds(230,250,100,30);
		
		chkb2=new JCheckBox("Cycling");
		add(chkb2);
		chkb2.setBounds(330,250,100,30);
		
		chkb3=new JCheckBox("Swimming");
		add(chkb3);
		chkb3.setBounds(430,250,100,30);
		
		chkb4=new JCheckBox("Chatting");
		add(chkb4);
		chkb4.setBounds(530,250,100,30);
		
		lbldob=new JLabel("Birth Year");
		add(lbldob);
		lbldob.setBounds(100,300,100,30);
		lbldob.setForeground(Color.BLUE);
		lbldob.setOpaque(true);
		lbldob.setBackground(Color.PINK);
		lbldob.setFont(f1);
		
		String day[]= {"1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005"};
		cmbday=new JComboBox<String>(day);
		add(cmbday);
		cmbday.setBounds(220,300,100,30);
		
		lblsub=new JLabel("Subject");
		add(lblsub);
		lblsub.setBounds(100,350,100,30);
		lblsub.setForeground(Color.BLUE);
		lblsub.setOpaque(true);
		lblsub.setBackground(Color.PINK);
		lblsub.setFont(f1);
		
		String subject[]= {"Marathi","Hindi","English","History","Geography","Science","Maths"};
		jlsub=new JList<String>(subject);
		JScrollPane scrollpane=new JScrollPane(jlsub);
		jlsub.setBounds(220,350,100,130);
		scrollpane.setBounds(220,350,100,30);
		add(jlsub);
		add(scrollpane);
		
		lbladd=new JLabel("Address");
		add(lbladd);
		lbladd.setBounds(100,500,100,30);
		lbladd.setForeground(Color.BLUE);
		lbladd.setOpaque(true);
		lbladd.setBackground(Color.PINK);
		lbladd.setFont(f1);
		
		jtadd=new JTextArea("Enter your address");
		add(jtadd);
		jtadd.setBounds(220,500,200,30);
		
		lblmail=new JLabel("E-mail");
		add(lblmail);
		lblmail.setBounds(100,550,100,30);
		lblmail.setForeground(Color.BLUE);
		lblmail.setOpaque(true);
		lblmail.setBackground(Color.PINK);
		lblmail.setFont(f1);
		
		txtmail=new JTextField(20);
		add(txtmail);
		txtmail.setBounds(220,550,100,30);
		
		btnlogin=new JButton("Login");
		add(btnlogin);
		btnlogin.setBounds(100,600,100,30);
		btnlogin.setForeground(Color.RED);
		btnlogin.setBackground(Color.PINK);
		btnlogin.setToolTipText("Enter here to login");
		btnlogin.setFont(f1);
		
		btnrst=new JButton("Reset");
		add(btnrst);
		btnrst.setBounds(250,600,100,30);
		btnrst.setForeground(Color.RED);
		btnrst.setBackground(Color.PINK);
		btnrst.setToolTipText("Enter here to reset");
		btnrst.setFont(f1);
	}
	public static void main(String[] args)
	{
		new FrameExample2();
	}

}
