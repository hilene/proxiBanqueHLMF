package org.formation.proxibanqueV3.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.formation.proxibanqueV3.entity.Client;
import org.formation.proxibanqueV3.service.ClientService;

/**@author HLMF
 * Servlet implementation class ListerUnClientServlet
 * Servlet permettant de rediriger vers la page lister un client au sein de /WEB-INF/pagesInternes
 */
@WebServlet("/ListerUnClientServlet")
public class ListerUnClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ClientService clientServ;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListerUnClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		long idClient = Long.parseLong(request.getParameter("idclient"));
		if (idClient != 0) {
			try {
				Client client = clientServ.getClient(idClient);
				session.setAttribute("client", client);
				request.getRequestDispatcher("/WEB-INF/pagesInternes/listerUnClient.jsp").forward(request, response);
			} catch (Exception e) {
				String messageEchec = "<h2><strong>Erreur! Impossible de trouver ce client dans la base de données.</strong></h2>";
				session.setAttribute("MsgJSP", messageEchec);
				e.printStackTrace();
			}
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/WEB-INF/pagesInternes/listerUnClient.jsp").forward(request, response);
	}

}
