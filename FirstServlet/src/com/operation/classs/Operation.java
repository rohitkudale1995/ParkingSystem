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
	static ArrayList<CarDetails> a;
	
	static TreeMap<Integer,String> t;
	static int result=0;

	
	public static  int Number(){
		try {
			

			 con=ConnectionClass.connetionObj().connect();
			 st=con.prepareStatement("select min(sno) as no from Slot where place='NO'");
			 rs=st.executeQuery();
	
			 while(rs.next()){
				result=rs.getInt("no");
			
			 }	
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return result;
	}
	
	public static int insert(String number,String color){
		int num=Number();
		try{
		if(num==0)
			{
			   con=null;
				  rs=null;
			  st=null;
			 con=ConnectionClass.connetionObj().connect();
			 st=con.prepareStatement("select max(sno) as no from Slot where place='Yes'");
			 rs=st.executeQuery();
	
			 while(rs.next()){
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
			}else{
				  con=null;
				  rs=null;
			  st=null;
			  con=ConnectionClass.connetionObj().connect();
				 st=con.prepareStatement("update  slot set Place='Yes' where sno=?");
				st.setInt(1, result);
				st.executeUpdate();
			}
	
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
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
	
	}
		
		return result;
	
	}


}
