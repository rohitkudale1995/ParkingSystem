package com.user.classs;

public class CarDetails {
public String regNumber;
public String color;
public String inTime;
public String outTime;
public int slot;
public String Status;
 public CarDetails(String regNumber,String color,String inTime,String outTime,int slot,String Status){
	this.color=color;
	this.regNumber=regNumber;
	this.inTime=inTime;
	this.outTime=outTime;
	this.slot=slot;
	this.Status=Status;
}
	

@Override
public String toString() {
	return " [regNumber=" + regNumber + ", color=" + color + ", inTime=" + inTime + ", outTime=" + outTime
			+ ", slot=" + slot + ", Status=" + Status + "]";
}



}
