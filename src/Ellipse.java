//Dhruvi Patel, Momoreoluwa Ayinde, Serena Havunen
import java.awt.Color;

public class Ellipse extends RectangleShape {
	//default constructor
	public Ellipse() {
		super(new java.awt.geom.Ellipse2D.Double());
	}
	
	//parametized constructor
	public Ellipse(int x, int y) {
		super(new java.awt.geom.Ellipse2D.Double(), x, y);
	}
	
	//parametized constructor
	public Ellipse(Color color) {
		super(new java.awt.geom.Ellipse2D.Double(), color);
	}
}
