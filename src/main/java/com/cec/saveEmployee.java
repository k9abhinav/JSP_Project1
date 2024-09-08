package com.cec;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.cec.models.Employee;
import com.cec.services.DBconnection;
import com.mysql.cj.protocol.Resultset;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class saveEmployee extends HttpServlet{
	
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException {
//		String firstName= req.getParameter("usn");
//		String lastName= req.getParameter("name");
//		String studentPassword = req.getParameter("password");
//		System.out.println("Name "+lastName+"USN "+firstName);
//		
//	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstName= req.getParameter("firstName");
		String lastName= req.getParameter("lastName");
		String phoneNo= req.getParameter("phoneNo");
		
		Employee e1 = new Employee(firstName,lastName,phoneNo);
//		System.out.println("Name "+lastName+"USN "+firstName);
		System.out.println("FIRST "+e1.getFirstName()+"LAST "+e1.getLastName()+"PHONE"+e1.getPhoneNo());
		
		Connection connection = DBconnection.myConnection();
		System.out.println("Connection Established");
//		String createQuerry = "create table student("
//				+ "STUDENT_USN INTEGER(4),"
//				+ "STUDENT_NAME VARCHAR(40),"
//				+ "STUDENT_PASSWORD VARCHAR(20)"
//				+ ");";
		String insertQuerry = "INSERT INTO employee values ('"+e1.getFirstName()+"','"+e1.getLastName()+"','"+e1.getPhoneNo()+"');";
		String employeeList = "SELECT * FROM employee";
		ResultSet resultset = null;
		ArrayList<Employee> listOfEmp = null;
		
		try {
//			Statement statement = connection.createStatement();
//			statement.execute(createQuerry);
			PreparedStatement state1 = connection.prepareStatement(insertQuerry);
			state1.executeUpdate();
			PreparedStatement getemployeeListStatement = connection.prepareStatement(employeeList);
			resultset = getemployeeListStatement.executeQuery();
			System.out.println("FULL LIST querry created");
			
			listOfEmp = new ArrayList<Employee>();
			
			while(resultset.next()) {
				e1 = new Employee(
						resultset.getNString("FirstName"),
						resultset.getNString("LastName"),
						resultset.getNString("PhoneNumber")
						);
				System.out.println("\nFetched "+e1);
				listOfEmp.add(e1);
				System.out.println("Added to arraylist");
			}
			
			System.out.println("Array List is "+listOfEmp);
			req.setAttribute("employeeList", listOfEmp);
			RequestDispatcher dispatcher
				= req.getRequestDispatcher("views/firstFile.jsp");
			dispatcher.forward(req, resp);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
