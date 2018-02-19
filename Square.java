import java.awt.Graphics;
import java.awt.Polygon;

public class Square extends AbstractShape implements Shape {

	public Square(int ns, String sn, int tx, int ty, int mx, int my) {
		super(ns, sn, tx, ty, mx, my);
	}

	@Override
	public void drawShape(Graphics g) {
		g.fillRect(100, 50, 150, 150);
		
	}
	
}
