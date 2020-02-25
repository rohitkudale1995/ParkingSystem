package com.servlet.file;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.data.file.GetData;
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
    public AllData() {
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
		ArrayList<CarDetails> c=GetData.getCarDetails();
		PrintWriter pw = response.getWriter();
		PrintWriter pw1 = response.getWriter();
	
	
		pw.write("<h1 style='text-align:center'>Parking System</h1><div  align='center' ><h3>Car Details "+ " </h3><table border='2'><tr><th>Registration No</th><th>Color</th><th>Slot</th><tr>");
		
		for(int i=0;i<c.size();i++)
		{
		
		pw1.write("<tr><td>"+c.get(i).regNumber+"</td><td>"+c.get(i).color+"</td><td>"+c.get(i).slot+"</td></tr>");
			
			
			}
		pw.write("</table>");
	
	}

}
