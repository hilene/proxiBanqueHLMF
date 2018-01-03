package org.formation.proxibanqueV3.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

// TODO: Auto-generated Javadoc
/**
 * @author HLMF
 * The Class CarteVisaPremier.
 * elle permet de creer une carte visa premier
 * la carte appartient au client
 */
@Entity
public class CarteVisaPremier extends CarteBancaire {

	/** The type. */
	private String type = "Visa Premier";
	
	/** The client. */
	@OneToOne(mappedBy="visaP")
	private Client client;
	
	/**
	 * Instantiates a new carte visa premier.
	 */
	public CarteVisaPremier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Instantiates a new carte visa premier.
	 *
	 * @param numCarte the num carte
	 * @param dateValid the date valid
	 */
	public CarteVisaPremier(long numCarte, String dateValid) {
		super(numCarte, dateValid);
		// TODO Auto-generated constructor stub
	}
	


	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(String type) {
		this.type = type;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CarteVisaPremier [type=" + type + ", getNumCarte()=" + getNumCarte() + ", getDateValid()="
				+ getDateValid() + "]";
	}

	
	

}
