package com.operation.classs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.connection.file.ConnectionClass;

public class RemoveOperation implements Opration{
 Connection con=null;
 ResultSet rs=null;
 PreparedStatement st=null;	
 int result=0;

	public int insert(String number, String color) {
		// TODO Auto-generated method stub
		return 0;
	}


	public int Remove(int number) {
		// TODO Auto-generated method stub
		try {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			LocalDateTime now = LocalDateTime.now();  
			String temp=dtf.format(now);
			con=null;
			rs=null;
			st=null;
			con=ConnectionClass.connetionObj().connect();
			st=con.prepareStatement("update cardata set outTime=?,cStatus=? where slot=? and cstatus=?");
			st.setString(1,temp);
			st.setString(2,"OUT");
			st.setInt(3, number);
			st.setString(4,"IN");
			st.executeUpdate();
			} 
			catch (Exception e) 
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
		try {
		
			con=null;
			rs=null;
			st=null;
			con=ConnectionClass.connetionObj().connect();
			st=con.prepareStatement("select * from slot");
		
			st.execute();
			} 
			catch (Exception e) 
			{
			
			e.printStackTrace();
			
			}
			finally
			{
				try
				{
				con.close();
				} catch (SQLException e) 
				{
			// TODO Auto-generated catch block
					e.printStackTrace();
			}
			}
		try {
		
			con=null;
			rs=null;
			st=null;
			con=ConnectionClass.connetionObj().connect();
			st=con.prepareStatement("update slot set place='NO' where sno=? and place='Yes'");
	
			st.setInt(1, number);
			st.executeUpdate();
			} 
			catch (Exception e) 
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
		
		return 0;
	}

}
