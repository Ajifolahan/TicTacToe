//Dhruvi Patel, Momoreoluwa Ayinde, Serena Havunen
//This class creates the frame of the game screen.

import javax.swing.JFrame;

public class TttApp extends JFrame {
	// instance variables
	private ColorHolder holder;
	private TicTacToe ttt;

	// parametized constructor initializing the holder variable(from the ColorHolder
	// class)
	public TttApp(ColorHolder holder) {

		super("Game window");
		this.holder = holder;
		ttt = new TicTacToe(holder);
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(ttt);
	}

//updates the color of the ttt board
	public void updateColor() {
		ttt.updateColor();
	}

}
