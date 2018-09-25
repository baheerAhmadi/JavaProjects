package console.library.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class CurdOperations {
	static ResultSet rs;
	
	public static void getList(ResultSet rs)throws SQLException{
	while (rs.next()) {
		int id = rs.getInt("id");
		String subject = rs.getString("name");
//Book b=new Book();
//b.setId(id);
//b.setSubject(subject);

//Collection: List<Book> a=new ArrayList<Book>();
//a=a.add(b);

		// Display values
		System.out.print("ID: " + id+", Subject: " + subject + "\n");
	}
	}
	
	
	public static void displayChoices(){
		String stars="********************************************************************************************************";
		System.out.println("\n\n"+stars+"\n"+ "Enter The Choices\n1. Display the List of Books\n2. Add the Book\n3. Update the books \n4. Delete the Books\n5. Exit\n"+stars);
		System.out.println("Enter the Choice 1..5 to manage your library");
		
	}
	
	
	public static Connection getConnections() throws ClassNotFoundException, FileNotFoundException, IOException, SQLException
	{ Connection conn = null;
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
	public static void main(String args[]) 

	{	
		Statement stmt;
		String c;
		
		try(Connection conn=CurdOperations.getConnections();) {
			
			//System.out.println(conn);
			if(conn!=null)
			{
				int i,j,m,n;
				
				do{
					Random rand = new Random();
					int  a = rand.nextInt(5000) + 1;
					CurdOperations.displayChoices();
					stmt = conn.createStatement();
					Scanner sc = new Scanner(System.in);
					i = sc.nextInt();
				switch(i)
				{
				case 1: {
				
				String sqlcreate = "SELECT * FROM LINRARYMANAGEMENT";
				rs = stmt.executeQuery(sqlcreate);
				System.out.println("List of Books Avaialble...");
				// Extracting data from result settyryr
				 CurdOperations.getList(rs);
				 
				} break;
				case 2: {
					System.out.println("Enter the book name to insert");
					
					System.out.print(sc.nextLine());
					String sql = "Insert into LINRARYMANAGEMENT values("+a+", '"+sc.nextLine() +"')";
					//System.out.println(sql);
					stmt.executeUpdate(sql);
					System.out.println("Inserted records into the table...");
					
					
					String sqlcreate = "SELECT * FROM LINRARYMANAGEMENT";
					rs = stmt.executeQuery(sqlcreate);
					/*System.out.println("List of Books Avaialble...");
					// Extracting data from result set
					 getList( rs);*/
					 
					} break;
				case 3: {
					System.out.println("Enter the book id to update");
					System.out.print(m=sc.nextInt());
					System.out.println("Enter the book name to update");
					//System.out.print(sc.nextLine());
					String sqlupdate = "UPDATE LINRARYMANAGEMENT SET subject ='"+sc.nextLine()+"' WHERE id = "+(m)+"";

					stmt.executeUpdate(sqlupdate);
					//System.out.println(sqlupdate);
					//stmt.executeUpdate(sql);
					System.out.println("Updated records into the table...");
					
					
					/*String sqlcreate = "SELECT * FROM LINRARYMANAGEMENT";
					rs = stmt.executeQuery(sqlcreate);
					System.out.println("List of Books Avaialble...");
					// Extracting data from result set
					 getList( rs);
					 */
					} break;
				case 4: {
					System.out.println("Enter the book id to Delete");
					
					System.out.print(n=sc.nextInt());
					String sqldelete = "DELETE FROM LINRARYMANAGEMENT " +"WHERE id = "+n+"";
					
					stmt.executeUpdate(sqldelete);
					//System.out.println(sqldelete);
					System.out.println("Record "+n+" deleted from the Library...");
					
					/*
					String sqlcreate = "SELECT * FROM LINRARYMANAGEMENT";
					rs = stmt.executeQuery(sqlcreate);
					System.out.println("List of Books Avaialble...");
					// Extracting data from result set
					 getList( rs);*/
					 
					} break;
				case 5: System.out.println("System Shuttdown"); break;
				
				default: System.out.println("Please enter Valid choice");
				}
				
			}while(i!=5);
			
			

			// Reading the books in Library Mangement System
			
			

			 /*
			// Update books in Library
			
			System.out.println("\n\nList of Updates Books Avaialble...");
			//Reading the Upadted books in Library
			sql = "SELECT id, subject FROM LINRARYMANAGEMENT";
			rs = stmt.executeQuery(sql);
			getList( rs);
			*/
			/*
			System.out.println("\n\nList of Available Books after removing out of stock books of id: "+(a+1)+"");
			//Reading the Upadted books in Library
			sql = "SELECT id, subject FROM LINRARYMANAGEMENT";
			rs = stmt.executeQuery(sql);
			getList( rs);*/
			
		
			}
		}
		catch (Exception e) {
			System.out.println("Error Caused" + e);
		}
	}
}
