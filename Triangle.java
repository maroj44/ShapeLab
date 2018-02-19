import java.awt.Graphics;
import java.awt.Polygon;

public class Triangle extends AbstractShape implements Shape {

	public Triangle(int ns, String sn, int tx, int ty, int mx, int my) {
		super(ns, sn, tx, ty, mx, my);
	}

	@Override
	public void drawShape(Graphics g) {
		Polygon triangle = new Polygon();
		triangle.addPoint(600, 50);
		triangle.addPoint(500, 200);
		triangle.addPoint(700, 200);
		g.fillPolygon(triangle);
	}
	
}
