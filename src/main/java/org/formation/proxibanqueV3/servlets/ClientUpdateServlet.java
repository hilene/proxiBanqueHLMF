package org.formation.proxibanqueV3.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.formation.proxibanqueV3.entity.Adresse;
import org.formation.proxibanqueV3.entity.Client;
import org.formation.proxibanqueV3.entity.ClientParticulier;
import org.formation.proxibanqueV3.entity.CompteBancaire;
import org.formation.proxibanqueV3.entity.CompteCourant;
import org.formation.proxibanqueV3.entity.CompteEpargne;
import org.formation.proxibanqueV3.service.ClientService;
import org.formation.proxibanqueV3.service.CompteService;

/**
 * @author HLMF
 * Servlet implementation class ClientUpdate
 * Servlet permettant de rediriger vers la page Mise a Jour compte client
 * a partir de la page conseiller
 *  
 */
@WebServlet("/ClientUpdateServlet")
public class ClientUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       HttpSession session;
       ClientService clientService = new ClientService();
       CompteService cpteService = new CompteService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * doGet recoie l'info idclient de la page conseiller et fait appel au clientservice de trouver
	 * toutes les donnees du client par son id
	 * les donnes du client seront affichees sur la page clientupdate.jsp
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		session = request.getSession();

		long idClient = Long.parseLong(request.getParameter("idclient"));
		Client monClient = clientService.getClient(idClient);
		
		session.setAttribute("client", monClient);
				
		request.getRequestDispatcher("/WEB-INF/pagesInternes/clientupdate.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * doPost recoit les infos de mise a jour de la page clientupdate.jsp et fait appel a clientservice
	 * pour la mise a jour dans la base de donnees
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClientService clientService = new ClientService();
		ClientParticulier clientPart = new ClientParticulier();
	
		HttpSession session = request.getSession();
		
	try {
		
	
	String nom = request.getParameter("nom");
    String prenom = request.getParameter("prenom");
    String adresse = request.getParameter("adresse");
    long codepostal = Long.parseLong(request.getParameter("codepostal"));
    String ville = request.getParameter("ville");
    String telephone = request.getParameter("telephone");
    
    double soldeCpteCourant = Double.parseDouble(request.getParameter("soldecptecourant"));
    String dateStr = request.getParameter("date");
    
    String email = request.getParameter("email");
    double soldeCpteEpargne = Double.parseDouble(request.getParameter("soldecpteepargne"));
    
    Adresse adresseClient = new Adresse(adresse, codepostal, ville);
    CompteCourant cpteCourantClient = new CompteCourant(soldeCpteCourant, dateStr);
    CompteEpargne cpteEpargneClient = new CompteEpargne(soldeCpteEpargne, dateStr);
    clientPart.setNom(nom);
    clientPart.setPrenom(prenom);
    clientPart.setAdresse(adresseClient);
    clientPart.setEmail(email);
    clientPart.setNumTel(telephone);
    clientPart.setCpteC(cpteCourantClient);
    clientPart.setCpteEp(cpteEpargneClient);
    clientService.replaceClient(clientPart);
    
    String message = "<h2>Le client a été mise a jour dans la base de données</h2>";
	session.setAttribute("MsgJSPUpdate", message);
    request.getRequestDispatcher("/WEB-INF/pagesInternes/clientupdate.jsp").forward(request, response);
	} catch (Exception e) {
		// TODO: handle exception
		String messageEchec = "<h2><strong>Erreur d'insertion dans la base de données.</strong></h2>";
		session.setAttribute("MsgJSPUpdate", messageEchec);
		request.getRequestDispatcher("/WEB-INF/pagesInternes/clientupdate.jsp").forward(request, response);
		e.printStackTrace();
	}
    
	}
	

}
