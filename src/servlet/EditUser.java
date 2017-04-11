package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import servlet.Register;

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
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		//HashMap<Long, User> users
	//	ArrayList<User> user_list = /*(HashMap<Long, User>)*/(ArrayList<User>)session.getAttribute("users");
        Map<String, User> users = (HashMap<String, User>) session.getAttribute( Register.ATT_USERS );
		
		long id = Long.parseLong((String) request.getParameter("user"));	
		User user = users.get(id);
		session.setAttribute("user", user);
		
		/*boucle
		for(User u : user_list) {
			users.put(u.getId(), u);
		}
		String str_id = request.getParameter("user");
		String str_id2 = request.getParameter("id");
		String lastname = request.getParameter("lastname");
		long id2 = Long.parseLong(str_id2);
		long id = Long.parseLong(str_id);
		System.out.println("Yolooo: id1=" + id + ", id2=" + id2);
		User user = users.get(id);
		session.setAttribute("user", user);
		
	*/	
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
