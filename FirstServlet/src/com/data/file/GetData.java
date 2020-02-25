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
			 CarDetails c=new CarDetails();
			 c.setRegNumber(rs.getString(1));
			 c.setColor(rs.getString(2));
			 c.setInTime(rs.getString(3));
			 c.setOutTime(rs.getString(4));
			 c.setStatus(rs.getString(5));
			 c.setSlot(rs.getInt(5));
		a.add(c);
	
		 }	
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
