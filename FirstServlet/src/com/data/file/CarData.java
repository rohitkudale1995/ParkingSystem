package com.data.file;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.TreeMap;

import com.connection.file.ConnectionClass;
import com.user.classs.CarDetails;

public class CarData implements Data{
	 Connection con=null;
	 ResultSet rs=null;
	 Statement st=null;
	 ArrayList<CarDetails> a=new ArrayList<CarDetails>();

	@Override
	public ArrayList<CarDetails> getCarDetails() {
		// TODO Auto-generated method stub
		try 
		{
		

			 con=ConnectionClass.connetionObj().connect();
			 st=con.createStatement();
			 rs=st.executeQuery("select * from CarData");
			 while(rs.next())
			 {
				 CarDetails c=new CarDetails(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(6),rs.getString(5));
				 a.add(c);
		
			 }	
			 con.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return a;
		
	}

	public TreeMap<Integer, String> getSlotDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
