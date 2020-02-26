package com.object.file;

import com.data.file.CarData;
import com.data.file.Data;
import com.data.file.SlotData;
import com.operation.InsertOpration;
import com.operation.Opration;
import com.operation.RemoveOperation;

public class OprationClass extends DataOpration{
Opration o=null;
	public Data getData(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	public Opration getOpration(String s) {
		// TODO Auto-generated method stub
		if(s.equalsIgnoreCase("insertdata"))
		{
			o=new InsertOpration();
		}
		else
		if(s.equalsIgnoreCase("removedata"))
		{				
			o=new RemoveOperation();
		}
		if(s==null)
		{
			o=null;
		}
		return o;
		
		
	
	}

}
