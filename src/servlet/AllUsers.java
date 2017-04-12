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
		this.getServletContext().setAttribute(ATT_USERS, UserManager.getUserManager().getAllUser());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatch = request.getRequestDispatcher("Users.jsp");
		dispatch.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		User user1 = new User("mickael", "bob", "Strasbourg", "rue de rome", "5", "mickael@bob.fr", "1234", 1);
		User user2 = new User("Boby", "bobo", "Illkirch", "rue du tramway", "4", "boby@bobo.fr", "789", 2);
		User user3 = new User("Francois", "bob", "Lingolsheim", "rue de normandie", "15", "franc@bob.fr", "456", 1);
		User user4 = new User("Dimitri", "boby", "Schiltigheim", "route de bischwiller", "43", "boby@bobo.fr", "159", 2);
		
		UserManager.getUserManager().addUser(user1);
		UserManager.getUserManager().addUser(user2);
		UserManager.getUserManager().addUser(user3);
		UserManager.getUserManager().addUser(user4);

		this.getServletContext().setAttribute(ATT_USERS, UserManager.getUserManager().getAllUser());
		request.setAttribute("user1", user1);
		this.getServletContext().setAttribute(ATT_USERS, UserManager.getUserManager().getAllUser());
		request.setAttribute("user2", user2);
		this.getServletContext().setAttribute(ATT_USERS, UserManager.getUserManager().getAllUser());
		request.setAttribute("user3", user3);
		this.getServletContext().setAttribute(ATT_USERS, UserManager.getUserManager().getAllUser());
		request.setAttribute("user4", user4);

		session.setAttribute(ATT_USERS, UserManager.getUserManager().getAllUser());
		this.getServletContext().setAttribute(ATT_USERS, UserManager.getUserManager().getAllUser());

		this.getServletContext().getRequestDispatcher("/index.jsp").include(request, response);

	}
}
