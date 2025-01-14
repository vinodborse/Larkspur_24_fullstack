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
    		System.out.println("Welcome User");
        }


}

/*
//http methods
	GET --> doGet
	POST--> doPost
	PUT	--> doPut
	DELETE --> doDelete
*/