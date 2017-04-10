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
@WebServlet("/CompleteProfil")
public class CompleteProfil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CompleteProfil() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/complete_profil/CompleteProfil.jsp");
		dispatch.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = (User) request.getSession().getAttribute("user");
		
		String gender = request.getParameter("gender");
		String smoker = request.getParameter("smoker");
		String phone = request.getParameter("phone");
		int nbPlace = Integer.parseInt(request.getParameter("nbPlace"));
		int mobilityDriver = Integer.parseInt(request.getParameter("mobilityDriver"));
		String acceptSmokerDriver = request.getParameter("acceptSmokerDriver");
		int mobilityPassenger = Integer.parseInt(request.getParameter("mobilityPassenger"));
		String acceptSmokerPassenger = request.getParameter("acceptSmokerPassenger");
		
		user.setGender(gender);
		user.setSmoker(smoker);
		user.setPhone(phone);
		user.setNbPlace(nbPlace);
		user.setMobilityDriver(mobilityDriver);
		user.setAcceptSmokerDriver(acceptSmokerDriver);
		user.setMobilityPassenger(mobilityPassenger);
		user.setAcceptSmokerPassenger(acceptSmokerPassenger);
		
		
		//response.sendRedirect("DetailUser?user=" + user.getId());
	}

}
