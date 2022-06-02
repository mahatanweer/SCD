package task1_LAB3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//through anonymous class

public class check {

	public static void main(String[] args) {

		JFrame f = new JFrame("Window");
		f.setVisible(true);
		f.setSize(600,600);
		f.setLayout(null);

		//passing exit_on_close member in JFrame class as parameter
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b1 = new JButton("Button 1");
		b1.setBounds(300, 150, 90, 30);
		b1.setBackground(Color.GREEN);
	    b1.setForeground(Color.WHITE);
		f.add(b1);
		
		JButton b2 = new JButton("Button 2");
		b2.setBounds(300, 250, 90, 30);
		b2.setBackground(Color.BLUE);
	    b2.setForeground(Color.WHITE);
		f.add(b2);
		
		JButton b3 = new JButton("Button 3");
		b3.setBounds(300, 350, 90, 30);
		b3.setBackground(Color.RED);
	    b3.setForeground(Color.WHITE);
		f.add(b3);
		
		b1.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b1.setVisible(false);
				b2.setVisible(true);
				b3.setVisible(true);
			}
			
		});

		

		b2.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b2.setVisible(false);
				b1.setVisible(true);
				b3.setVisible(true);
			}
			
		});
		

		b3.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b3.setVisible(false);
				b1.setVisible(true);
				b2.setVisible(true);
			}
			
		});
	}

}
