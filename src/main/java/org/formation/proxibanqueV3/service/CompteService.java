package org.formation.proxibanqueV3.service;


import java.util.List;

import org.formation.proxibanqueV3.entity.CompteBancaire;
import org.formation.proxibanqueV3.persistance.DaoCompteBancaire;
import org.formation.proxibanqueV3.persistance.IDaoCrud;

// TODO: Auto-generated Javadoc
/**
 *  @author HLMF
 * The Class CompteService.
 * elle permet de communiquer avec le DAO afin d'effectuer le CRUD sur les donnees Comptes Bancaires
 * elle permet aussi de lister tous les comptes
 */
public class CompteService extends serviceCommon {

	/** The compte service. */
	private IDaoCrud<CompteBancaire> compteService;
	
	/**
	 * Instantiates a new compte service.
	 */
	public CompteService() {
		
		this.compteService = DaoCompteBancaire.getInstance();
	}
	
	/**
	 * Adds the compte.
	 *
	 * @param cpte the cpte
	 */
	public void addCompte(CompteBancaire cpte) {
		getEntityTransaction().begin();
		compteService.create(cpte, getEntityManager());
		getEntityTransaction().commit();
	}

	/**
	 * Gets the compte.
	 *
	 * @param numCompte the num compte
	 * @return the compte
	 */
	public void getCompte(long numCompte) {
		getEntityTransaction().begin();
		compteService.read(numCompte, getEntityManager());
		getEntityTransaction().commit();
	}

	/**
	 * Delete compte.
	 *
	 * @param cpte the cpte
	 */
	public void deleteCompte(CompteBancaire cpte) {
		getEntityTransaction().begin();
		compteService.delete(cpte, getEntityManager());
		getEntityTransaction().commit();
	}

	/**
	 * Replace compte.
	 *
	 * @param cpte the cpte
	 */
	public void replaceCompte(CompteBancaire cpte) {
		getEntityTransaction().begin();
		compteService.update(cpte, getEntityManager());
		getEntityTransaction().commit();
	}

	/**
	 * Show all clients.
	 *
	 * @return the list
	 */
	public List<CompteBancaire> showAllClients() {
		
		return compteService.showAll(getEntityManager());
		
	}

}
