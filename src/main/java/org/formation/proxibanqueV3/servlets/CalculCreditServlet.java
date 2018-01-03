package org.formation.proxibanqueV3.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.formation.proxibanqueV3.service.CalculCreditService;



/**
 * @author HLMF
 * Servlet implementation class CalculCreditServlet
 * le servlet permet le calcul du credit et redirige vers la page d'affichage
 */
@WebServlet("/CalculCreditServlet")
public class CalculCreditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * Instantiates a new calcul credit servlet.
     *
     * @see HttpServlet#HttpServlet()
     */
    public CalculCreditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * de la page credits.html, le servlet prendra les donnees du montant de l'emprunt,
	 * le nbre de mensualites et le taux de credit. le servlet renvoie le resultat sur la page
	 * resultatCalculCredit.jsp en prenant soin d'afficher les donnees entrees par l'utilisateur
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		int montantEmprunt = Integer.parseInt(request.getParameter("mntEmprunt") );
		
		int nombreMensualite = Integer.parseInt(request.getParameter("mensualites"));
		
		float tauxCredit = Float.parseFloat(request.getParameter("txCredit").replace(",",".") );
		
				

		CalculCreditService calcul = new CalculCreditService();
		calcul.setDureeMois(nombreMensualite);
		calcul.setMontantEmprunt(montantEmprunt);
		calcul.setTxCredit(tauxCredit);
		
		calcul.calculCredit();
		
		calcul.getMensualites();
			
		
		session.setAttribute("sommeEmprunt", montantEmprunt);
		session.setAttribute("NbMensualites", nombreMensualite);
		session.setAttribute("taux", tauxCredit);
		session.setAttribute("resultat", calcul);
		
		request.getRequestDispatcher("/WEB-INF/pagesInternes/resultatCalculCredit.jsp").forward(request, response);
		
	}

}
