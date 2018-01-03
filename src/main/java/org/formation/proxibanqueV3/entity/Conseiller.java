package org.formation.proxibanqueV3.entity;

// TODO: Auto-generated Javadoc
/**
 * @author HLMF
 * The Class Conseiller.
 * la classe conseiller permet d'instancier un objet conseiller
 * il pourrra gerer un portefeuille de clients
 */
public class Conseiller {
	
	/** The nom. */
	private String nom;

	/** The prenom. */
	private String prenom;

	/** The clients. */
	public java.util.Vector clients;

	/** The id. */
	public Integer id;

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
	 * @param nom            the nom to set
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
	 * @param prenom            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Gets the clients.
	 *
	 * @return the clients
	 */
	public java.util.Vector getClients() {
		return clients;
	}

	/**
	 * Sets the clients.
	 *
	 * @param clients            the clients to set
	 */
	public void setClients(java.util.Vector clients) {
		this.clients = clients;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
}
