package org.formation.proxibanqueV3.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

// TODO: Auto-generated Javadoc
/**
 * @author HLMF
 * The Class serviceCommon.
 * cette classe permet d'appeler des instances
 *  de entitymanager et entitytransaction
 */
public class serviceCommon {
	
	/**
	 * Gets the entity manager.
	 *
	 * @return the entity manager
	 */
	public EntityManager getEntityManager() {
		return ServiceUtils.getInstance().getEntityManager();
	}
	
	/**
	 * Gets the entity transaction.
	 *
	 * @return the entity transaction
	 */
	public EntityTransaction getEntityTransaction() {
		return ServiceUtils.getInstance().getEntityTransaction();
	}
}
