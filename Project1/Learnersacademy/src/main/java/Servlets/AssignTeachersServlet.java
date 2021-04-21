package Servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AssignTeachersServlet extends HttpServlet{

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		//System.out.print("Success");
		try {
			HttpSession session2=req.getSession();
			String id=(String) session2.getAttribute("Id");
			String teachername=req.getParameter("newteachername");
			System.out.println(id+" "+teachername);
			
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://aa1y1ghile0p7t1.cv2uqxokjyuy.us-east-1.rds.amazonaws.com:3306/learnersacademy","root","rootraja");
		PreparedStatement ps=con.prepareStatement("update Teachertable set Teachername='"+teachername+"' where Id='"+id+"'");
		ps.executeUpdate();
		res.sendRedirect("AssignTeachers.jsp");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
