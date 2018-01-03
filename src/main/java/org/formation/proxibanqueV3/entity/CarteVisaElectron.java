package org.formation.proxibanqueV3.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

// TODO: Auto-generated Javadoc
/**
 * @author HLMF
 * The Class CarteVisaElectron.
 * la classe permet de creer une carte electron, herite de CarteBancaire
 * le client a une carte electron
 */
@Entity
public class CarteVisaElectron extends CarteBancaire{

	/** The type. */
	private String type = "Visa Electron";
	
	/** The client. */
	@OneToOne(mappedBy="visaE")
	private Client client;
	
	/**
	 * Instantiates a new carte visa electron.
	 */
	public CarteVisaElectron() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Instantiates a new carte visa electron.
	 *
	 * @param numCarte the num carte
	 * @param dateValid the date valid
	 */
	public CarteVisaElectron(long numCarte, String dateValid) {
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
		return "CarteVisaElectron [type=" + type + ", getNumCarte()=" + getNumCarte() + ", getDateValid()="
				+ getDateValid() + "]";
	}

	
}
