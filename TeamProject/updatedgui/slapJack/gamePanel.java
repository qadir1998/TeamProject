package slapJack;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class gamePanel extends JPanel
{
	private JTextField textField;
	private JTextField textField_1;
  // Constructor for the game panel.
  public gamePanel(gameControl gc)
  {
  	setBackground(new Color(46, 139, 87));
  	setLayout(null);
  	
  	JLabel lblNewLabel = new JLabel("Player 1");
  	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
  	lblNewLabel.setBounds(10, 25, 60, 13);
  	add(lblNewLabel);
  	
  	JLabel lblPlayer = new JLabel("Player 2");
  	lblPlayer.setFont(new Font("Tahoma", Font.BOLD, 12));
  	lblPlayer.setBounds(10, 159, 60, 13);
  	add(lblPlayer);
  	
  	JLabel lblCardCount = new JLabel("Card Count");
  	lblCardCount.setFont(new Font("Tahoma", Font.BOLD, 12));
  	lblCardCount.setBounds(204, 142, 74, 13);
  	add(lblCardCount);
  	
  	JLabel lblCardCount_1 = new JLabel("Card Count");
  	lblCardCount_1.setFont(new Font("Tahoma", Font.BOLD, 12));
  	lblCardCount_1.setBounds(204, 10, 74, 13);
  	add(lblCardCount_1);
  	
  	textField = new JTextField();
  	textField.setBounds(204, 25, 74, 30);
  	textField.setEditable(false);
  	add(textField);
  	textField.setColumns(10);
  	
  	textField_1 = new JTextField();
  	textField_1.setColumns(10);
  	textField_1.setBounds(204, 159, 74, 30);
  	textField_1.setEditable(false);
  	add(textField_1);
  	
  	BufferedImage image = null;
	try {
		image = ImageIO.read(new File("slapJack/back.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  	
  	JPanel panel = new JPanel();
  	panel.setBounds(80, 142, 114, 49);
  	add(panel);
  	JLabel piclabel = new JLabel(new ImageIcon(image));
    panel.add(piclabel);
  	
  	JPanel panel_1 = new JPanel();
  	panel_1.setBounds(81, 10, 113, 49);
  	add(panel_1);
  	JLabel piclabel2 = new JLabel(new ImageIcon(image));
  	panel_1.add(piclabel2);
  	
  	JPanel panel_2 = new JPanel();
  	panel_2.setBounds(80, 69, 51, 63);
  	add(panel_2);
  	JLabel piclabel3 = new JLabel(new ImageIcon(image));
  	panel_2.add(piclabel3);
  	
  	JPanel panel_2_1 = new JPanel();
  	panel_2_1.setBounds(141, 69, 53, 63);
  	add(panel_2_1);
  	JLabel piclabel4 = new JLabel(new ImageIcon(image));
  	panel_2_1.add(piclabel4);
  	
  	JButton btnNewButton = new JButton("Slap!");
  	btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
  	btnNewButton.setBounds(204, 111, 85, 21);
  	add(btnNewButton);
  	
  	JButton btnNewButton_1 = new JButton("Logout");
  	btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
  	btnNewButton_1.setBounds(10, 201, 85, 21);
  	add(btnNewButton_1);
  	
  	JButton btnReady = new JButton("Ready ");
  	btnReady.setFont(new Font("Tahoma", Font.BOLD, 12));
  	btnReady.setBounds(204, 65, 85, 21);
  	add(btnReady);
  }
}
