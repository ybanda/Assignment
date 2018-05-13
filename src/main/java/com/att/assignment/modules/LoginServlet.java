package com.att.assignment.modules;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.att.assignment.constants.ProjectConstants;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Map<String,String> credentials=null;
	private static Logger logger = Logger.getLogger(LoginServlet.class);
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		credentials = new HashMap<String,String>();
		Properties prop = new Properties();
		try {
			prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("credentials.properties"));
			credentials.put(prop.get(ProjectConstants.USER_NAME_ONE).toString(),prop.get(ProjectConstants.USER_PASSWORD_ONE).toString());
			credentials.put(prop.get(ProjectConstants.USER_NAME_TWO).toString(),prop.get(ProjectConstants.USER_PASSWORD_TWO).toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String userName=request.getParameter("userId");
		String password = request.getParameter("password");
		logger.info("Inside of GEt Method -- User Id "+userName +" Password="+password);
		if(credentials.containsKey(userName) && password.equalsIgnoreCase(credentials.get(userName))) {
			response.sendRedirect("home.jsp");
		}else {
			response.sendRedirect("error.html");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
