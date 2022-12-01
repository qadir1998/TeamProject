package slapJack;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

public class DatabaseTest {
	
	String[] users = {"jsmith@uca.edu","msmith@uca.edu","tjones@yahoo.com","jjones@yahoo.com"};
	String[] passwords = {"hello123","pass123","123456","hello1234"};
	
	
	/*@Test
	public void testSetConnection()
	{
		Database database = new Database();
		Connection conn;
		
		database.setConnection("lab8out/db.properties");
		//database.setConnection("lab8out/db.proportees"); results in failure
		conn = database.getConnection();
		assertNotNull(conn);
	}*/
	
	@Test
	public void testQuery()
	{
		int user = 3;  //change this to choose different users
		
		Database database = new Database();	
		String q = "select username, aes_decrypt(password,'key') from user where username='imcginnes'";
		//String q = "select usernam, aes.decrypt(password,'kee') from users where username is '" + user[user] + "'";   results in failure
		
		ArrayList<String> r = database.query(q);
		String res = r.toString();
		String exp = "[" + "imcginnes" + "," + "hehe123" + "]";
		//String exp = "[" + imcginnes + "," + passwords[user] + "]"; results in failure
		assertEquals(exp, res);
	}
	
	@Test
	public void testExecuteDML() throws SQLException
	{
		Database database = new Database();	
		String d = "insert into user values('imcginnes',aes_encrypt('hehe123','key'))";    //fails if username already in database
		//String d = "insert in useers value('imcginnes@cub.uca.edu','hehe123')'";   results in failure
		String d2 = "delete from user where username='imcginnes'";
		
		//database.executeDML(d);
		database.executeDML(d2);
		
	}

}
