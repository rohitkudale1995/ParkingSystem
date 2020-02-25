package com.user.classs;

public class CarDetails {
private String regNumber;
private String color;
private String inTime;
private String outTime;
private int slot;
private String Status;
	public String getRegNumber() {
	return regNumber;
}

public void setRegNumber(String regNumber) {
	this.regNumber = regNumber;
}

public String getStatus() {
	return Status;
}

public void setStatus(String status) {
	Status = status;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getInTime() {
	return inTime;
}

public void setInTime(String inTime) {
	this.inTime = inTime;
}

public String getOutTime() {
	return outTime;
}

public void setOutTime(String outTime) {
	this.outTime = outTime;
}

public int getSlot() {
	return slot;
}

public void setSlot(int slot) {
	this.slot = slot;
}

@Override
public String toString() {
	return " [regNumber=" + regNumber + ", color=" + color + ", inTime=" + inTime + ", outTime=" + outTime
			+ ", slot=" + slot + ", Status=" + Status + "]";
}



}
