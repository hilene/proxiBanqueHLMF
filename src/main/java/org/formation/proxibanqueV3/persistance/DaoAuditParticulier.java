package org.formation.proxibanqueV3.persistance;



import org.formation.proxibanqueV3.entity.ClientParticulier;

// TODO: Auto-generated Javadoc
/**
 * @author HLMF
 * The Class DaoAuditParticulier.
 * elle herite de la classe abstraite IDaoAudit<>
 * la classe permettre au gerant d'auditer tous les comptes particulier de son agence
 */
public class DaoAuditParticulier implements IDaoAudit<ClientParticulier>{



	/* (non-Javadoc)
	 * @see org.formation.proxibanqueV3.persistance.IDaoAudit#auditService(java.lang.Object)
	 * le plafond de debit max est de 5000 pour un compte particulier
	 */
	@Override
	public String auditService(ClientParticulier clParticulier) {
		String resultat = " ";

		if (clParticulier.getCpteC().getSoldeCompte() < -5000.00) {

			resultat = "ALERTE!!! Le compte de: " + clParticulier.getNom() + " " + clParticulier.getPrenom() + " est dans le ROUGE: "
					+ clParticulier.getCpteC().getSoldeCompte();
		} else {
			resultat = "Le compte de: " + clParticulier.getNom() + " " + clParticulier.getPrenom()
					+ " presente un solde correspondant a nos conditions generales: "
					+ clParticulier.getCpteC().getSoldeCompte();
		}
		return resultat;
	}
	
}