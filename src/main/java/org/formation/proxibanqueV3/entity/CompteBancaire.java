package org.formation.proxibanqueV3.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;

// TODO: Auto-generated Javadoc
/**
 * @author HLMF
 * The Class CompteBancaire.
 * classe abstraite
 * elle partage les attributs en commun pour les classes filles:
 * numCompte 
 * soldecompte
 * date de creation
 */
@Entity
@NamedQuery(name="Compte.findAll", query="SELECT c from CompteBancaire c")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class CompteBancaire {
	
	/** The num compte. */
	@Id
	private long numCompte;
	
	/** The solde compte. */
	private double soldeCompte;
	
	/** The date. */
	private String date;
	
	/**
	 * Instantiates a new compte bancaire.
	 */
	public CompteBancaire() {
		super();
		
	}
	
	/**
	 * Instantiates a new compte bancaire.
	 *
	 * @param numCompte the num compte
	 * @param soldeCompte the solde compte
	 * @param date the date
	 */
	public CompteBancaire(long numCompte, double soldeCompte, String date) {
		super();
		this.numCompte = numCompte;
		this.soldeCompte = soldeCompte;
		this.date = date;
	}


	/**
	 * Gets the num compte.
	 *
	 * @return the num compte
	 */
	public long getNumCompte() {
		return numCompte;
	}


	/**
	 * Sets the num compte.
	 *
	 * @param numCompte the new num compte
	 */
	public void setNumCompte(long numCompte) {
		this.numCompte = numCompte;
	}


	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public String getDate() {
		return date;
	}


	/**
	 * Sets the date.
	 *
	 * @param date the new date
	 */
	public void setDate(String date) {
		this.date = date;
	}


	/**
	 * Gets the solde compte.
	 *
	 * @return the solde compte
	 */
	public double getSoldeCompte() {
		return soldeCompte;
	}


	/**
	 * Sets the solde compte.
	 *
	 * @param soldeCompte the new solde compte
	 */
	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CompteBancaire [numCompte=" + numCompte + ", soldeCompte=" + soldeCompte + ", date=" + date + "]";
	}

	
}
