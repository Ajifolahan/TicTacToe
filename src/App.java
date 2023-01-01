//Dhruvi Patel, Momoreoluwa Ayinde, Serena Havunen
// This is the blueprint of the JFrame

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class App extends JFrame {
	//instance variables
	private CenterPanel centerPanel;
	private RulesPanel rulesPanel;
	private NorthPanel northPanel;
	private SouthPanel southPanel;
	private TttApp ttt;

	//default constructor
	public App() {

		super("Welcome window");

		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());
		ColorHolder holder = new ColorHolder();

		northPanel = new NorthPanel(30, 15, holder);
		southPanel = new SouthPanel(30, 10, holder);
		centerPanel = new CenterPanel(this, holder, northPanel, southPanel, ttt);
		rulesPanel = new RulesPanel();

		content.add(southPanel, BorderLayout.SOUTH);
		content.add(northPanel, BorderLayout.NORTH);
		content.add(rulesPanel, BorderLayout.EAST);
		content.add(centerPanel, BorderLayout.CENTER);
		ttt = new TttApp(holder);

		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(content);
		setVisible(true);

	}

	public void changescreen() {
		this.setVisible(false);
		ttt.setVisible(true);
		ttt.updateColor();
	}

	public static void main(String[] args) {
		new App();
	}

}