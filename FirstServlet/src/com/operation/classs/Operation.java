package com.operation.classs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.TreeMap;

import com.connection.file.ConnectionClass;
import com.data.file.GetData;
import com.user.classs.CarDetails;

public class Operation {
	static Connection con=null;
	static ResultSet rs=null;
	static PreparedStatement st=null;
	
	static int result=0;
	
	public static int insert(String number,String color){
		try {
			 con=ConnectionClass.connetionObj().connect();
			 st=con.prepareStatement("select min(sno) as no from Slot where place='NO'");
			 rs=st.executeQuery();
	
			 while(rs.next())
			 {
				result=rs.getInt("no");
			
			 }	
		
			 con.close();
			} catch (Exception e)
				{
			
				e.printStackTrace();
				
				}
		
		int num=result;
		
		try{
				if(num==0)
				{
					con=null;
					rs=null;
					st=null;
					con=ConnectionClass.connetionObj().connect();
					st=con.prepareStatement("select max(sno) as no from Slot where place='Yes'");
					rs=st.executeQuery();
	
						while(rs.next())
							{
								num=rs.getInt("no");
			
							}
					result=num+1;
					con=null;
					rs=null;
					st=null;
					con=ConnectionClass.connetionObj().connect();
					st=con.prepareStatement("insert into slot values(?,?)");
					st.setInt(1, result);
					st.setString(2, "Yes");
					st.executeUpdate();
					con.close();
				}
				else
				{
				  con=null;
				  rs=null;
				  st=null;
				 con=ConnectionClass.connetionObj().connect();
				 st=con.prepareStatement("update  slot set Place='Yes' where sno=?");
				 st.setInt(1, result);
				 st.executeUpdate();
				 con.close();
				}
			} 
		
			catch (Exception e) 
			{
			
				e.printStackTrace();
			}
	
		try{
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
				LocalDateTime now = LocalDateTime.now();  
				String temp=dtf.format(now);
				con=null;
				rs=null;
				st=null;
				con=ConnectionClass.connetionObj().connect();
				st=con.prepareStatement("insert into CarData values(?,?,?,?,?,?)");
				st.setString(1, number);
				st.setString(2, color);
				st.setString(3, temp);
				st.setString(4, "-");
				st.setString(5, "IN");
				st.setInt(6, result);
				st.executeUpdate();
				con.close();  
			} 
		catch (Exception e) 
		{
	
		e.printStackTrace();
		
		}
		
		return result;
	
	}
	
	public static int Remove(int number){
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
		return 0;
	}

}
