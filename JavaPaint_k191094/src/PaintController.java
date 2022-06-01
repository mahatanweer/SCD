import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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


public class PaintController {

	private PaintView viewObj;
	private Paint model;
	
	public PaintController(PaintView viewObj, Paint model) {
		this.viewObj = viewObj; 
		this.model = model;

		this.viewObj.addPaintListener(new PaintListener());
	}
	
	class PaintListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == viewObj.clear) {
		        model.clear();
		      } else if (e.getSource() == viewObj.colorPicker) {
		    	  model.colorPicker();
		      }  else if(e.getSource() == viewObj.eraser) {
		    	  model.eraser();
		      } else if(e.getSource() == viewObj.pen) {
		    	  model.pen();
		      } else if(e.getSource() == viewObj.marker) {
		    	  model.marker();
		      } else if(e.getSource() == viewObj.brush) {
		    	  model.brush();
		      } else if(e.getSource() == viewObj.bigBrush) {
		    	  model.bigBrush();
		      }
		    
		}		
	}


}
