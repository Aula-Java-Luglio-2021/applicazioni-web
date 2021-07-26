package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Account;
import utility.CRUD;

/**
 * Servlet implementation class Registrazione
 */
@WebServlet("/AvvioServlet")
public class AvvioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AvvioServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(Boolean.parseBoolean(request.getParameter("deleteOn"))==true) {
			CRUD.getinstance().rimozione(Integer.parseInt(request.getParameter("id")));
			response.sendRedirect("benvenuto.jsp");
		}else {
			request.setAttribute("listaAccount", CRUD.getinstance().getQueryAccount());
			request.getRequestDispatcher("visualizzaAccount.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//		CRUD.getinstance().inserimento(request.getParameter("username"),
		//				                       request.getParameter("password"),
		//				                       request.getParameter("email"));
		CRUD.getinstance().inserimento(new Account(request.getParameter("username"),
				request.getParameter("password"),
				request.getParameter("email")));
		response.sendRedirect("registrazioneAccount.jsp");
	}

}
