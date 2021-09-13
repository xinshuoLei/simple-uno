package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EndView {
	
	/**
	 * constant for font size
	 */
	private float FONT_SIZE = 20;
	
	/**
	 * constant for window width
	 */
	private int END_WINDOW_WIDTH = 1000;
	
	/**
	 * constant for window height
	 */
	private int END_WINDOW_HEIGHT = 800;
	
	/**
	 * constant for image height
	 */
	private int IMAGE_WIDTH = 300;
	
	/**
	 * constant for image height
	 */
	private int IMAGE_HEIGHT = 300;
	
	/**
	 * winner of the uno game
	 */
	private String winner;
	
	 /**
	 * Constructor of the EndView class
	 * @param setWinner winner of the game
	 */
	
	public EndView(String setWinner) {
		winner = setWinner;
		JFrame endView = new JFrame("End");
		endView.setSize(END_WINDOW_WIDTH,END_WINDOW_HEIGHT);
		JPanel endPanel = Utilities.initializePanel(END_WINDOW_WIDTH, 
													END_WINDOW_HEIGHT);
		
		// display winner prompt
		String winnerPrompt = "The winner is " + winner + "!" ;
		int promptY = 520;
		Utilities.displayText(endPanel, winnerPrompt, FONT_SIZE, 
									END_WINDOW_WIDTH, promptY);
		
		// display a trophy image
		String trophyUrl = 
		"https://media.istockphoto.com/vectors/vector-flat-golden-trophy-vector-"
		+ "id1176397624?k=20&m=1176397624&s=612x612&w=0&h=yICH7de39SwB1sDP4-kBHFS"
		+ "8bJz4srdu_HOrBC9KvzY=";
		
		int imageX = (END_WINDOW_WIDTH - IMAGE_WIDTH) / 2;
		int imageY = 150;
		Utilities.displayImageFromUrl(endPanel, IMAGE_WIDTH, IMAGE_HEIGHT, 
										imageX, imageY, trophyUrl);
		
		endView.setContentPane(endPanel);
		endView.setVisible(true);
		endView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
