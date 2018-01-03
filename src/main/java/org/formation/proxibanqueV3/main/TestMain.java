package org.formation.proxibanqueV3.main;

import org.formation.proxibanqueV3.entity.Adresse;
import org.formation.proxibanqueV3.entity.CarteVisaPremier;
import org.formation.proxibanqueV3.entity.Client;
import org.formation.proxibanqueV3.entity.ClientEntreprise;
import org.formation.proxibanqueV3.entity.ClientParticulier;
import org.formation.proxibanqueV3.entity.CompteCourant;
import org.formation.proxibanqueV3.entity.CompteEpargne;
import org.formation.proxibanqueV3.service.ClientService;

// TODO: Auto-generated Javadoc
/**
 * @author HLMF
 * The Class TestMain.
 * classe de tests si les donnees sont bien transmises 
 * entre les couches services, dao et baqse de donnees
 */
public class TestMain {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
	
		Adresse addrCl1 = new Adresse("15 Rue de Lappe", 75011, "Paris");
		CompteCourant cpteCourantCl1 = new CompteCourant(4568533, 5000.00, "02.01.2018");
		CompteEpargne cpteEpargneCl1 = new CompteEpargne(4564219, 1000.00, "02.01.2018");
		CarteVisaPremier visaPremCl1= new CarteVisaPremier(2563325, "01/22");
		ClientParticulier cliPart = new ClientParticulier();
		cliPart.setAdresse(addrCl1);
		cliPart.setCpteC(cpteCourantCl1);
		cliPart.setCpteEp(cpteEpargneCl1);
		cliPart.setVisaP(visaPremCl1);
		cliPart.setNumTel("01042538696");
		cliPart.setEmail("alaindupont@gmail.com");
		
		cliPart.setNom("Dupont");
		cliPart.setPrenom("Alain");
		ClientService cs = new ClientService();
		//cs.addClient(cliPart);
		//cs.addClient(cl);
		//cs.replaceClient(client);
		//Client cli = cs.getClient(1); 
		//System.out.println( cs.getClient(1).toString());
		//cli.getCpteC().getNumCompte();
		//cs.deleteClient(cl);
	}
}
