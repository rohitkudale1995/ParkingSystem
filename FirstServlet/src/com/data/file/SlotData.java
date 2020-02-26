package com.data.file;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.TreeMap;

import com.connection.file.ConnectionClass;
import com.user.classs.CarDetails;

public class SlotData implements Data {
	 Connection con=null;
	 ResultSet rs=null;
	 Statement st=null;
	 TreeMap<Integer,String> t=new TreeMap<Integer,String>();
	 public TreeMap<Integer, String> getSlotDetails()
	 {
		try 
		{
			 con=ConnectionClass.connetionObj().connect();
			 st=con.createStatement();
			 rs=st.executeQuery("select * from Slot");
			 while(rs.next())
			 {
				 t.put(rs.getInt(1), rs.getString(2));
			 }	
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
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
		return t;
	}
	@Override
	public ArrayList<CarDetails> getCarDetails() {
		// TODO Auto-generated method stub
		return null;
	}
}
