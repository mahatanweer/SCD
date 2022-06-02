package task1_LAB3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Listener extends JFrame implements ActionListener {

	JFrame f;
	JButton b1,b2,b3;
	
	Listener(){
		f = new JFrame();
		setVisible(true);
		setSize(700,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Task 1");
		setLayout(null);
		
		b1 = new JButton("Button 1");
		b1.setBounds(300, 150, 90, 30);
		b1.setBackground(Color.GREEN);
	    b1.setForeground(Color.WHITE);
		add(b1);
		b1.addActionListener(this);

		
		b2 = new JButton("Button 2");
		b2.setBounds(300, 250, 90, 30);
		b2.setBackground(Color.BLUE);
	    b2.setForeground(Color.WHITE);
		add(b2);
		b2.addActionListener(this);
		
		b3 = new JButton("Button 3");
		b3.setBounds(300, 350, 90, 30);
		b3.setBackground(Color.RED);
	    b3.setForeground(Color.WHITE);
		add(b3);
		b3.addActionListener(this);
	 
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == b1) {
			b1.setVisible(false);
			b2.setVisible(true);
			b3.setVisible(true);
		}
		else if(e.getSource() == b2) {
			b2.setVisible(false);
			b1.setVisible(true);
			b3.setVisible(true);
		}
		else if(e.getSource() == b3) {
			b3.setVisible(false);
			b1.setVisible(true);
			b2.setVisible(true);
		}
		
	}

	public static void main(String[] args) {
		Listener l = new Listener();
		
	}
}
