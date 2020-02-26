package com.servlet.file;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.data.file.Data;

import com.object.file.DataOpration;
import com.object.file.MainObject;

import com.operation.Opration;
import com.user.classs.CarDetails;

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
		DataOpration od=MainObject.getObject("opration");
		Opration op=od.getOpration("removedata");
		DataOpration o=MainObject.getObject("Data");
		Data cd=o.getData("slotdata");
		PrintWriter pw=response.getWriter();
		String s=request.getParameter("slot");
		int temp=Integer.parseInt(s);
		TreeMap<Integer,String> tm=cd.getSlotDetails();
		Set se=tm.entrySet();
		Iterator it=se.iterator();
		boolean	flag=false;
		while(it.hasNext())
		{
				String st="Yes";
				Map.Entry me=(Map.Entry)it.next();
				if(temp==(int)me.getKey() && me.getValue().equals(st))
				{
					flag=true;
				}
		}
	
		if(flag==false)
		{
			response.setContentType("text/html");
			PrintWriter pw1=response.getWriter();
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Invalid Slot');");
			pw.println("</script>");
			RequestDispatcher rd=request.getRequestDispatcher("ExitCar.html");
			rd.include(request, response); 
		}
		else
		{
			op.Remove(temp);
			pw.write( "<h1 style='text-align:center'>Parking System</h1><div  align='center' ><h3>Entery Car Details</h3> <div>"
				+ " <label>Parking Slot Is Empty:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "<input type='text' id='number'value='"+s+"' disabled></div><br><br><button> <a href='index.html'  role='button' style='text-align:center' >Submit</a></button>");
		}
		}

}
