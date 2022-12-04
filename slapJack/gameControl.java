package slapJack;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class gameControl implements ActionListener {
	
	private JPanel container;
	private ChatClient client;
	
	public gameControl(JPanel container, ChatClient client) 
	{
		this.container = container;
	    this.client = client;
	}

	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(command == "ready")
		{
			
		}
		
		else if(command == "slap")
		{
			
		}
		
		else if(command == "logout")
		{
			
		}
	}
}
