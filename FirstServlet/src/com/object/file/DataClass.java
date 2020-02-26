package com.object.file;

import com.data.file.CarData;
import com.data.file.Data;
import com.data.file.SlotData;
import com.operation.classs.Opration;

public class DataClass  extends DataOpration{
	Data d = null;
	public Data getData(String s)
	{
			if(s.equalsIgnoreCase("cardata"))
			{
				d=new CarData();
			}
			else
			if(s.equalsIgnoreCase("slotdata"))
			{				
				d=new SlotData();
			}
			if(s==null)
			{
				d=null;
			}
			return d;
		
}
	public Opration getOpration(String s) {
		// TODO Auto-generated method stub
		return null;
	}



}
