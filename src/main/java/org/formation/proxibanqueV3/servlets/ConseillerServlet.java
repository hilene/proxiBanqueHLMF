package org.formation.proxibanqueV3.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.formation.proxibanqueV3.entity.Client;
import org.formation.proxibanqueV3.service.ClientService;

/**@author HLMF
 * Servlet implementation class ConseillerServlet
 * Servlet permettant de rediriger vers la page pricipale du conseiller
 */
@WebServlet("/ConseillerServlet")
public class ConseillerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConseillerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/WEB-INF/pagesInternes/conseiller.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * sur la page principale du conseiller, on met a jour la liste des clients en appelant
	 * ClientService
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		ClientService cs = new ClientService();
		List<Client> list = cs.showAllClients();
		
		session.setAttribute("ALLCLIENT", list);
		request.getRequestDispatcher("/WEB-INF/pagesInternes/conseiller.jsp").forward(request, response);
	}

}
