import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class PaintView {

	JButton pen, marker, brush, bigBrush, clear, eraser, colorPicker;
	Paint canvas;
	  
	public PaintView(Paint canvas) {
		JFrame frame = new JFrame("Paint Application");
	    Container content = frame.getContentPane();
	    content.setLayout(new BorderLayout());
	    frame.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
				new ImageIcon("src/download.png").getImage(),
				new Point(10, 20), null));
	 
	    
	    
	      frame.getContentPane().setLayout(new BoxLayout(content, BoxLayout.X_AXIS));
	      JPanel panel = new JPanel();
	      pen = new JButton("Pen");
		  marker = new JButton("Marker");
		  brush = new JButton("Brush");
		  bigBrush = new JButton("Big Brush");
		    
		  clear = new JButton("Clear");
		  colorPicker = new JButton("CHANGE COLOR");
		  eraser = new JButton("Eraser");

		  panel.add(pen);
	      panel.add(Box.createRigidArea(new Dimension(80, 20)));
	      panel.add(marker);
	      panel.add(Box.createRigidArea(new Dimension(80, 30)));
	      panel.add(brush);
	      panel.add(Box.createRigidArea(new Dimension(80, 10)));
	      panel.add(bigBrush);
	      
	      panel.add(Box.createRigidArea(new Dimension(80, 90)));
	      
	      panel.add(clear);
	      panel.add(Box.createRigidArea(new Dimension(80, 10)));
	      panel.add(eraser);
	      panel.add(Box.createRigidArea(new Dimension(80, 30)));
	      panel.add(colorPicker);
	      panel.setAlignmentX(Component.TOP_ALIGNMENT);
	      panel.setPreferredSize(new Dimension(150, 500));
	      panel.setMaximumSize(new Dimension(150, 500));
	      panel.setBorder(BorderFactory.createTitledBorder("Tools"));
	      content.add(panel);
	      content.add(canvas);
	    

	    frame.setSize(700, 700);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
		
	}
	
	public void addPaintListener(ActionListener actionListener) {
		  pen.addActionListener(actionListener);
		  marker.addActionListener(actionListener);
		  brush.addActionListener(actionListener);
		  bigBrush.addActionListener(actionListener);
		  clear.addActionListener(actionListener);
		  colorPicker.addActionListener(actionListener);
		  eraser.addActionListener(actionListener);

	}
}
