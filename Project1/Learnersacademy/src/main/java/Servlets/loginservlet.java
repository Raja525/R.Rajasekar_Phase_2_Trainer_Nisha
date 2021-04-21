package Servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginservlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String userid=req.getParameter("userid");
		String password=req.getParameter("password");
		
		if(userid.equals("Admin"))
		{
			if(password.equals("123"))
			{
				res.sendRedirect("HomePage.jsp");
			}
			else
			{
				res.sendRedirect("AdminLogin.jsp");
			}
		}
		else
		{
			res.sendRedirect("AdminLogin.jsp");
		}
	}

}
