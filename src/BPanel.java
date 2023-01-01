//Dhruvi Patel, Momoreoluwa Ayinde, Serena Havunen
//this class is used to acheive polymorphism, Northpanel and Southpanel extend BPanel and use its updateColor method
//tictactoe extends BPanel and overrides its updateColor method. 

import javax.swing.JPanel;

public class BPanel extends JPanel {
	// instance variables
	private ColorHolder holder;

	// paramaetized constructor
	public BPanel(ColorHolder holder) {
		this.holder = holder;
	}

    //uses holder to setBackground Color
	public void updateColor() {
		this.setBackground(holder.getColor());
	}

}
