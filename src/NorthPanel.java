//Dhruvi Patel, Momoreoluwa Ayinde, Serena Havunen
//this class creates the rectangleshape(X) that moves from left to right in the north part of the frame
//It also contains all the rectangleshape interactions. This rectangleshape represents "X" in the tictactoe game

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

public class NorthPanel extends BPanel implements ActionListener {
	// instance variables
	private Rectangle rectangle;
	private Rectangle rectangle1;
	private ColorHolder holder;

	// parametized constructor
	public NorthPanel(int x, int y, ColorHolder holder) {
		super(holder);
		this.holder = holder;
		this.setPreferredSize(new Dimension(0, 40));
		this.setBackground(Color.PINK);

		// creates the two rectangles that form an "x" in the north part of the frame
		rectangle = new Rectangle();
		rectangle.setColor(Color.RED);
		rectangle.setSize(50, 10);
		rectangle.setRotation(45);

		rectangle1 = new Rectangle();
		rectangle1.setColor(Color.RED);
		rectangle1.setSize(50, 10);
		rectangle1.setRotation(315);

		Mouse mouse = new Mouse();
		this.addMouseListener(mouse);
		this.addMouseMotionListener(mouse);
		this.addMouseWheelListener(mouse);

		setLocation(x, y);
		// the shape shifts across the screen as soon as the timer starts
		Timer timer = new Timer(5, this);
		timer.start();

	}

	// sets the location of each rectangle
	public void setLocation(int x, int y) {
		rectangle.setLocation(x, y);
		rectangle1.setLocation(rectangle.getXLocation() + 3, rectangle.getYLocation());
	}

	@Override
	// displays the rectangles onto the JPanel
	public void paintComponent(Graphics g) {
		// Always include this when overriding paintComponent
		super.paintComponent(g);
		Graphics2D brush = (Graphics2D) g;
		rectangle.paint(brush);
		rectangle1.paint(brush);
	}

	// Nested class that contains the mouseEvent for the rectangles. This mouseEvent
	// involves a change in
	// color of the rectangles
	private class Mouse extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			int r = (int) (Math.random() * 256);
			int g = (int) (Math.random() * 256);
			int b = (int) (Math.random() * 256);
			Color c = new Color(r, g, b);

			rectangle.setColor(c);
			rectangle1.setColor(c);
		}
	}

	@Override

	// lets the "X" wrap around the screen after it hits the edge of the JPanel
	public void actionPerformed(ActionEvent e) {
		if (rectangle.getXLocation() > getWidth() || (rectangle.getYLocation() > getHeight())
				|| (rectangle1.getXLocation() > getWidth()) || (rectangle1.getYLocation() > getHeight())) {
			rectangle.setLocation(rectangle.getXLocation() - getWidth(), rectangle.getYLocation());
			rectangle1.setLocation(rectangle1.getXLocation() - getWidth(), rectangle1.getYLocation());
		} else {
			rectangle.setLocation(rectangle.getXLocation() + 2, rectangle.getYLocation());
			rectangle1.setLocation(rectangle1.getXLocation() + 2, rectangle1.getYLocation());
		}

		this.repaint();
	}

}
