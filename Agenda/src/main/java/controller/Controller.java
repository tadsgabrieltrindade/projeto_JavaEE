package controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.DAO;

@WebServlet(urlPatterns = { "/Controller", "/main" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	DAO dao = new DAO();

	public Controller() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Pega o path da requisição
		String action = request.getServletPath();
		if (action.equals("/main"))
			contatos(request, response);
	}

	protected void contatos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// redirecionar a requisição para o documento agenda.jsp

		response.sendRedirect("agenda.jsp");

		/*
		 * Pode ser dessa forma tbm RequestDispatcher rd =
		 * request.getRequestDispatcher("/agenda.jsp"); rd.forward(request, response);
		 */

	}

}
