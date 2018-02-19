import java.awt.Graphics;

public abstract class AbstractShape {
	private int numSides;
	private String shapeName;
	private int titleX;
	private int titleY;
	private int messageX;
	private int messageY;
	
	public AbstractShape(int ns, String sn, int tx, int ty, int mx, int my) {
		numSides = ns;
		shapeName = sn;
		titleX = tx;
		titleY = ty;
		messageX = mx;
		messageY = my;
	}
	
	public void displayName(Graphics g) {
		g.drawString(shapeName, titleX, titleY);
	}
	
	public void displayNumSides(Graphics g) {
		g.drawString("A " + shapeName + " has " + numSides + " sides.", messageX, messageY);
	}
	
}	
