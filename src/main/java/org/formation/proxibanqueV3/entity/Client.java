package org.formation.proxibanqueV3.entity;

import javax.persistence.CascadeType;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;



// TODO: Auto-generated Javadoc
/**
 * @author HLMF
 * The Class Client.
 * la classe abstraite Client permet de transmettre les attributs suivants aux classes filles:
 * id en GenerationType.AUTO
 * 	adresse
 * numTel
 * cpte Courant
 * cpte Epargne
 * visa premier
 * visa electron
 * email
 */
@Entity
@NamedQuery(name="Client.findAll", query="SELECT cl from Client cl")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Client {
	
	/** The id. */
	//attributs
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	/** The adresse. */
	@Embedded
	private Adresse adresse;
	
	/** The num tel. */
	private String numTel;
	
	/** The cpte C. */
	@OneToOne(cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="cpteC_id", unique=true)
	private CompteCourant cpteC;
	
	/** The cpte ep. */
	@OneToOne(cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="cpteEp_id", unique=true)
	private CompteEpargne cpteEp;
	
	/** The visa P. */
	@OneToOne(cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="visaP_id", unique=true)
	private CarteVisaPremier visaP;
	
	/** The visa E. */
	@OneToOne(cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="visaE_id", unique=true)
	private CarteVisaElectron visaE;
	
	/** The email. */
	private String email;
	

	/**
	 * Instantiates a new client.
	 */
	public Client() {
		super();
	}

	/**
	 * Instantiates a new client.
	 *
	 * @param adresse the adresse
	 * @param numTel the num tel
	 * @param cpteC the cpte C
	 * @param cpteEp the cpte ep
	 * @param visaE the visa E
	 * @param email the email
	 */
	public Client(Adresse adresse, String numTel, CompteCourant cpteC, CompteEpargne cpteEp,
			CarteVisaElectron visaE, String email) {
		super();
		
		this.adresse = adresse;
		this.numTel = numTel;
		this.cpteC = cpteC;
		this.cpteEp = cpteEp;
		this.visaE = visaE;
		this.email = email;
	}


	/**
	 * Instantiates a new client.
	 *
	 * @param adresse the adresse
	 * @param numTel the num tel
	 * @param cpteC the cpte C
	 * @param cpteEp the cpte ep
	 * @param visaP the visa P
	 * @param email the email
	 */
	public Client(Adresse adresse, String numTel, CompteCourant cpteC, CompteEpargne cpteEp,
			CarteVisaPremier visaP, String email) {
		super();
		
		this.adresse = adresse;
		this.numTel = numTel;
		this.cpteC = cpteC;
		this.cpteEp = cpteEp;
		this.visaP = visaP;
		this.email = email;
	}

	/**
	 * Instantiates a new client.
	 *
	 * @param adresse the adresse
	 * @param numTel the num tel
	 * @param cpteC the cpte C
	 * @param visaP the visa P
	 * @param email the email
	 */
	public Client(Adresse adresse, String numTel, CompteCourant cpteC, CarteVisaPremier visaP, String email) {
		super();
		
		this.adresse = adresse;
		this.numTel = numTel;
		this.cpteC = cpteC;
		this.visaP = visaP;
		this.email = email;
	}

	/**
	 * Instantiates a new client.
	 *
	 * @param adresse the adresse
	 * @param numTel the num tel
	 * @param cpteC the cpte C
	 * @param visaE the visa E
	 * @param email the email
	 */
	public Client(Adresse adresse, String numTel, CompteCourant cpteC, CarteVisaElectron visaE, String email) {
		super();
		
		this.adresse = adresse;
		this.numTel = numTel;
		this.cpteC = cpteC;
		this.visaE = visaE;
		this.email = email;
	}

	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the adresse.
	 *
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * Sets the adresse.
	 *
	 * @param adresse the new adresse
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/**
	 * Gets the num tel.
	 *
	 * @return the num tel
	 */
	public String getNumTel() {
		return numTel;
	}

	/**
	 * Sets the num tel.
	 *
	 * @param numTel the new num tel
	 */
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	/**
	 * Gets the cpte C.
	 *
	 * @return the cpte C
	 */
	public CompteCourant getCpteC() {
		return cpteC;
	}

	/**
	 * Sets the cpte C.
	 *
	 * @param cpteC the new cpte C
	 */
	public void setCpteC(CompteCourant cpteC) {
		this.cpteC = cpteC;
	}

	/**
	 * Gets the cpte ep.
	 *
	 * @return the cpte ep
	 */
	public CompteEpargne getCpteEp() {
		return cpteEp;
	}

	/**
	 * Sets the cpte ep.
	 *
	 * @param cpteEp the new cpte ep
	 */
	public void setCpteEp(CompteEpargne cpteEp) {
		this.cpteEp = cpteEp;
	}

	/**
	 * Gets the visa P.
	 *
	 * @return the visa P
	 */
	public CarteVisaPremier getVisaP() {
		return visaP;
	}

	/**
	 * Sets the visa P.
	 *
	 * @param visaP the new visa P
	 */
	public void setVisaP(CarteVisaPremier visaP) {
		this.visaP = visaP;
	}

	/**
	 * Gets the visa E.
	 *
	 * @return the visa E
	 */
	public CarteVisaElectron getVisaE() {
		return visaE;
	}

	/**
	 * Sets the visa E.
	 *
	 * @param visaE the new visa E
	 */
	public void setVisaE(CarteVisaElectron visaE) {
		this.visaE = visaE;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Client [id=" + id + ", adresse=" + adresse + ", numTel=" + numTel + ", cpteC=" + cpteC + ", cpteEp="
				+ cpteEp + ", visaP=" + visaP + ", visaE=" + visaE + ", email=" + email + "]";
	}

	
	
		

}
