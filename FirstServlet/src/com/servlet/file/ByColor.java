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
 * Servlet implementation class ByColor
 */
@WebServlet("/ByColor")
public class ByColor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ByColor() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		ArrayList<CarDetails> al=GetData.getCarDetails();
		PrintWriter pw = response.getWriter();
		PrintWriter pw1 = response.getWriter();
		String s=request.getParameter("color1");
	
		pw.write("<h1 style='text-align:center'>Parking System</h1><div  align='center' ><h3>Car Details For Slot Number "+s+""
				+ " </h3><table border='2'><tr><th>Registration No</th><th>Color</th><th>Slot</th><tr>");
		boolean flag=false;
		for(CarDetails c:al)
		{
			if(c.color.equalsIgnoreCase(s)){
		flag=true;
		pw1.write("<tr><td>"+c.regNumber+"</td><td>"+c.color+"</td><td>"+c.slot+"</td></tr>");
			}
			
			}
		pw.write("</table>");
		if(flag==false){
			pw.write("<h4 style='text-align:center'>NO RECORD FOUND</h4>");
		}
	}

}
