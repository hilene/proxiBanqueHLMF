package org.formation.proxibanqueV3.persistance;

import org.formation.proxibanqueV3.entity.ClientEntreprise;

// TODO: Auto-generated Javadoc
/**
 * @author HLMF
 * The Class DaoAuditEntreprise.
 * elle herite de la classe abstraite IDaoAudit<>
 * la classe permettre au gerant d'auditer tous les comptes pro de son agence
 */
public class DaoAuditEntreprise implements IDaoAudit<ClientEntreprise>{

	/* (non-Javadoc)
	 * @see org.formation.proxibanqueV3.persistance.IDaoAudit#auditService(java.lang.Object)
	 * le plafond de debit max est de 50000 pour un compte pro
	 */
	@Override
	public String auditService(ClientEntreprise cliEntreprise) {
		String resultat = " ";

		if (cliEntreprise.getCpteC().getSoldeCompte() < -50000.00) {

			resultat = "ALERTE!!! Le compte de: " + cliEntreprise.getRaisonSociale() +  " est dans le ROUGE: "
					+ cliEntreprise.getCpteC().getSoldeCompte();
		} else {
			resultat = "Le compte de: " + cliEntreprise.getRaisonSociale()
					+ " presente un solde correspondant a nos conditions generales: "
					+ cliEntreprise.getCpteC().getSoldeCompte();
		}
		return resultat;
	}
	

}
