package org.formation.proxibanqueV3.service;


import org.formation.proxibanqueV3.entity.ClientEntreprise;
import org.formation.proxibanqueV3.entity.ClientParticulier;
import org.formation.proxibanqueV3.persistance.DaoAuditEntreprise;
import org.formation.proxibanqueV3.persistance.DaoAuditParticulier;


// TODO: Auto-generated Javadoc
/**
 *  @author HLMF
 * The Class AuditService.
 * le service d'audit permettra a la page jsp du gerant d'effectuer 
 * un audit des comptes entreprise et particulier separement
 */
public class AuditService {
	
	/** The audit part. */
	private DaoAuditParticulier auditPart = new DaoAuditParticulier();
	
	/** The audit ent. */
	private DaoAuditEntreprise auditEnt= new DaoAuditEntreprise();
	
	/**
	 * Audit service particulier.
	 *
	 * @param clPart the cl part
	 * @return the string
	 */
	public String auditServiceParticulier(ClientParticulier clPart) {
		return auditPart.auditService(clPart);
	}
	
	/**
	 * Audit service entreprise.
	 *
	 * @param clEnt the cl ent
	 * @return the string
	 */
	public String auditServiceEntreprise(ClientEntreprise clEnt) {
		return auditEnt.auditService(clEnt);
	}

}
