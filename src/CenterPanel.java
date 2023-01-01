//Dhruvi Patel, Momoreoluwa Ayinde, Serena Havunen
//This class is the blueprint of the first window.
//It asks the user which color they want their game scheme to be 
//and also has a prompt button to start the game(this button sends the user to the other window)

import javax.swing.JPanel;

import javax.swing.JTextArea;
import java.awt.Graphics;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CenterPanel extends JPanel implements ActionListener {
	// instance variables
	private JPanel panel;
	private JButton button, blue, gray;
	private App app;
	private ColorHolder holder;
	private BPanel northPanel;
	private BPanel southPanel;
	private TttApp ttt;

	// parametized constructor
	public CenterPanel(App app, ColorHolder holder, NorthPanel northPanel, SouthPanel southPanel, TttApp ttt) {
		this.app = app;
		this.holder = holder;
		this.northPanel = northPanel;
		this.southPanel = southPanel;
		this.ttt = ttt;

		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		this.setBackground(Color.PINK);

		JTextArea text = new JTextArea("Welcome to Tic-Tac-Toe");
		text.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		button = new JButton("Click Start to begin");
		button.setFont(new Font("Times New Roman", Font.BOLD, 25));
		JTextArea text2 = new JTextArea("Choose the Game Layouts color");
		blue = new JButton("Blue");
		gray = new JButton("Gray");
		text.setEditable(false);
		text2.setEditable(false);
		this.add(panel);
		panel.add(text, BorderLayout.NORTH);
		panel.add(button, BorderLayout.SOUTH);
		panel.add(text2, BorderLayout.SOUTH);
		panel.add(blue, BorderLayout.EAST);
		panel.add(gray, BorderLayout.WEST);
		button.addActionListener(this);
		blue.addActionListener(this);
		gray.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// checks if button was clicked and then changes the app screen to the game
		// screen
		if (e.getSource() == button) {
			app.changescreen();
			// checks if button was clicked and then uses the holder to update the
			// background color of the various
			// panels
		} else if (e.getSource() == blue) {
			holder.setColor(Color.BLUE);
			this.setBackground(holder.getColor());
			northPanel.updateColor();
			southPanel.updateColor();
		} else if (e.getSource() == gray) {
			holder.setColor(Color.GRAY);
			this.setBackground(holder.getColor());
			northPanel.updateColor();
			southPanel.updateColor();
		}

	}

}
