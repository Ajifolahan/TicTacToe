//Dhruvi Patel, Momoreoluwa Ayinde, Serena Havunen
//this class creates the ellipse that moves from left to right in the south part of the frame
//It also contains all the ellipse interactions. This ellipse represents "O" in the tictactoe game

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

public class SouthPanel extends BPanel implements ActionListener {
	// instance variables
	private Ellipse ellipse;
	private ColorHolder holder;

	// parametized constructor
	public SouthPanel(int x, int y, ColorHolder holder) {
		super(holder);
		this.holder = holder;
		this.setBackground(Color.PINK);
		this.setPreferredSize(new Dimension(0, 40));

		// creates the ellipse and all the characteristics it has
		ellipse = new Ellipse();
		ellipse.setColor(Color.RED);
		ellipse.setSize(60, 30);

		Mouse mouse = new Mouse();
		this.addMouseListener(mouse);
		this.addMouseMotionListener(mouse);
		this.addMouseWheelListener(mouse);

		setLocation(x, y);
		// the eclipse starts to move as soon as the timer starts
		Timer timer = new Timer(5, this);
		timer.start();
	}

	// sets the location of the ellipse
	public void setLocation(int x, int y) {
		ellipse.setLocation(x, y);

	}

	@Override
	// draws the ellipse on the JPanel
	public void paintComponent(Graphics g) {
		// Always include this when overriding paintComponent
		super.paintComponent(g);
		Graphics2D brush = (Graphics2D) g;
		ellipse.paint(brush);
	}

	// Nested class that contains the mouseEvent for the ellipse. This mouseEvent
	// involves a change in
	// color of the ellipse
	private class Mouse extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			int r = (int) (Math.random() * 256);
			int g = (int) (Math.random() * 256);
			int b = (int) (Math.random() * 256);
			Color c = new Color(r, g, b);

			ellipse.setColor(c);

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// lets the ellipse "wrap" around the JPanel
		// TODO Auto-generated method stub
		if (ellipse.getXLocation() > getWidth() || (ellipse.getYLocation() > getHeight())) {
			ellipse.setLocation(ellipse.getXLocation() - getWidth(), ellipse.getYLocation());
		} else {
			ellipse.setLocation(ellipse.getXLocation() + 2, ellipse.getYLocation());

		}
		this.repaint();
	}

}
