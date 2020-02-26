package com.object.file;

public class MainObject {
	static DataOpration od;
public static DataOpration getObject(String select){
	if(select.equalsIgnoreCase("Data"))
	{
		od=new DataClass();
	}else
		if(select.equalsIgnoreCase("opration")){
			od=new OprationClass();
		}else
		{
			od=null;
		}
	return od;
}

}
