package slapJack;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class gamePanel extends JPanel {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_3;
	private JLabel lblNewLabel_4;
	private JTextField textField_4;
	private JLabel lblNewLabel_5;
	private JTextField textField_5;
	private JTextField textField_6;

	public gamePanel() {
		
		frame = new JFrame("gameGUI");
		frame.getContentPane().setBackground(new Color(0, 128, 0));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 653, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Player1");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(29, 65, 94, 40);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 240));
		textField.setBounds(86, 36, 339, 99);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		lblNewLabel_1 = new JLabel("Card Count");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(479, 10, 73, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 255, 240));
		textField_1.setBounds(471, 48, 81, 28);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		textField_1.setEditable(false); 
		
		lblNewLabel_2 = new JLabel("Moves");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(481, 86, 64, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(255, 255, 240));
		textField_2.setBounds(471, 109, 81, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		textField_2.setEditable(false); 
		
		lblNewLabel_3 = new JLabel("Player2");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(29, 398, 45, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(255, 255, 240));
		textField_3.setBounds(86, 353, 349, 104);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Card Count");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(479, 346, 73, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(255, 255, 240));
		textField_4.setBounds(471, 369, 84, 28);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		textField_4.setEditable(false);
		
		lblNewLabel_5 = new JLabel("Moves");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(479, 407, 45, 13);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(255, 255, 240));
		textField_5.setBounds(471, 430, 81, 26);
		frame.getContentPane().add(textField_5);
		textField_5.setEditable(false);
		
		textField_6 = new JTextField();
		textField_6.setBackground(new Color(255, 255, 240));
		textField_6.setBounds(90, 174, 292, 140);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		textField_6.setEditable(false);
		
		JButton btnNewButton = new JButton("Slap");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(423, 233, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(531, 233, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		
			
		
	}
}