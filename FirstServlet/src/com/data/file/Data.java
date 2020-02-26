package com.data.file;

import java.util.ArrayList;
import java.util.TreeMap;

import com.user.classs.CarDetails;

public interface Data {
	public ArrayList<CarDetails> getCarDetails();
	public TreeMap<Integer,String> getSlotDetails();
}
