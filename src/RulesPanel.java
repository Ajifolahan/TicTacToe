//Dhruvi Patel, Momoreoluwa Ayinde, Serena Havunen
// this class lets the user know all the rules of the game
// these rules are displayed on the right side of the frame

import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Graphics;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;

public class RulesPanel extends JPanel {

	public RulesPanel() {

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		this.setBackground(Color.BLACK);
		JTextArea text1 = new JTextArea("Rules" + "\n1. The game is played on a grid that's 3 squares by 3 squares."
				+ "\n2. You are X, your friend is O. Players take turns putting their marks in empty squares."
				+ "\n3. The first player to get 3 of her marks in a row (up, down, across, or diagonally) is the winner."
				+ "\n4. When all 9 squares are full, the game is over. If no player has 3 marks in a row, the game ends in a tie.");

		text1.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		//make the JTextArea uneditable
		text1.setEditable(false);
		//wraps the text around the border
		text1.setLineWrap(true);
		text1.setWrapStyleWord(true);
		panel.setPreferredSize(new Dimension(100, 450));
		this.add(panel);
		panel.add(text1, BorderLayout.NORTH);
	}

}
