package console.library.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
	public static java.sql.Connection getConnections() throws ClassNotFoundException, FileNotFoundException, IOException, SQLException
	{ java.sql.Connection conn = null;
		try {
			String dbUrl=ReadPropertyFile.getInstance().readPropertyfile("dburl");
			String connstring=ReadPropertyFile.getInstance().readPropertyfile("connstring");
			String usernm=ReadPropertyFile.getInstance().readPropertyfile("usernm");
			String pwd=ReadPropertyFile.getInstance().readPropertyfile("pwd");
			
			Class.forName(dbUrl);
			conn = DriverManager.getConnection(connstring,usernm,pwd);
			//System.out.println("Connected");
			
		}
		catch( ClassNotFoundException | FileNotFoundException fnf)
		{
			System.out.println(fnf);
		}
		
		return conn;
	}
}
