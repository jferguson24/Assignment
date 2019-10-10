package com.ss.asn1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.*;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/lolpage")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init() 
    {

    	System.out.println("       Initiating        ");

    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		Gson gson =  new Gson();
		Login info = gson.fromJson(request.getReader(), Login.class);
		
		List<Login> login =  new ArrayList<Login>();
		login.add(new Login("Jeff", "password"));
		login.add(new Login("Batman", "robin"));

		//log(info.getUser()+info.getPassword());
		
		login = login.stream().filter(logins -> logins.equals(info)).collect(Collectors.toList());
		
		if(login.size() == 1){
			response.sendRedirect("success.jsp");
		}
		else if(login.size() == 0){
			response.sendRedirect("fail.jsp");
		}
		else{
			response.sendError(HttpServletResponse.SC_BAD_REQUEST);
		}
		
	}

}
