import java.awt.Graphics;

public class Circle extends AbstractShape implements Shape {

	public Circle(int ns, String sn, int tx, int ty, int mx, int my) {
		super(ns, sn, tx, ty, mx, my);
	}

	@Override
	public void drawShape(Graphics g) {
		g.fillOval(500, 350, 150, 150);
	}
	
}
