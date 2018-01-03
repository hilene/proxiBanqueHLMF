package org.formation.proxibanqueV3.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.formation.proxibanqueV3.bean.VirementEvent;
import org.formation.proxibanqueV3.entity.Client;
import org.formation.proxibanqueV3.service.ClientService;
import org.formation.proxibanqueV3.service.CompteService;
import org.formation.proxibanqueV3.service.VirementService;
import org.formation.proxibanqueV3.util.InvalidVirementException;

/**
 * Servlet implementation class VirementServlet
 * Servlet permettant de rediriger vers la page virement au sein de /WEB-INF/pagesInternes
 */
@WebServlet("/VirementServlet")
public class VirementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  HttpSession session;
      ClientService clientService = new ClientService();
      CompteService cpteService = new CompteService();
      ClientService cs = new ClientService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VirementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		session = request.getSession();

		long idClient = Long.parseLong(request.getParameter("idclient"));
		Client monClient = clientService.getClient(idClient);
		
		session.setAttribute("client", monClient);
		request.getRequestDispatcher("/WEB-INF/pagesInternes/virement.jsp").forward(request, response);
			
		
		List<Client> list = cs.showAllClients();
		
		session.setAttribute("ALLCLIENT", list);
		request.getRequestDispatcher("/WEB-INF/pagesInternes/virement.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
	
		String[] clientCreditData = request.getParameter("clientcrediteur").split("-");
		String partId = clientCreditData[0];
		String partCpteCourant = clientCreditData[1];
		
		if ("clientcrediteur".equals(partCpteCourant)) {
			
		}
		
		long cpteDebit = Long.parseLong(request.getParameter("comptedebiteur")) ;
		long cpteCredit = Long.parseLong(request.getParameter("comptecrediteur"));
		double montant = Double.parseDouble(request.getParameter("montant"));
		
		VirementEvent virement = new VirementEvent();
		VirementService virementService = new VirementService();
		
		try {		
		
		virement.setIdCompteCible(cpteCredit);
		virement.setIdCompteDepart(cpteDebit);
		virement.setMontant(montant);
		
		virementService.effectuerVirement(virement);
		
		String message = "<h2>Le virement a ete effectue avec succes!</h2>";
		session.setAttribute("MsgJSPVirement", message);
		request.getRequestDispatcher("/WEB-INF/pagesInternes/virement.jsp").forward(request, response);
		
		} catch (InvalidVirementException e) {
			
			System.out.println("Le montant est nul ou negatif " + "exception.get() " + e.getVirement());
			String messageEchec = "<h2>Echec du virement! Le montant est nul ou negatif!</h2>";
			session.setAttribute("MsgJSPVirement", messageEchec);
			request.getRequestDispatcher("/WEB-INF/pagesInternes/virement.jsp").forward(request, response);
			e.printStackTrace();
			
		
		}
			
		
	}

}
