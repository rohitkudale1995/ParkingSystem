package com.operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.connection.file.ConnectionClass;

public class InsertOpration implements  Opration{
	static Connection con=null;
	static ResultSet rs=null;
	static PreparedStatement st=null;	
	static int result=0;
	public int insert(String number, String color) {
		// TODO Auto-generated method stub
		if(number!=null && color!=null)
		{
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
			} finally {
				try {
					con.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
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
	}
		return result;
	
	}

	public int Remove(int number) {
		// TODO Auto-generated method stub
		return 0;
	}

}
