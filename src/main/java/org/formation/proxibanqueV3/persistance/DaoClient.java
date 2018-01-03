package org.formation.proxibanqueV3.persistance;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.formation.proxibanqueV3.entity.Client;



// TODO: Auto-generated Javadoc
/**
 *  @author HLMF
 * The Class DaoClient. elle implemente la classe IDaoCrud
 * cette classe est un singleton, permet d'instancier une instance de client a la fois
 * JPA permet de faire le CRUD complet et aller chercher toute la liste des clients
 * avec une requete JPQL
 */
public class DaoClient implements IDaoCrud<Client> {
	
	
	/** The dao client. */
	private static DaoClient daoClient;
	
	/**
	 * Instantiates a new dao client.
	 */
	private DaoClient() {
		
	}
	
	/**
	 * Gets the single instance of DaoClient.
	 *
	 * @return single instance of DaoClient
	 */
	public static DaoClient getInstance() {
		if(daoClient == null) {
			daoClient = new DaoClient();
		}
		
		return daoClient;
		
	}
		
	/* (non-Javadoc)
	 * @see org.formation.proxibanqueV3.persistance.IDaoCrud#create(java.lang.Object, javax.persistence.EntityManager)
	 */
	@Override
	public Client create(Client client, EntityManager em) {
		em.persist(client);
		return client;
	}

	/* (non-Javadoc)
	 * @see org.formation.proxibanqueV3.persistance.IDaoCrud#read(long, javax.persistence.EntityManager)
	 */
	@Override
	public Client read(long id, EntityManager em) {
		
		Client client = em.find(Client.class, id);
		return client;
		 
	}

	/* (non-Javadoc)
	 * @see org.formation.proxibanqueV3.persistance.IDaoCrud#update(java.lang.Object, javax.persistence.EntityManager)
	 */
	@Override
	public Client update(Client client, EntityManager em) {
		if (em.find(Client.class, client.getId()) == null) {
			throw new IllegalArgumentException("Client inconnu!");
		}
		em.merge(client);
		return client;
	}

	/* (non-Javadoc)
	 * @see org.formation.proxibanqueV3.persistance.IDaoCrud#delete(java.lang.Object, javax.persistence.EntityManager)
	 */
	@Override
	public void delete(Client client, EntityManager em) {
		client = em.merge(client);
		em.remove(client);
		
	}

	/* (non-Javadoc)
	 * @see org.formation.proxibanqueV3.persistance.IDaoCrud#showAll(javax.persistence.EntityManager)
	 */
	@Override
	public List<Client> showAll(EntityManager em) {
		TypedQuery<Client> q = em.createNamedQuery("Client.findAll", Client.class);
		List<Client> listClient = q.getResultList();
		
		return listClient;
	}

//	@Override
//	public List<Client> showAll(EntityManager em) {
//		
//		Query q = em.createNamedQuery("Client.findAll", Client.class);
//		return q.getResultList();
//	}



	
}
