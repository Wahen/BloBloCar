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

import model.ListeUtilisateur;
import model.User;
import service.FieldValidation;

/**
 * Servlet implementation class AddUser
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public static final String FIELD_EMAIL = "email";
	public static final String FIELD_PWD = "pwd";
	public static final String FIELD_FIRSTNAME = "firstName";
	public static final String FIELD_LASTNAME = "lastName";
	public static final String FIELD_ADDRESS = "address";
	public static final String FIELD_PWDCONFIRM = "pwdConfirm";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/Register.jsp");
		dispatch.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		ListeUtilisateur users = (ListeUtilisateur) session.getAttribute("users");

		String email = request.getParameter(FIELD_EMAIL);
		String pwd = request.getParameter(FIELD_PWD);
		String firstName = request.getParameter(FIELD_FIRSTNAME);
		String lastName = request.getParameter(FIELD_LASTNAME);
		String address = request.getParameter(FIELD_ADDRESS);
		String pwdConfirm = request.getParameter(FIELD_PWDCONFIRM);

		// Map<String, String> erreurs = new HashMap<String, String>();
		// Map<String, String> form = new HashMap<String, String>();

		String msgVal4 = null;
		String msgVal3 = null;
		String msgVal2 = null;
		String msgVal = null;

		msgVal  = FieldValidation.validatePwd(pwd, pwdConfirm);
		msgVal2 = FieldValidation.validateFirstName(firstName);
		msgVal3 = FieldValidation.validateLastName(lastName);
		msgVal4 = FieldValidation.validateEmail(email);

		if ((msgVal == null) && (msgVal2 == null) && (msgVal3 == null) && (msgVal4 == null)){

			User user = new User(firstName,lastName,address,email,pwd);


			response.sendRedirect("CompleteProfil");
		}

		else {

			response.sendRedirect("Register");
			
		}

	}

}
