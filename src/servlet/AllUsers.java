package servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.UserManager;


import model.User;
import service.FieldValidation;

/**
 * Servlet implementation class AddUser
 */
@WebServlet("/AllUsers")
public class AllUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public static final String ATT_USERS = "users";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AllUsers() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	    public void init() throws ServletException {
	    	super.init();
	        this.getServletContext().setAttribute( ATT_USERS, UserManager.getUserManager().getAllUser() );
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/register/Register.jsp");
		dispatch.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		User newUser = null;
		

		String firstName = "mic";
		String lastName = "bob";
		String address_ville = "str";
		String address_rue = "neuo";
		String address_nbrue= "5";
		String email = "m@j.f";
		String pwd = "111";
	
		
		HttpSession session = request.getSession();
		newUser = new User(firstName, lastName, address_ville, address_rue, address_nbrue, email, pwd);

			UserManager.getUserManager().addUser(newUser);
			

			this.getServletContext().setAttribute( ATT_USERS, UserManager.getUserManager().getAllUser() );

			request.setAttribute("newUser", newUser);
		
		
			
			session.setAttribute(ATT_USERS, UserManager.getUserManager().getAllUser());
			this.getServletContext().setAttribute(ATT_USERS, UserManager.getUserManager().getAllUser());

		
		
		
		

        	this.getServletContext().getRequestDispatcher("/index.jsp").include( request, response );
  
	}
}
