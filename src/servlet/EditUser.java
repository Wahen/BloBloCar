package servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;

/**
 * Servlet implementation class EditUser
 */
@WebServlet("/EditUser")
public class EditUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		HashMap<Long, User> users = (HashMap<Long, User>)session.getAttribute("users");	
		long id = Long.parseLong((String) request.getParameter("user"));	
		User user = users.get(id);
		session.setAttribute("user", user);
		
		RequestDispatcher dispatch = request.getRequestDispatcher("/EditUser.jsp");
		dispatch.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = (User) request.getSession().getAttribute("user");
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String pwd = request.getParameter("pwd");
		String address =request.getParameter("address");
		String email = request.getParameter("email");
		
		user.setFirstName(firstname);
		user.setLastName(lastname);
		user.setMail(email);
		user.setPwd(pwd);
		user.setAddress(address);

	}

}
