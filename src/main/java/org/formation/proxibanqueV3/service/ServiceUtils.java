package org.formation.proxibanqueV3.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

// TODO: Auto-generated Javadoc
/**
 * @author HLMF
 * The Class ServiceUtils.
 * un service utilitaire afin d'appeler les entity de JPA
 * necessaires au CRUD
 */
public class ServiceUtils {
	
	/** The em. */
	private EntityManager em;
	
	/** The et. */
	private EntityTransaction et;
	
	/** The instance. */
	private static ServiceUtils instance;

	/**
	 * Instantiates a new service utils.
	 */
	private  ServiceUtils() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		this.em = emf.createEntityManager();
		this.et = em.getTransaction();
	}
	

	/**
	 * Gets the single instance of ServiceUtils.
	 *
	 * @return single instance of ServiceUtils
	 */
	public static ServiceUtils getInstance() {
		
		if(instance == null) {
			instance = new ServiceUtils();
		}
		return instance;
	}
	
	/**
	 * Gets the entity manager.
	 *
	 * @return the entity manager
	 */
	public EntityManager getEntityManager(){
		return em;
	}
	
	/**
	 * Gets the entity transaction.
	 *
	 * @return the entity transaction
	 */
	public EntityTransaction getEntityTransaction() {
		return et;
	}

}
