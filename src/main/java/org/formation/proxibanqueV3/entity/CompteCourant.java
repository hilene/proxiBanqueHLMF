package org.formation.proxibanqueV3.entity;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

// TODO: Auto-generated Javadoc
/**
 * @author HLMF
 * The Class CompteCourant.
 * elle herite de CompteBancaire, permet d'instancier un objet compte courant
 * a un decouvert autorise de 1000
 */
@Entity
@NamedQuery(name="CompteCourant.findAll", query="SELECT cc from CompteCourant cc")
public class CompteCourant extends CompteBancaire{
	
	/** The decouvert autorise. */
	private double decouvertAutorise = 1000.00;
	
	/**
	 * Instantiates a new compte courant.
	 */
	public CompteCourant() {
		super();
	}
	
	/**
	 * Instantiates a new compte courant.
	 *
	 * @param numCompte the num compte
	 * @param soldeCompte the solde compte
	 * @param date the date
	 */
	public CompteCourant(long numCompte, double soldeCompte, String date) {
		super(numCompte, soldeCompte, date);
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * Instantiates a new compte courant.
	 *
	 * @param soldeCpteCourant the solde cpte courant
	 * @param dateStr the date str
	 */
	public CompteCourant(double soldeCpteCourant, String dateStr) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Gets the decouvert autorise.
	 *
	 * @return the decouvert autorise
	 */
	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}

	/**
	 * Sets the decouvert autorise.
	 *
	 * @param decouvertAutorise the decouvert autorise
	 * @return the double
	 */
	public double setDecouvertAutorise(double decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
		return decouvertAutorise;
	}


	/* (non-Javadoc)
	 * @see org.formation.proxibanqueV3.entity.CompteBancaire#toString()
	 */
	@Override
	public String toString() {
		return "CompteCourant [decouvertAutorise=" + decouvertAutorise + ", getNumCompte()=" + getNumCompte()
				+ ", getDate()=" + getDate() + ", getSoldeCompte()=" + getSoldeCompte() + "]";
	}


	
	

}
