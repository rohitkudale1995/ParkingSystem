package com.servlet.file;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.file.ConnectionClass;
import com.data.file.GetData;
import com.operation.classs.Operation;

@WebServlet("/EnterCarServlet")
public class EnterCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EnterCarServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		String s = request.getParameter("color1");
		String s1 = request.getParameter("number");
		Operation o=new Operation();
		int slott=o.Number();
		pw.write(
				"<h1 style='text-align:center'>Parking System</h1><div  align='center' >"
				+ "<h3>Entery Car Details</h3> <div><label for='number'>Registration Numbers:-</label>&nbsp;"
						+ "<input type='text' id='number'value='" + s1 + "' disabled></div>"
						+ " <br><div> <label>Car Colour:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
						+ "<input type='text' id='number'value='" + s
						+ "' disabled></div><br><div> <label>Parking Slot:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
						+ "<input type='text' id='number'value='"+slott+"' disabled></div><br><br><button> <a href='index.html'  role='button' style='text-align:center' >Submit</a></button>");

	}

}
