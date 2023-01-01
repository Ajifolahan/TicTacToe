//Dhruvi Patel, Momoreoluwa Ayinde, Serena Havunen
import java.awt.Color;

public class Rectangle extends RectangleShape {
	//default constructor
	public Rectangle() {
		super(new java.awt.geom.Rectangle2D.Double());
	}
	
	//parametized constructor
	public Rectangle(int x, int y) {
		super(new java.awt.geom.Rectangle2D.Double(), x, y);
	}
	
	//parametized constructor
	public Rectangle(Color color) {
		super(new java.awt.geom.Rectangle2D.Double(), color);
	}
}

