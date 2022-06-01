import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JColorChooser;
import javax.swing.JComponent;

public class Paint extends JComponent{

	  private Image img;
	  private Graphics2D g2D;
	  private int currentX, currentY, oldX, oldY;
	 
	  public Paint() {
	    setDoubleBuffered(false);
	    addMouseListener(new MouseAdapter() {
	      public void mousePressed(MouseEvent e) {
	        oldX = e.getX();
	        oldY = e.getY();
	      }
	    });
	 
	    addMouseMotionListener(new MouseMotionAdapter() {
	      public void mouseDragged(MouseEvent e) {
	        currentX = e.getX();
	        currentY = e.getY();
	 
	        if (g2D != null) {
	          g2D.drawLine(oldX, oldY, currentX, currentY);
	          repaint();
	          oldX = currentX;
	          oldY = currentY;
	        }
	      }
	    });
	  }
	 
	  protected void paintComponent(Graphics g) {
	    if (img == null) {
	      img = createImage(getSize().width, getSize().height);
	      g2D = (Graphics2D) img.getGraphics();
	      g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	      clear();
	    }
	 
	    g.drawImage(img, 0, 0, null);
	  }
	 
	  public void clear() {
	    g2D.setPaint(Color.white);
	    g2D.fillRect(0, 0, getSize().width, getSize().height);
	    g2D.setPaint(Color.black);
	    repaint();
	  }
	 
	 
	  public void colorPicker() {
		  JColorChooser colorChooser = new JColorChooser();
		  Color color = JColorChooser.showDialog(null,"Pick a Colour",Color.white);
		  g2D.setPaint(color);
	  }
	  public void eraser() {
		  g2D.setPaint(Color.white);
		  g2D.setStroke(new BasicStroke(15));
	  }
	  
	  public void pen() {
		  g2D.setStroke(new BasicStroke(1));
	  }
	  public void marker() {
		  g2D.setStroke(new BasicStroke(5));
	  }
	  public void brush() {
		  g2D.setStroke(new BasicStroke(10));
	  }
	  public void bigBrush() {
		  g2D.setStroke(new BasicStroke(18));
	  }

}
