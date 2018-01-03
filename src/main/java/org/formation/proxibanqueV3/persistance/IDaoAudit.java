package org.formation.proxibanqueV3.persistance;



// TODO: Auto-generated Javadoc
/**
 * @author HLMF
 * The Interface IDaoAudit. interface de type generique
 * utilisation pour les classes qui vont l'implementer d'effectuer des audits de comptes
 *
 * @param <T> the generic type
 */
public interface IDaoAudit<T> {
	
	/**
	 * Audit service.
	 *
	 * @param paramT the param T
	 * @return the string
	 */
	public String auditService(T paramT);
	
	


}
