///Dhruvi Patel, Momoreoluwa Ayinde, Serena Havunen
//This class contains the functionality of the tic-tac-toe game
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TicTacToe extends BPanel implements TttInterface {
	//instance variables
	private ColorHolder holder;
	private JPanel title = new JPanel();
	private JPanel main = new JPanel();
	private JLabel titletext = new JLabel();
	private JButton[] buttonarray = new JButton[9];
	private int clicked;
	private boolean turns;

	//parametized constructor
	public TicTacToe(ColorHolder holder) {
		super(holder);
		this.holder = holder;
		this.setLayout(new BorderLayout());

		title.setLayout(new BorderLayout());
		title.setBackground(Color.RED);
		title.setPreferredSize(new Dimension(0, 50));

		main.setLayout(new GridLayout(3, 3));
		
		titletext.setForeground(Color.GRAY);
		titletext.setFont(new Font("Times New Roman", Font.ITALIC, 70));
		titletext.setHorizontalAlignment(JLabel.CENTER);
		titletext.setText("Tic-Tac-Toe");

		this.add(title, BorderLayout.NORTH);
		this.add(main);
		title.add(titletext);
		buttonmethod();
	}

	public void buttonmethod() {

		// Loop to set up buttons and add the actionListener
		for (int i = 0; i < buttonarray.length; i++) {
			//create buttons
			buttonarray[i] = new JButton();
			//add buttons to the panel
			main.add(buttonarray[i]);
			buttonarray[i].setFont(new Font("Times New Roman", Font.BOLD, 120));
			holder.setColor(Color.PINK);
			buttonarray[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (int i = 0; i < buttonarray.length; i++) {
						if (e.getSource() == buttonarray[i]) {
							clicked += 1;
							if (clicked % 2 == 1) {
								if (buttonarray[i].getText() == "") {
									buttonarray[i].setText("X");
									buttonarray[i].setEnabled(false);
									titletext.setText("O turn");
									checkWinState();
								}
							} else {
								if (buttonarray[i].getText() == "") {
									buttonarray[i].setText("O");
									buttonarray[i].setEnabled(false);
									titletext.setText("X turn");
									checkWinState();
								}
							}
						}

					}
				}

			});

		}
	}

	//Overrides updateColor method from BPanel
	@Override
	public void updateColor() {
		for (int i = 0; i < buttonarray.length; i++) {
			buttonarray[i].setBackground(holder.getColor());
		}
	}

	//method to check win/lose/tie logic of the game
	public void checkWinState() {
		if ((buttonarray[0].getText() == "X") && (buttonarray[1].getText() == "X")
				&& (buttonarray[2].getText() == "X")) {
			buttonarray[0].setBackground(Color.BLACK);
			buttonarray[1].setBackground(Color.BLACK);
			buttonarray[2].setBackground(Color.BLACK);
			titletext.setText("Xwins");

			for (int i = 0; i < buttonarray.length; i++) {
				buttonarray[i].setEnabled(false);
			}
		} else if ((buttonarray[0].getText() == "X") && (buttonarray[3].getText() == "X")
				&& (buttonarray[6].getText() == "X")) {
			buttonarray[0].setBackground(Color.BLACK);
			buttonarray[3].setBackground(Color.BLACK);
			buttonarray[6].setBackground(Color.BLACK);
			titletext.setText("Xwins");

			for (int i = 0; i < buttonarray.length; i++) {
				buttonarray[i].setEnabled(false);
			}
		} else if ((buttonarray[0].getText() == "X") && (buttonarray[4].getText() == "X")
				&& (buttonarray[8].getText() == "X")) {
			buttonarray[0].setBackground(Color.BLACK);
			buttonarray[4].setBackground(Color.BLACK);
			buttonarray[8].setBackground(Color.BLACK);
			titletext.setText("Xwins");

			for (int i = 0; i < buttonarray.length; i++) {
				buttonarray[i].setEnabled(false);
			}
		} else if ((buttonarray[3].getText() == "X") && (buttonarray[4].getText() == "X")
				&& (buttonarray[5].getText() == "X")) {
			buttonarray[3].setBackground(Color.BLACK);
			buttonarray[4].setBackground(Color.BLACK);
			buttonarray[5].setBackground(Color.BLACK);
			titletext.setText("Xwins");

			for (int i = 0; i < buttonarray.length; i++) {
				buttonarray[i].setEnabled(false);
			}
		} else if ((buttonarray[6].getText() == "X") && (buttonarray[7].getText() == "X")
				&& (buttonarray[8].getText() == "X")) {
			buttonarray[6].setBackground(Color.BLACK);
			buttonarray[7].setBackground(Color.BLACK);
			buttonarray[8].setBackground(Color.BLACK);
			titletext.setText("Xwins");

			for (int i = 0; i < buttonarray.length; i++) {
				buttonarray[i].setEnabled(false);
			}
		} else if ((buttonarray[1].getText() == "X") && (buttonarray[4].getText() == "X")
				&& (buttonarray[7].getText() == "X")) {
			buttonarray[1].setBackground(Color.BLACK);
			buttonarray[4].setBackground(Color.BLACK);
			buttonarray[7].setBackground(Color.BLACK);
			titletext.setText("Xwins");

			for (int i = 0; i < buttonarray.length; i++) {
				buttonarray[i].setEnabled(false);
			}
		} else if ((buttonarray[2].getText() == "X") && (buttonarray[5].getText() == "X")
				&& (buttonarray[8].getText() == "X")) {
			buttonarray[2].setBackground(Color.BLACK);
			buttonarray[5].setBackground(Color.BLACK);
			buttonarray[8].setBackground(Color.BLACK);
			titletext.setText("Xwins");

			for (int i = 0; i < buttonarray.length; i++) {
				buttonarray[i].setEnabled(false);
			}
		} else if ((buttonarray[2].getText() == "X") && (buttonarray[4].getText() == "X")
				&& (buttonarray[6].getText() == "X")) {
			buttonarray[2].setBackground(Color.BLACK);
			buttonarray[4].setBackground(Color.BLACK);
			buttonarray[6].setBackground(Color.BLACK);
			titletext.setText("Xwins");

			for (int i = 0; i < buttonarray.length; i++) {
				buttonarray[i].setEnabled(false);
			}
		} else if ((buttonarray[0].getText() == "O") && (buttonarray[1].getText() == "O")
				&& (buttonarray[2].getText() == "O")) {
			buttonarray[0].setBackground(Color.BLACK);
			buttonarray[1].setBackground(Color.BLACK);
			buttonarray[2].setBackground(Color.BLACK);
			titletext.setText("Owins");

			for (int i = 0; i < buttonarray.length; i++) {
				buttonarray[i].setEnabled(false);
			}
		} else if ((buttonarray[0].getText() == "O") && (buttonarray[3].getText() == "O")
				&& (buttonarray[6].getText() == "O")) {
			buttonarray[0].setBackground(Color.BLACK);
			buttonarray[3].setBackground(Color.BLACK);
			buttonarray[6].setBackground(Color.BLACK);
			titletext.setText("Owins");

			for (int i = 0; i < buttonarray.length; i++) {
				buttonarray[i].setEnabled(false);
			}
		} else if ((buttonarray[0].getText() == "O") && (buttonarray[4].getText() == "O")
				&& (buttonarray[8].getText() == "O")) {
			buttonarray[0].setBackground(Color.BLACK);
			buttonarray[4].setBackground(Color.BLACK);
			buttonarray[8].setBackground(Color.BLACK);
			titletext.setText("Owins");

			for (int i = 0; i < buttonarray.length; i++) {
				buttonarray[i].setEnabled(false);
			}
		} else if ((buttonarray[3].getText() == "O") && (buttonarray[4].getText() == "O")
				&& (buttonarray[5].getText() == "O")) {
			buttonarray[3].setBackground(Color.BLACK);
			buttonarray[4].setBackground(Color.BLACK);
			buttonarray[5].setBackground(Color.BLACK);
			titletext.setText("Owins");

			for (int i = 0; i < buttonarray.length; i++) {
				buttonarray[i].setEnabled(false);
			}
		} else if ((buttonarray[6].getText() == "O") && (buttonarray[7].getText() == "O")
				&& (buttonarray[8].getText() == "O")) {
			buttonarray[6].setBackground(Color.BLACK);
			buttonarray[7].setBackground(Color.BLACK);
			buttonarray[8].setBackground(Color.BLACK);
			titletext.setText("Owins");

			for (int i = 0; i < buttonarray.length; i++) {
				buttonarray[i].setEnabled(false);
			}
		} else if ((buttonarray[1].getText() == "O") && (buttonarray[4].getText() == "O")
				&& (buttonarray[7].getText() == "O")) {
			buttonarray[1].setBackground(Color.BLACK);
			buttonarray[4].setBackground(Color.BLACK);
			buttonarray[7].setBackground(Color.BLACK);
			titletext.setText("Owins");

			for (int i = 0; i < buttonarray.length; i++) {
				buttonarray[i].setEnabled(false);
			}
		} else if ((buttonarray[2].getText() == "O") && (buttonarray[5].getText() == "O")
				&& (buttonarray[8].getText() == "O")) {
			buttonarray[2].setBackground(Color.BLACK);
			buttonarray[5].setBackground(Color.BLACK);
			buttonarray[8].setBackground(Color.BLACK);
			titletext.setText("Owins");

			for (int i = 0; i < buttonarray.length; i++) {
				buttonarray[i].setEnabled(false);
			}
		} else if ((buttonarray[2].getText() == "O") && (buttonarray[4].getText() == "O")
				&& (buttonarray[6].getText() == "O")) {
			buttonarray[2].setBackground(Color.BLACK);
			buttonarray[4].setBackground(Color.BLACK);
			buttonarray[6].setBackground(Color.BLACK);
			titletext.setText("Owins");

			for (int i = 0; i < buttonarray.length; i++) {
				buttonarray[i].setEnabled(false);
			}
		} else if (clicked == 9) {
			title.setBackground(Color.BLACK);
			titletext.setText("It's a tie");
		}

	}
}
