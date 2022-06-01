//reference link: http://www.ssaurel.com/blog/learn-how-to-make-a-swing-painting-and-drawing-application/

import java.awt.Graphics;

public class PaintDriver {

	public static void main(String[] args) {

		Paint model = new Paint();
		PaintView viewObj = new PaintView(model);

		new PaintController(viewObj, model);
	}

}
