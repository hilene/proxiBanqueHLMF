package org.formation.proxibanqueV3.entity;

import javax.persistence.Entity;

// TODO: Auto-generated Javadoc
/**
 * @author HLMF
 * The Class ClientParticulier.
 * elle herite de Client, permet d'instancier un objet clientparticulier
 * elle a les attributs supplementaires suivants:
 * nom
 * prenom
 * un decouvert de 1000
 */
@Entity
public class ClientParticulier extends Client {
	
	/** The nom. */
	private String nom;
	
	/** The prenom. */
	private String prenom;
	
	/** The Constant decouvertAutorise. */
	private static final float decouvertAutorise = 1000.00f;
	
	/**
	 * Instantiates a new client particulier.
	 *
	 * @param nom the nom
	 * @param prenom the prenom
	 */
	public ClientParticulier(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * Instantiates a new client particulier.
	 */
	public ClientParticulier() {
		super();
	}



	/**
	 * Instantiates a new client particulier.
	 *
	 * @param adresse the adresse
	 * @param numTel the num tel
	 * @param cpteC the cpte C
	 * @param cpteEp the cpte ep
	 * @param visaE the visa E
	 * @param nom the nom
	 * @param prenom the prenom
	 * @param email the email
	 */
	public ClientParticulier(Adresse adresse, String numTel, CompteCourant cpteC, CompteEpargne cpteEp,
			CarteVisaElectron visaE, String nom, String prenom, String email) {
		super(adresse, numTel, cpteC, cpteEp, visaE, email);
		this.nom = nom;
		this.prenom = prenom;
	}
	
	

	/**
	 * Instantiates a new client particulier.
	 *
	 * @param adresse the adresse
	 * @param numTel the num tel
	 * @param cpteC the cpte C
	 * @param cpteEp the cpte ep
	 * @param visaP the visa P
	 * @param nom the nom
	 * @param prenom the prenom
	 * @param email the email
	 */
	public ClientParticulier(Adresse adresse, String numTel, CompteCourant cpteC, CompteEpargne cpteEp,
			CarteVisaPremier visaP, String nom, String prenom, String email) {
		super(adresse, numTel, cpteC, cpteEp, visaP, email);
		this.nom = nom;
		this.prenom = prenom;
	}
	
	

	/**
	 * Instantiates a new client particulier.
	 *
	 * @param adresse the adresse
	 * @param numTel the num tel
	 * @param cpteC the cpte C
	 * @param visaP the visa P
	 * @param nom the nom
	 * @param prenom the prenom
	 * @param email the email
	 */
	public ClientParticulier(Adresse adresse, String numTel, CompteCourant cpteC, CarteVisaPremier visaP, String nom,
			String prenom, String email) {
		super(adresse, numTel, cpteC, visaP, email);
		this.nom = nom;
		this.prenom = prenom;
	}
	
	

	/**
	 * Instantiates a new client particulier.
	 *
	 * @param adresse the adresse
	 * @param numTel the num tel
	 * @param cpteC the cpte C
	 * @param visaE the visa E
	 * @param nom the nom
	 * @param prenom the prenom
	 * @param email the email
	 */
	public ClientParticulier(Adresse adresse, String numTel, CompteCourant cpteC, CarteVisaElectron visaE, String nom,
			String prenom, String email) {
		super(adresse, numTel, cpteC, visaE, email);
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * Gets the nom.
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Sets the nom.
	 *
	 * @param nom the new nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

	/**
	 * Gets the prenom.
	 *
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Sets the prenom.
	 *
	 * @param prenom the new prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
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
		return "ClientParticulier [nom=" + nom + ", prenom=" + prenom + ", getId()=" + getId() + ", getAdresse()="
				+ getAdresse() + ", getNumTel()=" + getNumTel() + ", getCpteC()=" + getCpteC() + ", getCpteEp()="
				+ getCpteEp() + ", getVisaP()=" + getVisaP() + ", getVisaE()=" + getVisaE() + ", getEmail()="
				+ getEmail() + "]";
	}

	
	
	
	
	

}
