package com.servlet.file;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.data.file.Data;

import com.object.file.DataOpration;
import com.object.file.MainObject;
import com.user.classs.CarDetails;

/**
 * Servlet implementation class History
 */
@WebServlet("/History")
public class History extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public History() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		DataOpration o=MainObject.getObject("Data");
		Data cd=o.getData("cardata");	
		ArrayList<CarDetails> c=cd.getCarDetails();

		PrintWriter pw = response.getWriter();
		PrintWriter pw1 = response.getWriter();
	
	
		pw.write("<h1 style='text-align:center'>Parking System</h1><div  align='center' ><h3>Car Details History</h3><table border='2'><tr><th>Registration No</th><th>Color</th><th>Slot</th><th>Status</th><tr>");
		boolean flag=false;
		for(int i=0;i<c.size();i++)
		{
			if(c.get(i).Status.equalsIgnoreCase("OUT"))
			{
				flag=true;
				pw1.write("<tr><td>"+c.get(i).regNumber+"</td><td>"+c.get(i).color+"</td><td>"+c.get(i).slot+"</td><td>"+c.get(i).Status+"</td></tr>");
			
			}
		}
			pw.write("</table><br><br><button> <a href='index.html'  role='button' style='text-align:center' >Submit</a></button>");
		if(flag==false)
		{
			pw.write("<h4 style='text-align:center'>NO RECORD FOUND</h4>");
		}
		c.removeAll(c);
	}

}
