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
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public static final String FIELD_EMAIL = "email";
	public static final String FIELD_PWD = "pwd1";
	public static final String FIELD_FIRSTNAME = "firstName";
	public static final String FIELD_LASTNAME = "lastName";
	public static final String FIELD_ADDRESS_VILLE = "address_ville";
	public static final String FIELD_ADDRESS_RUE = "address_rue";
	public static final String FIELD_ADDRESS_NBRUE = "address_nbrue";
	
	public static final String FIELD_PWDCONFIRM = "pwdConfirm";
	
	public static final String ATT_USERS = "users";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Register() {
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

		String email = request.getParameter(FIELD_EMAIL);
		String pwd = request.getParameter(FIELD_PWD);
		String firstName = request.getParameter(FIELD_FIRSTNAME);
		String lastName = request.getParameter(FIELD_LASTNAME);
		String address_ville = request.getParameter(FIELD_ADDRESS_VILLE);
		String address_rue =request.getParameter(FIELD_ADDRESS_RUE);
		String address_nbrue= request.getParameter(FIELD_ADDRESS_NBRUE);
		
		String pwdConfirm = request.getParameter(FIELD_PWDCONFIRM);

		Map<String, String> erreurs = new HashMap<String, String>();
		Map<String, String> form = new HashMap<String, String>();

		String actionMessage=null;
		String msgVal = null;

		msgVal = FieldValidation.validatePwd(pwd, pwdConfirm);
		if (msgVal == null) {
			form.put(FIELD_PWD, pwd);
		} else {erreurs.put(FIELD_PWDCONFIRM, msgVal);}
		
		msgVal = FieldValidation.validateFirstName(firstName);
		if (msgVal == null) {
			form.put(FIELD_FIRSTNAME, firstName);
		} else {erreurs.put(FIELD_FIRSTNAME, msgVal);}
		
		msgVal = FieldValidation.validateLastName(lastName);
		if (msgVal == null) {
			form.put(FIELD_LASTNAME, lastName);
		} else {erreurs.put(FIELD_LASTNAME, msgVal);}
		
		msgVal = FieldValidation.validateEmail(email);
		if (msgVal == null) {
			form.put(FIELD_EMAIL, email);
		} else {erreurs.put(FIELD_EMAIL, msgVal);}
		
		User newUser = null;
		boolean statusOk=false;
		if(erreurs.isEmpty()==true) {
			HttpSession session = request.getSession();
			newUser = new User(firstName, lastName, address_ville, address_rue, address_nbrue, email, pwd);
			
			UserManager.getUserManager().addUser(newUser);
			
			session.setAttribute( ATT_USERS, UserManager.getUserManager().getAllUser() );
			this.getServletContext().setAttribute( ATT_USERS, UserManager.getUserManager().getAllUser() );
			
			actionMessage="Succès de l'inscription";
			form = new HashMap<String, String>();
			statusOk = true;
		}
		else {
			actionMessage = "Echec de l'inscription";
		}
			
		request.setAttribute("newUser", newUser);
        request.setAttribute("form", form);
        request.setAttribute("erreurs", erreurs);
        request.setAttribute("statusOk", statusOk);
        request.setAttribute("actionMessage", actionMessage);
        
        if(statusOk == true ) {
        	this.getServletContext().getRequestDispatcher("/index.jsp").include( request, response );
        }
        else { this.getServletContext().getRequestDispatcher("/WEB-INF/register/Register.jsp").include( request, response );}

	}

	// else {

	// response.sendRedirect("Register");

}
