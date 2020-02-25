package com.servlet.file;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExitCarServlet
 */
@WebServlet("/ExitCarServlet")
public class ExitCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExitCarServlet() {
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
		
		PrintWriter pw=response.getWriter();
		String s=request.getParameter("slot");
		String s1=request.getParameter("number");
		pw.write( "<h1 style='text-align:center'>Parking System</h1><div  align='center' ><h3>Entery Car Details</h3> <div><label for='number'>Registration Numbers:-</label>&nbsp;"
				+ "<input type='text' id='number'value='"+s1+"' disabled></div>"
						+ " <br><div> <label>Car Colour:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
						+ "<input type='text' id='number'value='"+4+"' disabled></div><br><div> <label>Parking Slot:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<input type='text' id='number'value='"+s+"' disabled></div><br><br><button> <a href='index.html'  role='button' style='text-align:center' >Submit</a></button>");
			}

}
