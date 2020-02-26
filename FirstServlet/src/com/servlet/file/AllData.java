package com.servlet.file;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.data.file.CarData;
import com.data.file.Data;

import com.object.file.DataOpration;
import com.object.file.MainObject;
import com.operation.classs.Opration;
import com.user.classs.CarDetails;

/**
 * Servlet implementation class AllData
 */
@WebServlet("/AllData")
public class AllData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllData()
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
		DataOpration o=MainObject.getObject("Data");
		Data cd=o.getData("cardata");	
		ArrayList<CarDetails> c=cd.getCarDetails();
		PrintWriter pw = response.getWriter();
		PrintWriter pw1 = response.getWriter();
	
	
		pw.write("<h1 style='text-align:center'>Parking System</h1><div  align='center' ><h3>All Car Details</h3><table border='2'><tr><th>Registration No</th><th>Color</th></th><th>IN Time</th><th>Slot</th><th>Out Time</th><th>Status</th><tr>");

		for(int i=0;i<c.size();i++)
		{
			
			pw1.write("<tr><td>"+c.get(i).regNumber+"</td><td>"+c.get(i).color+"</td><td>"+c.get(i).inTime+"</td><td>"+c.get(i).slot+"</td><td>"+c.get(i).outTime+"</td><td>"+c.get(i).Status+"</td></tr>");
			
			
		}
		pw.write("</table><br><br><button> <a href='index.html'  role='button' style='text-align:center' >Submit</a></button>");
	
		c.removeAll(c);
	}

}
