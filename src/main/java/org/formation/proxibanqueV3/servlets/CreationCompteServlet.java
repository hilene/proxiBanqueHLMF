package org.formation.proxibanqueV3.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.formation.proxibanqueV3.entity.Adresse;
import org.formation.proxibanqueV3.entity.ClientParticulier;
import org.formation.proxibanqueV3.entity.CompteCourant;
import org.formation.proxibanqueV3.entity.CompteEpargne;
import org.formation.proxibanqueV3.service.ClientService;



/**@author HLMF
 * Servlet implementation class CreationCompteServlet
 * Servlet permettant de crï¿½er un nouveau compte en appelant la classe ServiceGestionClient au sein de /WEB-INF/pagesInternes
 */
@WebServlet("/CreationCompteServlet")
public class CreationCompteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreationCompteServlet() {
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
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * doPost recoit toutes les infos de la page nouveaucompteclient.jsp
	 * un nouvel objet client est cree a partir de ces donnees
	 * ClientService permet de le sauvegarder en base de donnees
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		ClientService clientService = new ClientService();
		ClientParticulier clientPart = new ClientParticulier();
	
		HttpSession session = request.getSession();
		
	try {
		
	
	String nom = request.getParameter("nom");
    String prenom = request.getParameter("prenom");
    String adresse = request.getParameter("adresse");
    int codepostal = Integer.parseInt(request.getParameter("codepostal"));
    String ville = request.getParameter("ville");
    String telephone = request.getParameter("telephone");
    long comptecourant = Long.parseLong(request.getParameter("comptecourant"));
    double soldeCpteCourant = Double.parseDouble(request.getParameter("soldecptecourant"));
    String dateStr = request.getParameter("date");
    long compteepargne = Long.parseLong(request.getParameter("compteepargne"));
    String email = request.getParameter("email");
    double soldeCpteEpargne = Double.parseDouble(request.getParameter("soldecpteepargne"));
    
    Adresse adresseClient = new Adresse(adresse, codepostal, ville);
    CompteCourant cpteCourantClient = new CompteCourant(comptecourant, soldeCpteCourant, dateStr);
    CompteEpargne cpteEpargneClient = new CompteEpargne(compteepargne, soldeCpteEpargne, dateStr);
    clientPart.setNom(nom);
    clientPart.setPrenom(prenom);
    clientPart.setAdresse(adresseClient);
    clientPart.setEmail(email);
    clientPart.setNumTel(telephone);
    clientPart.setCpteC(cpteCourantClient);
    clientPart.setCpteEp(cpteEpargneClient);
    clientService.addClient(clientPart);
    
    String message = "<h2>Le client a été ajouté à la base de données</h2>";
	session.setAttribute("MsgJSP", message);
    request.getRequestDispatcher("/WEB-INF/pagesInternes/nouveaucompteclient.jsp").forward(request, response);
	} catch (Exception e) {
		// TODO: handle exception
		String messageEchec = "<h2><strong>Erreur d'insertion dans la base de données.</strong></h2>";
		session.setAttribute("MsgJSP", messageEchec);
		request.getRequestDispatcher("/WEB-INF/pagesInternes/nouveaucompteclient.jsp").forward(request, response);
		e.printStackTrace();
	}
    
	}
}