package org.formation.proxibanqueV3.persistance;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.formation.proxibanqueV3.entity.Client;
import org.formation.proxibanqueV3.entity.CompteBancaire;



// TODO: Auto-generated Javadoc
/**
 *  @author HLMF
 * The Class DaoCompteBancaire. elle implemente la classe IDaoCrud
 * cette classe est un sigleton, une seule instance est cree a chaque fois
 * JPA permet de faire le CRUD complet et aller chercher toute la liste des comptes
 * avec une requete JPQL 
 */
public class DaoCompteBancaire implements IDaoCrud<CompteBancaire> {
	
	/** The dao compte. */
	private static DaoCompteBancaire daoCompte;
	
	/**
	 * Instantiates a new dao compte bancaire.
	 */
	private DaoCompteBancaire() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Gets the single instance of DaoCompteBancaire.
	 *
	 * @return single instance of DaoCompteBancaire
	 */
	public static DaoCompteBancaire getInstance(){
		if ( daoCompte == null) {
			daoCompte = new DaoCompteBancaire();
		}
		return daoCompte;
	}

	/* (non-Javadoc)
	 * @see org.formation.proxibanqueV3.persistance.IDaoCrud#create(java.lang.Object, javax.persistence.EntityManager)
	 */
	@Override
	public CompteBancaire create(CompteBancaire cpteBancaire, EntityManager em) {
		em.persist(cpteBancaire);
		return cpteBancaire;
	}

	/* (non-Javadoc)
	 * @see org.formation.proxibanqueV3.persistance.IDaoCrud#read(long, javax.persistence.EntityManager)
	 */
	@Override
	public CompteBancaire read(long numCompte, EntityManager em) {
		
		return em.find(CompteBancaire.class, numCompte);
	}

	/* (non-Javadoc)
	 * @see org.formation.proxibanqueV3.persistance.IDaoCrud#update(java.lang.Object, javax.persistence.EntityManager)
	 */
	@Override
	public CompteBancaire update(CompteBancaire cpteBancaire, EntityManager em) {
		if (em.find(CompteBancaire.class, cpteBancaire.getNumCompte()) == null) {
			throw new IllegalArgumentException("Compte Bancaire inconnu!");
		}
		em.merge(cpteBancaire);
		return cpteBancaire;
	}

	/* (non-Javadoc)
	 * @see org.formation.proxibanqueV3.persistance.IDaoCrud#delete(java.lang.Object, javax.persistence.EntityManager)
	 */
	@Override
	public void delete(CompteBancaire cpteBancaire, EntityManager em) {
		cpteBancaire = em.merge(cpteBancaire);
		em.remove(cpteBancaire);
		
	}

	/* (non-Javadoc)
	 * @see org.formation.proxibanqueV3.persistance.IDaoCrud#showAll(javax.persistence.EntityManager)
	 */
	@Override
	public List<CompteBancaire> showAll(EntityManager em) {
		Query q = em.createNamedQuery("Compte.findAll", CompteBancaire.class);
		return q.getResultList();
	}

}
