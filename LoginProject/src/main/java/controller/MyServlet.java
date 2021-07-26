package controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<String> v=new ArrayList<>(Arrays.asList("mirkozzo90,mirkozzo@gmail.com","carmine95,carmine@gmail.com","kenny75,kenny@libero.it",
				"leo94,leo@hotmail.it","eu_g95,eugenius@live.it","marchetiello97,cammarota@7spritz.5euro"));
		if(v.contains(request.getParameter("username")+","+request.getParameter("email"))){
			response.sendRedirect("benvenuto.jsp");
		}else {
			response.sendRedirect("errore.jsp");
		}
	}

}
