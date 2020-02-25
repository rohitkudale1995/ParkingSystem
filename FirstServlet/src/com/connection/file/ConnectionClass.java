package com.connection.file;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
	private static	ConnectionClass connectionclass=new ConnectionClass();
	Connection con;
	private ConnectionClass(){
		
	}
	public static ConnectionClass connetionObj(){
		return connectionclass;
	}
	public Connection connect(){
		 try {
			
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost/parking","root","root");
				
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.print(" Not Connect "+e);
		}
		return con;
	}
}
