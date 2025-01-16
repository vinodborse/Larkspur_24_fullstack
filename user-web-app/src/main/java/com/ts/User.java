package com.ts;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class User extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
        {

			String name1 = req.getParameter("q");
			String result = "";
			
			//----------
				// "SELECT * FROM student WHERE name = "+ name1;
			//----------
			
			if(name1.equals("cricket")) {
				result = "Get live cricket scores, cricket updates of upcoming International, domestic and T20 matches";
			} else if (name1.equals("football")) {
				result = "Football is a family of team sports that involve, to varying degrees, kicking a ball to score a goal.";
			} else {
				result = "Sorry";
			}
			
			
			req.setAttribute("d1", result);
			req.getRequestDispatcher("sample.jsp").forward(req, resp);
			
    		//System.out.println(name);
        }


}

/*
//http methods
	GET --> doGet
	POST--> doPost
	PUT	--> doPut
	DELETE --> doDelete
*/