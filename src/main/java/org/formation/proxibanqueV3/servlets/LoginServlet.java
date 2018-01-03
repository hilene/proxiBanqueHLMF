package org.formation.proxibanqueV3.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.formation.proxibanqueV3.entity.Client;
import org.formation.proxibanqueV3.service.ClientService;

/**@author HLMF
 * Servlet implementation class LoginServlet Servlet permettant de se connecter,
 * il fait le tri en dirigeant vers la page directeur, client ou conseiller et affiche la
 * liste des clients du conseiller
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *      doPost recueille les donnees recueillies du formulaire
	 *      fait le trie des utilisateurs
	 *      et charge la bonne page 
	 *      
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		String role = request.getParameter("role");

		ClientService cs = new ClientService();
		List<Client> list = cs.showAllClients();

		if ("testcons".equals(user) && "testcons".equals(pass) && "Conseiller".equals(role)) {

			// afficher tous les clients
			session.setAttribute("ALLCLIENT", list);
			request.getRequestDispatcher("/WEB-INF/pagesInternes/conseiller.jsp").forward(request, response);
			
		} else if ("testcli".equals(user) && "testcli".equals(pass) && "Client".equals(role)) {
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/pagesInternes/client.jsp");
			requestDispatcher.forward(request, response);
			
		} else if ("testdir".equals(user) && "testdir".equals(pass) && "Directeur".equals(role)) {

			request.getRequestDispatcher("/WEB-INF/pagesInternes/gerant.jsp").forward(request, response);
			
		} else {
			
			System.out.println("Mot de Passe ou nom d'utlisateur incorrect.");
			request.getRequestDispatcher("/WEB-INF/pagesInternes/incorrectConnexion.jsp").forward(request, response);
		}

	}

}
