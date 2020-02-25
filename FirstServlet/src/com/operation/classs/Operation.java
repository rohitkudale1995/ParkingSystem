package com.operation.classs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.TreeMap;

import com.data.file.GetData;
import com.user.classs.CarDetails;

public class Operation {
	
	static ArrayList<CarDetails> a;
	
	static TreeMap<Integer,String> t;
	static int result=0;

	
	public  int Number(){
		
		 ArrayList<Integer> it=GetData.getSlot();
		System.out.println(it);

		if(it.size()==0){
			result=1;
		}else
			if(it.get(0)==1 && it.get(1)!=2){
			
				result=2;
			}else{
		
					for(int i=0;i<it.size()-1;i++){
						if(it.get(i+1)-it.get(i)!=1){
							result=it.size()+1;
				
						}else{
							result=it.get(i+1)+1;
							break;
						}
					}
				}
		it.removeAll(it);
		return result;
	}
	public static int insert(String number,String color){
		return result;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
