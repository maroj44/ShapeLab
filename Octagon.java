import java.awt.Graphics;
import java.awt.Polygon;

public class Octagon extends AbstractShape implements Shape {

	public Octagon(int ns, String sn, int tx, int ty, int mx, int my) {
		super(ns, sn, tx, ty, mx, my);
	}

	@Override
	public void drawShape(Graphics g) {
		Polygon octagon = new Polygon();
		octagon.addPoint(100, 400);
		octagon.addPoint(150, 350);
		octagon.addPoint(200, 350);
		octagon.addPoint(250, 400);
		octagon.addPoint(250, 450);
		octagon.addPoint(200, 500);
		octagon.addPoint(150, 500);
		octagon.addPoint(100, 450);
		g.fillPolygon(octagon);
	}
	
}
