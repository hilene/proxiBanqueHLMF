package org.formation.proxibanqueV3.service;

// TODO: Auto-generated Javadoc
/**
 *  @author HLMF
 * The Class CalculCreditService.
 * cette classe permet d'effectuer des simulations de credit
 * sur les pages directement accessibles
 * elle retourne le montant des mensualites en fonction de:
 * montant emprunt, la duree en mois et le taux de credit
 */
public class CalculCreditService {
	
	/** The montant emprunt. */
	private double montantEmprunt;
	
	/** The Mensualites. */
	private double Mensualites;
	
	/** The duree mois. */
	private int dureeMois;
	
	/** The tx credit. */
	private float txCredit;
	//public double resultCredit;
	
	/** The df. */
	java.text.DecimalFormat df = new java.text.DecimalFormat("0.##");
	


	/**
	 * Instantiates a new calcul credit service.
	 *
	 * @param montantEmprunt the montant emprunt
	 * @param dureeMois the duree mois
	 * @param txCredit the tx credit
	 */
	public CalculCreditService(double montantEmprunt, int dureeMois, float txCredit) {
		super();
		this.montantEmprunt = montantEmprunt;
		this.dureeMois = dureeMois;
		this.txCredit = txCredit;
	}


	/**
	 * Instantiates a new calcul credit service.
	 */
	public CalculCreditService() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * Gets the result credit.
	 *
	 * @param resultCredit the result credit
	 * @return the result credit
	 */
	public double getResultCredit(double resultCredit){
		
		return resultCredit;
	}


	/**
	 * Gets the montant emprunt.
	 *
	 * @return the montant emprunt
	 */
	public double getMontantEmprunt() {
		return montantEmprunt;
	}


	/**
	 * Sets the montant emprunt.
	 *
	 * @param montantEmprunt the new montant emprunt
	 */
	public void setMontantEmprunt(double montantEmprunt) {
		this.montantEmprunt = montantEmprunt;
	}


	/**
	 * Gets the mensualites.
	 *
	 * @return the mensualites
	 */
	public double getMensualites() {
		return Mensualites;
	}


	/**
	 * Sets the mensualites.
	 *
	 * @param mensualites the new mensualites
	 */
	public void setMensualites(double mensualites) {
		Mensualites = mensualites;
	}


	/**
	 * Gets the duree mois.
	 *
	 * @return the duree mois
	 */
	public int getDureeMois() {
		return dureeMois;
	}


	/**
	 * Sets the duree mois.
	 *
	 * @param dureeMois the new duree mois
	 */
	public void setDureeMois(int dureeMois) {
		this.dureeMois = dureeMois;
	}


	/**
	 * Gets the tx credit.
	 *
	 * @return the tx credit
	 */
	public float getTxCredit() {
		return txCredit;
	}


	/**
	 * Sets the tx credit.
	 *
	 * @param txCredit the new tx credit
	 */
	public void setTxCredit(float txCredit) {
		this.txCredit = txCredit;
	}


//	public double getResultCredit() {
//		return resultCredit;
//	}
//
//
//	public void setResultCredit(double resultCredit) {
//		this.resultCredit = resultCredit;
//	}
	
	/**
 * Calcul credit.
 */
public void calculCredit() {
		Mensualites = ((montantEmprunt*((txCredit/100)/12))/((1)-(Math.pow((1+((txCredit/100)/12)), (-dureeMois)))));
		
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Voici le resultat de votre simulation de credit:" + "\n" + "montant emprunte: " + montantEmprunt + " euros, duree de: "
				+ dureeMois + " mois, taux: " + txCredit + "%." + df.format(Mensualites) + " euros.";
	}
	
	
}
