package updatedgui;

import java.awt.*;  
import javax.swing.*;  
public class gamePanel extends JPanel{
	
	
    public gamePanel(LoginControl lc){  
          
        JFrame f= new JFrame();  
        f.setBounds(100, 100, 653, 531);
        JPanel panel=new JPanel(null);   
        panel.setBounds(0, 0, 630, 600);    
        panel.setBackground(new Color(0, 128, 0)); 
        
        JLabel lblNewLabel = new JLabel("Player1"); 
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(19, 55, 94, 40);
		lblNewLabel.setLocation(20,50);
		panel.add(lblNewLabel);
		
		JTextField textField = new JTextField();
		textField.setBackground(new Color(255, 255, 240));
		textField.setBounds(86, 36, 339, 99);
		panel.add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		JLabel lblNewLabel_1 = new JLabel("Card Count");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(479, 10, 73, 28);
		lblNewLabel_1.setLocation(470,30);
		panel.add(lblNewLabel_1); 
		
		JTextField textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 255, 240));
		textField_1.setBounds(471, 48, 81, 28);
		textField_1.setLocation(460,60);
		panel.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setEditable(false);
		
		JLabel lblNewLabel_2 = new JLabel("Moves");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(481, 86, 64, 13);
		lblNewLabel_2.setLocation(470,95); 
		panel.add(lblNewLabel_2);
		
		JTextField textField_2 = new JTextField();
		textField_2.setBackground(new Color(255, 255, 240));
		textField_2.setBounds(471, 109, 81, 26);
		textField_2.setLocation(460,110);
		panel.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setEditable(false);
		
		JTextField textField_6 = new JTextField();
		textField_6.setBackground(new Color(255, 255, 240));
		textField_6.setBounds(90, 174, 292, 140);
		textField_6.setLocation(70,180);
		panel.add(textField_6);
		textField_6.setColumns(10);
		textField_6.setEditable(false);
		
		JButton btnNewButton = new JButton("Slap");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(423, 233, 85, 21);
		btnNewButton.setLocation(385,220); 
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(531, 233, 85, 21);
		btnNewButton_1.setLocation(480,220);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Player2");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(29, 398, 45, 13);
		lblNewLabel_3.setLocation(20,380);
		panel.add(lblNewLabel_3);
		
		JTextField textField_3 = new JTextField();
		textField_3.setBackground(new Color(255, 255, 240));
		textField_3.setBounds(86, 353, 349, 104);
		textField_3.setLocation(80,350);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Card Count");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(479, 346, 73, 13);
		lblNewLabel_4.setLocation(470,350);
		panel.add(lblNewLabel_4);
		
		JTextField textField_4 = new JTextField();
		textField_4.setBackground(new Color(255, 255, 240));
		textField_4.setBounds(471, 369, 84, 28);
		textField_4.setLocation(460,370); 
		panel.add(textField_4);
		textField_4.setColumns(10);
		textField_4.setEditable(false);
		
		JLabel lblNewLabel_5 = new JLabel("Moves");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(479, 407, 45, 13);
		lblNewLabel_5.setLocation(470,405);
		panel.add(lblNewLabel_5);
		
		JTextField textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(255, 255, 240));
		textField_5.setBounds(471, 430, 81, 26);
		textField_5.setLocation(460,420);
		panel.add(textField_5);
		textField_5.setEditable(false);
		
        
        f.add(panel);  
                f.setSize(630,600);    
                f.setLayout(null);    
                f.setVisible(true);    
      
    }
        public static void main(String args[])  
        {  
       
        	new gamePanel(null); //might need to change this if the code doesn't work  	
        }
    
    }  