package com.data.file;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.connection.file.ConnectionClass;
import com.mysql.*;
import com.user.classs.User;

public class GetData {
	static Connection con=null;
	static ResultSet rs=null;
	static Statement st=null;
	static ArrayList<User> a=new ArrayList<User>();
public static ArrayList<User> get(){
	try {
	

		 con=ConnectionClass.connetionObj().connect();
		 st=con.createStatement();
		 rs=st.executeQuery("select * from admin");
		 while(rs.next()){
		a.add(new User(rs.getString(1),rs.getString(2)));
	
		 }	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return a;
	
}

}
