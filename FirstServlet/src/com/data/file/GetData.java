package com.data.file;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.TreeMap;

import com.connection.file.ConnectionClass;
import com.mysql.*;
import com.user.classs.CarDetails;
import com.user.classs.User;

public class GetData {
	static Connection con=null;
	static ResultSet rs=null;
	static Statement st=null;
	static ArrayList<CarDetails> a=new ArrayList<CarDetails>();
	static TreeMap<Integer,String> t=new TreeMap<Integer,String>();
	static ArrayList<Integer> s=new ArrayList<Integer>();
	
public static ArrayList<CarDetails> getCarDetails(){
	try {
	

		 con=ConnectionClass.connetionObj().connect();
		 st=con.createStatement();
		 rs=st.executeQuery("select * from CarData");
		 while(rs.next()){
			 CarDetails c=new CarDetails(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(6),rs.getString(5));
			 a.add(c);
	
		 }	
		 con.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	return a;
	
}
public static TreeMap<Integer,String> getSlotDetails()
{
	try {
	

		 con=ConnectionClass.connetionObj().connect();
		 st=con.createStatement();
		 rs=st.executeQuery("select * from Slot");
		 while(rs.next()){
		t.put(rs.getInt(1), rs.getString(2));
		s.add(rs.getInt(1));
		
		 }	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return t;
	
}
public static ArrayList<Integer> getSlot(){
	getSlotDetails();
	return s;
	
}
}
