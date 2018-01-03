package org.formation.proxibanqueV3.entity;

import javax.persistence.Entity;
import javax.persistence.GenerationType;

// TODO: Auto-generated Javadoc
/**
 * @author HLMF
 * The Class ClientEntreprise. 
 * elle herite de Client, permet d'instancier un objet cliententreprise
 * elle a les attributs supplementaires suivant:
 * un decouvert de 50000 euros
 * un numero de SIRET
 * une raison sociale
 */
@Entity
public class ClientEntreprise extends Client{
	
	/** The Constant decouvertAutorise. */
	private static final float decouvertAutorise = 50000.00f;
	
	/** The num SIRET. */
	private long numSIRET;
	
	/** The raison sociale. */
	private String raisonSociale;
	
	
	/**
	 * Instantiates a new client entreprise.
	 */
	public ClientEntreprise() {
		super();
		
	}
	

	/**
	 * Instantiates a new client entreprise.
	 *
	 * @param adresse the adresse
	 * @param numTel the num tel
	 * @param cpteC the cpte C
	 * @param visaP the visa P
	 * @param email the email
	 * @param numSIRET the num SIRET
	 * @param raisonSociale the raison sociale
	 */
	public ClientEntreprise(Adresse adresse, String numTel, CompteCourant cpteC, CarteVisaPremier visaP, String email,
			long numSIRET, String raisonSociale) {
		super(adresse, numTel, cpteC, visaP, email);
		this.numSIRET = numSIRET;
		this.raisonSociale = raisonSociale;
	}


	/**
	 * Gets the num SIRET.
	 *
	 * @return the num SIRET
	 */
	public long getNumSIRET() {
		return numSIRET;
	}
	
	/**
	 * Sets the num SIRET.
	 *
	 * @param numSIRET the new num SIRET
	 */
	public void setNumSIRET(long numSIRET) {
		this.numSIRET = numSIRET;
	}
	
	/**
	 * Gets the raison sociale.
	 *
	 * @return the raison sociale
	 */
	public String getRaisonSociale() {
		return raisonSociale;
	}
	
	/**
	 * Sets the raison sociale.
	 *
	 * @param raisonSociale the new raison sociale
	 */
	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}
	
	/**
	 * Gets the decouvertautorise.
	 *
	 * @return the decouvertautorise
	 */
	public static float getDecouvertautorise() {
		return decouvertAutorise;
	}


	/* (non-Javadoc)
	 * @see org.formation.proxibanqueV3.entity.Client#toString()
	 */
	@Override
	public String toString() {
		return "ClientEntreprise [numSIRET=" + numSIRET + ", raisonSociale=" + raisonSociale + ", getId()=" + getId()
				+ ", getAdresse()=" + getAdresse() + ", getNumTel()=" + getNumTel() + ", getCpteC()=" + getCpteC()
				+ ", getCpteEp()=" + getCpteEp() + ", getVisaP()=" + getVisaP() + ", getVisaE()=" + getVisaE()
				+ ", getEmail()=" + getEmail() + "]";
	}



}
