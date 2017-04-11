package servlet;


import java.util.HashMap;
import java.util.Map;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ConnectValidation;
import service.FieldValidation;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	// View
    public static String VIEW_PAGES_URL="/WEB-INF/login.jsp";
	
	public static final String FIELD_EMAIL = "mail";
    public static final String FIELD_PWD = "pwd";
	
 // Request attributs
    Map<String, String> error;// = new HashMap<String, String>();
    Map<String, String> form;// = new HashMap<String, String>();
    String statusMessage="";
    boolean statusOk=false;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Prepare model to view
        request.setAttribute("statusOK", false);
        request.setAttribute("statusMessage", "");
        
        // Build view
		this.getServletContext().getRequestDispatcher(VIEW_PAGES_URL).include( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      // Get form fields
        String email = request.getParameter(FIELD_EMAIL);
        String pwd = request.getParameter(FIELD_PWD);
		
        // Prepare data for view (attributs)
        error = new HashMap<String, String>();
        form = new HashMap<String, String>();
        statusMessage=null;
        String login = null;
        // Validate page
        String msgVal = FieldValidation.validateEmail(email);
        if(msgVal==null) {
        	form.put(FIELD_EMAIL, email);
        }
        else {error.put(FIELD_EMAIL, msgVal);}	
        
        msgVal = ConnectValidation.pwdValidation(pwd);
        if(msgVal==null) {
        	form.put(FIELD_PWD, pwd);
        }
        else {error.put(FIELD_PWD, pwd);}
        
        String msgAuthentif = ConnectValidation.authenticate(email,pwd);
        if(error.isEmpty()==true && msgAuthentif == null){
        	statusOk=true;
        	statusMessage="Connecté"+msgAuthentif;
        	login = email;
        }
        else{
        	statusOk=false;
        	statusMessage="Connexion refusée"+msgAuthentif;
        }
     // Prepare model to view
        request.setAttribute("form", form);
        request.setAttribute("error", error);
        request.setAttribute("statusOK", statusOk);
        request.setAttribute("statusMessage", statusMessage);
        request.setAttribute("login", login);
        
        // Build view
        if(statusOk == true) {
        	this.getServletContext().getRequestDispatcher("/index.jsp").include( request, response );
        }
        else {this.getServletContext().getRequestDispatcher(VIEW_PAGES_URL).include( request, response ); }
	}

}
