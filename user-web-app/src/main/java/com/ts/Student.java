package com.ts;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Student extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
        {
			String sampleData = "We are in STD file";
			req.setAttribute("d1", sampleData);
			req.getRequestDispatcher("sample.jsp").forward(req, resp);
			
    		//System.out.println(name);
        }


}
